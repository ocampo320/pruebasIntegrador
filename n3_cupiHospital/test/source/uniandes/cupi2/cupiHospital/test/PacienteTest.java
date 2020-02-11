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

import org.junit.Before;
import org.junit.Test;

import uniandes.cupi2.cupiHospital.mundo.Paciente;
import uniandes.cupi2.cupiHospital.mundo.Paciente.Motivo;

/**
 * Clase usada para verificar que los m�todos de la clase Paciente est�n correctamente implementados.
 */
public class PacienteTest
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Paciente de prueba.
	 */
	private Paciente paciente;

	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------

	/**
	 * Escenario 1: Construye un nuevo paciente con la siguiente informaci�n:
	 * paciente - nombre: Germ�n, apellido: Romero, n�mero de identificaci�n: 273, edad: 22, diagn�stico: Dolor general, dias de hospitalizaci�n: 1, motivo ingreso: accidente.
	 */
	@Before
	public void setupEscenario1( )
	{
		paciente = new Paciente("Germ�n", "Romero", 273, 22, "Dolor general.", 1, Motivo.ACCIDENTE);
	}

	/**
     * Prueba 1: Obtener el nombre del paciente.
     */
	@Test
	public void testDarNombre()
	{
		assertEquals("El nombre esperado es Germ�n.", "Germ�n", paciente.darNombre());
	}
	
	/**
     * Prueba 2: Obtener el apellido del paciente.
     */
	@Test
	public void testDarApellido()
	{
		assertEquals("El apellido esperado es Romero.", "Romero", paciente.darApellido());
	}
	
	/**
     * Prueba 3: Obtener el n�mero de identificaci�n del paciente.
     */
	@Test
	public void testDarNumeroIdentificacion()
	{
		assertEquals("El numero de identificaci�n esperado es 273.", 273, paciente.darNumeroIdentificacion());
	}
	
	/**
     * Prueba 4: Obtener la edad del paciente.
     */
	@Test
	public void testDarEdad()
	{
		assertEquals("La edad esperada es 22.", 22, paciente.darEdad());
	}
	
	/**
     * Prueba 5: Obtener el diagn�stico del paciente.
     */
	@Test
	public void testDarDiagnostico()
	{
		assertEquals("El diagn�stico esperado es: Dolor general.", "Dolor general.", paciente.darDiagnostico());
	}
	
	/**
     * Prueba 6: Obtener los d�as de hospitalizaci�n del paciente.
     */
	@Test
	public void testDarDiasHospitalizacion()
	{
		assertEquals("Los d�as de hospitalizaci�n esperados son: 1.", 1, paciente.darDiasHospitalizacion());
	}
	
	/**
     * Prueba 7: Obtener el motivo de ingreso del paciente.
     */
	@Test
	public void testDarMotivoIngreso()
	{
		assertEquals("El motivo de ingreso esperado es: Accidente", Motivo.ACCIDENTE, paciente.darMotivoIngreso());
	}
}
