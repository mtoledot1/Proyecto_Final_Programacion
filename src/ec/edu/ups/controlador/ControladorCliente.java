 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Producto;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class ControladorCliente {
    private Cliente cliente;
    private ClienteDAO clienteDAO;
    private PersonaDAO personaDAO;

    public ControladorCliente(ClienteDAO clienteDAO, PersonaDAO personaDAO) {
        this.clienteDAO = clienteDAO;
	this.personaDAO = personaDAO;
    }
   
    public void registar(String cedula, String ruc, String nombre, String telefono, String direccion){
        cliente = new Cliente(ruc, nombre, direccion, telefono, null);
	Persona persona = personaDAO.read(cedula);
	cliente.setPropietario(persona);
        clienteDAO.create(cliente);
    }
    
    public void actualizar(String cedula, String ruc, String nombre, String apellido, String telefono, String direccion){
	cliente = new Cliente(ruc, nombre, direccion, telefono, null);
        Persona persona = personaDAO.read(cedula);
	cliente.setPropietario(persona);
        clienteDAO.update(cliente);
    }
    
    public void eliminar(String cedula){
        clienteDAO.delete(cedula);
    }
    
    public Cliente buscarCliente(String cedula){
        cliente = clienteDAO.read(cedula);
        return cliente;
    }
    
    public List<Cliente> listar(){
	return clienteDAO.findAll();
    }
    
    public void verCliente(DefaultTableModel tabla){
        List<Cliente> clientes;
        clientes = clienteDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < clientes.size(); i++){
	    tabla.addRow(new Object[]{
		clientes.get(i).getPropietario().getCedula().trim(),
		clientes.get(i).getRuc().trim(),
		clientes.get(i).getNombre().trim(),
		clientes.get(i).getTelefono().trim(),
		clientes.get(i).getDireccion().trim()
	    });
	}
    }
    
    public void verClienteFactura(DefaultTableModel tabla){
        List<Cliente> clientes;
        clientes = clienteDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < clientes.size(); i++){
	    tabla.addRow(new Object[]{
		clientes.get(i).getRuc().trim(),
		clientes.get(i).getNombre().trim(),
		clientes.get(i).getDireccion().trim(),
		clientes.get(i).getTelefono().trim(),
		clientes.get(i).getPropietario().getCedula().trim(),
		clientes.get(i).getPropietario().getNombre().trim()
	    });
	}
    }
}
