package modulo3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cuentas
		float i=3;
		float j=i/0;
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		System.out.println("Ingrese nota 1...");
		Scanner sc= new Scanner(System.in);
		//float nota1 = sc.nextFloat();
		int nota1 = sc.nextInt();

		System.out.println("Ingrese nota 2...");
		//float nota2 = sc.nextFloat();
		int nota2 = sc.nextInt();

		System.out.println("Ingrese nota 3...");
		//float nota3 = sc.nextFloat();
		int nota3 = sc.nextInt();
		//si trabajamos con enteros, debemos castear a float para que muestre 
		//el resultado con decimales correctamente (sino traerá un entero):
		float promedio =(float)(nota1+nota2+nota3)/3;
		
		if (promedio>=7) {
			System.out.println("Aprobaste... viva!! Con "+promedio);
		}else {
			System.out.println("Desaprobaste... muelte!! :c Con "+promedio);
		}
		
		//como lo resolví yo:
		byte nota4 = 7;
		byte nota5 = 8;
		byte nota6 = 3;
				
		if (((nota4+nota5+nota6)/3) >= 7) {
			System.out.println("Aprobado"); 
		}else {
			System.out.println("Reprobado");
		}
	}

}
