/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: cupiHospital
 * Autor: Equipo Cupi2 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.cupiHospital.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import uniandes.cupi2.cupiHospital.mundo.*;
import uniandes.cupi2.cupiHospital.mundo.Paciente.Motivo;
import uniandes.cupi2.cupiHospital.mundo.Unidad.Tipo;

/**
 * Clase usada para verificar que los m�todos de la clase Hospital est�n
 * correctamente implementados.
 */
public class HospitalTest {

	// -------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------

	/**
	 * Hospital de prueba.
	 */
	private Hospital hospital;

	// -------------------------------------------------------------
	// M�todos
	// -------------------------------------------------------------

	/**
	 * Escenario 1: Construye un nuevo hospital sin pacientes.
	 */
	@Before
	public void setupEscenario1() {
		hospital = new Hospital();
	}

	/**
	 * Escenario 2: Construye un nuevo hospital con un paciente.
	 */
	public void setupEscenario2() {
		hospital = new Hospital();
		hospital.internarNuevoPaciente("Unidad A", "Luis", "Suarez", 777, 27, "Golpes varios.", 7, Motivo.ACCIDENTE);
	}

	/**
	 * Prueba 1: Inicializar el contenedor de unidades.
	 */
	@Test
	public void testHospital() {
		Unidad[] unidades = hospital.darUnidades();
		assertNotNull("El arreglo no deber�a ser nulo.", unidades);
		assertEquals("Deber�a tener 6 unidades", Hospital.NUMERO_UNIDADES, hospital.darUnidades().length);
		for (int i = 0; i < unidades.length; i++) {
			assertNotNull("La unidad en la posici�n: " + i + " no deber�a ser nula", hospital.darUnidades()[i]);
		}
	}

	/**
	 * Prueba 2: Internar un nuevo paciente. 1. Un paciente cualquiera. 2. Un
	 * paciente de geriatr�a. 3. Un paciente de pediatr�a. 4. Casos error.
	 */
	@Test
	public void testInternarNuevoPaciente() {
		// 1. Un paciente cualquiera.
		boolean rta = hospital.internarNuevoPaciente("Unidad A", "Luis", "Suarez", 777, 27, "Golpes varios.", 7,
				Motivo.ACCIDENTE);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 1.", 1,
				hospital.buscarUnidad("Unidad A").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 1", 1, hospital.darCantidadTotalPacientes());
		assertNotNull("El paciente deber�a existir", hospital.buscarPaciente(777));
		assertTrue("La respuesta deber�a ser verdadero", rta);

		// 2. Un paciente de geriatr�a.
		rta = hospital.internarNuevoPaciente("Unidad E", "Juan", "Lopez", 333, 62, "Demencia senil.", 1000,
				Motivo.TRATAMIENTO);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 1.", 1,
				hospital.buscarUnidad("Unidad E").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 2", 2, hospital.darCantidadTotalPacientes());
		assertNotNull("El paciente deber�a existir", hospital.buscarPaciente(333));
		assertTrue("La respuesta deber�a ser verdadero", rta);
		rta = hospital.internarNuevoPaciente("Unidad E", "Juan2", "Lopez2", 334, 63, "Demencia senil.", 1000,
				Motivo.TRATAMIENTO);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 2.", 2,
				hospital.buscarUnidad("Unidad E").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 3", 3, hospital.darCantidadTotalPacientes());
		assertNotNull("El paciente deber�a existir", hospital.buscarPaciente(334));
		assertTrue("La respuesta deber�a ser verdadero", rta);

		// 3. Un paciente de pediatr�a.
		rta = hospital.internarNuevoPaciente("Unidad C", "Paola", "Lopez", 336, 12, "Gripa fuerte.", 5,
				Motivo.INFECCION);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 1.", 1,
				hospital.buscarUnidad("Unidad C").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 4", 4, hospital.darCantidadTotalPacientes());
		assertNotNull("El paciente deber�a existir", hospital.buscarPaciente(336));
		assertTrue("La respuesta deber�a ser verdadero", rta);
		rta = hospital.internarNuevoPaciente("Unidad C", "Paola2", "Lopez2", 337, 14, "Gripa fuerte.", 5,
				Motivo.INFECCION);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 2.", 2,
				hospital.buscarUnidad("Unidad C").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 5", 5, hospital.darCantidadTotalPacientes());
		assertNotNull("El paciente deber�a existir", hospital.buscarPaciente(337));
		assertTrue("La respuesta deber�a ser verdadero", rta);

		// 4a. Ya existe el paciente.
		rta = hospital.internarNuevoPaciente("Unidad A", "Luis", "Suarez", 777, 27, "Golpes varios.", 7,
				Motivo.ACCIDENTE);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 1.", 1,
				hospital.buscarUnidad("Unidad A").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 5", 5, hospital.darCantidadTotalPacientes());
		assertFalse("La respuesta deber�a ser falso", rta);

		// 4b. Es mayor de la edad necesaria para pediatr�a.
		rta = hospital.internarNuevoPaciente("Unidad C", "Paola", "Lopez", 346, 22, "Gripa fuerte.", 5,
				Motivo.INFECCION);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 2.", 2,
				hospital.buscarUnidad("Unidad C").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 5", 5, hospital.darCantidadTotalPacientes());
		assertFalse("La respuesta deber�a ser falso", rta);

		// 4c. Es menor de la edad necesaria para geriatr�a.
		rta = hospital.internarNuevoPaciente("Unidad E", "Juan", "Lopez", 4446, 22, "Gripa fuerte.", 5,
				Motivo.INFECCION);
		assertEquals("La cantidad de pacientes de la unidad deber�a ser 2.", 2,
				hospital.buscarUnidad("Unidad C").darPacientes().size());
		assertEquals("La cantidad total de pacientes deber�a ser 5", 5, hospital.darCantidadTotalPacientes());
		assertFalse("La respuesta deber�a ser falso", rta);

	}

