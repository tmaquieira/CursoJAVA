package modulo4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		int i=1;
		int suma=0;
		
		System.out.println("Te muestro los números al azar: ");
		while(i<numeros.length){  
		numeros[i]=(int) (Math.random()*10);
		suma = suma + numeros[i];
		System.out.println(numeros[i]);
		i++;  
		}  
		System.out.println("Te muestro la suma de los números al azar: "+suma);
		System.out.println("Te promedio la suma de los números al azar: "+suma/numeros.length);
	}
}
