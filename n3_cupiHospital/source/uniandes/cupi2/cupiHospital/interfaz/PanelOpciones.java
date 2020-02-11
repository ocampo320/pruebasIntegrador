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
package uniandes.cupi2.cupiHospital.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel para el manejo de las extensiones.
 */
public class PanelOpciones extends JPanel implements ActionListener
{

    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

	/**
	 * Comando para el paciente de mayor edad.
	 */
	private final static String MAYOR_EDAD = "MAYOR_EDAD";
	
	/**
	 * Comando para el total de pacientes.
	 */
	private final static String TOTAL_PACIENTES = "TOTAL_PACIENTES";
	
    /**
     * Comando Opci�n 1.
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando Opci�n 2.
     */
    private static final String OPCION_2 = "OPCION_2";
   
    
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n.
     */
    private InterfazCupiHospital principal;

    //-----------------------------------------------------------------
    // Atributos de interfaz
    //-----------------------------------------------------------------

    /**
     * Bot�n paciente mayor edad.
     */
    private JButton btnPacienteMayor;
    
    /**
     * Bot�n total pacientes
     */
    private JButton btnTotalPacientes;
    
    /**
     * Bot�n Opci�n 1.
     */
    private JButton btnOpcion1;

    /**
     * Bot�n Opci�n 2.
     */
    private JButton btnOpcion2;
    

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

	/**
	 * Constructor del panel.
	 * @param ventanaPrincipal Ventana principal. ventanaPrincipal != null.
	 */
    public PanelOpciones( InterfazCupiHospital ventanaPrincipal )
    {
        principal = ventanaPrincipal;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 4, 5, 0 ) );
        
        btnPacienteMayor = new JButton("Paciente mayor");
        btnPacienteMayor.setActionCommand(MAYOR_EDAD);
        btnPacienteMayor.addActionListener(this);
        add(btnPacienteMayor);
        
        btnTotalPacientes = new JButton("Total pacientes");
        btnTotalPacientes.setActionCommand(TOTAL_PACIENTES);
        btnTotalPacientes.addActionListener(this);
        add(btnTotalPacientes);
        
        //Bot�n Opci�n 1.
        btnOpcion1 = new JButton("Opci�n 1");
        btnOpcion1.setActionCommand( OPCION_1 );
        btnOpcion1.addActionListener( this );
        add(btnOpcion1);
        
        //Bot�n Opci�n 2.
        btnOpcion2 = new JButton("Opci�n 2");
        btnOpcion2.setActionCommand( OPCION_2 );
        btnOpcion2.addActionListener( this );
        add(btnOpcion2);
    }

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

	/**
     * Manejo de los eventos de los botones.
     * @param e Evento asociado al click en un bot�n. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
    	String comando = e.getActionCommand();
    	
    	if(MAYOR_EDAD.equals(comando))
    	{
    		principal.mayorEdad();
    	}
    	else if(TOTAL_PACIENTES.equals(comando))
    	{
    		principal.totalPacientes();
    	}
    	else if(OPCION_1.equals( comando ))
        {
            principal.reqFuncOpcion1();
        }
        else if(OPCION_2.equals( comando ))
        {
            principal.reqFuncOpcion2();
        }
        
       
    }

}
