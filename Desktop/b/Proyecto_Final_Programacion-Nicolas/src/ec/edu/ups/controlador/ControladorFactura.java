/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorFactura {

    //lista de facturas
    private ArrayList<Factura> facturas;
    private Factura factura;
    //private FacturaDao facturaDAO;
    private ArrayList<Producto> productos;

    public ControladorFactura(ArrayList<Factura> facturas, ArrayList<Producto> productos) {
        this.facturas = facturas;
        this.productos = productos;
    }

    
    
    

    //para crear la factura pasa como parámetros sus atributos.
    public Factura crearFactura(Cliente cliente, Date fecha, Producto[] productos, double subtotal, double IVA, boolean estado) {

        factura = new Factura();
        // facturaDAO.create(factura);
        return factura;
    }

    public void anularFactura(int codigo) {
            boolean estado;
        
             //obitiene el id de la factura
            // if(factura.getId==codigo){
                 estado=false;
            // }
             
             
         
        
        
        
    }

    public boolean validarFactura(int id) {
        boolean estado;
            //    facturaDAO.read(id);
                estado=true;
        return estado;
    }

    public double calcularIVA(double precio, int stock) {
        //
        double iva = (precio * 0.12);

        return iva;
    }

    public double calcularSubtotal(double precio, int stock) {
        //subtotal : precio * unidad 

        double subtotal;
        subtotal = precio * stock;

        return subtotal;
    }

    public double calcularTotal(double precio,int stock) {
        
        double total;
        
        total=(precio*stock)+(precio*0.12);
        
        
        return total;
    }

    public Factura buscarFacturas(int id) {

        //llama a facturaImpl para buscar la factura
        //  factura = facturaDAO.read(id);
        if (factura != null) {
            return factura;
        } else {

            return null;
        }

    }

    public int codigoFactura() {
        
        // facturaDao llama a idFactura que está en el IDAOFactura como : public int idFactura;)
        
      //  int cont = facturaDAO.idFactura();
       // return (++cont);
       
       return 0;
    }
    
    
     public List<Factura> listarFacturas() {
         
         //llama al DAOimpl de factura
       // return facturaDAO.findAll();
       return null;
    }

}
