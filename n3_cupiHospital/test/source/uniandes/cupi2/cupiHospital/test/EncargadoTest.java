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

import uniandes.cupi2.cupiHospital.mundo.Encargado;

/**
 * Clase usada para verificar que los m�todos de la clase Encargado est�n correctamente implementados.
 */
public class EncargadoTest 
{

	//-------------------------------------------------------------
	// Atributos
	//-------------------------------------------------------------

	/**
	 * Encargado de prueba.
	 */
	private Encargado encargado;
	
	//-------------------------------------------------------------
		// M�todos
		//-------------------------------------------------------------

		/**
		 * Escenario 1: Construye un nuevo hospital sin pacientes.
		 */
		@Before
		public void setupEscenario1()
		{
			encargado = new Encargado("Juan", 5);
		}
		
		/**
		 * Prueba 1: Inicializar los atributos de Encargado
		 */
		@Test
		public void testEncargado()
		{
			assertEquals("El nombre no corresponde", "Juan", encargado.darNombre());
			assertEquals("El nombre no corresponde", 5, encargado.darAniosExperiencia());
		}
}
