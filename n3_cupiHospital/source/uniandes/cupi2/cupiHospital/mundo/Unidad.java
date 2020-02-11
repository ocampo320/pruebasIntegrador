/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: cupiHospital
 * Autor: Equipo Cupi2 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.cupiHospital.mundo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import javax.swing.JOptionPane;

import uniandes.cupi2.cupiHospital.mundo.Paciente.Motivo;

/**
 * Clase que representa una unidad del hospital.
 */
public class Unidad {

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Enumeración para el tipo de unidad.
	 */

	public enum Tipo {

		CUIDADOS_INTENSIVOS, CUIDADOS_INTERMEDIOS, PEDIATRIA, MATERNIDAD, GERIATRIA, OBSERVACION;

	}

	/**
	 * Edad máxima pediatría.
	 */
	public final static int EDAD_MAX_PEDIATRIA = 15;

	/**
	 * Edad mínima geriatría.
	 */
	public final static int EDAD_MIN_GERIATRIA = 60;

	// -------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------

	/***
	 * Nombre de la unidad.
	 */
	private String nombre;

	/**
	 * Tipo de unidad.
	 */
	private Tipo tipo;

	/**
	 * Lista de pacientes de la unidad.
	 */
	// TODO Parte2 PuntoA: Declare el atributo pacientes de tipo ArrayList.
<<<<<<< HEAD
	ArrayList <Paciente>pacientes;
     
=======

<<<<<<< HEAD
	ArrayList<Paciente> pacientes;

>>>>>>> refs/remotes/origin/djocampoll
=======
	private ArrayList<Paciente> paciente;
>>>>>>> refs/heads/mgomez
	/**
	 * Encargado de la unidad.
	 */
	private Encargado encargado;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------
	
	/**
	 * Construye una nueva unidad con los parámetros dados. Inicializa una lista de
	 * pacientes vacía. El encargado es null.
	 * @param pNombre Nombre de la unidad. pNombre != null && pNombre != "".
	 * @param pTipo   Tipo de unidad.
	 */

	public Unidad(String pNombre, Tipo pTipo) {
		nombre = pNombre;
		tipo = pTipo;
		// TODO Parte2 PuntoB: Inicialice el atributo pacientes.
<<<<<<< HEAD
		pacientes = new ArrayList<Paciente>();
=======
		paciente = new ArrayList<Paciente>();
>>>>>>> refs/heads/mgomez
		encargado = null;
	}
	
	

	public String darUnidad() {

		return nombre;
	}

	// -------------------------------------------------------------
	// Métodos
	// -------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}

	public Unidad(String nombre, Tipo tipo, Encargado encargado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.encargado = encargado;
	}

	/**
	 * Devuelve el nombre de la unidad.
	 * 
	 * @return Nombre de la unidad.
	 */
	public String darNombreUnidad() {
		return nombre;
	}

	/**
	 * Devuelve el tipo de unidad.
	 * 
	 * @return Tipo de unidad.
	 */
	public Tipo darTipo() {
		return tipo;
	}

	/**
	 * Devuelve la lista de los pacientes que se encuentran en la unidad.
	 * 
	 * @return La lista de pacientes que hay en la unidad.
	 */
	public ArrayList<Paciente> darPacientes() {

		// TODO Parte2 PuntoC: Complete el método según la documentación dada.
<<<<<<< HEAD
<<<<<<< HEAD
		return pacientes;
		
=======
System.out.println("estos son los pacientes"+pacientes.size());
		return pacientes;

>>>>>>> refs/remotes/origin/djocampoll
=======
		return paciente;
>>>>>>> refs/heads/mgomez
	}

	/**
	 * Devuelve el encargado de la unidad.
	 * 
	 * @return Encargado de la unidad.
	 */
	public Encargado darEncargado() {
		return encargado;
	}

