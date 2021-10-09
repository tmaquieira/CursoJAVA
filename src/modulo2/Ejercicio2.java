package modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bmin = -128;
		byte bmax = 127;
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short smin = Short.MIN_VALUE; 
		short smax = Short.MAX_VALUE ;//2^15 -1 = 32767
		int imin = Integer.MIN_VALUE; 
		int imax = Integer.MAX_VALUE;//2^31 -1 = 2147483647
		long lmin = Long.MIN_VALUE; 
		long lmax = Long.MAX_VALUE;//2^63 -1 = 9223372036854775807
		System.out.println("tipo\tmínimo\t\t\tmáximo");
		System.out.println("....\t......\t\t\t......");
		System.out.println("\nbyte\t" + bmin + "\t\t\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t\t\t" + smax);
		System.out.println("\nint\t" + imin + "\t\t" + imax);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);

		//Cuál es la fórmula general que me permite mostrar los mínimos 
		//y los máximos teniendo en cuenta la cantidad de bits?
		//2^31
		
		//smin=(short) ((Math.pow(2,15))*(-1));
	}
}
