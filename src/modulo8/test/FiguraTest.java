package modulo8.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import modulo8.Circulo;
import modulo8.Cuadrado;
import modulo8.Figura;
import modulo8.Rectangulo;
import modulo8.Triangulo;

public class FiguraTest {
	//lote de pruebas
		Figura primerCirculo;
		Figura segundoCirculo;
		Figura primerCuadrado;
		Figura primerRectangulo;
		Figura primerTriangulo;
		List<Figura> lstFiguras; 
		Set<Figura> setFiguras; 
	@Before
	public void setUp() throws Exception {
		primerCirculo = new Circulo(999.9f, "Circulete Completo", 3.5f);
		segundoCirculo = new Circulo();
		primerCuadrado = new Cuadrado(999.9f, "Cuadradete Completo", 1.5f);
		primerRectangulo = new Rectangulo(999.9f, "Rectangulete Completo", 1.5f, 2.5f);
		primerTriangulo = new Triangulo(999.9f, "Triangulete Completo", 1.0f, 1.0f, 1.0f, 2.5f, 5.0f);
		//list
		lstFiguras = new ArrayList<>();
		lstFiguras.add(new Circulo(999.9f, "Otro Circulete Completo en List", 9.9f));
		lstFiguras.add(new Cuadrado(999.9f, "Otro Cuadradete Completo en List", 3.75f));
		lstFiguras.add(new Rectangulo(999.9f, "Otro Rectangulete Completo en List", 1.5f, 2.5f));
		lstFiguras.add(new Triangulo(999.9f, "Otro Triangulete Completo en List", 1.0f, 1.0f, 1.0f, 2.5f, 5.0f));
		lstFiguras.add(new Circulo());
		//set
		setFiguras = new HashSet<>();
		setFiguras.add(new Circulo(999.9f, "Otro Circulete Completo en Set", 9.9f));
		setFiguras.add(new Cuadrado(999.9f, "Otro Cuadradete Completo en Set", 3.75f));
		setFiguras.add(new Rectangulo(999.9f, "Otro Rectangulete Completo en Set", 1.5f, 2.5f));
		setFiguras.add(new Triangulo(999.9f, "Otro Triangulete Completo en Set", 1.0f, 1.0f, 1.0f, 2.5f, 5.0f));
		setFiguras.add(new Circulo());		
	}

	@After
	public void tearDown() throws Exception {
		primerCirculo = null;
		segundoCirculo = null;
		primerCuadrado = null;
		primerRectangulo = null;
		primerTriangulo = null;
		lstFiguras = null;
		setFiguras = null;
	}
	@Test
	public void testFigura() {
		assertEquals("Circulete Completo", primerCirculo.getNombre());
		assertEquals(0, segundoCirculo.getMaximaSuperficie(),0.01);
	}
	@Test
	public void testEqualsCirculos_true() {
		Circulo nuevoCirculo = new Circulo();
		System.out.println("nuevo círculo = "+nuevoCirculo);
		assertTrue(segundoCirculo.equals(nuevoCirculo));
	}	
	@Test
	public void testEqualsCirculos_false() {
		Circulo nuevoCirculo = new Circulo();
		nuevoCirculo.setRadio(2.3f);
		System.out.println("nuevo círculo = "+nuevoCirculo);
		assertFalse(segundoCirculo.equals(nuevoCirculo));
	}	
	@Test
	public void testEqualsEnSet_add_true() {
		((Circulo) segundoCirculo).setRadio(12.0f);
		assertTrue(setFiguras.add(segundoCirculo));
		System.out.println("Acá sí agrega segundoCirculo: ");
		System.out.println("Set ="+setFiguras);
	}	
	@Test
	public void testEqualsEnSet_add_false() {
		assertFalse(setFiguras.add(segundoCirculo));
		System.out.println("\nAcá no agrega segundoCirculo :/");
		System.out.println("Set ="+setFiguras);
	}	
	@Test
	public void testEqualsEnList_true() {
		assertTrue(lstFiguras.contains(segundoCirculo));
	}
	@Test
	public void testEqualsEnList_false() {
		((Circulo) segundoCirculo).setRadio(12.0f);
		assertFalse(lstFiguras.contains(segundoCirculo));
	}	
	@Test
	public void testGetValores() {
		System.out.println(primerCirculo.getValores());
	}
	@Test
	public void testGetMaximaSuperficie() {
		System.out.println(primerTriangulo.getMaximaSuperficie());
	}
	@Test
	public void testGetNombre() {
		System.out.println(primerRectangulo.getNombre());
	}
	@Test
	public void testSetNombre() {
		segundoCirculo.setNombre("Soy un círculo cambiante e indeciso ;)");
		System.out.println(segundoCirculo.getNombre());
	}
}
