package modulo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticaEnClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fechas
		Date fecha = new Date();
		//otra clase para manejar fecha:
		//es una clase abstracta, no se puede instanciar objetos de ella
		//getInstance es un método estático para suplantar esa falla
		//un método estático se puede usar sin necesidad de crear objetos.
		Calendar calendario = Calendar.getInstance();//patron de diseño singleton
		//para darle un mejor formato:
		SimpleDateFormat sdf=new SimpleDateFormat("EEEEEEEEE dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Hoy es: "+fecha);
		System.out.println("Hoy es: "+sdf.format(fecha));
		
		System.out.println("Hoy es: "+calendario.get(Calendar.DATE));
		System.out.println("Estamos en el mes: "+(calendario.get(Calendar.MONTH)+1));
		System.out.println("Y el año: "+calendario.get(Calendar.YEAR));
		
		switch (calendario.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			System.out.println("Hoy es Lúnes");
			break;
		case Calendar.TUESDAY:
			System.out.println("Hoy es Martes");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("Hoy es Miércoles");
			break;
		case Calendar.THURSDAY:
			System.out.println("Hoy es Jueves");
			break;
		case Calendar.FRIDAY:
			System.out.println("Hoy es Viernes");
			break;
		case Calendar.SATURDAY:
			System.out.println("Hoy es Sábado");
			break;
		case Calendar.SUNDAY:
			System.out.println("Hoy es Domingo");
			break;
		default:
			break;
		}
		
		//también se pueden hacer operaciones matemáticas con Calendar:
		calendario.add(Calendar.DATE, 10); //a diferencia de los strings, este sí se modifica permanentemente
		System.out.println("La fecha de acá a 10 días: "+sdf.format(calendario.getTime()));
		calendario.add(Calendar.MONTH, 3);
		System.out.println("La fecha de acá a 3 meses: "+sdf.format(calendario.getTime()));

	}
}
