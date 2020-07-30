/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author braya
 */
public class ControladorUsuario {
     private Usuario usuario;
     private Usuario sesion;
//    private UsuarioDao usuarioDAO;

    public ControladorUsuario() {
    }
    
    /*public boolean iniciarSesion(String correo, String contrasenia){
        usuario = usuarioDAO.login(correo, contrasenia);
	if(usuario != null){
	    sesion = usuario;
	    return true;
	}else
	    return false;
    }*/
    
    public Usuario crearUsuario(String cedula, String nombre, String apellido, String telefono, String correo, String contraseña){
        usuario = new Usuario(cedula, nombre, apellido, telefono, correo, contraseña);
        //usuarioDAO.create(usuario);
        return usuario;
    }
    
    public void actualizar(String cedula, String nombre, String apellido, String telefono, String correo, String contraseña){
        usuario = new Usuario(cedula, nombre, apellido, telefono, correo, contraseña);
        //clienteDAO.update(cliente);
    }
    
    public void eliminar(String cedula){
        //clienteDAO.delete(cedula);
    }
    
    public Usuario buscarCliente(String cedula){
        //clienteDAO.read(cedula);
        return usuario;
    }
    
    //aplicación de excepciones 
    public void validacionCedula(String cedula)throws ExcepcionValidacion,NumberFormatException,ExcepcionTamaño{
          
        int n;
        int suma = 0;
        int c;
        int resta = 0;
        int ult;
        int num;
        if (cedula.length() != 10) {
            throw new ExcepcionTamaño();
        }
        for (int i = 0; i < cedula.length(); i++) {
            //int a char
            n = (char) Integer.parseInt(cedula.charAt(i)+"");
            //pares
            if (i % 2 == 0) {
                n = n * 2;
                if (n > 9) {
                    n = n - 9;
                }
            }
            suma = suma + n;
        }
        if (suma % 10 != 0) {
            c = ((suma / 10) + 1) * 10;
            resta = c - suma;
        }
        ult=  Integer.parseInt(cedula.charAt(9)+"");

        if (ult==resta) {
          System.out.println("Cedula correcta");
        }else{
                throw new ExcepcionValidacion();
        }
    }
    
    class ExcepcionTamaño extends Exception {

        public ExcepcionTamaño() {
            super("La cédula solo puede tener 10 dígitos");
        }
    }

    class ExcepcionValidacion extends Exception {
        public ExcepcionValidacion() {
            super("Cedula incorrecta");
        }
    }
}
