package modulo3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su curso...");
		Scanner sc= new Scanner(System.in);
		int curso = sc.nextInt();
	
		if (curso>=1 && curso<=6){
			System.out.println("primaria");
		}else if (curso>=7 && curso<=12){
			System.out.println("secundaria");
		}else{
			System.out.println("jardín de infantes");
		}
	}
}
