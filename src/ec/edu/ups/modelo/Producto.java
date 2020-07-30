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
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;
    private int bodega;

    public Producto(int id, String nombre, String descripcion, int stock, double precio, int bodega) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.bodega = bodega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getBodega() {
        return bodega;
    }

    public void setBodega(int bodega) {
        this.bodega = bodega;
    }
    
    
    
    
}
