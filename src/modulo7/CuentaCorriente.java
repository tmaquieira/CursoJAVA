package modulo7;

public class CuentaCorriente extends Cuenta {
	//atributos
	private float descubierto; 
	
	//constructores
	public CuentaCorriente() {
		super();
	}
	public CuentaCorriente(int pNum, float pSaldo, float pDescubierto) {
		super(pNum, pSaldo);
		descubierto = pDescubierto; 
	}
	
	//getters y setters
	public float getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(float descubierto) {
		this.descubierto = descubierto;
	}
	
	//métodos heredados
	@Override
	public void acreditar(float pMonto) {
	}
	@Override
	public void debitar(float pMonto) {
		if (pMonto <= (saldo+descubierto)){
			saldo -= pMonto;
		}
	}
}
