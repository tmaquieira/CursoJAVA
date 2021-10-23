package modulo7;
import java.util.Objects;
public class Persona {
	
	private static int cantidadDePersonas;
	private String nombre;
	private String apellido;

	//Constructores
	public Persona(){
		cantidadDePersonas++;
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
	public static int getCantidadDePersonas() {
		return cantidadDePersonas;
	}
	
	//Setters
	public void setApellido (String unApellido){
		this.apellido = unApellido;
	}
	public void setNombre (String unNombre){
		nombre = unNombre;
	}	
	public static void limpiarCantidadDePersonas() {
		cantidadDePersonas = 0;
	}	
	   
	//métodos	    
	public boolean equals(Object obj){
		boolean bln = false; 
		if (obj instanceof Persona) {
			Persona personita = (Persona) obj;	
			bln = nombre == personita.getNombre() && apellido == personita.getApellido();
		}
		return bln;	
	}
	
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	/*
	return nombre.hashCode()+apellido.hashCode();
	*/
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("\nNombre = ");
		sb.append(nombre);
		sb.append(", Apellido = ");
		sb.append(apellido);
		return sb.toString();
	}
}
