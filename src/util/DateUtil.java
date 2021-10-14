package util;

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
		return cal.get(Calendar.MONTH);
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
	
	public static boolean isDiaDeSemana(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		if ((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) { 
			System.out.println("No es finde");
			return false;
		} else {
			System.out.println("Es finde");
			return true;  
		}	
	}
	
	public static int getDiaDeSemana(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	public static Date asDate(String pattern, String fecha) {
	/*	SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String paramFecha = "31-08-1982 10:20:56";
		Date date = sdf.parse(fecha);
		System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982*/
		return null;		
	}

	public static Calendar asCalendar(String pattern, String fecha) {
		Calendar cal = Calendar.getInstance();
		/*SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		cal.setTime(sdf.parse("Mon Mar 14 16:02:37 GMT 2011"));// all done*/
		return null;
	}
	
	public static String asString(String pattern, Date fecha) {
		return pattern;	
	}	
}
