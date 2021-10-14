package modulo3;

import java.util.Scanner;

//import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su letra...");
		Scanner sc= new Scanner(System.in);
		char letra = sc.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal");
		}
	}
}

/*CON STRING: 
		System.out.println("Ingrese su letra...");
		Scanner sc= new Scanner(System.in);
		String letra = sc.next();

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal");
		}
 */