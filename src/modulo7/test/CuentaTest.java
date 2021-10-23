package modulo7.test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import modulo7.CajaDeAhorro;
import modulo7.Cuenta;
import modulo7.CuentaCorriente;

public class CuentaTest {
	//lote de pruebas
	Cuenta cajaDeAhorroVacia;
	Cuenta cuentaCorrienteLlena;
	List<Cuenta> lstCuentas; //coleccion ordenada; una pila. firs input, first output. permite duplicados.
	Set<Cuenta> setCuentas; //no permite duplicados. ordenado de cualquier forma.
	@Before
	public void setUp() throws Exception {
		cajaDeAhorroVacia = new CajaDeAhorro();
		cuentaCorrienteLlena = new CuentaCorriente(123456, 100, 2500);
		//list
		lstCuentas = new ArrayList<>();
		lstCuentas.add(new CajaDeAhorro(10,100,1.5f));
		lstCuentas.add(new CajaDeAhorro(11,200,2.5f));
		lstCuentas.add(new CajaDeAhorro(12,300,4.5f));
		lstCuentas.add(new CajaDeAhorro(13,50,5.5f));
		lstCuentas.add(new CajaDeAhorro(14,150,1.5f));
		lstCuentas.add(new CajaDeAhorro());
		lstCuentas.add(new CuentaCorriente(60,600,6000));
		lstCuentas.add(new CuentaCorriente(70,700,7000));
		lstCuentas.add(new CuentaCorriente(80,800,8000));
		lstCuentas.add(new CuentaCorriente(90,900,9000));
		lstCuentas.add(new CuentaCorriente(100,1000,10000));
		lstCuentas.add(new CuentaCorriente());
		//set
		setCuentas = new HashSet<>();
		setCuentas.add(new CajaDeAhorro(10,100,1.5f));
		setCuentas.add(new CajaDeAhorro(11,200,2.5f));
		setCuentas.add(new CajaDeAhorro(12,300,4.5f));
		setCuentas.add(new CajaDeAhorro(13,50,5.5f));
		lstCuentas.add(new CajaDeAhorro(14,150,1.5f));
		setCuentas.add(new CajaDeAhorro());
		setCuentas.add(new CuentaCorriente(60,600,6000));
		setCuentas.add(new CuentaCorriente(70,700,7000));
		setCuentas.add(new CuentaCorriente(80,800,8000));
		setCuentas.add(new CuentaCorriente(90,900,9000));
		setCuentas.add(new CuentaCorriente(100,1000,10000));
		setCuentas.add(new CuentaCorriente());
	}
	@After
	public void tearDown() throws Exception {
		cajaDeAhorroVacia = null;
		cuentaCorrienteLlena = null;
		lstCuentas = null;
		setCuentas = null;
		Cuenta.limpiarCantidadDeCuentas();
	}
	@Test
	public void testCantidadDeObjetos() {
		assertEquals(26, Cuenta.getCantidadDeCuentas());
	}	
	@Test
	public void testEqualsEnSet_add_true() {
		cajaDeAhorroVacia.setNumero(12);
		assertTrue(setCuentas.add(cajaDeAhorroVacia));
		System.out.println("acá sí agrega la caja de ahorro vacía");
		System.out.println("lista ="+lstCuentas);
		System.out.println("\n\nset ="+setCuentas);
	}	
	@Test
	public void testEqualsEnSet_add_false() {
		assertFalse(setCuentas.add(cajaDeAhorroVacia));
		System.out.println("acá no agrega la caja de ahorro vacía");
		System.out.println("lista ="+lstCuentas);
		System.out.println("\n\nset ="+setCuentas);
	}	
	@Test
	public void testEqualsEnList_true() {
		assertTrue(lstCuentas.contains(cajaDeAhorroVacia));
	}	
	@Test
	public void testEqualsEnList_false() {
		cajaDeAhorroVacia.setNumero(12);
		assertFalse(lstCuentas.contains(cajaDeAhorroVacia));
	}		
	@Test
	public void testCuenta() {
		assertEquals(0, cajaDeAhorroVacia.getNumero());
		assertEquals(0, cajaDeAhorroVacia.getSaldo(),0.01);
	}
	@Test
	public void testCuentaIntFloat() {
		assertEquals(123456, cuentaCorrienteLlena.getNumero());
		assertEquals(100, cuentaCorrienteLlena.getSaldo(),0.01);
	}
	@Test
	public void testAcreditarCuentaVacia() {
		cajaDeAhorroVacia.acreditar(5);
		assertEquals(5, cajaDeAhorroVacia.getSaldo(),0.01);
	}
	@Test
	public void testEqualsCajasDeAhorros_false() {
		CajaDeAhorro nuevaCaja = new CajaDeAhorro();
		nuevaCaja.setInteres(2.3f);
		System.out.println("nueva caja = "+nuevaCaja);
		assertFalse(cajaDeAhorroVacia.equals(nuevaCaja));
	}	
	@Test
	public void testEqualsCajasDeAhorros_true() {
		CajaDeAhorro nuevaCaja = new CajaDeAhorro();
		System.out.println("nueva caja = "+nuevaCaja);
		assertTrue(cajaDeAhorroVacia.equals(nuevaCaja));
	}	
	@Test
	public void testAcreditarCuentaLlena() {
		cuentaCorrienteLlena.acreditar(5);
		assertEquals(105, cuentaCorrienteLlena.getSaldo(),0.01);
	}
	@Test
	public void testDebitarCuentaLlena() {
		cuentaCorrienteLlena.debitar(20);
		assertEquals(80, cuentaCorrienteLlena.getSaldo(),0.01);
	}
	@Test
	public void testDebitarCuentaCorrienteLlena_fallido() {
		cuentaCorrienteLlena.debitar(2700);
		assertEquals(100, cuentaCorrienteLlena.getSaldo(),0.01);
	}
	@Test
	public void testDebitarCuentaCorrienteLlena_sobrepaseElSaldo() {
		cuentaCorrienteLlena.debitar(300);
		assertEquals(-200, cuentaCorrienteLlena.getSaldo(),0.01);
	}
}
