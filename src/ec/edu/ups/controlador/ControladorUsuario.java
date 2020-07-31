/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class ControladorUsuario {
    private Usuario usuario;
    private Usuario sesion;
    private UsuarioDAO usuarioDAO;

    public ControladorUsuario(UsuarioDAO usuarioDAO) {
	this.usuarioDAO = usuarioDAO;
    }

    public Usuario getSesion() {
	return sesion;
    }

    public void setSesion(Usuario sesion) {
	this.sesion = sesion;
    }
    
    public boolean iniciarSesion(String correo, String contrasenia){
        usuario = usuarioDAO.login(correo, contrasenia);
	if(usuario != null){
	    sesion = usuario;
	    return true;
	}else
	    return false;
    }
    
    public Usuario crearUsuario(String cedula, String nombre, String apellido, String telefono, String correo, String contraseña){
        usuario = new Usuario(cedula, nombre, apellido, telefono, correo, contraseña);
        usuarioDAO.create(usuario);
        return usuario;
    }
    
    public void actualizar(String cedula, String nombre, String apellido, String telefono, String correo, String contraseña){
        usuario = new Usuario(cedula, nombre, apellido, telefono, correo, contraseña);
        usuarioDAO.update(usuario);
    }
    
    public void eliminar(String cedula){
        usuarioDAO.delete(cedula);
    }
    
    public Usuario buscarCliente(String cedula){
        usuarioDAO.read(cedula);
        return usuario;
    }
        
    public List<Usuario> listar(){
	return usuarioDAO.findAll();
    }
    
    public void verUsuarios(DefaultTableModel tabla){
        List<Usuario> usuarios;
        usuarios = usuarioDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < usuarios.size(); i++){
	    tabla.addRow(new Object[]{
		usuarios.get(i).getCedula().trim(),
		usuarios.get(i).getNombre().trim(),
		usuarios.get(i).getApellido().trim(),
		usuarios.get(i).getTelefono().trim(),
		usuarios.get(i).getUsuario().trim()
	    });
	}
    }
}
