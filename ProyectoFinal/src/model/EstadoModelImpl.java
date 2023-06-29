/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 06/06/2023              *
 * Descripciòn: Cree el model para     *
 *              Estado,aquí            *
 *              proporciono            *
 *              los métodos para hacer *
 *              el CRUD                *
 ***************************************/
package model;

import entity.Estado;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EstadoModelImpl implements IEstadoModel {
    
    private int codigoActual = 1;

    /**
     * Crea un nuevo registro de Estado y lo agrega a la lista.
     *
     * @param lista  la lista de Estados
     * @param estado el Estado a crear
     */
    @Override
    public void crearRegistro(List<Estado> lista, Estado estado) {
        estado.setCodigo(codigoActual);
        lista.add(estado);
        codigoActual++;
    }

    /**
     * Muestra los registros de Estado en un modelo de tabla.
     *
     * @param lista  la lista de Estados
     * @param modelo el modelo de tabla donde se mostrarán los registros
     */
    @Override
    public void mostrarRegistro(List<Estado> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Estado estado : lista) {
            Object[] fila = new Object[5];
            fila[0] = estado.getCodigo();
            fila[1] = estado.getNombre();
            fila[2] = estado.getCapital();
            fila[3] = estado.getPais().getNombre();

            modelo.addRow(fila);
        }
    }

    /**
     * Actualiza un registro de Estado en la lista.
     *
     * @param lista  la lista de Estados
     * @param estado el Estado actualizado
     */
    @Override
    public void actualizarRegistro(List<Estado> lista, Estado estado) {
        int i = 0;
        for (Estado objEstado : lista) {
            if (objEstado.getCodigo() == estado.getCodigo()) {
                lista.set(i, estado);
                break;
            }
            i++;
        }
    }

    /**
     * Elimina un registro de Estado de la lista según el código especificado.
     *
     * @param lista  la lista de Estados
     * @param codigo el código del registro a eliminar
     */
    @Override
    public void eliminarRegistro(List<Estado> lista, int codigo) {
        for (Estado estado : lista) {
            if (estado.getCodigo() == codigo) {
                int resp = JOptionPane.showConfirmDialog(null,
                        "¿Seguro que desea borrar este elemento?\n",
                        "Alerta!", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    lista.remove(estado);
                    break;
                }
                if (resp == JOptionPane.NO_OPTION) {
                    break;
                }
            }
        }
    }
}
