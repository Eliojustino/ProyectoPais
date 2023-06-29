/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 11/06/2023              *
 * Descripciòn: Arregle errores que    *
 *              Tenía al momento de    *
 *              registrar y mostrar    *
 *              los elementos          *
 ************************************** */
package model;

import entity.Pais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Implementación de la interfaz IPaisModel.
 */
public class PaisModelImpl implements IPaisModel {
    /**
     * {@inheritDoc}
     */
    @Override
    public void crearRegistro(List<Pais> lista, Pais pais) {
       pais.setCodigo(lista.size()+1);
       lista.add(pais);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminarRegistro(List<Pais> lista, int codigo) {
        for (Pais pais : lista) {
            if (pais.getCodigo() == (codigo)) {
                int resp = JOptionPane.showConfirmDialog(null,
                        "¿Seguro que quiere borrar este elemento?\n",
                        "Alerta!", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if (resp == JOptionPane.YES_NO_OPTION) {
                    lista.remove(pais);
                    break;
                }else {
                    break;
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void actualizarRegistro(List<Pais> lista, Pais pais) {
        for (Pais objPais : lista) {
            if (objPais.getCodigo() == pais.getCodigo()) {
                lista.set(objPais.getCodigo()-1, pais);
                break;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mostrarRegistro(List<Pais> lista, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[4];
            fila[0] = lista.get(i).getCodigo();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getCapital();
            fila[3] = lista.get(i).getFrontera();

            modelo.addRow(fila);
        }
    }
}
