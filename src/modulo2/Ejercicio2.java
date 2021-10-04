package modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=++i;
		System.out.println("j=" + j);
		System.out.println("i=" + i);
		System.out.println("ahora si los quiero ver");
		System.out.println(i++ + "-" + ++i);
				
		byte bmin = -128;
		byte bmax = 127;
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short smin = Short.MIN_VALUE; //2 >> 15 = 32768
		short smax = Short.MAX_VALUE;
		int imin = Integer.MIN_VALUE; //2 >> 31 = 2147483648
		int imax = Integer.MAX_VALUE;
		long lmin = Long.MIN_VALUE; //2 >> 63  = 9223372036854775808
		long lmax = Long.MAX_VALUE;;
		System.out.println("tipo\tmínimo\t\t\tmáximo");
		System.out.println("....\t......\t\t\t......");
		System.out.println("\nbyte\t" + bmin + "\t\t\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t\t\t" + smax);
		System.out.println("\nint\t" + imin + "\t\t" + imax);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);

		//Cuál es la fórmula general que me permite mostrar los mínimos 
		//y los máximos teniendo en cuenta la cantidad de bits?
	}

}
