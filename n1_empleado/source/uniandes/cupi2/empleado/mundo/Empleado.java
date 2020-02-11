/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_empleado
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.empleado.mundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

<<<<<<< HEAD
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Clase que representa un empleado.
 */
public class Empleado
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del empleado.
     */
    private String nombre;

    /**
     * Apellido del empleado.
     */
    private String apellido;

    /**
     * Genero del empleado. <br>
     * 1 indica género masculino. <br>
     * 2 indica género femenino. <br>
     */
    private int genero;

    /**
     * Fecha de nacimiento del empleado.
     */
    private Fecha fechaNacimiento;

    /**
     * Fecha de ingreso del empleado a la compañía.
     */
    private Fecha fechaIngreso;

    /**
     * Ruta de la imagen.
     */
    private String imagen;

    /**
     * Salario del empleado.
     */
    private double salario;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye el empleado. <br>
     * <b>post: </b> Se creó el empleado con los siguientes valores: <br>
     * Nombre: Pedro, Apellido: Matallana, Género: masculino (1), Fecha de nacimiento: 16-6-1982, Fecha de ingreso: 5-4-2000, Imagen: empleado1.png, Salario: 1500000.
     */
    public Empleado( )
    {
        nombre = "Pedro";
        apellido = "Matallana";
        genero = 1;
        fechaNacimiento = new Fecha( 16, 6, 1982 );
        fechaIngreso = new Fecha( 5, 4, 2000 );
        imagen = "empleado1.png";
        salario = 1500000;
        
    }

    /**
     * Retorna el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna el genero del empleado.
     * @return Genero del empleado.
     */
    public int darGenero( )
    {
        return genero;
    }

    /**
     * Retorna la fecha de nacimiento del empleado en una cadena.
     * @return Fecha de nacimiento del empleado.
     */
    public String darFechaNacimiento( )
    {
        String strFecha = fechaNacimiento.toString( );
        return strFecha;
    }

    /**
     * Retorna la fecha de ingreso del empleado en una cadena.
     * @return Fecha de ingreso del empleado.
     */
    public String darFechaIngreso( )
    {
        String strFecha = fechaIngreso.toString( );
        return strFecha;
    }

    /**
     * Retorna la ruta de la imagen del empleado.
     * @return Ruta de la imagen.
     */
    public String darImagen( )
    {
        return imagen;
    }

    /**
     * Retorna el salario del empleado.
     * @return Salario del empleado.
     */
    public double darSalario( )
    {
        return salario;
    }

    /**
     * Retorna el apellido del empleado.
     * @return Apellido del empleado.
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Retorna la edad del empleado en años.
     * @return Edad del empleado en años.
     */
   
    public int calcularEdad( )
    {
        Fecha hoy = darFechaActual( );

        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;

        return edad;
        
        
    }

    /**
     * Retorna la antigüedad del empleado en años.
     * @return Antigüedad del empleado en años.
     */
   
    
    public double calcularAntiguedad( )
    {
        Fecha hoy = darFechaActual( );
        double antiguedad = fechaIngreso.darDiferenciaEnMeses( hoy ) / 12.0;

        return antiguedad;
        
    }
    

    /**
     * Retorna las prestaciones del empleado usando la fórmula: p = (a * s)/12 (p: prestaciones, a: antigüedad, s: salario). <br>
     * La antigüedad que se utiliza está dada en años, así que si un empleado lleva menos de un año en la empresa, sus prestaciones serán 0.
     * @return Prestaciones del empleado.
     */
    public double calcularPrestaciones( )
    {
        double antiguedad = calcularAntiguedad( );
        double prestaciones = ( ( double ) ( antiguedad * salario ) ) / 12;
        return prestaciones;
        
    }

    /**
     * Cambia la información del empleado con los valores dados por parámetro. <br>
     * <b> post: </b> El nombre, apellido, género, fecha de nacimiento, fecha de ingreso, salario e imagen fueron cambiados con los valores dados por parámetro.
     * @param pNombre Nombre del empleado. pNombre != null && pNombre != "".
     * @param pApellido Apellido del empleado. pApellido != null && pApellido != "".
     * @param pGenero Género del empleado. pGenero == 1 || pGenero == 0.
     * @param pFechaNacimiento Fecha de nacimiento del empleado. pFechaNacimiento != null.
     * @param pFechaIngreso Fecha de ingreso del empleado. pFechaIngreso != null.
     * @param pSalario Salario del empleado. pSalario > 0.
     * @param pImagen Imagen del empleado. pImagen != null && pImagen != "".
     */
    public void cambiarEmpleado( String pNombre, String pApellido, int pGenero, Fecha pFechaNacimiento, Fecha pFechaIngreso, int pSalario, String pImagen )
    {
        nombre = pNombre;
        apellido = pApellido;
        genero = pGenero;
        fechaNacimiento = pFechaNacimiento;
        fechaIngreso = pFechaIngreso;
        salario = pSalario;
        imagen = pImagen;
    }

    /**
     * Cambia el salario del empleado con el valor dado por parámetro. <br>
     * <b>post: </b> El salario tiene el valor ingresado por parámetro.
     * @param pSalario Nuevo salario del empleado. pSalario > 0.
     */
    public void cambiarSalario( double pSalario )
    {
        salario = pSalario;
    }

    /**
     * Retorna la fecha actual.
     * @return Fecha actual.
     */
    public int anho;
    public Fecha darFechaActual( )
    {
        GregorianCalendar gc = new GregorianCalendar( );

        int dia = gc.get( Calendar.DAY_OF_MONTH );
        int mes = gc.get( Calendar.MONTH ) + 1;
        anho = gc.get( Calendar.YEAR );
        Fecha hoy = new Fecha( dia, mes, anho );

        return hoy;

    }
    

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * Método para la extensión 1.
     * @return Respuesta 1.
     */
    
    /*este metodo calcula el incremento del salario segun la antiguedad
     * se usan los metodos calcula antiguedad y darsalarrio el cual regresa un int y double
     * esto permite la comparacion con los numeros, que en este caso
     * serian los años de antiguedad
     * se usan sentencias de if, para hacer las comparaciones
     * por cada comparacion se hace la respectiva formula
     * 
     * 
     * */
    public String metodo1()
    {
    	
    	double incremento=0;
    	double porcentajeDeincremento=0;
    	
    	if (calcularAntiguedad()==1) {
    		
    		porcentajeDeincremento=darSalario()*0.15;
    		incremento=porcentajeDeincremento+darSalario();
			
		}else if (calcularAntiguedad()>1 && calcularAntiguedad()<=2) {
			
			incremento=darSalario()*0.18;
    		incremento=incremento+darSalario();
    		
    		
		}else if (calcularAntiguedad()>2&&calcularAntiguedad()<=3) {
			incremento=darSalario()*0.20;
    		incremento=incremento+darSalario();
		}
    	
		else {
			return "no se hace aumento"; 
		}
    	
        return "el nuievo salrio es "+incremento +" y se aumento "+porcentajeDeincremento;
    }

    /**
     * Método para la extensión 2.
     * @return Respuesta 2.
     */
    
    /*  
     * este metod calcula la prima anual y
     * se toma el dato de darfecha,se aplica un substring
     * el cual toma solo el valor del año
     * se almacena dicho valor en una variable y se aplica parce, para convertir a int
     * y poder el calculo de la prima
     * 
     * */
    public String metodo2( )
    {
    	
    	int fechaIngreso=Integer.parseInt(darFechaIngreso().substring(4));
    	double primaAdicional=0;
    	double salarioNuevo = 0;
    	
    	
    	
    	if (fechaIngreso<2016 && calcularEdad()<28) {
    		primaAdicional=darSalario()*10/100;
    		salarioNuevo=darSalario()+primaAdicional;
    		
			
		}
    	
    	
        return "la prima es "+primaAdicional+"  el nuevo salario es: "+salarioNuevo; 
    }
