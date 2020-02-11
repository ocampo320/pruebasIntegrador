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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Di�logo para mostrar los pacientes de una unidad.
 */
public class DialogoPacientesUnidad extends JDialog implements ActionListener
{
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------
	/**
     * Comando para cerrar el di�logo.
     */
	private static final String CERRAR = "Cerrar";

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------
	/**
	 * Ventana principal de la aplicaci�n.
	 */	
	private InterfazCupiHospital principal;
	
	// -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Barra de desplazamiento de la tabla.
     */
    private JScrollPane barraDesplazamiento;

    /**
     * Tabla para mostrar los pacientes.
     */
    private JTable tblPacientes;

    /**
     * Bot�n para cerrar el di�logo.
     */
    private JButton btnCerrar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	
	/**
	 * Constructor del di�logo.
	 * @param ventanaPrincipal Ventana principal. ventanaPrincipal != null.
	 * @param pacientes Lista de pacientes de la unidad.
	 */
	public DialogoPacientesUnidad(InterfazCupiHospital ventanaPrincipal, ArrayList pacientes)
	{
		principal= ventanaPrincipal;
		setTitle( "Pacientes");
		setSize(592, 250);
		JPanel panelAuxiliar = new JPanel();
		panelAuxiliar.setLayout( new BorderLayout( ) );
		panelAuxiliar.setPreferredSize( new Dimension(592, 250) );

        tblPacientes = new JTable( );

        barraDesplazamiento = new JScrollPane( );
        barraDesplazamiento.setViewportView( tblPacientes );

        btnCerrar = new JButton( "Cerrar" );
        btnCerrar.addActionListener( this );
        btnCerrar.setActionCommand( CERRAR );
        JPanel panelBotones = new JPanel( );
        panelBotones.add( btnCerrar );

        panelAuxiliar.add( barraDesplazamiento, BorderLayout.CENTER );

        panelAuxiliar.add( panelBotones, BorderLayout.SOUTH );
        
        add(panelAuxiliar);
        establecerPacientes(pacientes);
		
	}
	
	// -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Establece los pacientes a visualizar.
     * @param pacientes Pacientes a mostrar.
     */
    public void establecerPacientes( ArrayList pacientes )
    {
        tblPacientes.setModel( new TableModelPacientes( pacientes ) );
    }

	/**
     * Manejo de los eventos de los botones.
     * @param e Evento asociado al click en un bot�n. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );

        if( comando.equals( CERRAR ) )
        {
          	dispose();
        }
    }

}
