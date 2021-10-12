package modulo4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el número a multiplicar...");
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
		System.out.println("La suma de todos los múltiplos pares es: "+suma);
		}
}

/*
//con Algoritmo:
		for(int i=0; i<11; i++) {
		suma = suma + (base*i); //primero sumame todo; 2x1, 2x2, 2x3...
		suma = suma - (((i%2)*i)*base); //después restame solo los impares.
//resultado del módulo (1 o 0) x multiplicador (1,2,3...) x multiplicado (número ingresado por el usuario)
		}
 */