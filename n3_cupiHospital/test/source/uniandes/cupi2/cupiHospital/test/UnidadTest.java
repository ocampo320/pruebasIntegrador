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

import org.junit.Before;
import org.junit.Test;

import uniandes.cupi2.cupiHospital.mundo.Paciente;
import uniandes.cupi2.cupiHospital.mundo.Paciente.Motivo;
import uniandes.cupi2.cupiHospital.mundo.Unidad;
import uniandes.cupi2.cupiHospital.mundo.Unidad.Tipo;

/**
 * Clase usada para verificar que los m�todos de la clase Unidad est�n correctamente implementados.
 */
public class UnidadTest
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Unidad de prueba.
	 */
	private Unidad unidad;

	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------
	
	/**
	 * Escenario 1: Construye una nueva unidad.
	 * unidad - nombre: Unidad de prueba, tipo: Observaci�n.
	 */
	@Before
	public void setupEscenario1( )
	{
		unidad = new Unidad("Unidad de prueba", Tipo.OBSERVACION);
	}
	
	/**
	 * Prueba 1: Crear la unidad.
	 */
	@Test
	public void testUnidad()
	{
		assertEquals("El nombre no corresponde", "Unidad de prueba", unidad.darNombreUnidad());
		assertEquals("El tipo no corresponde", Tipo.OBSERVACION, unidad.darTipo());
		assertNull("El encargado deber�a ser null", unidad.darEncargado());
	}	
	
	/**
     * Prueba 2: Agregar un paciente a la unidad.
     */
	@Test
	public void testAgregarPaciente()
	{
		unidad.agregarPaciente("Germ�n", "Romero", 273, 22, "Dolor general.", 1, Motivo.ACCIDENTE);
		assertEquals("La cantidad de pacientes en la unidad deber�a ser 1.", 1, unidad.darPacientes().size());
	}
	
	/**
     * Prueba 3: Agregar un paciente a la unidad.
     */
	@Test
	public void testDarDeAltaPaciente()
	{
		unidad.agregarPaciente("Germ�n", "Romero", 273, 22, "Dolor general.", 1, Motivo.ACCIDENTE);
		unidad.darDeAltaPaciente(273);
		assertEquals("La cantidad de pacientes en la unidad deber�a ser 0.", 0, unidad.darPacientes().size());
	}
	
	
	/**
     * Prueba 4: Verificar que la busqueda de un paciente sea correcta.
     */
	@Test
	public void testBuscarPaciente()
	{
		unidad.agregarPaciente("Germ�n", "Romero", 273, 22, "Dolor general.", 1, Motivo.ACCIDENTE);
		Paciente rta = unidad.buscarPaciente(273);
		assertNotNull("El paciente deber�a existir",rta);
		assertEquals("La informaci�n no coincide.", "Germ�n", rta.darNombre());
		
	}
	
	/**
	 * Prueba 5: Verificar la busqueda del paciente con mayor edad.
	 */
	@Test
	public void testDarPacienteMayorEdad()
	{
		unidad.agregarPaciente("Germ�n", "Romero", 273, 22, "Dolor general.", 1, Motivo.ACCIDENTE);
		unidad.agregarPaciente("Germ�n2", "Romero2", 275, 24, "Dolor general.", 1, Motivo.ACCIDENTE);
		unidad.agregarPaciente("Germ�n3", "Romero3", 276, 32, "Dolor general.", 1, Motivo.ACCIDENTE);
		unidad.agregarPaciente("Germ�n4", "Romero4", 272, 28, "Dolor general.", 1, Motivo.ACCIDENTE);
		unidad.agregarPaciente("Germ�n5", "Romero5", 278, 32, "Dolor general.", 1, Motivo.ACCIDENTE);
		unidad.agregarPaciente("Germ�n6", "Romero6", 279, 12, "Dolor general.", 1, Motivo.ACCIDENTE);
		assertNotNull("No deber�a ser nula la respuesta", unidad.darPacienteMayorEdad());
		assertEquals("No est� encontrando correctamente el paciente de mayor edad.", 32, unidad.darPacienteMayorEdad().darEdad());
		assertTrue("El paciente de mayor edad no es el que deber�a", (unidad.darPacienteMayorEdad().darNombre().equals("Germ�n3")||unidad.darPacienteMayorEdad().darNombre().equals("Germ�n5")));
	}
	
	/**
	 * Prueba 6: Verificar la asignaci�n de un encargado.
	 * 1. cuando no hay encargado.
	 * 2. cuando hay encargado.
	 */
	@Test
	public void testAsignarEncargado()
	{
		boolean pudo = unidad.asignarEncargado("Luis", 15);
		assertTrue("Deber�a ser verdadero la respuesta de asignarEncargado", pudo);
		assertNotNull("No deber�a ser nulo el encargado", unidad.darEncargado());
		
		boolean pudo2 = unidad.asignarEncargado("Juan", 12);
		assertFalse("Deber�a ser falso la respuesta de asignarEncargado", pudo2);
		assertNotNull("No deber�a ser nulo el encargado", unidad.darEncargado());
		assertEquals("El nombre no deber�a haber cambiado", "Luis", unidad.darEncargado().darNombre());
		assertEquals("Los a�os de experiencia no deber�an haber cambiado", 15, unidad.darEncargado().darAniosExperiencia());
	}
	
	
}
