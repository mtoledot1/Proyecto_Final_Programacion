package ec.edu.ups.modelo;

public class Bodega {
    private int codigo;
    private String nombre;

    public Bodega() {
    }

    /*
    codigo = 4 bytes + 2
    nombre = 25 bytes + 2
    tamaño = 33 bytes
    */
    
    public Bodega(int codigo, String nombre) {
	this.codigo = codigo;
	setNombre(nombre);
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
    
    public String validarString(String str, int longitud){
	if(str.length() > longitud)
	    str = str.substring(0, longitud);
	else if(str.length() < longitud)
	    while(str.length() < longitud)
		str += " ";
	return str;
    }
}
