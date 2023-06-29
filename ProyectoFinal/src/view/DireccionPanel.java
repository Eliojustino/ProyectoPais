/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 22/06/2023                  *
 * Modificado: 22/06/2023              *
 * Descripciòn: Cree el Panel para     *
 *              dirección,aquí         *
 *              llame las funciones    *
 *              con los botones        *
 *              correspondientes       *
 ***************************************/
package view;

import controller.DireccionController;
import entity.Direccion;
import entity.Estado;
import entity.Pais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DireccionPanel extends javax.swing.JPanel {

    private final DefaultTableModel modeloTablaDireccion;
    private final DireccionController direccionController;
    private final List<Direccion> listaDireccion;
    private final List<Estado> listaEstado;
    private final List<Pais> listaPais;
    private Direccion direccionSeleccionado;
    private Estado estadoSeleccionado;
    private Pais paisSeleccionado;

    /**
     * Crea un nuevo panel de Dirección.
     *
     * @param listaDireccion la lista de direcciones
     * @param listaEstado la lista de estados
     * @param listaPais la lista de países
     */
    public DireccionPanel(List<Direccion> listaDireccion, List<Estado> listaEstado, List<Pais> listaPais) {
        initComponents();

        this.listaDireccion = listaDireccion;
        this.listaEstado = listaEstado;
        this.listaPais = listaPais;
        this.modeloTablaDireccion = (DefaultTableModel) jtListaDireccion.
                getModel();
        jtListaDireccion.setModel(modeloTablaDireccion);

        this.direccionController = new DireccionController();
        this.direccionController.mostrarRegistro(this.listaDireccion,
                modeloTablaDireccion);
    }

    /**
     * Llena el combo de países con los elementos de la lista de países.
     *
     * @param listaPais la lista de países
     */
    public void llenarComboPais(List<Pais> listaPais) {
        for (Pais pais : listaPais) {
            jcPais.addItem(pais.getNombre());
        }
    }

    /**
     * Llena el combo de estados con los elementos de la lista de estados.
     *
     * @param listaEstado la lista de estados
     */
    public void llenarComboEstado(List<Estado> listaEstado) {
        for (Estado estado : listaEstado) {
            jcEstado.addItem(estado.getNombre());
        }
    }

    /**
     * Limpia los combos de país y estado.
     */
    public void limpiarCombo() {
        jcPais.removeAllItems();
        jcEstado.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSeleccionD = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlCodPostal = new javax.swing.JLabel();
        jlColonia = new javax.swing.JLabel();
        Calle = new javax.swing.JLabel();
        jlNumCasa = new javax.swing.JLabel();
        jlPais1 = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jcPais = new javax.swing.JComboBox<>();
        jcEstado = new javax.swing.JComboBox<>();
        jtNombre = new javax.swing.JTextField();
        jtCodPostal = new javax.swing.JTextField();
        jtColonia = new javax.swing.JTextField();
        jtCalle = new javax.swing.JTextField();
        jtNumCasa = new javax.swing.JTextField();
        jbEditar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaDireccion = new javax.swing.JTable();
        jlFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSeleccionD.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlSeleccionD.setForeground(new java.awt.Color(255, 255, 255));
        jlSeleccionD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeleccionD.setText("Introduce tú Dirección");
        add(jlSeleccionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 810, -1));

        jlNombre.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("Nombre de la ciudad:");
        add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        jlCodPostal.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        jlCodPostal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCodPostal.setText("Código Postal:");
        add(jlCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 190, -1));

        jlColonia.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlColonia.setForeground(new java.awt.Color(255, 255, 255));
        jlColonia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlColonia.setText("Colonia:");
        add(jlColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 190, -1));

        Calle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Calle.setForeground(new java.awt.Color(255, 255, 255));
        Calle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Calle.setText("Calle:");
        add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, -1));

        jlNumCasa.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlNumCasa.setForeground(new java.awt.Color(255, 255, 255));
        jlNumCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNumCasa.setText("Numero de Casa");
        add(jlNumCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 190, -1));

        jlPais1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlPais1.setForeground(new java.awt.Color(255, 255, 255));
        jlPais1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPais1.setText("País:");
        add(jlPais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 190, -1));

        jlEstado.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEstado.setText("Estado:");
        add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 190, -1));

        add(jcPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 190, 25));

        add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 190, 25));
        add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 25));
        add(jtCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 190, 25));
        add(jtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 190, 25));
        add(jtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 190, 25));
        add(jtNumCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 190, 25));

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEditar.png"))); // NOI18N
        jbEditar.setContentAreaFilled(false);
        jbEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEditarMouseClicked(evt);
            }
        });
        add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 40, 40));

        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAgregar.png"))); // NOI18N
        jbRegistrar.setContentAreaFilled(false);
        jbRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegistrarMouseClicked(evt);
            }
        });
        add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 40, 40));

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEliminar.png"))); // NOI18N
        jbEliminar.setContentAreaFilled(false);
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEliminarMouseClicked(evt);
            }
        });
        add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 40, 40));

        jtListaDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Pais", "Estado", "Ciudad", "Código Postal", "Colonia", "Calle", "No. Casa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtListaDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaDireccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaDireccion);
        if (jtListaDireccion.getColumnModel().getColumnCount() > 0) {
            jtListaDireccion.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtListaDireccion.getColumnModel().getColumn(1).setResizable(false);
            jtListaDireccion.getColumnModel().getColumn(2).setResizable(false);
            jtListaDireccion.getColumnModel().getColumn(3).setResizable(false);
            jtListaDireccion.getColumnModel().getColumn(4).setResizable(false);
            jtListaDireccion.getColumnModel().getColumn(5).setResizable(false);
            jtListaDireccion.getColumnModel().getColumn(6).setResizable(false);
            jtListaDireccion.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 790, 160));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapamundi.jpg"))); // NOI18N
        add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic en el botón de registro.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarMouseClicked
        if ("".equals(this.jtNombre.getText())
                && "".equals(this.jtCodPostal.getText())) {
            if ("".equals(this.jtColonia.getText())
                    && "".equals(this.jtCalle.getText())) {
                if ("".equals(this.jtNumCasa.getText())) {
                    int resp = JOptionPane.showConfirmDialog(
                            null,
                            "No pueden haber campos vacios.\n",
                            "Alerta!", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            String nombreCiudad = this.jtNombre.getText();
            String codPostal = this.jtCodPostal.getText();
            String colonia = this.jtColonia.getText();
            String calle = this.jtCalle.getText();
            String numCasa = this.jtNumCasa.getText();
            String nombrePais = this.jcPais.getSelectedItem().toString();
            String nombreEstado = this.jcEstado.getSelectedItem().toString();

            Direccion direccion = new Direccion();
            direccion.setNombre(nombreCiudad);
            direccion.setCodPostal(codPostal);
            direccion.setColonia(colonia);
            direccion.setCalle(calle);
            direccion.setNumCasa(numCasa);

            Pais pais = new Pais();
            pais.setNombre(nombrePais);

            Estado estado = new Estado();
            estado.setNombre(nombreEstado);

            direccion.setEstado(estado);
            direccion.setPais(pais);
            this.direccionController.crearRegistro(listaDireccion,
                    direccion);
            this.direccionController.mostrarRegistro(listaDireccion,
                    modeloTablaDireccion);
            this.limpiarComponentes();
        }
    }//GEN-LAST:event_jbRegistrarMouseClicked

    /**
     * Maneja el evento de clic en el botón de eliminar.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseClicked
        int codigo = Integer.parseInt(this.jtListaDireccion.getValueAt(
                this.jtListaDireccion.getSelectedRow(), 0).toString());
        this.direccionController.eliminarRegistro(listaDireccion, codigo);
        this.direccionController.mostrarRegistro(listaDireccion,
                modeloTablaDireccion);
    }//GEN-LAST:event_jbEliminarMouseClicked

    /**
 * Maneja el evento de clic en la tabla de lista de direcciones.
 *
 * @param evt el evento de clic del mouse
 */
    private void jtListaDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaDireccionMouseClicked
        this.jtNombre.setText(jtListaDireccion.getValueAt(jtListaDireccion.
                getSelectedRow(), 3).toString());
        this.jtCodPostal.setText(jtListaDireccion.getValueAt(jtListaDireccion.
                getSelectedRow(), 4).toString());
        this.jtColonia.setText(jtListaDireccion.getValueAt(jtListaDireccion.
                getSelectedRow(), 5).toString());
        this.jtCalle.setText(jtListaDireccion.getValueAt(jtListaDireccion.
                getSelectedRow(), 6).toString());
        this.jtNumCasa.setText(jtListaDireccion.getValueAt(jtListaDireccion.
                getSelectedRow(), 7).toString());

        int code = (int) jtListaDireccion.getValueAt(jtListaDireccion.
                getSelectedRow(), 0);

        for (Direccion direccion : listaDireccion) {
            if (code == direccion.getCodigo()) {
                direccionSeleccionado = direccion;
                paisSeleccionado = direccion.getPais();
                estadoSeleccionado = direccion.getEstado();
                break;
            }
        }
    }//GEN-LAST:event_jtListaDireccionMouseClicked

    /**
     * Maneja el evento de clic en el botón de editar.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEditarMouseClicked
        Direccion direccion = new Direccion();
        direccion.setNombre(this.jtNombre.getText());
        direccion.setCodPostal(this.jtCodPostal.getText());
        direccion.setColonia(this.jtColonia.getText());
        direccion.setCalle(this.jtCalle.getText());
        direccion.setNumCasa(this.jtNumCasa.getText());
        direccion.setCodigo(direccionSeleccionado.getCodigo());
        direccion.setPais(paisSeleccionado);
        direccion.setEstado(estadoSeleccionado);

        int auxPais = this.jcPais.getSelectedIndex();
        int auxEstado = this.jcEstado.getSelectedIndex();

        for (Pais Pais : listaPais) {
            if (Pais.getNombre() == null ? listaPais.get(auxPais).getNombre()
                    == null : Pais.getNombre().equals(listaPais.
                            get(auxPais).getNombre())) {
                direccion.setPais(Pais);
            }
        }
        for (Estado Estado : listaEstado) {
            if (Estado.getNombre() == null ? listaEstado.get(auxEstado).getNombre()
                    == null : Estado.getNombre().equals(listaEstado.
                            get(auxEstado).getNombre())) {
                direccion.setEstado(Estado);
            }
        }
        this.direccionController.actualizarRegistro(listaDireccion,
                direccion);
        this.direccionController.mostrarRegistro(listaDireccion,
                modeloTablaDireccion);
    }//GEN-LAST:event_jbEditarMouseClicked
    /**
     * Limpia los componentes del panel de dirección.
     */
    public void limpiarComponentes() {
        this.jcEstado.setSelectedIndex(0);
        this.jcPais.setSelectedIndex(0);
        this.jtNombre.setText("");
        this.jtCodPostal.setText("");
        this.jtColonia.setText("");
        this.jtCalle.setText("");
        this.jtNumCasa.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Calle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcPais;
    private javax.swing.JLabel jlCodPostal;
    private javax.swing.JLabel jlColonia;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumCasa;
    private javax.swing.JLabel jlPais1;
    private javax.swing.JLabel jlSeleccionD;
    private javax.swing.JTextField jtCalle;
    private javax.swing.JTextField jtCodPostal;
    private javax.swing.JTextField jtColonia;
    private javax.swing.JTable jtListaDireccion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNumCasa;
    // End of variables declaration//GEN-END:variables
}
