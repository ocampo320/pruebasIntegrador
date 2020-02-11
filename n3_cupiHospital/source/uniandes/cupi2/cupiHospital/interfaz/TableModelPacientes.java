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

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import uniandes.cupi2.cupiHospital.mundo.Paciente;


/**
 * Clase que maneja el formato de la tabla donde se muestran los pacientes de una unidad.
 */
public class TableModelPacientes extends AbstractTableModel
{

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Pacientes a mostrar
     */
    private ArrayList pacientes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la clase. 
     * @param pPacientes Pacientes de una unidad a mostrar.
     */
    public TableModelPacientes( ArrayList pPacientes )
    {
        pacientes = pPacientes;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Devuelve el numero de filas de la tabla.
     * @return N�mero de filas de la tabla.
     */
    public int getRowCount( )
    {
        return pacientes.size( );
    }

    /**
     * Devuelve el numero de columnas de la tabla.
     * @return N�mero de columnas de la tabla.
     */
    public int getColumnCount( )
    {
        return 3;
    }

    /**
     * Devuelve el elemento dada su posici�n en fila y columna.
     * @param row N�mero de la fila.
     * @param col N�mero de la columna.
     * @return El elemento de la posici�n dada en fila y columna.
     */
    public Object getValueAt( int row, int col )
    {
        switch( col )
        {
            case 0:
                int numero= ( ( Paciente )pacientes.get( row ) ).darNumeroIdentificacion( );
                return new Integer(numero);
            case 1:
                return ( ( Paciente )pacientes.get( row ) ).darNombre( );
            default:
                return ( ( Paciente )pacientes.get( row ) ).darApellido( );
        }
    }

    /**
     * Devuelve el encabezado de la columna dado su n�mero.
     * @param col Numero de la columna.
     * @return El nombre de la columna.
     */
    public String getColumnName( int col )
    {
        switch( col )
        {
            case 0:
                return "N�mero de identificaci�n";
            case 1:
                return "Nombre";
            default:
                return "Apellido";
        }
    }

}
