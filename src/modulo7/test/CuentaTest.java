package modulo7.test;
import static org.junit.Assert.*; 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import modulo7.Cuenta;

public class CuentaTest {
	//lote de pruebas
	Cuenta cuentaVacia;
	Cuenta cuentaLlena;
	@Before
	public void setUp() throws Exception {
		cuentaVacia = new Cuenta();
		cuentaLlena = new Cuenta(10,100);
	}
	@After
	public void tearDown() throws Exception {
		cuentaVacia = null;
		cuentaLlena = null;
	}
	@Test
	public void testCuenta() {
		assertEquals(0, cuentaVacia.getNumero());
		assertEquals(0, cuentaVacia.getSaldo(),0.01);
	}
	@Test
	public void testCuentaIntFloat() {
		assertEquals(10, cuentaLlena.getNumero());
		assertEquals(100, cuentaLlena.getSaldo(),0.01);
	}
	@Test
	public void testAcreditarCuentaVacia() {
		cuentaVacia.acreditar(5);
		assertEquals(5, cuentaVacia.getSaldo(),0.01);
	}
	@Test
	public void testAcreditarCuentaLlena() {
		cuentaLlena.acreditar(5);
		assertEquals(105, cuentaLlena.getSaldo(),0.01);
	}
	@Test
	public void testDebitarCuentaLlena() {
		cuentaLlena.debitar(20);
		assertEquals(80, cuentaLlena.getSaldo(),0.01);
	}
}
