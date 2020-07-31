package ec.edu.ups.dao;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    private PersonaDAO personaDAO;
    private RandomAccessFile file;
    private int tam = 49;
    
    public UsuarioDAO(PersonaDAO personaDAO){
	this.personaDAO = personaDAO;
	try{
	    file = new RandomAccessFile("datos/usuarios.dat", "rw");
	}catch(FileNotFoundException e){
	    System.out.println("Archivo no econtrado: ");
	    e.printStackTrace();
	}
    }
    
    public void create(Usuario usuario){
	try{
	    file.seek(file.length());
	    file.writeUTF(usuario.getCedula());
	    file.writeUTF(usuario.getUsuario());
	    file.writeUTF(usuario.getContrasenia());
	}catch(IOException e){
	    System.out.println("Error de lectura y escritura: ");
	    e.printStackTrace();
	}
    }
    
    public Usuario read(String cedula){
	cedula = cedula.trim();
        try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                String cedulaA = file.readUTF().trim();
                if(cedula.equals(cedulaA)){
                    Persona persona = personaDAO.read(cedula);
		    Usuario usuario = new Usuario(cedula, persona.getNombre(), persona.getApellido(), persona.getTelefono(), file.readUTF(), file.readUTF());
                    return usuario;
                }
                pos += tam;
            }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
        return null;
    }
    
    public void update(Usuario usuario){
	ArrayList<Usuario> usuarios = new ArrayList<>();
	String cedula = usuario.getCedula();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {                
                String cedulaA = file.readUTF().trim();
		Persona persona = personaDAO.read(cedula);
		Usuario usr = new Usuario(cedulaA, persona.getNombre(), persona.getApellido(), persona.getTelefono(), file.readUTF(), file.readUTF());
                if(cedula.equals(cedulaA)){
                    usr = usuario;
                }
		usuarios.add(usr);
                pos += tam;
            }
	    file.setLength(0);
	    for(Usuario u : usuarios){
		create(u);
	    }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public void delete(String cedula){
	ArrayList<Usuario> usuarios = new ArrayList<>();
	try {
            int pos = 0;
            while (pos < file.length()) {
		file.seek(pos);
                String cedulaA = file.readUTF().trim();
                if(!cedula.equals(cedulaA)){
                    Persona persona = personaDAO.read(cedula);
		    Usuario usuario = new Usuario(cedulaA, persona.getNombre(), persona.getApellido(), persona.getTelefono(), file.readUTF(), file.readUTF());
                    usuarios.add(usuario);
                }
                pos += tam;
            }
	    file.setLength(0);
	    for(Usuario u : usuarios){
		create(u);
	    }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
    }
    
    public List<Usuario> findAll(){
	ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            int pos = 0;
	    file.seek(pos);
            while (pos < file.length()) {
		String cedula = file.readUTF().trim();
		Persona persona = personaDAO.read(cedula);
		Usuario usuario = new Usuario(cedula, persona.getNombre(), persona.getApellido(), persona.getTelefono(), file.readUTF(), file.readUTF());
                pos += tam;
		usuarios.add(usuario);
            }
        } catch (IOException ex) {
            System.out.println("Error de escritura y lectura");
            ex.printStackTrace();
        }
	return usuarios;
    }
    
    public Usuario login(String usuario, String pass) {
	for(Usuario u : findAll()){
	    if(usuario.equals(u.getUsuario())){
                if(pass.equals(u.getContrasenia())){
                    return u;
                }
            }
	}
	return null;
    }
}
