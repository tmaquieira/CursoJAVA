package modulo3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su variable 1...");
		Scanner sc= new Scanner(System.in);
		int variable1 = sc.nextInt();
		System.out.println("Ingrese su variable 2...");
		int variable2 = sc.nextInt();
		System.out.println("Ingrese su variable 3...");
		int variable3 = sc.nextInt();
		
		if (variable1 > variable2){
			if (variable1 > variable3) {
				System.out.println("La mayor de todas es: "+variable1);
			}else {
				System.out.println("La mayor de todas es: "+variable3);
			}
		}else if (variable2 > variable3){
			System.out.println("La mayor de todas es: "+variable2);
			}else{
				System.out.println("La mayor de todas es: "+variable3);
		}
	}
}
