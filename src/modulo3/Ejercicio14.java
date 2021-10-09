package modulo3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su puesto...");
		Scanner sc= new Scanner(System.in);
		int puesto = sc.nextInt();
	
		switch (puesto){
		case 1:
		System.out.println("Medalla de Oro");
		break;
		case 2:
		System.out.println("Medalla de Plata");
		break;
		case 3:
		System.out.println("Medalla de Bronce");
		break;
		default:
			System.out.println("Siga participando");
		} 
	}
}
