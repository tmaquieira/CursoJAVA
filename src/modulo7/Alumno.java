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
	public boolean equals(Object obj){
		boolean bln=false;
		if(obj instanceof Alumno){
			Alumno alu = (Alumno) obj;
			bln = super.equals(alu) && obj instanceof Alumno && ((Alumno) obj).getLegajo() == legajo;
		}
		return bln;
	} 
	
	public int hashCode(){
		return super.hashCode() + (int) legajo;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", Legajo Nro. = ");
		sb.append(legajo);
		return sb.toString();
	}
}
		


