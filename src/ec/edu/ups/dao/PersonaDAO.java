package ec.edu.ups.dao;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {
    
    private RandomAccessFile file;
    private int tam = 78;
    
    public PersonaDAO(){
	try{
	    file = new RandomAccessFile("datos/personas.dat", "rw");
	}catch(FileNotFoundException e){
	    System.out.println("Archivo no econtrado: ");
	    e.printStackTrace();
	}
    }
    
    public void create(Persona persona){
	try{
	    file.seek(file.length());
	    file.writeUTF(persona.getCedula());
	    file.writeUTF(persona.getNombre());
	    file.writeUTF(persona.getApellido());
	    file.writeUTF(persona.getTelefono());
	    System.out.println(file.getFilePointer());
	}catch(IOException e){
	    System.out.println("Error de lectura y escritura: ");
	    e.printStackTrace();
	}
    }
    
    public Persona read(String cedula){
	cedula = cedula.trim();
        try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                String cedulaA = file.readUTF().trim();
                if(cedula.equals(cedulaA)){
                    Persona persona = new Persona(cedula, file.readUTF(), file.readUTF(), file.readUTF());
                    return persona;
                }
                pos += tam;
            }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
        return null;
    }
    
    public void update(Persona persona){
	ArrayList<Persona> personas = new ArrayList<>();
	String cedula = persona.getCedula();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {                
                String cedulaA = file.readUTF().trim();
		Persona per = new Persona(cedulaA, file.readUTF(), file.readUTF(), file.readUTF());
                if(cedula.equals(cedulaA)){
                    per = persona;
                }
		personas.add(per);
                pos += tam;
            }
	    file.setLength(0);
	    for(Persona p : personas)
		create(p);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public void delete(String cedula){
	ArrayList<Persona> personas = new ArrayList<>();
	cedula = cedula.trim();
        try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                String cedulaA = file.readUTF().trim();
                if(!cedula.equals(cedulaA)){
		    Persona per = new Persona(cedulaA, file.readUTF(), file.readUTF(), file.readUTF());
		    personas.add(per);
                }
                pos += tam;
            }
	    file.setLength(0);
	    for(Persona p : personas)
		create(p);
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public List<Persona> findAll(){
	ArrayList<Persona> personas = new ArrayList<>();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {
                String cedulaA = file.readUTF().trim();
		Persona persona = new Persona(cedulaA, file.readUTF(), file.readUTF(), file.readUTF());
		personas.add(persona);
                pos += tam;
            }
	    return personas;
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
	return null;
    }
}
