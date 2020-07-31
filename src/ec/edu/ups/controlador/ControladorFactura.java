/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.FacturaDAO;
import ec.edu.ups.modelo.*;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author braya
 */
public class ControladorFactura {

    //lista de facturas
    private Factura factura;
    private FacturaDAO facturaDAO;

    public ControladorFactura(FacturaDAO facturaDAO) {
        this.facturaDAO = facturaDAO;
    }

    //para crear la factura pasa como parámetros sus atributos.
    public void crearFactura(int codigo, Cliente cliente, LocalDateTime fecha, double subtotal, double IVA, double total, boolean estado) {
        factura = new Factura(codigo, cliente, fecha, subtotal, IVA, total, estado);
    }
    
    public void guardarFactura(){
	facturaDAO.create(factura);
    }

    public void anularFactura(int codigo) {
	for(Factura f : facturaDAO.findAll())
	if(f.getCodigo() == codigo){
	    f.setEstado(false);
	    facturaDAO.update(f);
	}
    }
    
    public double calcularIVA() {
        double iva = (factura.getSubtotal() * factura.getIVA());
        return iva;
    }

    public void calcularSubtotal() {
	double subtotal = 0;
	for(Producto p : factura.getProductos()){
	    subtotal += p.getPrecio() * p.getStock();
	}
	factura.setSubtotal(subtotal);
    }

    public void calcularTotal() {
        double total = calcularIVA() + factura.getSubtotal();
	factura.setTotal(total);
    }

    public int codigoFactura() {
	return facturaDAO.obtenerUltimoCodigo();
    }
    
    
    public List<Factura> listarFacturas() {
	//llama al DAOimpl de factura
        return facturaDAO.findAll();
    }

    public void agregarProducto(Producto producto){
	factura.agregarProducto(producto);
    }
    
    public void quitarProducto(Producto producto){
	factura.quitarProducto(producto);
    }
    
    public void actualizarProducto(Producto producto){
	factura.actualizarProductoÇ(producto);
    }
    
    public Factura getFactura(){
	return factura;
    }
    
    public void verFacturas(DefaultTableModel tabla){
        List<Factura> facturas;
        facturas = facturaDAO.findAll();
        tabla.setRowCount(0);
	for(int i = 0; i < facturas.size(); i++){
	    String estado;
	    if(facturas.get(i).isEstado())
		estado = "Activo";
	    else
		estado = "Anulado";
	    tabla.addRow(new Object[]{
		facturas.get(i).getCodigo(),
		facturas.get(i).getCliente().getRuc().trim(),
		facturas.get(i).getFecha().toString().substring(0, 19),
		facturas.get(i).getProductos().size(),
		facturas.get(i).getSubtotal(),
		facturas.get(i).getIVA(),
		facturas.get(i).getTotal(),
		estado
	    });
	}
    }
}
