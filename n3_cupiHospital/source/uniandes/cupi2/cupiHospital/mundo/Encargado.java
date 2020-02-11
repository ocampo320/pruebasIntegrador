package uniandes.cupi2.cupiHospital.mundo;

public class Encargado {
<<<<<<< HEAD
	private String nombre;
	private int aniosExperiencia;

	
	
	public Encargado(String nombre, int aniosExperiencia) {
		this.nombre = nombre;
		aniosExperiencia = aniosExperiencia;
=======
	
	String nombreEncargado="";
	int experienciaEncargado=0;
	
	

	

	public Encargado(String nombreEncargado, int experienciaEncargado) {
		super();
		this.nombreEncargado = nombreEncargado;
		this.experienciaEncargado = experienciaEncargado;
	}

	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	public void setExperienciaEncargado(int experienciaEncargado) {
		this.experienciaEncargado = experienciaEncargado;
>>>>>>> refs/remotes/origin/djocampoll
	}

	private String nombre;
	private int aniosExperiencia;
	public Encargado(String nombre, int aniosExperiencia) {
		super();
		this.nombre = nombre;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String darNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public int darAniosExperiencia() {
		// TODO Auto-generated method stub
		return aniosExperiencia;
	}

}
