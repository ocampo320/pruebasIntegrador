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
package uniandes.cupi2.cupiHospital.mundo;

/**
 * Clase que representa un paciente del hospital.
 */
public class Paciente 
{
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Enumeraci�n para el motivo de ingreso.
	 */
	
	
	
	
	public enum Motivo
	{
		INFECCION,
		ACCIDENTE,
		PARTO,
		TRATAMIENTO,
		CIRUGIA;
	}

	//-------------------------------------------------------------
	// Atributos
	//-------------------------------------------------------------

	/**
	 * Nombre del paciente.
	 */
	private String nombre;

	/**
	 * Apellido del paciente.
	 */
	private String apellido;

	/**
	 * N�mero de identificaci�n del paciente.
	 */
	private int numeroIdentificacion;

	/**
	 * Edad del paciente.
	 */
	private int edad;

	/**
	 * Diagn�stico del paciente.
	 */
	private String diagnostico;

	/**
	 * D�as de hospitalizaci�n del paciente.
	 */
	private int diasHospitalizacion;

	/**
	 * Motivo de ingreso del paciente.
	 */
	private Motivo motivoIngreso;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye un nuevo paciente con los par�metros dados.
	 * @param pNombre Nombre del paciente. pNombre != null && !pNombre.equals("").
	 * @param pApellido Apellido del paciente. pApellido != null && !pApellido.equals("").
	 * @param pNumeroIdentificacion ID del paciente. pNumeroIdentificacion > 0.
	 * @param pEdad Edad del paciente. pEdad >= 0.
	 * @param pDiagnostico Diagn�stico del paciente. pDiagnostico != null && !pDiagnostico.equals("").
	 * @param pDiasHospitalizacion Dias de hospitalizaci�n del paciente. pDiasHospitalizacion > 0.
	 * @param pMotivoIngreso Motivo de ingreso del paciente. 
	 */
	public Paciente(String pNombre, String pApellido, int pNumeroIdentificacion, int pEdad, String pDiagnostico, int pDiasHospitalizacion, Motivo pMotivoIngreso) 
	{
		nombre = pNombre;
		apellido = pApellido;
		numeroIdentificacion = pNumeroIdentificacion;
		edad = pEdad;
		diagnostico = pDiagnostico;
		diasHospitalizacion = pDiasHospitalizacion;
		motivoIngreso = pMotivoIngreso;
	}

	//-------------------------------------------------------------
	// M�todos
	//-------------------------------------------------------------

	/**
	 * Devuelve el nombre del paciente.
	 * @return Nombre del paciente.
	 */
	public String darNombre() 
	{
		return nombre;
	}

	/**
	 * Devuelve el apellido del paciente.
	 * @return Apellido del paciente.
	 */
	public String darApellido() 
	{
		return apellido;
	}

	/**
	 * Devuelve el ID del paciente.
	 * @return ID del paciente.
	 */
	public int darNumeroIdentificacion() 
	{
		return numeroIdentificacion;
	}

	/**
	 * Devuelve la edad del paciente.
	 * @return Edad del paciente.
	 */
	public int darEdad() 
	{
		return edad;
	}

	/**
	 * Devuelve el diagn�stico del paciente.
	 * @return Diagn�stico del paciente.
	 */
	public String darDiagnostico()
	{
		return diagnostico;
	}

	/**
	 * Devuelve los d�as de hospitalizaci�n del paciente.
	 * @return D�as de hospitalizaci�n del paciente.
	 */
	public int darDiasHospitalizacion()
	{
		return diasHospitalizacion;
	}

	/**
	 * Devuelve el motivo de ingreso del paciente.
	 * @return Motivo de ingreso del paciente.
	 */
	public Motivo darMotivoIngreso()
	{
		return motivoIngreso;
	}


}
