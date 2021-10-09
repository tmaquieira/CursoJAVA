package modulo3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su letra...");
		Scanner sc= new Scanner(System.in);
		String letra = sc.next();

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal");
		}
	}
}
