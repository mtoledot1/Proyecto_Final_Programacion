package ec.edu.ups.modelo;

public class Bodega {
    private int codigo;
    private String nombre;
    private int tamanio;
    private int productos;

    public Bodega() {
    }

    /*
    codigo = 4 bytes + 2
    nombre = 25 bytes + 2
    tamañoBodega = 4 bytes + 2
    productos = 4 bytes + 2
    tamaño = 45 bytes
    */
    
    public Bodega(int codigo, String nombre, int tamanio, int productos) {
	this.codigo = codigo;
	setNombre(nombre);
	this.tamanio = tamanio;
	this.productos = productos;
    }

    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	nombre = validarString(nombre, 25);
	this.nombre = nombre;
    }

    public int getTamanio() {
	return tamanio;
    }

    public void setTamanio(int tamanio) {
	this.tamanio = tamanio;
    }

    public int getProductos() {
	return productos;
    }

    public void setProductos(int productos) {
	this.productos = productos;
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
