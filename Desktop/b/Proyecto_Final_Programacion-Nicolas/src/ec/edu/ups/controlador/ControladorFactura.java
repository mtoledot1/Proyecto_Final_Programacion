/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author braya
 */
public class ControladorFactura {
    
    //lista de facturas
    private Factura[] facturas;
     private Factura factura;
    //private FacturaDao facturaDAO;
     private ArrayList<Producto> productos;

    public ControladorFactura(Factura[] facturas/*, */) {
        this.facturas = facturas;
     
    }
 
    //para crear la factura pasa como parámetros sus atributos.
    public Factura crearFactura(Cliente cliente,Date fecha,Producto[] productos,double subtotal,double IVA,boolean estado){
        
         factura = new Factura();
      // facturaDAO.create(factura);
        return factura;
    }
    
     public void anularFactura(int codigo){
            
       // if(factura.getCodigo==codigo){
            
       
        
        
    }
    
     public void validarFactura(){
         
     }
     
     
     public double calcularIVA(double precio, int stock){
     //
         double iva=(precio*0.12);
        
         return iva;
    }
    
    public double calcularSubtotal(double precio, int stock){
    //subtotal : precio * unidad 
    
     double subtotal;
     subtotal=precio*stock;
    
        return subtotal;
    }
   
    
    public double calcularTotal(double precio){
        
        
        return 0.00;
    }
    
    
    public void buscarFacturas(){
        
    }
   
   public void listarFacturas(){
       
   }
   
    
    
   
    
}
