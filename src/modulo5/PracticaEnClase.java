package modulo5;

import java.util.Scanner;

public class PracticaEnClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un texto a codificar: ");
		Scanner sc = new Scanner(System.in);
		//MURCIELAGO
		//0123456789
		String textoOriginal = sc.nextLine(); //"next" devuelve solo la primer palabra 
		String textoMayuscula = textoOriginal.toUpperCase(); //"next" devuelve solo la primer palabra 
		//toUpercase
		System.out.println("Original="+ textoOriginal);
		System.out.println("Todo en mayúsculas="+ textoOriginal.toUpperCase());
		System.out.println("Todo en minúsculas="+ textoOriginal.toLowerCase());
		System.out.println("Original="+ textoOriginal);

		System.out.println("\ny la clave del murciélago pa cuándo?");
		//llamado on the fly: llamar objetos no referenciados
		String murcielago = textoOriginal.toLowerCase() //el perro verde (minusc)
		.replace('m', '0')
		.replace('u','1')
		.replace('r', '2')//el pe22o ve2de
		.replace('c', '3')
		.replace('i', '4')
		.replace('e', '5')
		.replace('l', '6')
		.replace('a', '7')
		.replace('g', '8')
		.replace('o','9')
		.toUpperCase();
		System.out.println("\nEn clave murciélago= "+murcielago);
		
		for (int i=0; i<textoOriginal.length(); i++) {
			System.out.println("Posición "+i+" char= "+textoOriginal.charAt(i));
		}
		
	}
}
