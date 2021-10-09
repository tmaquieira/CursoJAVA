package modulo2;
import java.math.BigInteger;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Completar con el tipo de dato que corresponda, se debe tener en cuenta que 
		//la suma de 2 bytes va a sobrepasar el byte.
		byte b=(byte)(Math.random()*Byte.MAX_VALUE);
		short s=(short)(Math.random()*Short.MAX_VALUE);
		int i=(int)(Math.random()*Integer.MAX_VALUE);
		long l=(long)(Math.random()*Long.MAX_VALUE);
		//byte b=10;
		//short s=20;
		//int i=30;
		//long l=40;
		
		int sumabb=b+b;
		int sumabs=b+s;
		int sumabi=b+i;
		long sumaii=i+i;
		long sumasl=s+l; //necesita casteo manual; que el tipo se responsabilice de que entre lo que pueda

		System.out.println(sumabb);
		System.out.println(sumabs);
		System.out.println(sumabi);
		System.out.println(sumaii);
		System.out.println(sumasl);
	}
}
