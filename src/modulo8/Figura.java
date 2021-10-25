package modulo8;

import java.util.Objects;

public abstract class Figura {
	protected static float maximaSuperficie; 
	private String nombre;
	
	public Figura() {}
	public Figura (String unNombre) {
		nombre = unNombre;
	}
	public Figura (float unaMaximaSuperficie, String unNombre) {
		//this();
		maximaSuperficie = unaMaximaSuperficie;
		nombre = unNombre;
	}
	public static float getMaximaSuperficie(){
		return maximaSuperficie;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String unNombre){
		nombre = unNombre;
	}
	
	public abstract String getValores();
	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();
		
	public boolean equals(Object obj) {
		boolean bln = false; 
		if (obj instanceof Figura) {
			Figura fig = (Figura) obj;	
			bln = nombre == fig.getNombre() && maximaSuperficie == fig.getMaximaSuperficie();
		}
		return bln;
	}
	
	public int hashCode() {
		return Objects.hash(maximaSuperficie, nombre);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("\nNombre = ");
		sb.append(nombre);
		sb.append(", Máxima Superficie = ");
		sb.append(maximaSuperficie);
		return sb.toString();
	}
}
