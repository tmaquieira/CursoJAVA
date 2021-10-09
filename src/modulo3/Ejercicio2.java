package modulo3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su número...");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
				
		if(num%2==0) {
			System.out.println(num+" es par.");
		}else {
			System.out.println(num+" es impar.");
		}
	}
}
