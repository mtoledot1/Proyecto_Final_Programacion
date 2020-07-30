package ec.edu.ups.modelo;

public class Usuario extends Persona{
    private String usuario;
    private String contrasenia;

    public Usuario() {
    }
    
    /*
    cedula = 10 bytes + 2
    usuario = 25 bytes + 2
    contraseña = 8 bytes + 2
    tamaño = 49 bytes
    */

    public Usuario(String usuario, String contrasenia, String cedula, String nombre, String apellido, String telefono) {
	super(cedula, nombre, apellido, telefono);
	setUsuario(usuario);
	setContrasenia(contrasenia);
    }
    
    public String getUsuario() {
	return usuario;
    }

    public void setUsuario(String usuario) {
	usuario = validarString(usuario, 25);
	this.usuario = usuario;
    }

    public String getContrasenia() {
	return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
	contrasenia = validarString(contrasenia, 8);
	this.contrasenia = contrasenia;
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
