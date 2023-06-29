/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 03/06/2023              *
 * Descripciòn: Cree la intefaz de Estado*
 *              y generé los métodos   *
 *              use                    *
 ************************************** */
package model;

import entity.Estado;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Interfaz para el modelo de Estado. Define las operaciones relacionadas con los estados.
 */
public interface IEstadoModel {
    
    /**
     * Crea un nuevo registro de estado y lo agrega a la lista.
     *
     * @param lista la lista de estados
     * @param estado el estado a crear
     */
    public void crearRegistro(List<Estado> lista, Estado estado);
    
    /**
     * Elimina un registro de estado de la lista basado en el código.
     *
     * @param lista la lista de estados
     * @param codigo el código del estado a eliminar
     */
    public void eliminarRegistro(List<Estado> lista, int codigo);
    
    /**
     * Muestra los registros de estado en un modelo de tabla.
     *
     * @param lista el lista de estados
     * @param modelo el modelo de tabla para mostrar los datos
     */
    public void mostrarRegistro(List<Estado> lista, DefaultTableModel modelo);
    
    /**
     * Actualiza un registro de estado en la lista.
     *
     * @param lista la lista de estados
     * @param estado el estado actualizado
     */
    public void actualizarRegistro(List<Estado> lista, Estado estado);
}

