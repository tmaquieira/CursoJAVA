package modulo3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		System.out.println("Ingrese su variable de auto...");
		Scanner sc= new Scanner(System.in);
		char variable = sc.next().charAt(0);

		switch (variable){
		case 'a':
		System.out.println("Este auto tiene 4 ruedas y 1 motor.");
		break;
		case 'b':
		System.out.println("Este auto tiene 4 ruedas, 1 motor, cierre centralizado y aire.");
		break;
		case 'c':
		System.out.println("Este auto tiene 4 ruedas, 1 motor, cierre centralizado, aire y airbag.");
		break;
		} 
	}
}
