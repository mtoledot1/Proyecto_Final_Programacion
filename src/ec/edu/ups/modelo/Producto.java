package ec.edu.ups.modelo;

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
    
    
    
    
    /*
    id = 4 bytes + 2 
    nombre = 25 bytes + 2
    descripcion = 50 bytes + 2
    stock = 4 bytes + 2
    precio = 8 bytes + 2
    codigoBodega = 4 bytes + 2
    tamaño = 107 bytes
    */

    public Producto(int id, String nombre, String descripcion, int stock, double precio, Bodega bodega) {
	this.id = id;
	setNombre(nombre);
	setDescripcion(descripcion);
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
	nombre = validarString(nombre, 25);
	this.nombre = nombre;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	descripcion = validarString(descripcion, 50);
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

    public Bodega getBodega() {
	return bodega;
    }

    public void setBodega(Bodega bodega) {
	this.bodega = bodega;
    }
    
    public String validarString(String str, int longitud){
	if(str.length() > longitud)
	    str = str.substring(0, longitud);
	else if(str.length() < longitud)
	    while(str.length() < longitud)
		str += " ";
	return str;
    }
}
