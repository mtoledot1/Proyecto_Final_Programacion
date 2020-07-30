/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;

/**
 *
 * @author braya
 */
public class ControladorFactura {
    private Factura factura;
    //private FacturaDAO facturaDAO;
    
    public ControladorFactura() {
        //DAO
    }
    
    public Factura crearFactura(){
        factura = new Factura();
        //facturaDAO.create(factura);
        return factura;
    }
    
    public void disminuirStock(){
        
    }
}
