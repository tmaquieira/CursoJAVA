package modulo3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese mes en min�sculas...");
		Scanner sc= new Scanner(System.in);
		String nombreMes = sc.next();
		
	switch (nombreMes){
	case "enero":
		System.out.println(nombreMes+" tiene 31 d�as.");
	break;
	case "febrero":
		System.out.println(nombreMes+" tiene 28 d�as.");
	break;
	case "marzo":
		System.out.println(nombreMes+" tiene 31 d�as.");
	break;
	case "abril":
		System.out.println(nombreMes+" tiene 30 d�as.");
		break;
	case "mayo":
		System.out.println(nombreMes+" tiene 31 d�as.");
		break;
	case "junio":
		System.out.println(nombreMes+" tiene 30 d�as.");
		break;
	case "julio":
		System.out.println(nombreMes+" tiene 31 d�as.");
		break;
	case "agosto":
		System.out.println(nombreMes+" tiene 31 d�as.");
		break;
	case "septiembre":
		System.out.println(nombreMes+" tiene 30 d�as.");
		break;
	case "octubre":
		System.out.println(nombreMes+" tiene 31 d�as.");
		break;
	case "noviembre":
		System.out.println(nombreMes+" tiene 30 d�as.");
		break;
	case "diciembre":
		System.out.println(nombreMes+" tiene 31 d�as.");
		break;	
		} 
	}
}
