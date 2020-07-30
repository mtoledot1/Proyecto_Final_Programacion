package ec.edu.ups.modelo;

/**
 *
 * @author tano
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contraseña;

    public Usuario(String cedula, String nombre, String apellido, String telefono, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
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
