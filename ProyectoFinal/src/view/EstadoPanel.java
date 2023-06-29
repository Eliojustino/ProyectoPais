/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 03/06/2023                  *
 * Modificado: 06/06/2023              *
 * Descripciòn: Cree el Panel para     *
 *              Estado,aquí            *
 *              llame las funciones    *
 *              con los botones        *
 *              correspondientes       *
 ***************************************/
package view;

import controller.EstadoController;
import entity.Estado;
import entity.Pais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EstadoPanel extends javax.swing.JPanel {
    
    private final DefaultTableModel modeloTablaEstado;
    private final EstadoController estadoController;
    private final List<Estado> listaEstado;
    private final  List<Pais> listaPais;
    private Estado estadoSeleccionado;
    private Pais paisSeleccionado;
    
    public EstadoPanel(List<Estado> listaEstado, List<Pais> listaPais) {
        initComponents();

        this.listaEstado = listaEstado;
        this.listaPais = listaPais;
        this.modeloTablaEstado = (DefaultTableModel) jtListaEstado.getModel();
        jtListaEstado.setModel(modeloTablaEstado);
        
        this.estadoController = new EstadoController();
        this.estadoController.mostrarRegistro(this.listaEstado, 
                modeloTablaEstado);
    }
    
    /**
     * Llena el combo de países con los elementos de la lista de países.
     *
     * @param listaPais la lista de países
     */
    public void llenarComboPais(List<Pais> listaPais){
        for (Pais pais : listaPais){
            jcPais.addItem(pais.getNombre());
        }
    }
    
    /**
     * Limpia los combos de país.
     */
    public void limpiarCombo(){
        jcPais.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombre = new javax.swing.JLabel();
        jlPais = new javax.swing.JLabel();
        jlCapital = new javax.swing.JLabel();
        jlSeleccionE = new javax.swing.JLabel();
        jtNombreEstado = new javax.swing.JTextField();
        jtCapital = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jcPais = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaEstado = new javax.swing.JTable();
        jlFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlNombre.setBackground(new java.awt.Color(255, 255, 255));
        jlNombre.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("Nombre del estado:");
        add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 190, 25));

        jlPais.setBackground(new java.awt.Color(255, 255, 255));
        jlPais.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlPais.setForeground(new java.awt.Color(255, 255, 255));
        jlPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPais.setText("País:");
        add(jlPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 25));

        jlCapital.setBackground(new java.awt.Color(255, 255, 255));
        jlCapital.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jlCapital.setForeground(new java.awt.Color(255, 255, 255));
        jlCapital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCapital.setText("Capital:");
        add(jlCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 100, 25));

        jlSeleccionE.setBackground(new java.awt.Color(255, 255, 255));
        jlSeleccionE.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlSeleccionE.setForeground(new java.awt.Color(255, 255, 255));
        jlSeleccionE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeleccionE.setText("Introduce tú Estado");
        add(jlSeleccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, -1));
        add(jtNombreEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 180, 25));
        add(jtCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 180, 25));

        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAgregar.png"))); // NOI18N
        jbRegistrar.setContentAreaFilled(false);
        jbRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegistrarMouseClicked(evt);
            }
        });
        add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 40, 40));

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEliminar.png"))); // NOI18N
        jbEliminar.setContentAreaFilled(false);
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEliminarMouseClicked(evt);
            }
        });
        add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 40));

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEditar.png"))); // NOI18N
        jbEditar.setContentAreaFilled(false);
        jbEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEditarMouseClicked(evt);
            }
        });
        add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 40, 40));

        add(jcPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 180, 25));

        jtListaEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Num. Estado", "Estado", "Capital", "País"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtListaEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaEstadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaEstado);
        if (jtListaEstado.getColumnModel().getColumnCount() > 0) {
            jtListaEstado.getColumnModel().getColumn(0).setResizable(false);
            jtListaEstado.getColumnModel().getColumn(1).setResizable(false);
            jtListaEstado.getColumnModel().getColumn(2).setResizable(false);
            jtListaEstado.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 570, 220));

        jlFondo.setBackground(new java.awt.Color(255, 255, 255));
        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapamundi.jpg"))); // NOI18N
        add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));
    }// </editor-fold>//GEN-END:initComponents
