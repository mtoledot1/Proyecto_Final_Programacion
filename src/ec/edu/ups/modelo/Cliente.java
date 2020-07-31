package ec.edu.ups.modelo;

public class Cliente {
    private String ruc;
    private String nombre;
    private String direccion;
    private String telefono;
    private Persona propietario;

    public Cliente() {
    }

    /*
    ruc = 13 bytes + 2 
    nombre = 50 bytes + 2
    direccion = 100 bytes + 2 
    telefono = 10 bytes + 2
    cedula = 10 bytes + 2
    tamaño = 193 bytes
    */
    
    public Cliente(String ruc, String nombre, String direccion, String telefono, Persona propietario) {
	setRuc(ruc);
	setNombre(nombre);
	setDireccion(direccion);
	setTelefono(telefono);
	this.propietario = propietario;
    }

    public String getRuc() {
	return ruc;
    }

    public void setRuc(String ruc) {
	ruc = validarString(ruc, 13);
	this.ruc = ruc;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	nombre = validarString(nombre, 50);
	this.nombre = nombre;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	direccion = validarString(direccion, 100);
	this.direccion = direccion;
    }

    public String getTelefono() {
	return telefono;
    }

    public void setTelefono(String telefono) {
	telefono = validarString(telefono, 10);
	this.telefono = telefono;
    }

    public Persona getPropietario() {
	return propietario;
    }

    public void setPropietario(Persona propietario) {
	this.propietario = propietario;
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
