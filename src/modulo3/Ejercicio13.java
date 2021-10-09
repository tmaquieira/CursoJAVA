package modulo3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese mes en minúsculas...");
		Scanner sc= new Scanner(System.in);
		String nombreMes = sc.next();
		
	switch (nombreMes){
	case "enero":
		System.out.println(nombreMes+" tiene 31 días.");
	break;
	case "febrero":
		System.out.println(nombreMes+" tiene 28 días.");
	break;
	case "marzo":
		System.out.println(nombreMes+" tiene 31 días.");
	break;
	case "abril":
		System.out.println(nombreMes+" tiene 30 días.");
		break;
	case "mayo":
		System.out.println(nombreMes+" tiene 31 días.");
		break;
	case "junio":
		System.out.println(nombreMes+" tiene 30 días.");
		break;
	case "julio":
		System.out.println(nombreMes+" tiene 31 días.");
		break;
	case "agosto":
		System.out.println(nombreMes+" tiene 31 días.");
		break;
	case "septiembre":
		System.out.println(nombreMes+" tiene 30 días.");
		break;
	case "octubre":
		System.out.println(nombreMes+" tiene 31 días.");
		break;
	case "noviembre":
		System.out.println(nombreMes+" tiene 30 días.");
		break;
	case "diciembre":
		System.out.println(nombreMes+" tiene 31 días.");
		break;	
		} 
	}
}