=======
/**
 * Clase que representa un empleado.
 */
public class Empleado
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del empleado.
     */
    private String nombre;

    /**
     * Apellido del empleado.
     */
    private String apellido;

    /**
     * Genero del empleado. <br>
     * 1 indica género masculino. <br>
     * 2 indica género femenino. <br>
     */
    private int genero;

    /**
     * Fecha de nacimiento del empleado.
     */
    private Fecha fechaNacimiento;

    /**
     * Fecha de ingreso del empleado a la compañía.
     */
    private Fecha fechaIngreso;

    /**
     * Ruta de la imagen.
     */
    private String imagen;

    /**
     * Salario del empleado.
     */
    private double salario;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Construye el empleado. <br>
     * <b>post: </b> Se creó el empleado con los siguientes valores: <br>
     * Nombre: Pedro, Apellido: Matallana, Género: masculino (1), Fecha de nacimiento: 16-6-1982, Fecha de ingreso: 5-4-2000, Imagen: empleado1.png, Salario: 1500000.
     */
    public Empleado( )
    {
        nombre = "Pedro";
        apellido = "Matallana";
        genero = 1;
        fechaNacimiento = new Fecha( 16, 6, 1982 );
        fechaIngreso = new Fecha( 5, 4, 2000 );
        imagen = "empleado1.png";
        salario = 1500000;
    }

    /**
     * Retorna el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna el genero del empleado.
     * @return Genero del empleado.
     */
    public int darGenero( )
    {
        return genero;
    }

    /**
     * Retorna la fecha de nacimiento del empleado en una cadena.
     * @return Fecha de nacimiento del empleado.
     */
    public String darFechaNacimiento( )
    {
        String strFecha = fechaNacimiento.toString( );
        return strFecha;
    }

    /**
     * Retorna la fecha de ingreso del empleado en una cadena.
     * @return Fecha de ingreso del empleado.
     */
    public String darFechaIngreso( )
    {
        String strFecha = fechaIngreso.toString( );
        return strFecha;
    }

    /**
     * Retorna la ruta de la imagen del empleado.
     * @return Ruta de la imagen.
     */
    public String darImagen( )
    {
        return imagen;
    }

    /**
     * Retorna el salario del empleado.
     * @return Salario del empleado.
     */
    public double darSalario( )
    {
        return salario;
    }

    /**
     * Retorna el apellido del empleado.
     * @return Apellido del empleado.
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Retorna la edad del empleado en años.
     * @return Edad del empleado en años.
     */
    public int calcularEdad( )
    {
        Fecha hoy = darFechaActual( );

        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;

        return edad;
    }

    /**
     * Retorna la antigüedad del empleado en años.
     * @return Antigüedad del empleado en años.
     */
    public double calcularAntiguedad( )
    {
        Fecha hoy = darFechaActual( );
        double antiguedad = fechaIngreso.darDiferenciaEnMeses( hoy ) / 12.0;

        return antiguedad;
    }

    /**
     * Retorna las prestaciones del empleado usando la fórmula: p = (a * s)/12 (p: prestaciones, a: antigüedad, s: salario). <br>
     * La antigüedad que se utiliza está dada en años, así que si un empleado lleva menos de un año en la empresa, sus prestaciones serán 0.
     * @return Prestaciones del empleado.
     */
    public double calcularPrestaciones( )
    {
        double antiguedad = calcularAntiguedad( );
        double prestaciones = ( ( double ) ( antiguedad * salario ) ) / 12;
        return prestaciones;
    }

    /**
     * Cambia la información del empleado con los valores dados por parámetro. <br>
     * <b> post: </b> El nombre, apellido, género, fecha de nacimiento, fecha de ingreso, salario e imagen fueron cambiados con los valores dados por parámetro.
     * @param pNombre Nombre del empleado. pNombre != null && pNombre != "".
     * @param pApellido Apellido del empleado. pApellido != null && pApellido != "".
     * @param pGenero Género del empleado. pGenero == 1 || pGenero == 0.
     * @param pFechaNacimiento Fecha de nacimiento del empleado. pFechaNacimiento != null.
     * @param pFechaIngreso Fecha de ingreso del empleado. pFechaIngreso != null.
     * @param pSalario Salario del empleado. pSalario > 0.
     * @param pImagen Imagen del empleado. pImagen != null && pImagen != "".
     */
    public void cambiarEmpleado( String pNombre, String pApellido, int pGenero, Fecha pFechaNacimiento, Fecha pFechaIngreso, int pSalario, String pImagen )
    {
        nombre = pNombre;
        apellido = pApellido;
        genero = pGenero;
        fechaNacimiento = pFechaNacimiento;
        fechaIngreso = pFechaIngreso;
        salario = pSalario;
        imagen = pImagen;
    }

    /**
     * Cambia el salario del empleado con el valor dado por parámetro. <br>
     * <b>post: </b> El salario tiene el valor ingresado por parámetro.
     * @param pSalario Nuevo salario del empleado. pSalario > 0.
     */
    public void cambiarSalario( double pSalario )
    {
        salario = pSalario;
    }

    /**
     * Retorna la fecha actual.
     * @return Fecha actual.
     */
    public Fecha darFechaActual( )
    {
        GregorianCalendar gc = new GregorianCalendar( );

        int dia = gc.get( Calendar.DAY_OF_MONTH );
        int mes = gc.get( Calendar.MONTH ) + 1;
        int anho = gc.get( Calendar.YEAR );
        Fecha hoy = new Fecha( dia, mes, anho );

        return hoy;

    }

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------

    /**
     * Método para la extensión 1.
     * @return Respuesta 1.
     */
    public double metodo1( )
    {
    	 Fecha hoy = darFechaActual( );
         double antiguedad = fechaIngreso.darDiferenciaEnMeses( hoy ) / 12.0;

         return antiguedad;
    }
    
    

    public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
     * Método para la extensión 2.
     * @return Respuesta 2.
     */
    public int metodo2( )
    {
    	int anio=fechaIngreso.darAnio();
    	return anio;
    }

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
>>>>>>> refs/heads/mgomez

}