/**
     * Maneja el evento de clic en el botón de registro.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarMouseClicked
        if ("".equals(this.jtNombreEstado.getText()) && "".equals(this.jtCapital.getText())) {
            int resp = JOptionPane.showConfirmDialog(null,
                    "No pueden haber campos vacios.\n",
                    "Alerta!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE);

        } else {
            Estado estado = new Estado();
            Pais pais = new Pais();
            String nombreEstado = this.jtNombreEstado.getText();
            String capital = this.jtCapital.getText();
            String nombrePais = this.jcPais.getSelectedItem().toString();
            pais.setNombre(nombrePais);
            estado.setNombre(nombreEstado);
            estado.setCapital(capital);
            estado.setPais(pais);

            this.estadoController.crearRegistro(listaEstado, estado);
            this.estadoController.mostrarRegistro(listaEstado,
                    modeloTablaEstado);
            this.limpiarComponentes();
        }

    }//GEN-LAST:event_jbRegistrarMouseClicked
  
    /**
     * Maneja el evento de clic en el botón de eliminar.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseClicked
        int codigo = Integer.parseInt(this.jtListaEstado.getValueAt(
                this.jtListaEstado.getSelectedRow(), 0).toString());
        this.estadoController.eliminarRegistro(listaEstado, codigo);
        this.estadoController.mostrarRegistro(listaEstado, 
                modeloTablaEstado);
    }//GEN-LAST:event_jbEliminarMouseClicked

    /**
 * Maneja el evento de clic en la tabla de lista de direcciones.
 *
 * @param evt el evento de clic del mouse
 */
    private void jtListaEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaEstadoMouseClicked
        this.jtNombreEstado.setText(jtListaEstado.getValueAt(jtListaEstado.
                getSelectedRow(),1).toString());
        this.jtCapital.setText(jtListaEstado.getValueAt(jtListaEstado.
                getSelectedRow(), 2).toString());
        this.jcPais.setSelectedItem(jtListaEstado.getValueAt(
                jtListaEstado.
                getSelectedRow(), 3).toString());
                
        //Recupera el código del país de la tabla
        int code = (int) jtListaEstado.getValueAt(jtListaEstado.
                getSelectedRow(),
                0);
        
        //Busca y guarda el pais con el código recuperado de la tabla
        for (Estado estado : listaEstado) {
            if (code == estado.getCodigo()){
                estadoSeleccionado = estado;
                paisSeleccionado = estado.getPais();
                break;
            }
        }
    }//GEN-LAST:event_jtListaEstadoMouseClicked

    /**
     * Maneja el evento de clic en el botón de editar.
     *
     * @param evt el evento de clic del mouse
     */
    private void jbEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEditarMouseClicked
        Estado estado = new Estado();
        estado.setNombre(this.jtNombreEstado.getText());
        estado.setCapital(this.jtCapital.getText());
        estado.setCodigo(estadoSeleccionado.getCodigo());
        estado.setPais(paisSeleccionado);
        
        int auxPais= this.jcPais.getSelectedIndex();

        for (Pais Pais : listaPais) {
            //System.out.println(auxPais + Pais.getNombre());
            if (Pais.getNombre() == null ? listaPais.get(auxPais).getNombre()
                    == null : Pais.getNombre().equals(listaPais.
                            get(auxPais).getNombre())){
                estado.setPais(Pais);
                this.limpiarComponentes();
            }
        }
                
        this.estadoController.actualizarRegistro(listaEstado, estado);
        this.estadoController.mostrarRegistro(listaEstado, 
                modeloTablaEstado);
    }//GEN-LAST:event_jbEditarMouseClicked
/**
     * Limpia los componentes del panel de dirección.
     */
    public void limpiarComponentes() {
        this.jcPais.setSelectedIndex(0);
        this.jtNombreEstado.setText("");
        this.jtCapital.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jcPais;
    private javax.swing.JLabel jlCapital;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPais;
    private javax.swing.JLabel jlSeleccionE;
    private javax.swing.JTextField jtCapital;
    private javax.swing.JTable jtListaEstado;
    private javax.swing.JTextField jtNombreEstado;
    // End of variables declaration//GEN-END:variables
}
