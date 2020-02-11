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

import java.awt.Dimension;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import sun.print.resources.serviceui;
import uniandes.cupi2.cupiHospital.mundo.Paciente.Motivo;
import uniandes.cupi2.cupiHospital.mundo.Unidad.*;

/**
 * Clase que representa el hospital.
 */
public class Hospital {
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Cantidad de unidades del hospital.
	 */
	public final static int NUMERO_UNIDADES = 6;

	// -------------------------------------------------------------
	// Atributos
	// -------------------------------------------------------------
	Unidad unidades[];
	/**
	 * Arreglo que contiente las unidades del hospital.
	 * 
	 */
	private Unidad unidades[];
	// fijo.

	private Unidad u2;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye el hospital con las siguientes unidades en el arreglo: unidades[0]
	 * - nombre: Unidad A, Tipo: Cuidados intensivos. unidades[1] - nombre: Unidad
	 * B, Tipo: Cuidados intermedios. unidades[2] - nombre: Unidad C, Tipo:
	 * Pediatría. unidades[3] - nombre: Unidad D, Tipo: Maternidad. unidades[4] -
	 * nombre: Unidad E, Tipo: Geriatría. unidades[5] - nombre: Unidad F, Tipo:
	 * Observación.
	 */
	Unidad unidades [];
	public Hospital() {
<<<<<<< HEAD
		unidades = new Unidad[NUMERO_UNIDADES];
		Tipo t=null;
		unidades[0]= new Unidad("Unidad A", t.CUIDADOS_INTENSIVOS );
		unidades[1]= new Unidad("Unidad B", t.CUIDADOS_INTERMEDIOS);
		unidades[2]= new Unidad("Unidad C", t.PEDIATRIA);
		unidades[3]= new Unidad("Unidad D",t.MATERNIDAD);
		unidades[4]= new Unidad("Unidad E",t.GERIATRIA);
		unidades[5]= new Unidad("Unidad F",t.OBSERVACION);
		// TODO Parte3 PuntoB: Inicialice el atributo unidades con tamaño
		// NUMERO_UNIDADES e inicialice cada una da las unidades.
		
	
		unidades=new Unidad[NUMERO_UNIDADES];
	
		unidades[0]=new Unidad("unidad a", Tipo.CUIDADOS_INTENSIVOS);
		unidades[1]=new Unidad("unidad b", Tipo.CUIDADOS_INTERMEDIOS);
		unidades[2]=new Unidad("unidad c", Tipo.MATERNIDAD);
		unidades[3]=new Unidad("unidad d", Tipo.PEDIATRIA);
		unidades[4]=new Unidad("unidad e", Tipo.MATERNIDAD);
		unidades[5]=new Unidad("unidad f",Tipo.GERIATRIA);
		
=======

		unidades = new Unidad[NUMERO_UNIDADES];
		unidades[0] = new Unidad("Unidad A", Tipo.CUIDADOS_INTENSIVOS);
		unidades[1] = new Unidad("Unidad B", Tipo.CUIDADOS_INTERMEDIOS);
		unidades[2] = new Unidad("Unidad C", Tipo.PEDIATRIA);
		unidades[3] = new Unidad("Unidad D", Tipo.MATERNIDAD);
		unidades[4] = new Unidad("unidad E", Tipo.GERIATRIA);
		unidades[5] = new Unidad("unidad F", Tipo.OBSERVACION);
>>>>>>> refs/heads/mgomez
	}

	// -------------------------------------------------------------
	// Métodos
	// -------------------------------------------------------------

	/**
	 * Devuelve el arreglo con las unidades del hospital.
	 * 
	 * @return El arreglo de unidades.
	 */
	public Unidad[] darUnidades() {
<<<<<<< HEAD
		// TODO Parte3 PuntoC: Complete el método según la documentación dada.
<<<<<<< HEAD
		return unidades;
=======
		
	
		return unidades;
		
		
		
		
	
		
>>>>>>> refs/remotes/origin/djocampoll
=======

		return unidades;
>>>>>>> refs/heads/mgomez
	}

