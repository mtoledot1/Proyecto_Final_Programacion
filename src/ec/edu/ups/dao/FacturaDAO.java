package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Producto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO {
    
    private ProductoDAO productoDAO;
    private ClienteDAO clienteDAO;
    private RandomAccessFile file;
    private int tam = 75;
    
    public FacturaDAO(ProductoDAO productoDAO, ClienteDAO clienteDAO){
	this.clienteDAO = clienteDAO;
	this.productoDAO = productoDAO;
	try{
	    file = new RandomAccessFile("datos/facturas.dat", "rw");
	}catch(FileNotFoundException e){
	    System.out.println("Archivo no econtrado: ");
	    e.printStackTrace();
	}
    }
    
    public void create(Factura factura){
	try{
	    file.setLength(file.length()-6);
	    file.seek(file.length());
	    file.writeInt(tam+(factura.getProductos().size()*6));//se guarda el tamaño del registro
	    file.writeInt(factura.getCodigo());// se guarda el codigo
	    String fecha = factura.getFecha().toString();
	    fecha = fecha.substring(0,19);
	    file.writeUTF(fecha);//se guarda la fecha en forma de string
	    file.writeDouble(factura.getSubtotal());//se guarda el subtotal
	    file.writeDouble(factura.getIVA());//se guarda el IVA
	    file.writeDouble(factura.getTotal());//se guarda el total
	    //se guarda el estado de la factura, 1 si está activa, 0 si está anulada
	    if(factura.isEstado())
		file.writeByte(1);
	    else
		file.writeByte(0);
	    //se guarda el ruc del cliente
	    file.writeUTF(factura.getCliente().getRuc());
	    //se guardan los códigos de los productos
	    for(Producto p : factura.getProductos())
		file.writeInt(p.getId());
	}catch(IOException ex){
	    System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
	}
    }
    
    public Factura read(int codigo){
	try{
	    int salto = 0;
	    while(salto < file.length()-1){
		file.seek(salto);
		salto += file.readInt();
		int codigoA = file.readInt();
		if(codigo == codigoA){
		    Factura factura = new Factura(codigo, null, LocalDateTime.parse(file.readUTF()+"."), file.readDouble(), file.readDouble(), file.readDouble(), true);
		    if(file.readByte() == 0)
			factura.setEstado(false);
		    Cliente cliente = clienteDAO.read(file.readUTF());
		    factura.setCliente(cliente);
		    while(file.getFilePointer() <= salto){
			factura.agregarProducto(productoDAO.read(file.readInt()));
		    }
		    return factura;
		}
		
	    }
	}catch (IOException ex){
	    System.out.println("Error de lectura y escritura: ");
	    ex.printStackTrace();
	}
        return null;
    }
    
    public void update(Factura factura){
	ArrayList<Factura> facturas = new ArrayList<>();
	int codigo = factura.getCodigo();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < (file.length()-6)) {
		pos += file.readInt();
                int cod = file.readInt();
		Factura fac;
		if(cod == codigo)
                    fac = factura;
		else{
		    fac = new Factura(cod, null, LocalDateTime.parse(file.readUTF()+"."), file.readDouble(), file.readDouble(), file.readDouble(), true);
		    if(file.readByte() == 0)
			fac.setEstado(false);
		    Cliente cliente = clienteDAO.read(file.readUTF());
		    fac.setCliente(cliente);
		    while(file.getFilePointer() <= pos){
			fac.agregarProducto(productoDAO.read(file.readInt()));
		    }
		}
		facturas.add(fac);
            }
	    file.setLength(0);
	    for(Factura f : facturas)
		create(f);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public List<Factura> findAll(){
	ArrayList<Factura> facturas = new ArrayList<>();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < (file.length()-6)) {
		pos += file.readInt();
                int cod = file.readInt();
		Factura fac = new Factura(cod, null, LocalDateTime.parse(file.readUTF()+"."), file.readDouble(), file.readDouble(), file.readDouble(), true);
		if(file.readByte() == 0)
		    fac.setEstado(false);
		Cliente cliente = clienteDAO.read(file.readUTF());
		fac.setCliente(cliente);
		while(file.getFilePointer() <= pos){
		    fac.agregarProducto(productoDAO.read(file.readInt()));
		}
		facturas.add(fac);
            }
	    return facturas;
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
	return null;
    }
}
