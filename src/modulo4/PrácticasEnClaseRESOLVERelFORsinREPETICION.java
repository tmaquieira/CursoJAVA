package modulo4;

public class PrácticasEnClaseRESOLVERelFORsinREPETICION {

	public static void main(String[] args) {
		int loteria[] = new int[100];
		int valor =0;
		for(int i=0;i<100;i++){
			loteria[i]=(int)(Math.random()*1000%100);
//			int j=0;
			//para pensar....recorrer todos los anteriores y que el valor  no se repita
//			while(loteria[j++]==valor)
//				valor=(int)(Math.random()*1000%100);
		}
			
		
		System.out.println("Los 100 números son:");
		for(int i=0;i<100;i++)
			System.out.println("loteria[" + i + "]=" + loteria[i]);
		
		
		System.out.println("Los 10 primeros son:");
		for(int i=0;i<10;i++)
			System.out.println("loteria[" + i + "]=" + loteria[i]);
			
		/////hasta aca es un array de una posicios
		char teclado[][] ={ {'1','2','3','A'},
							{'4','5','6','B'},
							{'7','8','9','C'},
							{'*','0','#','D'}
							};
		System.out.println("ahora voy a mostrar el teclado");
		System.out.println("cantidad de filas=" + teclado.length);
		System.out.println("cantidad de columnas=" + teclado[0].length);
		System.out.println("\n\nmostrar el teclado completo\n");
		for (int fila=0;fila<teclado.length; fila++){
			for(int col = 0;col<teclado[fila].length;col++)
				System.out.print("teclado["+fila + "]["+ col + "]=" + teclado[fila][col] + " , ");
			System.out.println();
		}

	}

}
