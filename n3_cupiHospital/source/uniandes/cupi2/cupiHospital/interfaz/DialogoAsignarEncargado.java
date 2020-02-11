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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * Di�logo para ingresar un paciente a una unidad.
 */
public class DialogoAsignarEncargado extends JDialog implements ActionListener
{
	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Comando para asignar el encargado
	 */
	private static final String ASIGNAR = "ASIGNAR";
	/**
	 * Comando para cancelar.
	 */
	private static final String CANCELAR = "CANCELAR";

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Ventana principal de la aplicaci�n
	 */
	private InterfazCupiHospital principal;

	// -----------------------------------------------------------------
	// Atributos de Interfaz
	// -----------------------------------------------------------------

	/**
	 * Bot�n para asignar el encargado.
	 */
	private JButton btnAsignar;

	/**
	 * Bot�n para cancelar.
	 */
	private JButton btnCancelar;

	/**
	 * Etiqueta con el nombre del encargado.
	 */
	private JLabel lblNombre;

	/**
	 * Etiqueta con los a�os de experiencia.
	 */
	private JLabel lblAnios;

	/**
	 * Campo de texto con el nombre del encargado.
	 */
	private JTextField txtNombre;

	/**
	 * Campo de texto con los a�os de experiencia.
	 */
	private JTextField txtAnios;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Constructor del di�logo.
	 * @param ventanaPrincipal Ventana principal. ventanaPrincipal != null.
	 */
	public DialogoAsignarEncargado( InterfazCupiHospital ventanaPrincipal)
	{
		principal= ventanaPrincipal;
		setSize(300,200);
		setLayout(new GridLayout(3,2,10,10));
		setTitle("Asignar encargado");
		lblNombre = new JLabel("Nombre");
		lblAnios = new JLabel("A�os experiencia:");
		txtNombre = new JTextField();
		txtAnios= new JTextField();

		btnAsignar = new JButton("Asignar");
		btnAsignar.setActionCommand(ASIGNAR);
		btnAsignar.addActionListener(this);
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand(CANCELAR);
		btnCancelar.addActionListener(this);

		add(lblNombre);
		add(txtNombre);
		add(lblAnios);
		add(txtAnios);
		add(btnAsignar);
		add(btnCancelar);

	}

	// -----------------------------------------------------------------
	// M�todos
	// -----------------------------------------------------------------

	/**
	 * Manejo de los eventos de los botones.
	 * @param e Evento asociado al click en un bot�n. e != null.
	 */
	public void actionPerformed( ActionEvent evento )
	{
		String comando = evento.getActionCommand( );
		if(comando.equals(ASIGNAR))
		{
			String nombre = txtNombre.getText();
			String aniosSt= txtAnios.getText();
			if(nombre.equals("")||aniosSt.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Debe completar todos los campos", "Asignar encargado", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				try
				{
					int anios = Integer.parseInt(aniosSt);
					if(anios <= 0)
					{
						JOptionPane.showMessageDialog(this, "Los a�os de experiencia debe ser un n�mero mayor a 0.", "Asignar encargado", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						dispose();
						principal.asignarEncargado(nombre, anios);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(this, "Los a�os de experiencia debe ser un n�mero v�lido.", "Asignar encargado", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		else if(comando.equals(CANCELAR))
		{
			dispose();
		}
	}

}
