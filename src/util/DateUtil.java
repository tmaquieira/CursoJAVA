package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


/*Esta clase tiene una serie de métodos vinculados con el manejo de fechas 
 ofreciendo un conjunto de serivicios*/
/*
Este método devuelve el año de la fecha que se envía por parámetro 
@param pFecha corresponde al parámetro donde se envía la fecha
@return devuelve un valor de tipo int donde se encuentra el año
 */
public class DateUtil {

	public static int getAnio(Date paramFecha) {
		Calendar cal = Calendar.getInstance();//factory, singleton
		cal.setTime(paramFecha);
		return cal.get(Calendar.YEAR);
	}
	
	public static int getMes(Date paramFecha) {
		Calendar cal = Calendar.getInstance();//factory, singleton
		cal.setTime(paramFecha);
		return cal.get(Calendar.MONTH)+1;
	}
	
	public static int getDia(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public static boolean isFinDeSemana(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		if ((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) { 
			System.out.println("Es finde");
			return true;
		} else {
		    System.out.println("No es finde");
			return false;
		}		
	}
	/*OTRA FORMA:
	 public static boolean esFinde (Date fecha) {
	
	Calendar cal = Calendar.getInstance();
	boolean es = false;
	cal.setTime(fecha);
	 if (cal.get(Calendar.DAY_OF_WEEK) > 5) es = true;
	 return es;
	}
*/
	public static boolean isDiaDeSemana(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		if ((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) { 
			System.out.println("No es día lubural");
			return false;
		} else {
			System.out.println("Es día lubural");
			return true;  
		}	
		//también se puede devolver el valor del boolean directamente en el return: 
		/*
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		return (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) 
		 */
	}
	
	public static int getDiaDeSemana(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	public static Date asDate(String pattern, String fecha) {
		int dia;
		int mes;
		int anio;
		Calendar cal = Calendar.getInstance();

		if(pattern.equals("dd-MM-YYYY")){
		  dia = Integer.parseInt(fecha.substring(0,2));
		  mes = Integer.parseInt(fecha.substring(3,5));
		  anio = Integer.parseInt(fecha.substring(7));
		  cal.set(dia, mes-1, anio);
		
		} else if (pattern.equals("MM-dd-YYYY")){
			mes = Integer.parseInt(fecha.substring(0,2));
			dia = Integer.parseInt(fecha.substring(3,5));
			anio = Integer.parseInt(fecha.substring(7));
			cal.set(mes-1, dia, anio);
		
		}
		  Date result = cal.getTime();
		  return result;
		/*	SACADO DE NTERNET: SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String paramFecha = "31-08-1982 10:20:56";
		Date date = sdf.parse(fecha);
		System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
		return null;*/	
	}

	public static Calendar asCalendar(String pattern, String fecha) {
		return null;
	}
	
	public static String asString(String pattern, Date fecha) {
		fecha = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");  
		pattern = dateFormat.format(fecha);  
		return "Convertido a String: "+pattern;	
		//No se vio en clase. Sacado de https://www.javatpoint.com/java-date-to-string
	}	
}
