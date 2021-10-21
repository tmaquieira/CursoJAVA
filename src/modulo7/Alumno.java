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
			boolean bln=false;
			if(alumno instanceof Alumno){
				Alumno al = (Alumno) alumno;
				bln = super.equals(al) && alumno instanceof Alumno && ((Alumno) alumno).getLegajo() == legajo;
			}
			return bln;
		} 
	
	public int hashCode(){
		return super.hashCode() + (int) legajo;
		//return this.hashCode();
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(", legajo Nro. = ");
		sb.append(legajo);
		return getNombre()+" "+getApellido()+sb.toString();
	}
}
		


