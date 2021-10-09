package modulo2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 8;
		short s = 1525; 
		int i = 32000;
		long l = 343896812;
		
		b = (byte) s;
		l = i; //la única que corre OK
		b = (byte) i;
		s = (short) i;

		System.out.println(l);
		System.out.println(b);
		System.out.println(s);
	}
}
