package ec.edu.ups.controlador;

import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.modelo.Persona;

public class ControladorPersona {
    
    private PersonaDAO personaDAO;
    private Persona persona;
    
    public ControladorPersona(PersonaDAO personaDAO){
	this.personaDAO = personaDAO;
    }
    
    public boolean crear(String cedula, String nombre, String apellido, String telefono){
	try{
	    validarCedula(cedula);
	    persona = new Persona(cedula, nombre, apellido, telefono);
	    personaDAO.create(persona);
	    return true;
	}catch(ExcepcionLongitudCedula e){
	    System.out.println("Error en el tamaño de la cédula");
	    e.printStackTrace();
	}catch(ExcepcionCedula e){
	    System.out.println("Error en la validación de la cédula");
	    e.printStackTrace();
	}catch(NumberFormatException e){
	    System.out.println("Error en los contenidos de la");
	    e.printStackTrace();
	}
	return false;
    }
    
    public void actualizar(String cedula, String nombre, String apellido, String telefono){
        persona = new Persona(cedula, nombre, apellido, telefono);
	personaDAO.update(persona);
    }
    
    public void eliminar(String cedula){
        personaDAO.delete(cedula);
    }
    
    public Persona buscarCliente(String cedula){
	try{
	    validarCedula(cedula);
	    persona = personaDAO.read(cedula);
	    return persona;
	}catch(ExcepcionLongitudCedula e){
	    System.out.println("Error en el tamaño de la cédula");
	    e.printStackTrace();
	}catch(ExcepcionCedula e){
	    System.out.println("Error en la validación de la cédula");
	    e.printStackTrace();
	}catch(NumberFormatException e){
	    System.out.println("Error en los contenidos de la");
	    e.printStackTrace();
	}
        return null;
    }
    
    //aplicación de excepciones 
    public void validarCedula(String cedula) throws ExcepcionCedula, ExcepcionLongitudCedula, NumberFormatException{
	if(cedula.length() != 10){
	    throw new ExcepcionLongitudCedula();
	}
	Integer.parseInt(cedula);
	int res = 0;
	for(int i = 0; i < cedula.length()-1; i++){
	    if((i+1)%2 == 0){
		res += cedula.charAt(i)-'0';
	    } else {
		int digito = cedula.charAt(i)-'0';
		digito *= 2;
		if(digito > 9)
		    digito -= 9;
		res += digito;
	    }
	}
	while(res > 0){
	    res -= 10;
	}
	res = 0-res;
	int verificador = cedula.charAt(cedula.length()-1)-'0';
	if(res == verificador)
	    System.out.println("La cédula es válida");
	else
	    throw new ExcepcionCedula();
    }
    

    class ExcepcionLongitudCedula extends Exception{
	public ExcepcionLongitudCedula(){
	    super("La cédula debe tener 10 dígitos");
	}
    }

    class ExcepcionCedula extends Exception{
	public ExcepcionCedula(){
	    super("La cédula no es válida");
	}
    }
    
}
