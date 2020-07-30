package ec.edu.ups.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int codigo;
    private Cliente cliente;
    private LocalDateTime fecha;
    private List<Producto> productos;
    private double subtotal;
    private double IVA;
    private double total;
    private boolean estado;

    public Factura() {
    }
    
    /*
    codigo = 4 bytes + 2
    12/12/2012T12:12:12
    fecha = 19 bytes + 2
    subtotal = 8 bytes + 2
    IVA = 8 bytes + 2
    total = 8 bytes + 2
    estado = 1 byte + 2
    rucCliente = 13 bytes + 2
    productos = (4 bytes + 2)*n
    tamaño = 75 + 6n bytes
    */

    public Factura(int codigo, Cliente cliente, LocalDateTime fecha, double subtotal, double IVA, double total, boolean estado) {
	productos = new ArrayList<>();
	this.cliente = cliente;
	this.fecha = fecha;
	this.subtotal = subtotal;
	this.IVA = IVA;
	this.total = total;
	this.estado = estado;
    }

    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {  
	this.codigo = codigo;
    }

    public Cliente getCliente() {
	return cliente;
    }

    public void setCliente(Cliente cliente) {
	this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
	return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
	this.fecha = fecha;
    }

    public double getSubtotal() {
	return subtotal;
    }

    public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
    }

    public double getIVA() {
	return IVA;
    }

    public void setIVA(double IVA) {
	this.IVA = IVA;
    }

    public double getTotal() {
	return total;
    }

    public void setTotal(double total) {
	this.total = total;
    }

    public boolean isEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }
    
    public void agregarProducto(Producto producto){
	productos.add(producto);
    }
    
    public void quitarProducto(Producto producto){
	if(productos.contains(producto))
	    productos.remove(producto);
    }
    
    public void actualizarProductoÇ(Producto producto){
	if(productos.contains(producto))
	    productos.set(productos.indexOf(producto),producto);
    }
    
    public List<Producto> getProductos(){
	return productos;
    }
}
