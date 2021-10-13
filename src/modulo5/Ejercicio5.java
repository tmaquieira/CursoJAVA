package modulo5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringi = "gcasas1972@gmail.com"; 
		boolean hayNum = false;
	    
		for(char c : stringi.toCharArray()){
	        if(Character.isDigit(c)){
	          hayNum = true;
	        } else if(hayNum){
	          break;                
	        }
	    }
		System.out.println("Hay números?: "+hayNum);
	}	

}