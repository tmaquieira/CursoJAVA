package modulo2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=++i;
		System.out.println("j=" + j);
		System.out.println("i=" + i);
		System.out.println("ahora sí los quiero ver");
		//hasta acá i=1;
		System.out.println(i++ + "-" + ++i);
		//1-3
		
		//desplazamiento
		i=1357;
		j=i>>5;
		System.out.println("El valor de "+i+" desplazada 5 lugares es "+j);
		int x=-1357;
		int y=x>>5;
		System.out.println("El valor de "+x+" desplazada 5 lugares es "+y);
		
		//tipos de datos
		//byte, short, int, long, float, double tienen autocast
		byte b = 34;
		short s = b;
		i = 1357;
		//si quiero meter un i = b, necesito castear a mano.
		b = (byte)i;	
		s = (short)i;	
		System.out.println(b);
		System.out.println(s);

		int imin=Integer.MIN_VALUE;
		System.out.println("\nEl valor mínimo entero es "+imin);
		System.out.println("\nEl valor mínimo absoluto es "+(Math.abs(imin)-1));

	}
}
