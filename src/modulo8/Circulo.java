package modulo8;

public class Circulo extends Figura {
	private float radio;
	private double pi = 3.14159265358979323846;
	
	public Circulo() {
		super();
	}
	public Circulo(float unaMaximaSuperficie, String unNombre, float unRadio) {
		super(unaMaximaSuperficie, unNombre);
		radio = unRadio;
	}

	public float getRadio() {
		return radio;
	}	
	public void setRadio(float unRadio) {
		radio = unRadio;
	}	

	@Override
	public String getValores() {
		return ("Si el radio del círculo es: "+radio+"\nSu Perímetro es: "+calcularPerimetro()+"\nY su Superficie es: "+calcularSuperficie());
	}
	@Override
	public float calcularPerimetro() {
		return (float) (2*radio*pi) ;
	}
	@Override
	public float calcularSuperficie() {
		if((float) pi*(radio*radio) <= getMaximaSuperficie()) {
			return (float) pi*(radio*radio);
		}else {
			System.out.println("Se pasa de la Superficie Máxima =");
			return getMaximaSuperficie();
		}
	}
	
	public boolean equals(Object obj) {
		boolean bln = false; 
		if (obj instanceof Circulo) {
			Circulo cir = (Circulo) obj;	
			bln = super.equals(obj) && cir.getRadio() == radio;
		}
		return bln;
	}
	public int hashCode() {
		return super.hashCode() + (int) radio;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("radio = ");
		sb.append(radio);
		return sb.toString();
	}
}
