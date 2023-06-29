/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 03/06/2023              *
 * Descripciòn: Cree la clase de Pais  *
 *              Controller             *
 ************************************** */
package controller;

import entity.Pais;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IPaisModel;
import model.PaisModelImpl;

/**
 * Controlador para la gestión de registros de países.
 */
public class PaisController {

    private final IPaisModel service = new PaisModelImpl();

    /**
     * Crea un nuevo registro de país.
     *
     * @param lista la lista de países
     * @param pais el país a crear
     */
    public void crearRegistro(List<Pais> lista, Pais pais) {
        service.crearRegistro(lista, pais);
    }

    /**
     * Elimina un registro de país.
     *
     * @param lista la lista de países
     * @param codigo el código del país a eliminar
     */
    public void eliminarRegistro(List<Pais> lista, int codigo) {
        service.eliminarRegistro(lista, codigo);
    }

    /**
     * Muestra los registros de países en un modelo de tabla.
     *
     * @param lista la lista de países
     * @param modelo el modelo de tabla donde mostrar los registros
     */
    public void mostrarRegistro(List<Pais> lista, DefaultTableModel modelo) {
        service.mostrarRegistro(lista, modelo);
    }

    /**
     * Actualiza un registro de país.
     *
     * @param lista la lista de países
     * @param pais el país a actualizar
     */
    public void actualizarRegistro(List<Pais> lista, Pais pais) {
        service.actualizarRegistro(lista, pais);
    }
}
