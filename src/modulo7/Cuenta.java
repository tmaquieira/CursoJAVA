package modulo7;

public class Cuenta {
	//atributos
	private int numero;
	private float saldo;
	
	//constructores
	//primer método que se ejecuta al crear un objeto
	public Cuenta() {
	}
	//cuando 2 mét. tienen el mismo nombre y se diferencian por sus parámetros, se llama Sobrecarga.
	public Cuenta (int pNum, float pSaldo) {
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
	
	//métodos de negocio
	public void acreditar(float pMonto) {
		saldo += pMonto;
	}
	public void debitar(float pMonto) {
		saldo -= pMonto;
	}

	

}
