package modulo3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese mes en minúsculas...");
		Scanner sc= new Scanner(System.in);
		String nombreMes = sc.next();
		
	if (nombreMes == "febrero"){
		System.out.println(nombreMes+" tiene 28 días.");
	} else if (nombreMes == "abril" || nombreMes == "junio" || nombreMes == "setiembre"){
		System.out.println(nombreMes+" tiene 30 días.");
	} else {
		System.out.println(nombreMes+" tiene 31 días.");
	}
}
}
