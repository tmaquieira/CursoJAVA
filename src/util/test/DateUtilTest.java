package util.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DateUtil;

class DateUtilTest {
	//lote de prueba 
	Date fechaCumple;
	@BeforeEach
	void setUp() throws Exception {
		//se ejecuta antes de cada prueba
		Calendar cal = Calendar.getInstance();
		cal.set(1989, Calendar.JANUARY, 29);
		fechaCumple = cal.getTime();
	}

	@AfterEach
	void tearDown() throws Exception {
		//se ejecuta después de cada prueba
		fechaCumple = null;
	}

	@Test
	void test() {
		assertEquals(1989, DateUtil.getAnio(fechaCumple));
		//fail("Not yet implemented");
	}

}
