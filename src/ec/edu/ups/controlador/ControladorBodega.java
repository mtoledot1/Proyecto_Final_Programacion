/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.BodegaDAO;
import ec.edu.ups.modelo.Bodega;
import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class ControladorBodega {
    private BodegaDAO bodegaDAO;
    private ControladorBodega controladorBodega;
    private Bodega bodega;
    
    //MÉTODOS
    /**
     * @param producto parametro tipo Producto
     */    
    public ControladorBodega(BodegaDAO bodegaDAO){
	this.bodegaDAO = bodegaDAO;
    }

    public void crearBodega(int codigo, String nombre, int tamanio, int productos){
	bodega=new Bodega(codigo, nombre, tamanio, productos);
	bodegaDAO.create(bodega);
    }
    
    public void actualizar(int codigo, String nombre, int tamanio, int productos){
	bodega=new Bodega(codigo, nombre, tamanio, productos);
	bodegaDAO.update(bodega);
    }
    
    public void eliminar(int codigo){
	bodegaDAO.delete(codigo);
	List<Bodega> bodegas = listar();
	
    }
    
    public Bodega buscar(int codigo){
	return bodegaDAO.read(codigo);
    }
    
    public int codigoBodega() {
       //el bodegaDao llama a idbodega que está en el IDAOBodega como : public int idBodega;) 
       //int cont = bodegaDAO.idBodega();
       //return (++cont);
       return 0;
    }
    
    public List<Bodega> listar() {
	return bodegaDAO.findAll();
    }
    
    public void verUsuarios(DefaultTableModel tabla){
        List<Bodega> bodegas;
        bodegas = bodegaDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < bodegas.size(); i++){
	    tabla.addRow(new Object[]{
		bodegas.get(i).getCodigo(),
		bodegas.get(i).getNombre().trim(),
		bodegas.get(i).getTamanio(),
		bodegas.get(i).getProductos()
	    });
	}
    }
}
