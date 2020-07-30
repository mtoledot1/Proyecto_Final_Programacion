 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;

/**
 *
 * @author braya
 */
public class ControladorCliente {
    private Cliente cliente;
//    private ClienteDao clienteDAO;

    public ControladorCliente() {
        //DAO
    }
    
    public Cliente registar(String cedula, String ruc, String nombre, String apellido, String telefono, String direccion){
        cliente = new Cliente();
        //clienteDAO.create(cliente);
        return cliente;
    }
    
    public void actualizar(String cedula, String ruc, String nombre, String apellido, String telefono, String direccion){
        cliente = new Cliente();
        //clienteDAO.update(cliente);
    }
    
    public void eliminar(String cedula){
        //clienteDAO.delete(cedula);
    }
    
    public Cliente buscarCliente(String cedula){
        //clienteDAO.read(cedula);
        return cliente;
    }
}
