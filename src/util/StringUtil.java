package util;

/*Realizar una clase StringUtil dentro de un paquete con el mismo nombre, en
ella realizar los siguientes métodos, se puede utilizar String.charAt,
Character.isDigit, String.contains y para comprender su funcionamiento se recomienda 
acceder al javadoc.
a. public static boolean containsDobleSpace(String str), que debe inspeccionar si el
string str contiene 2 espacios, en caso afirmativo devuelve true y en caso contrario
false.
b. static boolean containsNumber(String str), este método debe devolver true en caso
de contener un numero
 */

public class StringUtil {

	public static boolean containsDobleSpace(String unString) {
		if (unString.contains("  ")) {
			System.out.println("Contengo  dos espacios y un número 2.Contengo  dos espacios y un número 2.");//true
			return true;	
		}else {
			System.out.println("No contengo dos espacios ni un número.");//true
			return false;	
		}
	}
	
	public static boolean containsNumber(String unString) {
		return unString.matches(".*\\d.*");
		/*NO ME FUNCA Y NO SÉ POR QUÉ:
	 	boolean contieneNum = false;
		for(char c : unString.toCharArray()){
	        if(Character.isDigit(c)){
	        	contieneNum = true;
	        } else if(contieneNum){
	          break;                
	        }
	    }
		return contieneNum;*/
	}	
}

/*OTRA FORMA QUE SUPUESTAMENTE SI FUNCIONA: 		
for (int i = 0; i < unString.length(); i++) {
	if (unString.charAt(i) >= '0' && unString.charAt(i) <= '9') {
	if (isDigit(unString.charAt(i))) {
		return true;
	}
	else {
		return false;
	}
}
*/
