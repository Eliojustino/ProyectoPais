/***************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 19/05/2023                  *
 * Modificado: 11/06/2023              *
 * Descripciòn: Arregle imperfecciones *
 *              y quite el gif de fondo*
 ***************************************/
package view;

import controller.PaisController;
import entity.Pais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que representa el panel de Países.
 */
public class PaisPanel extends javax.swing.JPanel {

    private final DefaultTableModel modeloTablaPais;
    private final PaisController paisController;
    private final List<Pais> listaPais;
    private Pais paisSeleccionado;

    /**
     * Crea un nuevo panel de Países.
     *
     * @param listaPais la lista de países
     */
    public PaisPanel(List<Pais> listaPais) {
        // Inicializa los componentes de la interfaz Género
        initComponents();

        this.modeloTablaPais = (DefaultTableModel) jtListaPais.getModel();
        this.paisController = new PaisController();
        this.listaPais = listaPais;       

        this.llenarDatos();
        this.paisController.mostrarRegistro(this.listaPais, modeloTablaPais);
    }
    
    public final void llenarDatos() {
        this.listaPais.add(new Pais(1, "México", "CDMX", "Estados Unidos"));
        this.listaPais.add(new Pais(2, "Estados Unidos", "Washington D.C", "Cánada"));
        this.listaPais.add(new Pais(3, "Rusia", "Moscú", "China"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSeleccionP = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlCapital = new javax.swing.JLabel();
        jlFrontera = new javax.swing.JLabel();
        jtNombrePais = new javax.swing.JTextField();
        jtCapitalPais = new javax.swing.JTextField();
        jtFrontera = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaPais = new javax.swing.JTable();
        jlFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSeleccionP.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlSeleccionP.setForeground(new java.awt.Color(255, 255, 255));
        jlSeleccionP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeleccionP.setText("Introduce tú País");
        add(jlSeleccionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 810, -1));

        jlNombre.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("Nombre del País:");
        add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 180, 25));

        jlCapital.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlCapital.setForeground(new java.awt.Color(255, 255, 255));
        jlCapital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCapital.setText("Capital:");
        add(jlCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 80, 25));

        jlFrontera.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlFrontera.setForeground(new java.awt.Color(255, 255, 255));
        jlFrontera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFrontera.setText("Frontera:");
        add(jlFrontera, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 100, 25));
        add(jtNombrePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 180, 25));
        add(jtCapitalPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 180, 25));
        add(jtFrontera, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 180, 25));

        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAgregar.png"))); // NOI18N
        jbRegistrar.setContentAreaFilled(false);
        jbRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegistrarMouseClicked(evt);
            }
        });
        add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 40, 40));

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEditar.png"))); // NOI18N
        jbEditar.setContentAreaFilled(false);
        jbEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEditarMouseClicked(evt);
            }
        });
        add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 40, 40));

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEliminar.png"))); // NOI18N
        jbEliminar.setContentAreaFilled(false);
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEliminarMouseClicked(evt);
            }
        });
        add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 40, 40));

        jtListaPais.setAutoCreateRowSorter(true);
        jtListaPais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Capital", "Frontera"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtListaPais.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        jtListaPais.setFillsViewportHeight(true);
        jtListaPais.setPreferredSize(new java.awt.Dimension(375, 80));
        jtListaPais.setShowGrid(true);
        jtListaPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaPaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaPais);
        if (jtListaPais.getColumnModel().getColumnCount() > 0) {
            jtListaPais.getColumnModel().getColumn(0).setResizable(false);
            jtListaPais.getColumnModel().getColumn(1).setResizable(false);
            jtListaPais.getColumnModel().getColumn(2).setResizable(false);
            jtListaPais.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 580, 150));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapamundi.jpg"))); // NOI18N
        add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que se ejecuta al hacer clic en el botón de registrar
     * (jbRegistrar). Crea un nuevo registro de país con los datos ingresados,
     * lo agrega a la lista y actualiza la tabla. Luego, limpia los campos de
     * entrada de texto.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarMouseClicked
        Pais pais = new Pais();

        pais.setNombre(this.jtNombrePais.getText());
        pais.setCapital(this.jtCapitalPais.getText());
        pais.setFrontera(this.jtFrontera.getText());

        if ("".equals(this.jtNombrePais.getText())) {
            if ("".equals(this.jtCapitalPais.getText())) {
                if ("".equals(this.jtFrontera.getText())) {
                    int resp = JOptionPane.showConfirmDialog(null,
                            "No pueden haber campos vacios.\n",
                            "Alerta!", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            this.paisController.crearRegistro(listaPais, pais);
            this.paisController.mostrarRegistro(listaPais, modeloTablaPais);
        }
        
        this.jtNombrePais.setText("");
        this.jtCapitalPais.setText("");
        this.jtFrontera.setText("");
    }//GEN-LAST:event_jbRegistrarMouseClicked

    /**
     * Evento que se ejecuta al hacer clic en el botón de eliminar (jbEliminar).
     * Elimina el registro del país seleccionado y actualiza la tabla.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseClicked
        int codigo = paisSeleccionado.getCodigo();
        this.paisController.eliminarRegistro(listaPais, codigo);
        this.paisController.mostrarRegistro(listaPais, modeloTablaPais);
    }//GEN-LAST:event_jbEliminarMouseClicked

    /**
     * Evento que se ejecuta al hacer clic en una fila de la tabla jtListaPais.
     * Muestra los datos del país seleccionado en los campos de texto
     * correspondientes.
     *
     * @param evt el evento de clic del mouse
     */
    private void jtListaPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaPaisMouseClicked
        int selectedRow = jtListaPais.getSelectedRow();
        if (selectedRow >= 0) {
            int codigo = (int) jtListaPais.getValueAt(selectedRow, 0);
            paisSeleccionado = obtenerPaisPorCodigo(codigo);
            this.jtNombrePais.setText(this.jtListaPais.getValueAt(jtListaPais.getSelectedRow(), 1).toString());
            this.jtCapitalPais.setText(this.jtListaPais.getValueAt(jtListaPais.getSelectedRow(), 2).toString());
            this.jtFrontera.setText(this.jtListaPais.getValueAt(jtListaPais.getSelectedRow(), 3).toString());
        }

    }//GEN-LAST:event_jtListaPaisMouseClicked

    /**
     * Evento que se ejecuta al hacer clic en el botón de editar. Actualiza un
     * registro de país con la información ingresada en los campos de texto.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEditarMouseClicked
        Pais pais = new Pais();
        pais.setCodigo(paisSeleccionado.getCodigo());
        pais.setNombre(this.jtNombrePais.getText());
        pais.setCapital(this.jtCapitalPais.getText());
        pais.setFrontera(this.jtFrontera.getText());
        
        
        this.paisController.actualizarRegistro(listaPais, pais);
        this.paisController.mostrarRegistro(listaPais, modeloTablaPais);
    }//GEN-LAST:event_jbEditarMouseClicked
    private Pais obtenerPaisPorCodigo(int codigo) {
        for (Pais pais : listaPais) {
            if (pais.getCodigo() == codigo) {
                return pais;
            }
        }
        return null;
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlCapital;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlFrontera;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlSeleccionP;
    private javax.swing.JTextField jtCapitalPais;
    private javax.swing.JTextField jtFrontera;
    private javax.swing.JTable jtListaPais;
    private javax.swing.JTextField jtNombrePais;
    // End of variables declaration//GEN-END:variables
}
