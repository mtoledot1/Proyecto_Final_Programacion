/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Bodega;
import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorBodega {
    private Producto producto;
    private ArrayList<Producto> productos;
    private Bodega bodega;
    
    //MÉTODOS
    
    
    /**
     * @param producto parametro tipo Producto
     */
    
    
    public ControladorBodega(ArrayList<Producto> productos){
        
        this.productos=productos;
        
    }

    public Bodega crearBodega(int codigo,String nombre){
          bodega=new Bodega();
          //llama a bodegaImpl para crear una bodega
       // bodegaDAO.create(bodega);
        
        return bodega;
    }
    
    public Producto añadirProducto(int id, String nombre, String descripcion, int stock, double precio, int bodega) {
        producto=new Producto();
       //se llama al DaoImpl
      //  productoDAO.create(producto);
        
      return producto;
    }
    
    
    
    public void quitarProducto(int id){
        //se llama al DaoImpl
       // productoDAO.delete(id);
    }
    
    //Método para almacenar el producto en bodega
    public void almacenar(Producto producto){
       //se agrega al array los productos
        productos.add(producto);
        
    }
    
    //Método para retirar el producto en bodega
    public Producto retirar(int id){
        
        
            for(Producto pro: productos){
                
                //"pro.getId": obtener el id del MODELO del PRODUCTO
                
                /*if(pro.getId==id){
                    productos.remove(pro);
                    break;
                }else{
                System.out.println("El producto no existe");
                }*/
            }
        
        
        
        return null;
    }
    
    public int codigoBodega() {
        
        //el bodegaDao llama a idbodega que está en el IDAOBodega como : public int idBodega;)
        
      //  int cont = bodegaDAO.idBodega();
       // return (++cont);
       
       return 0;
    }
    
    
     public List<Producto> listarProductos(int id) {
            
         
        for(int i=0; i<productos.size();i++){
            productos.get(i);
        }
        
        return productos;
        
     }
    
    
    
}
