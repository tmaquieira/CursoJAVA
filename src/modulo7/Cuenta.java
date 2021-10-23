package modulo7;

public abstract class Cuenta {
	//atributos
	private int numero;
	protected float saldo; //atributo visible para las clases que heredan de Cuenta
	
	//constructores
	//primer m�todo que se ejecuta al crear un objeto
	public Cuenta() {
	}
	//cuando 2 m�t. tienen el mismo nombre y se diferencian por sus par�metros, se llama Sobrecarga.
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
	
	//m�todos de negocio
	//m�todos abstractos: no est�n implementados. obliga a las clases que heredan a implementar sus propias normas
	public abstract void acreditar(float pMonto);
	
	public abstract void debitar(float pMonto);

}
