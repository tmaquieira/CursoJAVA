package modulo4;

import java.util.Scanner;

public class Ejercicio2noEntiendoLoDeALGORITMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el n�mero a multiplicar...");
		Scanner sc= new Scanner(System.in);
		int base = sc.nextInt();
		
		for(int i=0; i<11; i++) {
			System.out.println(base+" x "+i+" = "+base*i);
		}
		int suma = 0;
		for(int i=0; i<11; i++) {
		if((base*i)%2==0) {
			suma = suma + (base*i);
		}
		}
		System.out.println("La suma de todos los m�ltiplos pares es: "+suma);
	//no entiendo c�mo realizarlo "con un algoritmo".
	//c�mo sentenciar el boolean correctamente en el sysout?
	}
}
