/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author tano
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contraseña;

    public Usuario(String cedula, String nombre, String apellido, String telefono, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
    }
            
    
    
    
}
