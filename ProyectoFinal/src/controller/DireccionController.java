package controller;

import entity.Direccion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IDireccionModel;
import model.DireccionModelImpl;

public class DireccionController {
   private final IDireccionModel service = new DireccionModelImpl();

    /**
     * Crea un nuevo registro de estado y lo agrega a la lista.
     *
     * @param lista la lista de estados
     * @param estado el estado a crear
     */
    public void crearRegistro(List<Direccion> lista, Direccion estado) {
        service.crearRegistro(lista, estado);
    }

    /**
     * Elimina un registro de estado de la lista basado en el código.
     *
     * @param lista la lista de estados
     * @param codigo el código del estado a eliminar
     */
    public void eliminarRegistro(List<Direccion> lista, int codigo) {
        service.eliminarRegistro(lista, codigo);
    }

    /**
     * Muestra los registros de estado en un modelo de tabla.
     *
     * @param lista la lista de estados
     * @param modelo el modelo de tabla para mostrar los datos
     */
    public void mostrarRegistro(List<Direccion> lista, DefaultTableModel modelo) {
        service.mostrarRegistro(lista, modelo);
    }

    /**
     * Actualiza un registro de estado en la lista.
     *
     * @param lista la lista de estados
     * @param estado el estado actualizado
     */
    public void actualizarRegistro(List<Direccion> lista, Direccion estado) {
        service.actualizarRegistro(lista, estado);
    }
}