	/**
	 * Prueba 3: Buscar un paciente por ID. 1. Cuando el paciente no existe. 2.
	 * Cuando el paciente si existe.
	 */
	@Test
	public void testBuscarPaciente() {
		// 1. Cuando el paciente no existe.

		Paciente rta = hospital.buscarPaciente(777);
		assertNull("El paciente no deber�a existir.", rta);

		// 2. Cuando el paciente si existe.
		setupEscenario2();
		Paciente rta2 = hospital.buscarPaciente(777);
		assertNotNull("El paciente deber�a existir.", rta2);
	}

	/**
	 * Prueba 4: Dar de alta a un paciente. 1. Cuando el paciente no existe. 2.
	 * Cuando el paciente si existe.
	 */
	@Test
	public void testDarDeAltaPaciente() {
		// 1. Cuando el paciente no existe.

		boolean rta = hospital.darDeAltaPaciente(777);
		assertFalse("No se deber�a dar de alta al paciente.", rta);

		// 2. Cuando el paciente si existe.
		setupEscenario2();
		boolean rta2 = hospital.darDeAltaPaciente(777);
		assertTrue("Se deber�a dar de alta al paciente.", rta2);
	}

	/**
	 * Prueba 5: Reubicar a un paciente. 1. Cuando el paciente no existe. 2. Cuando
	 * el paciente si existe. 3. Cuando la unidad de destino es la misma que la de
	 * origen. 4. Cuando el paciente: existe, se intenta reubicar en pediatr�a y no
	 * tiene la edad apropiada. 5. Cuando el paciente: existe, se intenta reubicar
	 * en geriatr�a y no tiene la edad apropiada.
	 */
	@Test
	public void testReubicarPaciente() {
		// 1. Cuando el paciente no existe.

		boolean rta = hospital.reubicarPaciente(777, "Unidad B");
		assertFalse("No deber�a poder reubicar un paciente que no existe.", rta);

		// 2. Cuando el paciente si existe.
		setupEscenario2();
		boolean rta2 = hospital.reubicarPaciente(777, "Unidad B");
		assertTrue("Se deber�a poder reubicar el paciente.", rta2);
		assertNull("El paciente no deber�a estar en la Unidad A",
				hospital.buscarUnidad("Unidad A").buscarPaciente(777));
		assertNotNull("El paciente deber�a estar en la Unidad B",
				hospital.buscarUnidad("Unidad B").buscarPaciente(777));
		assertEquals("Solo deber�a haber 1 paciente en el hospital", 1, hospital.darCantidadTotalPacientes());

		// 3. Unidad de origen es igual a destino.
		boolean rta2b = hospital.reubicarPaciente(777, "Unidad B");
		assertFalse("No deber�a poder reubicar un paciente cuando la unidad origen y destino es igual.", rta2b);

		// 4. Cuando un paciente no puede ser transferido a la unidad de pediatr�a.
		hospital.internarNuevoPaciente("Unidad E", "Juan", "Lopez", 333, 62, "Demencia senil.", 1000, Motivo.ACCIDENTE);
		boolean rta3 = hospital.reubicarPaciente(333, "Unidad C");
		assertFalse(
				"No se deber�a poder reubicar el paciente. La edad sobrepasa la edad m�xima para atenci�n en la unidad de pediatr�a",
				rta3);
		assertNull("El paciente no deber�a estar en la Unidad C",
				hospital.buscarUnidad("Unidad C").buscarPaciente(333));
		assertNotNull("El paciente deber�a estar en la Unidad E",
				hospital.buscarUnidad("Unidad E").buscarPaciente(333));
		assertEquals("Solo deber�a haber 2 pacientes en el hospital", 2, hospital.darCantidadTotalPacientes());

		// 5. Cuando un paciente no puede ser transferido a la unidad de geriatr�a.
		hospital.internarNuevoPaciente("Unidad C", "Maria", "Rojas", 336, 12, "Gripa fuerte.", 5, Motivo.INFECCION);
		boolean rta4 = hospital.reubicarPaciente(336, "Unidad E");
		assertFalse(
				"No se deber�a poder reubicar el paciente. No cumple con la edad m�nima requerida para atenci�n en la unidad de geriatr�a",
				rta4);
		assertNull("El paciente no deber�a estar en la Unidad C",
				hospital.buscarUnidad("Unidad C").buscarPaciente(333));
		assertNotNull("El paciente deber�a estar en la Unidad E",
				hospital.buscarUnidad("Unidad E").buscarPaciente(333));
		assertEquals("Solo deber�a haber 3 pacientes en el hospital", 3, hospital.darCantidadTotalPacientes());

	}

