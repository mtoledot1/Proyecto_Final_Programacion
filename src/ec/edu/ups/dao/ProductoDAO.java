package ec.edu.ups.dao;

import ec.edu.ups.modelo.Bodega;
import ec.edu.ups.modelo.Producto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    
    private BodegaDAO bodegaDAO;
    private RandomAccessFile file;
    private int tam = 99;
    
    public ProductoDAO(BodegaDAO bodegaDAO){
	this.bodegaDAO = bodegaDAO;
	try{
	    file = new RandomAccessFile("datos/productos.dat","rw");
	}catch(FileNotFoundException e){
	    System.out.println("Archivo no econtrado: ");
	    e.printStackTrace();
	}
    }
    
    public void create(Producto producto){
	try{
	    file.seek(file.length());
	    file.writeInt(producto.getId());
	    file.writeUTF(producto.getNombre());
	    file.writeUTF(producto.getDescripcion());
	    file.writeInt(producto.getStock());
	    file.writeDouble(producto.getPrecio());
	    file.writeInt(producto.getBodega().getCodigo());
	}catch(IOException e){
	    System.out.println("Error de lectura y escritura: ");
	    e.printStackTrace();
	}
    }
    
    public Producto read(int id){
	try{
	    int salto = 0;
	    while(salto < file.length()-1){
		file.seek(salto);
		int idA = file.readInt();
		if(id == idA){
		    Producto producto = new Producto(id, file.readUTF(), file.readUTF(), file.readInt(), file.readDouble(), null);
		    Bodega bodega = bodegaDAO.read(file.readInt());
		    producto.setBodega(bodega);
		    return producto;
		}
		salto += tam;
	    }
	}catch (IOException ex){
	    System.out.println("Error de lectura y escritura: ");
	    ex.printStackTrace();
	}
        return null;
    }
    
    public void update(Producto producto){
	ArrayList<Producto> productos = new ArrayList<>();
	int id = producto.getId();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {                
                int idA = file.readInt();
		Producto prod;
		if(id == idA)
                    prod = producto;
		else{
		    prod = new Producto(idA, file.readUTF(), file.readUTF(), file.readInt(), file.readDouble(), null);
		    Bodega bodega = bodegaDAO.read(file.readInt());
		    prod.setBodega(bodega);
		}
		productos.add(prod);
                pos += tam;
            }
	    file.setLength(0);
	    for(Producto p : productos)
		create(p);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public void delete(int id){
	ArrayList<Producto> productos = new ArrayList<>();
        try {
            int pos = 0;
            while (pos < file.length()-1) {
		file.seek(pos);
                int idA = file.readInt();
		if(id != idA){
		    Producto producto = new Producto(idA, file.readUTF(), file.readUTF(), file.readInt(), file.readDouble(), null);
		    Bodega bodega = bodegaDAO.read(file.readInt());
		    producto.setBodega(bodega);
		    productos.add(producto);
		}
                pos += tam;
            }
	    file.setLength(0);
	    for(Producto p : productos)
		create(p);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public List<Producto> findAll(){
	ArrayList<Producto> productos = new ArrayList<>();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {                
                int idA = file.readInt();
		Producto producto = new Producto(idA, file.readUTF(), file.readUTF(), file.readInt(), file.readDouble(), null);
		Bodega bodega = bodegaDAO.read(file.readInt());
		producto.setBodega(bodega);
		productos.add(producto);
                pos += tam;
            }
	    return productos;
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
	return null;
    }
    
    public int obtenerUltimoCodigo(){
	try{
	    if(file.length() >= tam)
		file.seek(file.length() - tam);
	    else
		return -1;
	    int codigo = file.readInt();
	    return codigo;
	}catch (IOException ex){
	    System.out.println("Error de lectura y escritura: ");
	    ex.printStackTrace();
	}
	return 0;
    }
}
