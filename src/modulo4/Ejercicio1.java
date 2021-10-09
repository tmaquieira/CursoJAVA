package modulo4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el número a multiplicar...");
		Scanner sc= new Scanner(System.in);
		int base = sc.nextInt();
		
		for(int i=0; i<11; i++) {
			System.out.println(base+" x "+i+" = "+base*i);
		}
	}
}
