package modulo7;

public class Alumno extends Persona {
		
	//Atributos
	private int legajo;
		
	//constructors
	public Alumno(){ 
		super(); 
	}
		
	public Alumno (String unNombre, String unApellido, int unLegajo){
		super(unNombre, unApellido);
		legajo = unLegajo;
	}
		
	//Getters
	public int getLegajo(){
		return legajo;
	}
		
	//Setters
	public void setLegajo(int unLegajo){
		legajo = unLegajo;
	}
	
	//métodos
	public boolean equals(Object alumno){
		return false;
	}
	public int hashCode(){
		return this.hashCode();
	}
	public String toString(){
	  return getNombre()+" "+getApellido()+" "+legajo;  
	}
}
		


