package modulo7;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.plaf.synth.SynthSeparatorUI;
import modulo7.Persona;
import modulo7.Alumno;
import modulo7.Profesor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {

	List<Persona> listaPersonas;
	Persona persona1;
	Alumno alumno1;
	Profesor profesor1;

	@Before
	public void setUp() throws Exception {
		persona1 = new Persona("Tatiana", "Maquieira");
		alumno1 = new Alumno ("Federico", "Valledor", 37844826);
		profesor1 = new Profesor("Gabriel", "Casas", "Programacion1");
		listaPersonas = new ArrayList<>();
		listaPersonas.add(new Alumno("Tati", "Maqui", 1));
		listaPersonas.add(new Alumno("Joaco", "Corre", 2));
		listaPersonas.add(new Alumno("Yami", "Reyes", 3));
		listaPersonas.add(new Alumno("Sandra", "Leiva", 4));
		listaPersonas.add(new Alumno("Tere", "Delgado", 5));
		listaPersonas.add(new Alumno());
		listaPersonas.add(new Profesor("LAURA", "MARIPOSA", "UNO"));
		listaPersonas.add(new Profesor("PEDRO", "CARLOS", "DOS"));
		listaPersonas.add(new Profesor("LUIS", "FERNANDO", "SARASA"));
		listaPersonas.add(new Profesor());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		assertEquals("Maqui", persona1.getApellido()); 
		assertEquals("Tati", persona1.getNombre());
		assertEquals("Leiva", alumno1.getApellido());
		assertEquals(4, alumno1.getLegajo());
	}
	
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
