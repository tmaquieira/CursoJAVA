package util;

import java.util.Calendar;
import java.util.Date;


/*Esta clase tiene una serie de m�todos vinculados con el manejo de fechas
 ofreciendo un conjunto de serivicios*/
/*
Este m�todo devuelve el a�o de la fecha que se env�a por par�metro 
@param pFecha corresponde al par�metro donde se env�a la fecha
@return devuelve un valor de tipo int donde se encuentra el a�o
 */
public class DateUtil {

	public static int getAnio(Date paramFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(paramFecha);
		return cal.get(Calendar.YEAR);
	}
}