	/**
	 * Prueba 6: Buscar la unidad a la que pertenece un paciente. 1. Cuando el
	 * paciente no existe. 2. Cuando el paciente si existe.
	 */
	@Test
	public void testBuscarUnidadPaciente() {
		// 1. Cuando el paciente no existe.

		Unidad rta = hospital.buscarUnidadPaciente(777);
		assertNull("No deber�a existir una unidad que tenga el paciente indicado.", rta);

		// 2. Cuando el paciente si existe.
		setupEscenario2();
		Unidad rta2 = hospital.buscarUnidadPaciente(777);
		assertNotNull("La unidad deber�a existir", rta2);
		assertEquals("La unidad deber�a ser: Unidad A.", "Unidad A", rta2.darNombreUnidad());
	}

	/**
	 * Prueba 7: Buscar una unidad dado su nombre. 1. La unidad existe. 2. La unidad
	 * no existe.
	 */
	@Test
	public void testBuscarUnidad() {
		assertNotNull("Deber�a existir la unidad", hospital.buscarUnidad("Unidad D"));
		assertEquals("No corresponde el tipo de la unidad buscada", Tipo.MATERNIDAD,
				hospital.buscarUnidad("Unidad D").darTipo());
		assertNull("No deber�a existir la unidad", hospital.buscarUnidad("Unidad Z"));
	}

