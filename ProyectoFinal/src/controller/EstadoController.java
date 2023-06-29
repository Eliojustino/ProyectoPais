/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 03/06/2023              *
 * Descripciòn: Cree la clase de Estado*
 *              Controller             *
 ************************************** */
package controller;

import entity.Estado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.EstadoModelImpl;
import model.IEstadoModel;

/**
 * Controlador para la entidad Estado. Se encarga de manejar las operaciones
 * relacionadas con los estados.
 */
public class EstadoController {

    private final IEstadoModel model = new EstadoModelImpl();

    /**
     * Crea un nuevo registro de estado y lo agrega a la lista.
     *
     * @param lista la lista de estados
     * @param estado el estado a crear
     */
    public void crearRegistro(List<Estado> lista, Estado estado) {
        model.crearRegistro(lista, estado);
    }

    /**
     * Elimina un registro de estado de la lista basado en el código.
     *
     * @param lista la lista de estados
     * @param codigo el código del estado a eliminar
     */
    public void eliminarRegistro(List<Estado> lista, int codigo) {
        model.eliminarRegistro(lista, codigo);
    }

    /**
     * Muestra los registros de estado en un modelo de tabla.
     *
     * @param lista la lista de estados
     * @param modelo el modelo de tabla para mostrar los datos
     */
    public void mostrarRegistro(List<Estado> lista, DefaultTableModel modelo) {
        model.mostrarRegistro(lista, modelo);
    }

    /**
     * Actualiza un registro de estado en la lista.
     *
     * @param lista la lista de estados
     * @param estado el estado actualizado
     */
    public void actualizarRegistro(List<Estado> lista, Estado estado) {
        model.actualizarRegistro(lista, estado);
    }
}
