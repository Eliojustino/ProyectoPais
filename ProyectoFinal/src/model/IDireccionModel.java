/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 22/06/2023                  *
 * Modificado: 22/06/2023              *
 * Descripciòn: Cree la intefaz de     *
 *              Direccion              *
 *              y generé los métodos   *
 *              use                    *
 ************************************** */
package model;

import entity.Direccion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IDireccionModel {
    /**
     * Crea un nuevo registro de dirección y lo agrega a la lista.
     *
     * @param lista     la lista de direcciones
     * @param direccion la dirección a crear
     */
    public void crearRegistro(List<Direccion> lista, Direccion direccion);

    /**
     * Elimina un registro de dirección de la lista según el código especificado.
     *
     * @param lista  la lista de direcciones
     * @param codigo el código del registro a eliminar
     */
    public void eliminarRegistro(List<Direccion> lista, int codigo);

    /**
     * Actualiza un registro de dirección en la lista.
     *
     * @param lista     la lista de direcciones
     * @param direccion la dirección actualizada
     */
    public void actualizarRegistro(List<Direccion> lista, Direccion direccion);

    /**
     * Muestra los registros de dirección en un modelo de tabla.
     *
     * @param lista la lista de direcciones
     * @param model el modelo de tabla donde se mostrarán los registros
     */
    public void mostrarRegistro(List<Direccion> lista, DefaultTableModel model);
}