	/**
	 * Prueba 8: Dar la cantidad total de pacientes.
	 */
	@Test
	public void testDarCantidadTotalPacientes() {
		hospital.internarNuevoPaciente("Unidad A", "Luis", "Suarez", 777, 27, "Golpes varios.", 7, Motivo.ACCIDENTE);
		assertEquals("La cantidad total de pacientes deber�a ser 1", 1, hospital.darCantidadTotalPacientes());
		hospital.internarNuevoPaciente("Unidad E", "Juan", "Lopez", 333, 62, "Demencia senil.", 1000,
				Motivo.TRATAMIENTO);
		assertEquals("La cantidad total de pacientes deber�a ser 2", 2, hospital.darCantidadTotalPacientes());
		hospital.internarNuevoPaciente("Unidad E", "Juan2", "Lopez2", 334, 63, "Demencia senil.", 1000,
				Motivo.TRATAMIENTO);
		assertEquals("La cantidad total de pacientes deber�a ser 3", 3, hospital.darCantidadTotalPacientes());
		hospital.internarNuevoPaciente("Unidad C", "Paola", "Lopez", 336, 12, "Gripa fuerte.", 5, Motivo.INFECCION);
		assertEquals("La cantidad total de pacientes deber�a ser 4", 4, hospital.darCantidadTotalPacientes());
		hospital.internarNuevoPaciente("Unidad C", "Paola2", "Lopez2", 337, 14, "Gripa fuerte.", 5, Motivo.INFECCION);
		assertEquals("La cantidad total de pacientes deber�a ser 5", 5, hospital.darCantidadTotalPacientes());

	}

	/**
	 * Prueba 9: Buscar el paciente de mayor edad.
	 */
	@Test
	public void testDarPacienteMayorEdad() {
		assertNull("Cuando no hay pacientes la respuesta deber�a ser null", hospital.darPacienteMayorEdad());
		hospital.internarNuevoPaciente("Unidad A", "Luis", "Suarez", 777, 27, "Golpes varios.", 7, Motivo.ACCIDENTE);
		hospital.internarNuevoPaciente("Unidad E", "Juan", "Lopez", 333, 62, "Demencia senil.", 1000,
				Motivo.TRATAMIENTO);
		hospital.internarNuevoPaciente("Unidad E", "Juan2", "Lopez2", 334, 63, "Demencia senil.", 1000,
				Motivo.TRATAMIENTO);
		hospital.internarNuevoPaciente("Unidad C", "Paola", "Lopez", 336, 12, "Gripa fuerte.", 5, Motivo.INFECCION);
		hospital.internarNuevoPaciente("Unidad C", "Paola2", "Lopez2", 337, 14, "Gripa fuerte.", 5, Motivo.INFECCION);
		assertNotNull("Cuando hay pacientes la respuesta no deber�a ser null", hospital.darPacienteMayorEdad());
		assertEquals("La edad del paciente de mayor edad no corresponde", 63,
				hospital.darPacienteMayorEdad().darEdad());

	}

	/**
	 * Prueba 10. Asignar el encargado de una unidad. 1. la unidad existe y no tiene
	 * encargado. 2. la unidad existe y tiene encargado. 3. la unidad no existe
	 */
	@Test
	public void testAsignarEncargado() {
		// 1
		boolean pudo = hospital.asignarEncargado("Juan", 2, "Unidad F");
		assertTrue("La respuesta a asignar deber�a ser true", pudo);
		assertNotNull("La unidad deber�a tener encargado", hospital.buscarUnidad("Unidad F").darEncargado());

		// 2
		boolean pudo2 = hospital.asignarEncargado("Juana", 3, "Unidad F");
		assertFalse("La respuesta deber�a ser false", pudo2);

		// 3
		boolean pudo3 = hospital.asignarEncargado("Juana", 3, "Unidad Z");
		assertFalse("La respuesta deber�a ser false", pudo3);

	}

}