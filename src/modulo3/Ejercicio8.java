package modulo3;

import java.util.Scanner;

//import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Ingrese su jugada, jugador 1...");
		Scanner sc= new Scanner(System.in);
		int jugador1 = sc.nextInt();
		System.out.println("Ingrese su jugada, jugador 2...");
		int jugador2 = sc.nextInt();
		
		if ((jugador1 == 0 && jugador2 == 2)||(jugador1 == 1 && jugador2 == 0)||(jugador1 == 2 && jugador2 == 1)) {
			System.out.println("Ganó Jugador 1!");
		}else if ((jugador2 == 0 && jugador1 == 2)||(jugador2 == 1 && jugador1 == 0)||(jugador2 == 2 && jugador1 == 1)) {
			System.out.println("Ganó Jugador 2!");
		}else {
			System.out.println("Empate!");
		}
	}
}
