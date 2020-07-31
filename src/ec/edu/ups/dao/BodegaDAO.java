package ec.edu.ups.dao;

import ec.edu.ups.modelo.Bodega;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class BodegaDAO {
    
    private RandomAccessFile file;
    private int tam = 45;
    
    public BodegaDAO(){
	try{
	    file = new RandomAccessFile("datos/bodegas.dat", "rw");
	}catch(FileNotFoundException e){
	    System.out.println("Archivo no econtrado: ");
	    e.printStackTrace();
	}
    }
    
    public void create(Bodega bodega){
	try{
	    file.seek(file.length());
	    file.writeInt(bodega.getCodigo());
	    file.writeUTF(bodega.getNombre());
	    file.writeInt(bodega.getTamanio());
	    file.writeInt(bodega.getProductos());
	}catch(IOException e){
	    System.out.println("Error de lectura y escritura: ");
	    e.printStackTrace();
	}
    }
    
    public Bodega read(int codigo){
	try{
	    int salto = 0;
	    while(salto < file.length()-1){
		file.seek(salto);
		int codigoArchivo = file.readInt();
		if(codigo == codigoArchivo){
		    Bodega bodega = new Bodega(codigo, file.readUTF(), file.readInt(), file.readInt());
		    return bodega;
		}
		salto += tam;
	    }
	}catch (IOException ex){
	    System.out.println("Error de lectura y escritura: ");
	    ex.printStackTrace();
	}
        return null;
    }
    
    public void update(Bodega bodega){
	ArrayList<Bodega> bodegas = new ArrayList<>();
	int codigo = bodega.getCodigo();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {
                int cod = file.readInt();
		Bodega b;
		if(cod == codigo)
                    b = bodega;
		else{
		    b = new Bodega(codigo, file.readUTF(), file.readInt(), file.readInt());
		}
		bodegas.add(b);
                pos += tam;
            }
	    file.setLength(0);
	    for(Bodega b : bodegas)
		create(b);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public void delete(int codigo){
	ArrayList<Bodega> bodegas = new ArrayList<>();
        try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                int cod = file.readInt();
		if(codigo != cod){
                    Bodega bodega = new Bodega(codigo, file.readUTF(), file.readInt(), file.readInt());
                    bodegas.add(bodega);
                }
                pos += tam;
            }
	    file.setLength(0);
	    for(Bodega b : bodegas)
		create(b);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public List<Bodega> findAll(){
	ArrayList<Bodega> bodegas = new ArrayList<>();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {
		Bodega bodega = new Bodega(file.readInt(), file.readUTF(), file.readInt(), file.readInt());
		bodegas.add(bodega);
                pos += tam;
            }
	    return bodegas;
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
	return null;
    }
}
