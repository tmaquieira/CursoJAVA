package modulo8;

public class Triangulo extends Figura {
	private float lado1;
	private float lado2;
	private float lado3;
	private float base;
	private float altura;
	
	public Triangulo() {
		super();
	}
	public Triangulo(float unaMaximaSuperficie, String unNombre, float unLado1, float unLado2, float unLado3, float unaBase, float unaAltura) {
		super(unaMaximaSuperficie, unNombre);
		lado1 = unLado1;
		lado2 = unLado2;
		lado3 = unLado3;
		base = unaBase;
		altura = unaAltura;
	}

	@Override
	public String getValores() {
		return ("Si el lado1 del triángulo es: "+lado1+", el lado2 es: "+lado2+" y el lado3 es: "+lado3+"\nSu Perímetro es: "+calcularPerimetro()+"\nY su Superficie es: "+calcularSuperficie());
	}
	@Override
	public float calcularPerimetro() {
		return lado1+lado2+lado3;
	}
	@Override
	public float calcularSuperficie() {
		if((base*altura)/2 <= getMaximaSuperficie()) {
			return (base*altura)/2;
		}else {
			System.out.println("Se pasa de la Superficie Máxima =");
			return getMaximaSuperficie();
		}
	}
	
	public boolean equals(Object obj) {
		boolean bln = false; 
		if (obj instanceof Triangulo) {
			bln = super.equals(obj);
		}//requeriría igualar todos los lados, base y altura.
		return bln;
	}
	public int hashCode() {
		return super.hashCode() + (int) lado1 + (int) lado2 + (int) lado3 + (int) base + (int) altura;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("lado1 = ");
		sb.append(lado1);
		sb.append("lado2 = ");
		sb.append(lado2);
		sb.append("lado3 = ");
		sb.append(lado3);
		sb.append("base = ");
		sb.append(base);		
		sb.append("altura = ");
		sb.append(altura);
		return sb.toString();
	}
}
