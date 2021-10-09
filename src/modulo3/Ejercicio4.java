package modulo3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su categoría...");
		Scanner sc= new Scanner(System.in);
		String categoria = sc.next();
			 
		if (categoria.equals("a")) {
			System.out.println("hijo");
		}else if(categoria.equals("b")) {
			System.out.println("padres");
		}else if(categoria.equals("c")) {
			System.out.println("abuelos");
		}
		
		 /*
		switch (categoria){
		case "a":
		System.out.println("hijo");
		break;
		case "b":
		System.out.println("padres");
		break;
		case "c":
		System.out.println("abuelos");
		break;
		} */
	}
}
