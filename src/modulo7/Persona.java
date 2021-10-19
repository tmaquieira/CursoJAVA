package modulo7;

public class Persona {
	
	private String nombre;
	private String apellido;

	//Constructores
	public Persona(){
	}
	public Persona (String unNombre, String unApellido){
		nombre = unNombre;
		apellido = unApellido;
	}
			
	//Getters
	public String getApellido(){
		return apellido;
	}
	public String getNombre(){
		return nombre;
	}
		
	//Setters
	public void setApellido (String unApellido){
		this.apellido = unApellido;
	}
	public void setNombre (String unNombre){
		nombre = unNombre;
	}	   
		
	//métodos	    
	public boolean equals(Object unaPersona){
		return false;
	}
	public int hashCode(){
		return this.hashCode();
	}
	public String toString(){
		  return nombre+" "+apellido;  
	}
}
