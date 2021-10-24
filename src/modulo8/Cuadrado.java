package modulo8;

public class Cuadrado extends Figura {
	private float lado;
	
	public Cuadrado() {
		super();
	}
	public Cuadrado(float unaMaximaSuperficie, String unNombre, float unLado) {
		super(unaMaximaSuperficie, unNombre);
		lado = unLado;
	}

	public float getLado() {
		return lado;
	}	
	public void setLado(float unLado) {
		lado = unLado;
	}	

	@Override
	public String getValores() {
		return ("Si el lado del cuadrado es: "+lado+"\nSu Perímetro es: "+calcularPerimetro()+"\nY su Superficie es: "+calcularSuperficie());
	}
	@Override
	public float calcularPerimetro() {
		return (lado*4) ;
	}
	@Override
	public float calcularSuperficie() {
		if(lado*lado <= getMaximaSuperficie()) {
			return lado*lado;
		}else {
			System.out.println("Se pasa de la Superficie Máxima =");
			return getMaximaSuperficie();
		}
	}
	
	public boolean equals(Object obj) {
		boolean bln = false; 
		if (obj instanceof Cuadrado) {
			Cuadrado cua = (Cuadrado) obj;	
			bln = super.equals(obj) && cua.getLado() == lado;
		}
		return bln;
	}
	public int hashCode() {
		return super.hashCode() + (int) lado;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("lado = ");
		sb.append(lado);
		return sb.toString();
	}
}
