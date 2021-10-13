package modulo5;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringi = "esto es una prueba de la clase string"; 
		int vocales = 0;
		int consonantes = 0;
		
		for(int i=0; i<stringi.length(); i++) {
			char letrita = stringi.charAt(i);
			
			if(letrita == 'a' || letrita == 'e' || letrita == 'i' || letrita == 'o' || letrita == 'u') {
				vocales = vocales +1;
			}else if (letrita == 'b' || letrita == 'c' || letrita == 'd' || letrita == 'f' || letrita == 'g' || letrita == 'h' || letrita == 'j' || letrita == 'k' || letrita == 'l' || letrita == 'm' || letrita == 'n' || letrita == 'ñ' || letrita == 'p' || letrita == 'q' || letrita == 'r' || letrita == 's' || letrita == 't' || letrita == 'v' || letrita == 'w' || letrita == 'x' || letrita == 'y' || letrita == 'z'){
				consonantes = consonantes +1;
			}//si el texto tuviera mayúsculas, no las ve y no las suma.
		}
		System.out.println("De la frase '"+stringi+"' se obtuvieron "+vocales+" vocales y "+consonantes+" consonantes.");
	}
}