	/**
	 * Interna un nuevo paciente al hospital con los parámetros dados. No se permite
	 * internar un paciente si: - existe un paciente con el mismo número de
	 * identificación. - se desea internarlo en pediatría y tiene mas de 15 años
	 * (Unidad.EDAD_MAX_PEDIATRIA). - se desea internarlo en geriatría y tiene menos
	 * de 60 años (Unidad.EDAD_MIN_GERIATRIA).
	 * 
	 * @param pNombreUnidad         Nombre de la unidad a la que se ingresa el
	 *                              paciente.
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
	 * @return true si logra ingresar el paciente, false en caso contrario.
	 */
	public boolean internarNuevoPaciente(String pNombreUnidad, String pNombrePaciente, String pApellido, 
			int pNumeroIdentificacion, int pEdad, String pDiagnostico, int pDiasHospitalizacion,
			Motivo pMotivoIngreso) {
<<<<<<< HEAD
<<<<<<< HEAD
		    Unidad u=null;
		    u = null;
		    if((pNombrePaciente!=null)||(pNombrePaciente!=" ")) {
		    	if((pApellido!=null)||(pApellido!=" ")) {
			if (u.buscarPaciente(pNumeroIdentificacion)==null) {
				if((pEdad<15) &&(pNombreUnidad.equals("Unidad C"))) {
					u.agregarPaciente(pNombrePaciente, pApellido, pNumeroIdentificacion, pEdad, pDiagnostico, pDiasHospitalizacion, pMotivoIngreso);
				}
				
			}
		    	}
			return false;
=======

		if(buscarPaciente(pNumeroIdentificacion)==null)
		{
			if(pNombreUnidad == "PEDIATRIA" && pEdad > Unidad.EDAD_MAX_PEDIATRIA)
			{
				return Boolean.FALSE;
			}
			if(pNombreUnidad == "GERIATRIA" && pEdad < Unidad.EDAD_MIN_GERIATRIA)
			{
				return Boolean.FALSE;
			}
			
			Unidad unidad = buscarUnidad(pNombreUnidad);
			
			if(unidad != null)
			{
				unidad.agregarPaciente(pNombrePaciente, pApellido, pNumeroIdentificacion, pEdad, pDiagnostico, pDiasHospitalizacion, pMotivoIngreso);
				
				System.out.println("internar paciente:"+unidad.darNombreUnidad());
				
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
			
		}
		
		
		
		
>>>>>>> refs/remotes/origin/djocampoll
		// TODO Parte3 PuntoD: Complete el método según la documentación dada.
<<<<<<< HEAD
=======
		if (buscarPaciente(pNumeroIdentificacion) != null) {
			if (pNombreUnidad == "PEDIATRIA" && pEdad > Unidad.EDAD_MAX_PEDIATRIA) {
				return Boolean.FALSE;
			}
			if (pNombreUnidad == "GERIATRIA" && pEdad < Unidad.EDAD_MIN_GERIATRIA) {
				return Boolean.FALSE;
			}
		} else {
			Unidad unidad = buscarUnidad(pNombreUnidad);
			if (unidad != null) {
				unidad.agregarPaciente(pNombrePaciente, pApellido, pNumeroIdentificacion, pEdad, pDiagnostico,
						pDiasHospitalizacion, pMotivoIngreso);
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
>>>>>>> refs/heads/mgomez
	}
			return true;
	}
=======
	
>>>>>>> refs/remotes/origin/djocampoll

	/**
	 * Devuelve un paciente dado su ID.
	 * 
	 * @param pNumeroIdentificacion ID del paciente. pNumeroIdentificacion > 0.
	 * @return El paciente que tiene el ID dado por parámetro, null en caso de no
	 *         encontrarlo.
	 */
	public Paciente buscarPaciente(int pNumeroIdentificacion) {
<<<<<<< HEAD
<<<<<<< HEAD
		    Paciente p =null;
		    int i =0;
		    if(pNumeroIdentificacion>0) {
		    	while(unidades!=null) {
		    		p = unidades[i].buscarPaciente(pNumeroIdentificacion);
		    		i++;
		    	}
		}
		    return p;
=======
		
		Paciente bpaciente = null; 	
		if (pNumeroIdentificacion>0) 
		{ 			
			for(Unidad unidades : unidades) 
			{ 				
				bpaciente=unidades.buscarPaciente(pNumeroIdentificacion); 				
				if(bpaciente!= null) 
				{ 					
					return bpaciente; 				
					} 			
				} 		
			}
		return null;
		
		
>>>>>>> refs/remotes/origin/djocampoll
		// TODO Parte3 PuntoE: Complete el método según la documentación dada.
=======
		Paciente paciente = null;
		if (pNumeroIdentificacion > 0) {
			for (Unidad unidades : unidades) {
				paciente = unidades.buscarPaciente(pNumeroIdentificacion);
				if (paciente != null) {
					return paciente;
				}
			}
		}
		return null;
>>>>>>> refs/heads/mgomez
	}

	/**
	 * Determina si el paciente, dado su ID por parámetro, es dado de alta.
	 * 
	 * @param pNumeroIdentificacion ID del paciente.
	 * @return True si el paciente es dado de alta, false en caso de no encontrarlo.
	 */
	public boolean darDeAltaPaciente(int pNumeroIdentificacion) {
		// TODO Parte3 PuntoF: Complete el método según la documentación dada.
<<<<<<< HEAD
<<<<<<< HEAD
		Unidad u = null;
		Paciente p=null;
		p= buscarPaciente(pNumeroIdentificacion);
	 if(p!=null) {
		 u.darDeAltaPaciente(pNumeroIdentificacion);
		 return Boolean.TRUE;
		}
		return Boolean.FALSE;
=======

>>>>>>> refs/heads/mgomez
	}
=======
		
		Unidad llaUnidad = buscarUnidadPaciente(pNumeroIdentificacion);
		
		
		
		if (llaUnidad==null) {
			
			
			System.out.println("No se debería dar de alta al paciente");
			return Boolean.FALSE;
			
			
		}
			llaUnidad.darDeAltaPaciente(pNumeroIdentificacion);
			return Boolean.TRUE;
		}
		
		
		
		
		
		
		
				
		
			
		
	
		
		
		
		
	
>>>>>>> refs/remotes/origin/djocampoll

	/**
	 * Cambia de unidad a un paciente dado su ID por parámetro, si se cumplen las
	 * siguiente condiciones. - Si la unidad destino es de tipo PEDIATRIA y el
	 * paciente no supera la edad máxima. - Si la unidad destino es de tipo
	 * GERIATRIA y el paciente no está por debajo de la edad mínima. - Si la unidad
	 * de destino no es la misma en la que se encuentra actualmente el paciente.
	 * post:<br>
	 * Se retira de la unidad original solo si es posible reasignarlo en la unidad
	 * destino.
	 * 
	 * @param pNumeroIdentificacion ID del paciente.
	 * @param pNuevaUnidad          Unidad a la que será trasferido el paciente.
	 * @return True si pudo reubicar el paciente, false en caso contrario.
	 */

	
	public boolean reubicarPaciente(int pNumeroIdentificacion, String pNuevaUnidad) {
<<<<<<< HEAD
		// TODO Parte3 PuntoG: Complete el método según la documentación dada.
<<<<<<< HEAD
		
=======
		Paciente paciente = buscarPaciente( pNumeroIdentificacion);
		Unidad  unidadpaciente = buscarUnidadPaciente(pNumeroIdentificacion);
		Unidad unidad = buscarUnidad(pNuevaUnidad);
		
	if (paciente!=null) {
		
		if(pNuevaUnidad == "unidad C" && paciente.darEdad() > Unidad.EDAD_MAX_PEDIATRIA) {
			return Boolean.FALSE;
		}
		
		if(pNuevaUnidad == "unidad E" && paciente.darEdad() > Unidad.EDAD_MAX_PEDIATRIA) {
			return Boolean.FALSE;			
		}
		if(pNuevaUnidad != unidadpaciente.darNombreUnidad()) {
			if(unidad != null){
				unidad.agregarPaciente(paciente.darNombre(), paciente.darApellido(), 
						paciente.darNumeroIdentificacion(), paciente.darEdad(), paciente.darDiagnostico(), 
						paciente.darDiasHospitalizacion(), paciente.darMotivoIngreso());
				unidadpaciente.darDeAltaPaciente(pNumeroIdentificacion);
				return Boolean.TRUE;
	}
	return false;
		
		
		
			}
			
		}
		
		
		// TODO Parte3 PuntoG: Complete el método según la documentación dada.
	return Boolean.FALSE;
>>>>>>> refs/remotes/origin/djocampoll
=======
		Paciente paciente = buscarPaciente(pNumeroIdentificacion);
		Unidad unidadpaciente = buscarUnidadPaciente(pNumeroIdentificacion);
		Unidad unidad = buscarUnidad(pNuevaUnidad);
		if (pNuevaUnidad == "unidad C" && paciente.darEdad() > Unidad.EDAD_MAX_PEDIATRIA) {
			return Boolean.FALSE;
		}
		if (pNuevaUnidad == "unidad E" && paciente.darEdad() > Unidad.EDAD_MAX_PEDIATRIA) {
			return Boolean.FALSE;
		}

		if (pNuevaUnidad != unidadpaciente.darNombre()) {
			if (unidad != null) {
				unidad.agregarPaciente(paciente.darNombre(), paciente.darApellido(), paciente.darNumeroIdentificacion(),
						paciente.darEdad(), paciente.darDiagnostico(), paciente.darDiasHospitalizacion(),
						paciente.darMotivoIngreso());
				unidadpaciente.darDeAltaPaciente(pNumeroIdentificacion);
				return Boolean.TRUE;

			}

		}

		return Boolean.FALSE;

>>>>>>> refs/heads/mgomez
	}

	/**
	 * Busca la unidad a la que pertenece un paciente.
	 * 
	 * @param pNumeroIdentificacion ID del paciente.
	 * @return La unidad a la que pertenece el paciente, null en caso de no
	 *         encontrar el paciente.
	 */
	public Unidad buscarUnidadPaciente(int pNumeroIdentificacion) {
		// TODO Parte3 PuntoH: Complete el método según la documentación dada.
<<<<<<< HEAD
		Unidad llaUnidad = null;
		Unidad nombreUnidad;
		Paciente pacienteBUscarString;
		
		for(Unidad unidad : unidades)
		{
			if(unidad.buscarPaciente(pNumeroIdentificacion) != null )	
			{
				return unidad;
			}			
		}
		return null;
			
		
		
		
=======
		for (Unidad unidad : unidades) {
			if (unidad.buscarPaciente(pNumeroIdentificacion) != null) {
				return unidad;
			}

		}
		return null;

>>>>>>> refs/heads/mgomez
	}

	/**
	 * Busca una unidad dado su nombre.
	 * 
	 * @param pNombreUnidad Nombre de la unidad.
	 * @return La unidad cuyo nombre es dado por parámetro, null en caso de no
	 *         encontrarla.
	 */
	public Unidad buscarUnidad(String pNombreUnidad) {
<<<<<<< HEAD
<<<<<<< HEAD
		Unidad u= null;
		Return u;
=======
		
		Unidad unidadBuscadaString = null;
		
	for (int i = 0; i < unidades.length; i++) {
		
		if (pNombreUnidad.equals(unidades[i])) {

			unidadBuscadaString=unidades[i];
		}
	
	}
	return unidadBuscadaString;
	
	
	
	/*
	 * 
	 * */
>>>>>>> refs/remotes/origin/djocampoll
		// TODO Parte3 PuntoI: Complete el método según la documentación dada.
=======

		for (Unidad unidad : unidades) {
			if (unidad.darNombre() == pNombreUnidad) {
				return unidad;
			}
		}
		return null;
>>>>>>> refs/heads/mgomez
	}

	/**
	 * Calcula la cantidad total de pacientes en el hospital.
	 * 
	 * @return Cantidad total de pacientes en el hospital.
	 */
	public int darCantidadTotalPacientes() {
		
		int cantidad = 0; 
	
			
		for(Unidad unidades : unidades) 
		{ 				
			cantidad=unidades.darPacientes().size(); 
			
			
			} 		
		
	return cantidad;
		
		// TODO Parte3 PuntoJ: Complete el método según la documentación dada.
<<<<<<< HEAD
		
<<<<<<< HEAD
=======
		
>>>>>>> refs/remotes/origin/djocampoll
=======
		int cantidad=0;
		
		for (Unidad unidades:unidades) {
			cantidad=unidades.darPacientes().size();
			
		}
		return cantidad;
>>>>>>> refs/heads/mgomez
	}

	/**
	 * Retorna el paciente de mayor edad en el hospital. Si hay dos o más pacientes
	 * con la edad máxima, retorna cualquiera de los dos.
	 * 
	 * @return Paciente de mayor edad, null si no hay pacientes en el hospital.
	 */
	public Paciente darPacienteMayorEdad() {
<<<<<<< HEAD
	    Paciente p =null;
	    int i =0;
	    	while(unidades!=null) {
	    		p = unidades[i].darPacienteMayorEdad();
	    		i++;
=======
		// TODO Parte3 PuntoK: Complete el método según la documentación dada.
		
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
	    return p;
		// TODO Parte3 PuntoK: Complete el método según la documentación dada.
		Paciente bpaciente = null; 	
		 			
			for(Unidad unidades : unidades) 
			{ 				
				bpaciente=unidades.darPacienteMayorEdad(); 	
				
			
				
				if(bpaciente!= null) 
				{ 					
					return bpaciente; 				
					} 			
				} 		
			
		return null;
		
	
	}
	
	
	
	

	/**
	 * Asigna el encargado con los valores dados por parámetro a la unidad dada por
	 * parámetro, si la unidad ya tenía encargado no lo asigna.
	 * 
	 * @param pNombre           Nombre del encargado. pNombre != null && pNombre !=
	 *                          "".
	 * @param pAniosExperiencia Años de experiencia del encargado. pAniosExperiencia
	 *                          > 0.
	 * @param pUnidad           Nombre de la unidad para asignar enccargado. pUnidad
	 *                          != null && pUnidad != "".
	 * @return True si el encargado se pudo asignar, false si la unidad ya tenía
	 *         encargado o si no existe una unidad con el nombre dado.
	 */
	
	
	public boolean asignarEncargado(String pNombre, int pAniosExperiencia, String pUnidad) {
<<<<<<< HEAD
		Unidad u= null;
		if((pNombre!=null)||(pNombre!=" ")) {
			if(pAniosExperiencia>0) {
				if((pUnidad!=null)||(pUnidad==" ")) {
					u.asignarEncargado(pNombre, pAniosExperiencia);
					return Boolean.TRUE;
				}
			}
		}
		// TODO Parte3 PuntoL: Complete el método según la documentación dada.
<<<<<<< HEAD
		return false;
		
	
=======
		
		
		boolean nombreCorrecto=(pNombre != null && pNombre !="");
		boolean pAñosCorrectos=(pAniosExperiencia>0);
		boolean pUnidadCorrecta=(pUnidad != null && pUnidad != "");
		
		Unidad llUnidad = null;
		System.out.println("datos para asigrnar encargado "+pNombre+" "+pAniosExperiencia+" "+pUnidad);
		if (! nombreCorrecto || !pAñosCorrectos || !pUnidadCorrecta) {
			
			return Boolean.FALSE;
			
		}
		Unidad unidad=buscarUnidad(pUnidad);
		if (unidad==null) {
			
			return Boolean.FALSE;
			
			
		}
		boolean unidadLibre=unidad.darEncargado()==null;
		
		if (!unidadLibre) {
			
			return Boolean.FALSE;
			
		}
		
		boolean resultado=unidad.asignarEncargado(pNombre, pAniosExperiencia);
		return resultado;
		
		
>>>>>>> refs/remotes/origin/djocampoll
=======
		
		
		
		
>>>>>>> refs/heads/mgomez
	}
		
				
		
		
		
		
		// TODO Parte3 PuntoL: Complete el método según la documentación dada.
	

	// -----------------------------------------------------------------
	// Puntos de Extensión
	// -----------------------------------------------------------------

	/**
	 * Método para la extensión 1.
	 * 
	 * @return Respuesta1.
	 */
	public String metodo1() {
		return "Respuesta 1.";
	}

	/**
	 * Método para la extensión 2.
	 * 
	 * @return Respuesta2.
	 */
	public String metodo2() {
		return "Respuesta 2.";
	}

}