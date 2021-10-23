package modulo7;

public class CajaDeAhorro extends Cuenta {
	//atributos 
	private float interes;
	
	//constructores
	public CajaDeAhorro() {
		super(); //llama al constructor del padre
	}
	public CajaDeAhorro(int pNum, float pSaldo, float pInteres) {
		super(pNum, pSaldo);
		interes = pInteres;
	}

	//getters y setters
	public float getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	
	//métodos heredados
	@Override
	public void acreditar(float pMonto) {
	}
	@Override
	public void debitar(float pMonto) {
		if (pMonto <= getSaldo()){
			saldo -= pMonto;
		}
	}
}
