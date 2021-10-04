package modulo2;
import java.math.BigInteger;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Completar con el tipo de dato que corresponda, se debe tener en cuenta que 
		//la suma de 2 bytes va a sobrepasar el byte.
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		
		short sumabb=(short)(b+b);
		int sumabs=(int)(b+s);
		long sumabi=(long)(b+i);
		long sumaii=(long)(i+i);
		long sumasl= (long)(s+l); //??????????????
		//BigInteger sumasl= new BigInteger (s+l)L; //??????????????

	}
}
