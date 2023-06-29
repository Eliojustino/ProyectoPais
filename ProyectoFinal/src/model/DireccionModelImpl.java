/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 22/06/2023                  *
 * Modificado: 22/06/2023              *
 * Descripciòn: Cree el model para     *
 *              dirección,aquí         *
 *              proporciono            *
 *              los métodos para hacer *
 *              el CRUD                *
 ***************************************/
package model;

import entity.Direccion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DireccionModelImpl implements IDireccionModel {

    private int codigoActual = 1;

    /**
     * Crea un nuevo registro de dirección y lo agrega a la lista.
     *
     * @param lista     la lista de direcciones
     * @param direccion la dirección a crear
     */
    @Override
    public void crearRegistro(List<Direccion> lista, Direccion direccion) {
        direccion.setCodigo(codigoActual);
        lista.add(direccion);
        codigoActual++;
    }

    /**
     * Elimina un registro de dirección de la lista según el código especificado.
     *
     * @param lista  la lista de direcciones
     * @param codigo el código del registro a eliminar
     */
    @Override
    public void eliminarRegistro(List<Direccion> lista, int codigo) {
        for (Direccion direccion : lista) {
            if (direccion.getCodigo() == codigo) {
                int resp = JOptionPane.showConfirmDialog(null,
                        "¿Seguro que desea borrar este elemento?\n",
                        "¡Alerta!", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    lista.remove(direccion);
                    break;
                }
                if (resp == JOptionPane.NO_OPTION) {
                    break;
                }
            }

        }
    }

    /**
     * Actualiza un registro de dirección en la lista.
     *
     * @param lista     la lista de direcciones
     * @param direccion la dirección actualizada
     */
    @Override
    public void actualizarRegistro(List<Direccion> lista, Direccion direccion) {
        int i = 0;
        for (Direccion objDireccion : lista) {
            if (objDireccion.getCodigo() == direccion.getCodigo()) {
                lista.set(i, direccion);
                break;
            }
            i++;
        }
    }

    /**
     * Muestra los registros de dirección en un modelo de tabla.
     *
     * @param lista la lista de direcciones
     * @param model el modelo de tabla donde se mostrarán los registros
     */
    @Override
    public void mostrarRegistro(List<Direccion> lista, DefaultTableModel model) {
        model.setRowCount(0);
        for (Direccion direccion : lista) {
            Object[] fila = new Object[8];
            fila[0] = direccion.getCodigo();
            fila[1] = direccion.getPais().getNombre();
            fila[2] = direccion.getEstado().getNombre();
            fila[3] = direccion.getNombre();
            fila[4] = direccion.getCodPostal();
            fila[5] = direccion.getColonia();
            fila[6] = direccion.getCalle();
            fila[7] = direccion.getNumCasa();

            model.addRow(fila);
        }
    }
}

