/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.BodegaDAO;
import ec.edu.ups.dao.ProductoDAO;
import ec.edu.ups.modelo.Bodega;
import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class ControladorProducto {
    private Producto producto;
    private ProductoDAO productoDAO;
    private BodegaDAO bodegaDAO;

    public ControladorProducto(ProductoDAO productoDAO, BodegaDAO bodegaDAO) {
	this.bodegaDAO = bodegaDAO;
	this.productoDAO = productoDAO;
    }
    
    public void agregar(int id, String nombre, String descripcion, int stock, double precio, Bodega bodega){
        producto = new Producto(id, nombre, descripcion, stock, precio, bodega);
	bodega.setProductos(bodega.getProductos()+producto.getStock());
        productoDAO.create(producto);
	bodegaDAO.update(bodega);
    }
    
    public void actualizar(int id, String nombre, String descripcion, int stock, double precio, Bodega bodega){
        producto = new Producto(id, nombre, descripcion, stock, precio, bodega);
	bodega.setProductos(bodega.getProductos()-productoDAO.read(id).getStock());
	bodega.setProductos(bodega.getProductos()+producto.getStock());
        productoDAO.update(producto);
	bodegaDAO.update(bodega);
    }
    
    public Producto buscar(int id){
	return productoDAO.read(id);
    }
    
    public int codigoProducto() {
	return productoDAO.obtenerUltimoCodigo();
    }
    
    public List<Producto> productos(){
        return productoDAO.findAll();
    }
    
    public List<Producto> productosPorBodega(int codigo){
	ArrayList<Producto> productos = new ArrayList<>();
	List<Producto> pr = productoDAO.findAll();
	for(Producto p : pr){
	    if(p.getBodega().getCodigo() == codigo)
		productos.add(p);
	}
        return productos;
    }
    
    public void quitarProducto(int id, Bodega bodega){
	bodega.setProductos(bodega.getProductos()-productoDAO.read(id).getStock());
        productoDAO.delete(id);
	bodegaDAO.update(bodega);
    }

    public void reordenar(int codigo) {
	List<Bodega> bodegas = bodegaDAO.findAll();
	List<Producto> productos = productosPorBodega(codigo);
	for(Producto p : productos){
	    for(Bodega b : bodegas){
		if(b.getProductos() < b.getTamanio()){
		    p.setBodega(b);
		    b.setProductos(b.getProductos()+1);
		    productoDAO.update(p);
		    bodegaDAO.update(b);
		    break;
		}
	    }
	}
    }
    
    public void verUsuarios(DefaultTableModel tabla){
        List<Producto> productos;
        productos = productoDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < productos.size(); i++){
	    tabla.addRow(new Object[]{
		productos.get(i).getId(),
		productos.get(i).getNombre().trim(),
		productos.get(i).getDescripcion().trim(),
		productos.get(i).getStock(),
		productos.get(i).getPrecio()
	    });
	}
    }
    
    public void verProductos(DefaultTableModel tabla){
        List<Producto> productos;
        productos = productoDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < productos.size(); i++){
	    tabla.addRow(new Object[]{
		productos.get(i).getId(),
		productos.get(i).getNombre().trim(),
		productos.get(i).getDescripcion().trim(),
		productos.get(i).getStock(),
		productos.get(i).getPrecio(),
		productos.get(i).getBodega().getNombre().trim()
	    });
	}
    }
    
}
