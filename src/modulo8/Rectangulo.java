package modulo8;

public class Rectangulo extends Figura {
	private float altura;
	private float base;
	
	public Rectangulo() {
		super();
	}
	public Rectangulo(String unNombre) {
		super(unNombre);
	}
	public Rectangulo(float unaMaximaSuperficie, String unNombre, float unaAltura, float unaBase) {
		super(unaMaximaSuperficie, unNombre);
		altura = unaAltura;
		base = unaBase;
	}

	public float getAltura() {
		return altura;
	}	
	public float getBase() {
		return base;
	}	
	public void setAltura(float unaAltura) {
		altura = unaAltura;
	}	
	public void setBase(float unaBase) {
		base = unaBase;
	}	

	@Override
	public String getValores() {
		return ("Si la altura del rectángulo es: "+altura+" y la base es: "+base+"\nSu Perímetro es: "+calcularPerimetro()+"\nY su Superficie es: "+calcularSuperficie());
	}
	@Override
	public float calcularPerimetro() {
		return (altura*2)+(base*2);
	}
	@Override
	public float calcularSuperficie() {
		if(altura*base <= getMaximaSuperficie()) {
			return altura*base;
		}else {
			System.out.println("Se pasa de la Superficie Máxima =");
			return getMaximaSuperficie();
		}
	}
	
	public boolean equals(Object obj) {
		boolean bln = false; 
		if (obj instanceof Rectangulo) {
			Rectangulo rec = (Rectangulo) obj;	
			bln = super.equals(obj) && rec.getAltura() == altura && rec.getBase() == base;
		}
		return bln;
	}
	public int hashCode() {
		return super.hashCode() + (int) altura + (int) base;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("altura = ");
		sb.append(altura);
		sb.append("base = ");
		sb.append(base);
		return sb.toString();
	}
}
