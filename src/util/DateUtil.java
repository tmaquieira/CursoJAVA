package util;

import java.util.Calendar;
import java.util.Date;


/*Esta clase tiene una serie de métodos vinculados con el manejo de fechas
 ofreciendo un conjunto de serivicios*/
/*
Este método devuelve el año de la fecha que se envía por parámetro 
@param pFecha corresponde al parámetro donde se envía la fecha
@return devuelve un valor de tipo int donde se encuentra el año
 */
public class DateUtil {

	public static int getAnio(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		return cal.get(Calendar.YEAR);
	}
}
