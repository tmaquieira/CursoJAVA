package modulo7;

public class CajaDeAhorro extends Cuenta {
	//atributos 
	private float interes;
	
	//constructores
	public CajaDeAhorro() {
		//llama al constructor del padre
		super(); 
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
		saldo += pMonto;
	}
	@Override
	public void debitar(float pMonto) {
		if (pMonto <= getSaldo()){
			saldo -= pMonto;
		}
	}
	//equals hace un upCast
	public boolean equals(Object obj) {
		boolean bln = false;
			if(obj instanceof CajaDeAhorro) {
				//hago un downCast
				CajaDeAhorro ca = (CajaDeAhorro) obj;
				bln=super.equals(obj) && ca.getInteres() == interes;
			}
		return bln;
	//o simplemente:
	//return super.equals(obj) && obj instanceof CajaDeAhorro && ((CajaDeAhorro)obj).getInteres()==interes; 
	}
	
	public int hashCode(){
		return super.hashCode() + (int) interes;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", interes=");
		sb.append(interes);
		return sb.toString();
	}
}
