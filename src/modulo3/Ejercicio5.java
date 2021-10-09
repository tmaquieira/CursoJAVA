package modulo3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su puesto...");
		Scanner sc= new Scanner(System.in);
		int puesto = sc.nextInt();
	
		if(puesto == 1) {
			System.out.println("Medalla de Oro");
		}else if(puesto == 2) {
			System.out.println("Medalla de Plata");
		}else if(puesto ==3) {
			System.out.println("Medalla de Bronce");
		}else {
			System.out.println("Siga participando");
		} 
	}
}