	/**
	 * Da de alta de la unidad al paciente dado por parámetro. <br>
	 * <b> pre: </b> pacientes!=null <br>
	 * <b> post: </b> Si el paciente se encontraba en el unidad fue eliminado de la
	 * lista de pacientes. <br>
	 * 
	 * @param pNumeroIdentificacion Número de identificación del paciente.
	 */
	public boolean darDeAltaPaciente(int pNumeroIdentificacion) {

		if (pacientes != null) {
			for (int i = 0; i < pacientes.size(); i++) {

				if (pacientes.get(i).darNumeroIdentificacion() == pNumeroIdentificacion) {
					System.out.println("se  da alta");
					
					System.out.println("se removio el paciente "+pNumeroIdentificacion);
					
					pacientes.remove(i);
					return Boolean.TRUE;

				} else {
					System.out.println("no se da de alta");
				}
			}
		}
		// TODO Parte2 PuntoD: Complete el método según la documentación dada.
<<<<<<< HEAD
<<<<<<< HEAD
		Paciente p;
		p=buscarPaciente(pNumeroIdentificacion);
		if(p!=null) {
			pacientes.remove(p);
			//REmove
		
		}
=======
return Boolean.FALSE;
>>>>>>> refs/remotes/origin/djocampoll
=======

		if (paciente != null) {
			for (int i = 0; i < paciente.size(); i++) {
				if (paciente.get(i).darNumeroIdentificacion() == pNumeroIdentificacion) {
					System.out.println("se da de alta al paciente con id: " + pNumeroIdentificacion);
					paciente.remove(i);

				} else {
					System.out.println("no se da de alta al paciente con id: " + pNumeroIdentificacion);

				}

			}

		}

>>>>>>> refs/heads/mgomez
	}

	/**
	 * Busca el paciente con el número de identificación dado. <br>
	 * <b> pre: </b> pacientes!=null <br>
	 * 
	 * @param pNumeroIdentificacion Número de identificación del paciente a ser
	 *                              buscado.
	 * @return El paciente con el número de identificación especificado o null si
	 *         éste no es encontrado.
	 */
	public Paciente buscarPaciente(int pNumeroIdentificacion) {
<<<<<<< HEAD
		int i= 0;
		while(pacientes!=null) {
			if(pacientes.get(i).darNumeroIdentificacion()==pNumeroIdentificacion) {
				return pacientes.get(i);
			}
            i=i+1;
		}
=======

		if (pacientes != null) {
			for (int i = 0; i < pacientes.size(); i++) {

				if (pacientes.get(i).darNumeroIdentificacion() == pNumeroIdentificacion) {
					System.out.println("se encutra al paciente "+ pacientes.get(i).darNombre());

					return pacientes.get(i);

				}

			}

		}
		return null;
		
	

>>>>>>> refs/remotes/origin/djocampoll
		// TODO Parte2 PuntoE: Complete el método según la documentación dada.
<<<<<<< HEAD
		return null;
=======
		for (int i = 0; i < paciente.size(); i++) {
			if (paciente.get(i).darNumeroIdentificacion() == pNumeroIdentificacion) {
				System.out.println("se encontro el paciente con id: " + pNumeroIdentificacion);
				return paciente.get(i);
			}

		}
		return null;

>>>>>>> refs/heads/mgomez
	}

	/**
	 * Agrega un paciente a la lista de pacientes.
	 * 
	 * @param pNombrePaciente       Nombre del paciente. pNombrePaciente != null &&
	 *                              pNombrePaciente != "".
	 * @param pApellido             Apellido del paciente. pApellido != null
	 *                              &&pApellido != "".
	 * @param pNumeroIdentificacion ID del paciente. pNumeroidentificacion > 0.
	 * @param pEdad                 Edad del paciente. pEdad >= 0.
	 * @param pDiagnostico          Diagnóstico del paciente. pDiagnostico != null
	 *                              && pDiagnostico != "".
	 * @param pDiasHospitalizacion  Días de hospitalización del paciente.
	 *                              pDiasHospitalizacion >= 0.
	 * @param pMotivoIngreso        Motivo de ingreso del paciente en el hospital.
	 */
	public void agregarPaciente(String pNombrePaciente, String pApellido, int pNumeroIdentificacion, int pEdad,
			String pDiagnostico, int pDiasHospitalizacion, Motivo pMotivoIngreso) {
		
<<<<<<< HEAD
		if((pNombrePaciente!=null)||(pNombrePaciente!=" ")) {
			if((pApellido!=null)||(pApellido!=" ")) {
				if(pNumeroIdentificacion>0) {
					if(pEdad>0) {
						if((pDiagnostico!=null)&&(pDiagnostico!=" ")) {
							if(pDiasHospitalizacion>=0) {
								Paciente p= new Paciente(pNombrePaciente, pApellido, pNumeroIdentificacion, pEdad, pDiagnostico, pDiasHospitalizacion, pMotivoIngreso);
								pacientes.add(p);
							}
						}
					}
				}
			}
		}
        // TODO Parte2 PuntoF: Complete el método según la documentación dada.
=======
		Paciente p;
		
		if (pNombrePaciente != null || pNombrePaciente != "" ) {
			
		
		if ( pApellido != null || pApellido != "") {
			
		
		if (pNumeroIdentificacion > 0) {
			
			if ( pDiagnostico != null ||pDiagnostico != "" ) {
				
				if (pDiasHospitalizacion >= 0 ) {
					
					
					p=new Paciente(pNombrePaciente, pApellido, pNumeroIdentificacion, pEdad, pDiagnostico, pDiasHospitalizacion, pMotivoIngreso);
					pacientes.add(p);
					
				}
			}
				
			}
		}
		}
			
		/*hacer la comparacion de para agregar*/
		
		

		// TODO Parte2 PuntoF: Complete el método según la documentación dada.
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/djocampoll
=======

		if (pNombrePaciente != null || pNombrePaciente != "") {

			if (pApellido != null || pApellido != "") {

				if (pNumeroIdentificacion > 0) {

					if (pEdad >= 0) {

						if (pDiagnostico != null || pDiagnostico != "") {

							if (pDiasHospitalizacion > 0) {

								Paciente pacienteNuevo = new Paciente(pNombrePaciente, pApellido, pNumeroIdentificacion,
										pEdad, pDiagnostico, pDiasHospitalizacion, pMotivoIngreso);
								paciente.add(pacienteNuevo);

							}

						}

					}

				}

			}

		}

>>>>>>> refs/heads/mgomez
	}

