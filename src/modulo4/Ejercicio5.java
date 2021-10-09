package modulo4;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	for(int i=0; i<11; i++) {
	//	System.out.println(base+" x "+i+" = "+base*i);	}
		int numeros[] = new int[10];
		int i=0;
		int numMin=10;
		int numMay=0;

		System.out.println("Te muestro los números al azar:");
		do {
			numeros[i]=(int) (Math.random()*10);
			System.out.println(numeros[i]);
			
			if(numeros[i]<numMin) {
				numMin=numeros[i];
			}
			if(numeros[i]>numMay) {
				numMay=numeros[i];
			}
			
			i++;  
			} while (i<numeros.length);
	
	System.out.println("Número mínimo: "+numMin);
	System.out.println("Número máximo: "+numMay);

	}
}
