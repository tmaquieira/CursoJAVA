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
		saldo += pMonto;
	}
	@Override
	public void debitar(float pMonto) {
		if (pMonto <= (saldo+descubierto)){
			saldo -= pMonto;
		}
	}
	
	public boolean equals(Object obj) {
		boolean bln=false;
		if(obj instanceof CuentaCorriente) {
			//downcast
			CuentaCorriente cc = (CuentaCorriente) obj;
			bln=super.equals(obj) && cc.getDescubierto() == descubierto;
		}
		return bln;
	}
	
	public int hashCode() {
		return super.hashCode()+(int)descubierto;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", descubierto = ");
		sb.append(descubierto);
		return sb.toString();
	}
}