	/**
	 * Retorna el paciente de mayor edad en la unidad. Si hay dos o más pacientes
	 * con la edad máxima, retorna cualquiera de los dos.
	 * 
	 * @return Paciente de mayor edad, null si no hay pacientes en el hospital.
	 */
	public Paciente darPacienteMayorEdad() {
<<<<<<< HEAD
	    int posicion=0;
		int edad=0;
		int i= 0;
		while(pacientes!=null) {
			if(pacientes.get(i).darEdad()>edad) {
				edad=(pacientes.get(i)).darEdad();
				posicion=i;
			}
            i=i+1;
		}
		return pacientes.get(posicion);
		// TODO Parte2 PuntoG: Complete el método según la documentación dada.
<<<<<<< HEAD
=======
		
		int max=0;
		Paciente p;
		
		if (pacientes!=null) {
			
			for (int i = 0; i < pacientes.size(); i++) {
				
				if (pacientes.get(i).darEdad()>=max) {
					
					max=pacientes.get(i).darEdad();
					p=pacientes.get(i);
					
					
					return p;
					
				}
				
			
				
			}
			
		}
		return null;
		
		
		

>>>>>>> refs/remotes/origin/djocampoll
=======
		
		
		Paciente max;
		if(paciente!=null) {
			max=paciente.get(0);
			for (int i = 0; i < paciente.size(); i++) {
				
				if(paciente.get(i).darEdad()>max.darEdad()) {
					max=paciente.get(i);
				}
				
			}
			
			return max;

			
		}
		return null;
		
		
		
>>>>>>> refs/heads/mgomez
	}

	/**
	 * Asigna el encargado con los valores dados por parámetro a la unidad, si la
	 * unidad ya tenía encargado no lo asigna.
	 * 
	 * @param pNombre           Nombre del encargado. pNombre != null && pNombre !=
	 *                          "".
	 * @param pAniosExperiencia Años de experiencia del encargado. pAniosExperiencia
	 *                          > 0.
	 * @return True si el encargado se pudo asignar, false si la unidad ya tenía
	 *         encargado.
	 */
	public boolean asignarEncargado(String pNombre, int pAniosExperiencia) {
<<<<<<< HEAD
		
		if (pNombre!=null && pNombre !="") {
			
			if (pAniosExperiencia>0) {
				
				return true;
				
			}
			
		}
		// TODO Parte2 PuntoH: Complete el método según la documentación dada.
<<<<<<< HEAD
		if((pNombre!=null)||(pNombre!=" ")) {
			if(pAniosExperiencia>0) {
				if(encargado==null) {
					Hospital h = new Hospital();
					h.asignarEncargado(pNombre, pAniosExperiencia, nombre );
					return Boolean.TRUE;
				}
			}
		}
		return Boolean.FALSE;
=======
		return false;
>>>>>>> refs/remotes/origin/djocampoll
=======
		if(encargado == null)
		{
			if(pNombre != null || pNombre !="")
			{
				if(pAniosExperiencia > 0)
				{
					encargado = new Encargado(pNombre,pAniosExperiencia);
					return Boolean.TRUE;
				}
			}			
		}
		return Boolean.FALSE;
>>>>>>> refs/heads/mgomez
	}

}
