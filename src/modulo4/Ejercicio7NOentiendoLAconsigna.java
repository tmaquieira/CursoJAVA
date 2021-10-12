package modulo4;

public class Ejercicio7NOentiendoLAconsigna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*realizar un ciclo FOR de 10 repeticiones que tome Categorías, antiguedades 
		 y Sueldos al azar, con valores lógicos. Utilizar Math.random(), 
		 con un ciclo while y solo salir de este si el 
		 resultado es correcto.*/

		String categorias = "abc";
	
		for (int i = 0; i < 10; i++) {
	
			int categoriaAlAzar = (int) (Math.random()*3);
			char categoriaAlAzarATexto = categorias.charAt(categoriaAlAzar);
			int antiguedadAlAzar = (int) (Math.random()*35);
			double sueldoAlAzar = Math.floor(Math.random()*100000);

			System.out.println("\nEmpleado Nro: "+i);
			System.out.println("Categoría: "+categoriaAlAzarATexto);
			System.out.println("Antiguedad: "+antiguedadAlAzar);
			
			if(categoriaAlAzar == 0) {
				sueldoAlAzar = sueldoAlAzar + 1000.00;
			} else if (categoriaAlAzar == 1) {
				sueldoAlAzar = sueldoAlAzar + 2000.00;
			}else if (categoriaAlAzar == 2){
				sueldoAlAzar = sueldoAlAzar + 3000.00;
			}
			if(antiguedadAlAzar >=1 && antiguedadAlAzar <=5) {
				sueldoAlAzar = sueldoAlAzar * 1.05;
			} else if (antiguedadAlAzar >=6 && antiguedadAlAzar <=10) {
				sueldoAlAzar = sueldoAlAzar * 1.10;
			}else if (antiguedadAlAzar >10){
				sueldoAlAzar = sueldoAlAzar * 1.30;
			}	
			
			while (sueldoAlAzar > 0){
				System.out.println("\nEl sueldo Neto será de: $ "+(double)(Math.round(sueldoAlAzar * 100) / 100));
				break; 
			//el break es para frenar la repetición. 
			//el Math.round para mostrar solo 2 decimales.
			}
			
		}

		
	}
}


