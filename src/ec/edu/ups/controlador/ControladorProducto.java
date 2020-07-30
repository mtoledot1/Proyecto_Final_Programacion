/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author braya
 */
public class ControladorProducto {
    private Producto producto;
    private ArrayList<Producto> productos;
    //private ProductoDAO productoDAO;

    public ControladorProducto() {
        productos = new ArrayList<>();
    }
    
    public Producto añadirProducto(int id, String nombre, String descripcion, int stock, double precio, int bodega){
        producto = new Producto(id, nombre, descripcion, stock, precio, bodega);
        //productoDAO.create(producto);
        return producto;
    }
    
    public List<Producto> productos(){
        return productoDAO.findAll();
    }
    
    public void quitarProducto(int id){
        //productoDAO.delete(id);
    }
    
    public void almacenar(Producto producto){
        productos.add(producto);
    }
    
    public Producto retirar(int id){
        for (Producto productoB : productos) {
            if (productoB.getId() == id) {
                productos.remove(productoB);
                break;
            }
        }
        return null;        
    }
    
    
}
