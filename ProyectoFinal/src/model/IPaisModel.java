/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 03/06/2023              *
 * Descripciòn: Cree la intefaz de Pais*
 *              y generé los métodos   *
 *              use                    *
 ************************************** */
package model;

import entity.Pais;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Esta interfaz define los métodos para realizar operaciones en la lista de
 * países.
 */
public interface IPaisModel {

    /**
     * Crea un nuevo registro de país y lo agrega a la lista.
     *
     * @param lista la lista de países
     * @param pais el país a agregar
     */
    public void crearRegistro(List<Pais> lista, Pais pais);

    /**
     * Elimina un registro de país de la lista por su código.
     *
     * @param lista la lista de países
     * @param codigo el código del país a eliminar
     */
    public void eliminarRegistro(List<Pais> lista, int codigo);

    /**
     * Muestra los registros de países en un modelo de tabla.
     *
     * @param lista la lista de países
     * @param modelo el modelo de tabla para mostrar los datos
     */
    public void mostrarRegistro(List<Pais> lista, DefaultTableModel modelo);

    /**
     * Actualiza un registro de país en la lista.
     *
     * @param lista la lista de países
     * @param pais el país actualizado
     */
    public void actualizarRegistro(List<Pais> lista, Pais pais);
}
