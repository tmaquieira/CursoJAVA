package modulo7;

public abstract class Cuenta {
	//atributos
	private static int cantidadDeCuentas;//los atributos estáticos no le pertenecen a ninguna clase
	private int numero;
	protected float saldo; //atributo visible para las clases que heredan de Cuenta
	
	//constructores - primer método que se ejecuta al crear un objeto
	public Cuenta() {
		cantidadDeCuentas++;
	}
	//cuando 2 mét. tienen el mismo nombre y se diferencian por sus parámetros, se llama Sobrecarga.
	public Cuenta (int pNum, float pSaldo) {
		this();//llamo al constructor vacío para que sume una cuenta en cantidadDeCuentas.
		numero = pNum;
		saldo = pSaldo;
	}
	//accessors
	public void setNumero(int pNum) {
		numero=pNum;
	}
	public int getNumero(){
		return numero;
	}
	public float getSaldo(){
		return saldo;
	}
	//un método estático no puede acceder a los atributos
	public static int getCantidadDeCuentas() {
		return cantidadDeCuentas;
	}
	public static void limpiarCantidadDeCuentas() {
		cantidadDeCuentas = 0;
	}
	
	//métodos de negocio
	//métodos abstractos: no están implementados. obliga a las clases que heredan a implementar sus propias normas
	public abstract void acreditar(float pMonto);
	
	public abstract void debitar(float pMonto);

	public boolean equals(Object obj) {
		boolean bln = false; 
		if (obj instanceof Cuenta) {
			//downCast 
			Cuenta cue = (Cuenta) obj;	
			bln = numero == cue.getNumero() && saldo == cue.getSaldo();
		}
		return bln;
	}
	
	public int hashCode() {
		return numero+(int)saldo;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnumero = ");
		sb.append(numero);
		sb.append(", saldo = ");
		sb.append(saldo);
		return sb.toString();
	}
}
