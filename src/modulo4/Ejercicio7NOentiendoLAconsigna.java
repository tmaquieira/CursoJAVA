package modulo4;

import java.util.Scanner;

public class Ejercicio7NOentiendoLAconsigna {

	public static void main(String[] args) {
		/*(solo para valientes), tomar el ejercicio anterior y realizar un ciclo 
		 que se repita 10 veces tomando al categor�as al azar, lo mismo que el 
		 sueldo con valores l�gicos.
a. Utilizar Math.random(), y , utilizar un ciclo while y solamente salir de este 
cuando el resultado este dentro de los correctos.
*/		
		// TODO Auto-generated method stub
		System.out.println("Ingrese su categoria...");
		Scanner sc= new Scanner(System.in);
		String categoria = sc.next();
		System.out.println("Ingrese su antiguedad...");
		int antiguedad = sc.nextInt();
		System.out.println("Ingrese su sueldo...");
		double sueldoB = sc.nextDouble();
		double numAnt = 0.00;
		double numCat = 0.00;

		if(antiguedad >=1 && antiguedad <=5) {
			numAnt = 0.05;
		} else if (antiguedad >=6 && antiguedad <=10) {
			numAnt = 0.10;
		}else if (antiguedad >10){
			numAnt = 0.30;
		}
		if(categoria.equals("a")) {
			numCat = 1000.00;
		} else if (categoria.equals("b")) {
			numCat = 2000.00;
		}else if (categoria.equals("c")){
			numCat = 3000.00;
		}
	System.out.println("El sueldo Neto ser� de: $ "+(sueldoB+numCat+(sueldoB*numAnt)));
		}
}