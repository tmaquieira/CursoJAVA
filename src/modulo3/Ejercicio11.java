package modulo3;

import java.util.Scanner;

//import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su número de Ruleta...");
		Scanner sc= new Scanner(System.in);
		int numeroRuleta = sc.nextInt();
				
		if (numeroRuleta>=1 && numeroRuleta<=12){
			System.out.println(numeroRuleta+" pertenece a la Primera Docena.");
		}else if (numeroRuleta>=13 && numeroRuleta<=24){
			System.out.println(numeroRuleta+" pertenece a la Segunda Docena.");
		}else if (numeroRuleta>=25 && numeroRuleta<=36){
				System.out.println(numeroRuleta+" pertenece a la Tercera Docena.");
		}else if (numeroRuleta<1 || numeroRuleta>36) {
		System.out.println("El número "+numeroRuleta+" está fuera de rango.");
	}
}
}