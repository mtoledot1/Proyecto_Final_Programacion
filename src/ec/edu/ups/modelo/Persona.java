package ec.edu.ups.modelo;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {
    }

    /*
    cedula = 10 bytes + 2
    nombre = 25 bytes + 2
    apellido = 25 bytes + 2
    telefono = 10 bytes + 2
    tamaño = 78 bytes
    */
    
    public Persona(String cedula, String nombre, String apellido, String telefono) {
	setCedula(cedula);
	setNombre(nombre);
	setApellido(apellido);
	setTelefono(telefono);
    }

    public String getCedula() {
	return cedula;
    }

    public void setCedula(String cedula) {
	cedula = validarString(cedula, 10);
	this.cedula = cedula;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	nombre = validarString(nombre, 25);
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	apellido = validarString(apellido, 25);
	this.apellido = apellido;
    }

    public String getTelefono() {
	return telefono;
    }

    public void setTelefono(String telefono) {
	telefono = validarString(telefono, 10);
	this.telefono = telefono;
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
