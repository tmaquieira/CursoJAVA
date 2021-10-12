package modulo4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su categoria...");
		Scanner sc= new Scanner(System.in);
		String categoria = sc.next();
		System.out.println("Ingrese su antiguedad...");
		int antiguedad = sc.nextInt();
		System.out.println("Ingrese su sueldo...");
		double sueldoB = sc.nextLong();
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
	System.out.println("El sueldo Neto será de: $ "+(sueldoB+numCat+(sueldoB*numAnt)));
		}
}

/*CÓDIGO MEJORADO (1 sola variable de cálculo):
 
 System.out.println("Ingrese su categoria...");
		Scanner sc= new Scanner(System.in);
		String categoria = sc.next();
		System.out.println("Ingrese su antiguedad...");
		int antiguedad = sc.nextInt();
		System.out.println("Ingrese su sueldo...");
		double sueldoB = sc.nextDouble();

		if(antiguedad >=1 && antiguedad <=5) {
			sueldoB = sueldoB * 1.05;
		} else if (antiguedad >=6 && antiguedad <=10) {
			sueldoB = sueldoB * 1.10;
		}else if (antiguedad >10){
			sueldoB = sueldoB * 1.30;
		}
		if(categoria.equals("a")) {
			sueldoB = sueldoB + 1000.00;
		} else if (categoria.equals("b")) {
			sueldoB = sueldoB + 2000.00;
		}else if (categoria.equals("c")){
			sueldoB = sueldoB + 3000.00;
		}
	System.out.println("El sueldo Neto será de: $ "+sueldoB);
 
 */
