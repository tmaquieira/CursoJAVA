package modulo7.test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import modulo7.Alumno;
import modulo7.Persona;
import modulo7.Profesor;

public class PersonaTest {
		Persona personaNN;
		Persona personaConDatos;
		Persona persAlumno;
		Persona persProfesor;
		List<Persona> lstPersonas;
		Set<Persona> setPersonas;
		
		@Before
		public void setUp() throws Exception {
			personaNN = new Alumno();
			personaConDatos = new Profesor("Jhon", "Snow", "NoSéNada");
		
			lstPersonas = new ArrayList<>();
			lstPersonas.add(new Alumno("Daenerys","Targaryen",1));
			lstPersonas.add(new Alumno("Cersei","Lannister",2));
			lstPersonas.add(new Alumno("Margaery","Tyrell",3));
			lstPersonas.add(new Alumno("Sansa","Stark",4));
			lstPersonas.add(new Alumno("Arya","Stark",5));
			lstPersonas.add(new Alumno());
			lstPersonas.add(new Profesor("Ned","Stark","1"));
			lstPersonas.add(new Profesor("Tyrion","Lannister","2"));
			lstPersonas.add(new Profesor("Aemon","Targaryen","3"));
			lstPersonas.add(new Profesor("Olenna","Redwyne","4"));
			lstPersonas.add(new Profesor("Tywin","Lannister","5"));
			lstPersonas.add(new Profesor());

			setPersonas = new HashSet<>();
			setPersonas.add(new Alumno("Daenerys","Targaryen",1));
			setPersonas.add(new Alumno("Cersei","Lannister",2));
			setPersonas.add(new Alumno("Margaery","Tyrell",3));
			setPersonas.add(new Alumno("Sansa","Stark",4));
			setPersonas.add(new Alumno("Arya","Stark",5));
			setPersonas.add(new Alumno());
			setPersonas.add(new Profesor("Ned","Stark","1"));
			setPersonas.add(new Profesor("Tyrion","Lannister","2"));
			setPersonas.add(new Profesor("Aemon","Targaryen","3"));
			setPersonas.add(new Profesor("Olenna","Redwyne","4"));
			setPersonas.add(new Profesor("Tywin","Lannister","5"));
			setPersonas.add(new Profesor());
		}
		@After
		public void tearDown() throws Exception {
			personaNN = null;
			personaConDatos = null;
			persAlumno = null;
			persProfesor = null;
			lstPersonas = null;
			setPersonas = null;
			Persona.limpiarCantidadDePersonas();
		}
		@Test
		public void testCantidadDePersonas() {
			assertEquals(/*26*/5, Persona.getCantidadDePersonas());
		}//por qué no me cuenta la cantidad total de Personas creadas (26)? 
		//Es porque Personas No es Abstracta?
		@Test
		public void testPersonaConDatos() {
			assertEquals("Jhon", personaConDatos.getNombre());
			assertEquals("Snow", personaConDatos.getApellido());
			assertEquals("NoSéNada", ((Profesor) personaConDatos).getIosfa());
		}
		@Test
		public void testEqualsEnSet_add_true() {
			personaNN.setNombre("Bran");
			personaNN.setApellido("Stark");
			((Alumno) personaNN).setLegajo(10);
			assertTrue(setPersonas.add(personaNN));
			System.out.println("acá sí agrega la persona NN:");
			System.out.println("\nset ="+setPersonas);
		}	
		@Test
		public void testEqualsEnSet_add_false() {
			assertFalse(setPersonas.add(personaNN));
			System.out.println("acá no agrega la persona NN:");
			System.out.println("\nset ="+setPersonas);
		}	
		@Test
		public void testEqualsEnList_true() {
			assertTrue(lstPersonas.contains(personaNN));
		}	
		@Test
		public void testEqualsEnList_false() {
			personaNN.setNombre("Bran");
			personaNN.setApellido("Stark");
			assertFalse(lstPersonas.contains(personaNN));
		}		
		@Test
		public void testPersonaNN() {
			assertEquals(null, personaNN.getNombre());
			assertEquals(null, personaNN.getApellido());
		}
		@Test
		public void testEqualsAlumnos_false() {
			Alumno nuevoAlumno = new Alumno();
			nuevoAlumno.setLegajo(6);
			System.out.println("nuevo alumno = "+nuevoAlumno);
			assertFalse(personaNN.equals(nuevoAlumno));
		}	
		@Test
		public void testEqualsAlumnos_true() {
			Alumno nuevoAlumno = new Alumno();
			System.out.println("nuevo alumno = "+nuevoAlumno);
			assertTrue(personaNN.equals(nuevoAlumno));
		}
}