package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Persona;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    private PersonaDAO personaDAO;
    private RandomAccessFile file;
    private int tam = 193;
    
    public ClienteDAO(PersonaDAO personaDAO){
	this.personaDAO = personaDAO;
	try{
	    file = new RandomAccessFile("datos/clientes.dat", "rw");
	}catch(FileNotFoundException e){
	    System.out.println("Archivo no econtrado: ");
	    e.printStackTrace();
	}
    }
    
    public void create(Cliente cliente){
	try {
	    file.seek(file.length());
	    file.writeUTF(cliente.getRuc());
	    file.writeUTF(cliente.getNombre());
	    file.writeUTF(cliente.getDireccion());
	    file.writeUTF(cliente.getTelefono());
	    file.writeUTF(cliente.getPropietario().getCedula());
	} catch (IOException e) {
	    System.out.println("Error de lectura y escritura: ");
	    e.printStackTrace();
	}
    }
    
    public Cliente read(String ruc){
	ruc = ruc.trim();
        try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                String rucA = file.readUTF().trim();
                if(ruc.equals(rucA)){
		    Cliente cliente = new Cliente(ruc, file.readUTF(), file.readUTF(), file.readUTF(), null);
		    Persona persona = personaDAO.read(file.readUTF());
		    cliente.setPropietario(persona);
                    return cliente;
                }
                pos += tam;
            }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
        return null;
    }
    
    public void update(Cliente cliente){
	ArrayList<Cliente> clientes = new ArrayList<>();
	String ruc = cliente.getRuc();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {                
                String rucA = file.readUTF().trim();
		Cliente cli = new Cliente(rucA, file.readUTF(), file.readUTF(), file.readUTF(), null);
		Persona persona = personaDAO.read(file.readUTF());
		cli.setPropietario(persona);
                if(ruc.equals(rucA)){
                    cli = cliente;
                }
		clientes.add(cli);
                pos += tam;
            }
	    file.setLength(0);
	    for(Cliente c : clientes){
		create(c);
	    }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public void delete(String ruc){
	ArrayList<Cliente> clientes = new ArrayList<>();
	 try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                String rucA = file.readUTF().trim();
                if(!ruc.equals(rucA)){
                    Cliente cliente = new Cliente(rucA, file.readUTF(), file.readUTF(), file.readUTF(), null);
		    Persona persona = personaDAO.read(file.readUTF());
		    cliente.setPropietario(persona);
		    clientes.add(cliente);
                }
                pos += tam;
            }
	    file.setLength(0);
	    for(Cliente c : clientes){
		create(c);
	    }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public List<Cliente> findAll(){
	ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {
		String ruc = file.readUTF().trim();
		Cliente cliente = new Cliente(ruc, file.readUTF(), file.readUTF(), file.readUTF(), null);
		Persona persona = personaDAO.read(file.readUTF());
		cliente.setPropietario(persona);
                pos += tam;
		clientes.add(cliente);
            }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
	return clientes;
    }
}
