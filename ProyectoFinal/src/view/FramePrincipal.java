/** *************************************
 * Autor: Elio Justino Cruz Ortega     *
 * Creado: 22/06/2023                  *
 * Modificado: 22/06/2023              *
 * Descripciòn: Cree el Frame principal*
 *              que manda a llamar a   *
 *              los paneles de pais,   *
 *              Estado y direccion     *
 ************************************** */
package view;

import entity.Direccion;
import entity.Estado;
import entity.Pais;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que representa el marco principal de la aplicación.
 */
public class FramePrincipal extends javax.swing.JFrame {

    private PaisPanel paisPanel;
    private EstadoPanel estadoPanel;
    private DireccionPanel direccionPanel;

    private List<Pais> listaPais;
    private List<Estado> listaEstado;
    private List<Direccion> listaDireccion;

    /**
     * Crea un nuevo FramePrincipal.
     */
    public FramePrincipal() {
        initComponents();
        this.setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbDireccion = new javax.swing.JButton();
        jbPais = new javax.swing.JButton();
        jbEstado = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonDireccion.png"))); // NOI18N
        jbDireccion.setBorderPainted(false);
        jbDireccion.setContentAreaFilled(false);
        jbDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbDireccionMouseClicked(evt);
            }
        });
        getContentPane().add(jbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 100, 29));

        jbPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonPais.png"))); // NOI18N
        jbPais.setBorderPainted(false);
        jbPais.setContentAreaFilled(false);
        jbPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbPaisMouseClicked(evt);
            }
        });
        getContentPane().add(jbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 29));

        jbEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonEstado.png"))); // NOI18N
        jbEstado.setBorderPainted(false);
        jbEstado.setContentAreaFilled(false);
        jbEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEstadoMouseClicked(evt);
            }
        });
        getContentPane().add(jbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 29));

        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonCerrar.png"))); // NOI18N
        jbCerrar.setBorderPainted(false);
        jbCerrar.setContentAreaFilled(false);
        jbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 29));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paqueteria.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 710, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapamundi.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-600, 70, 720, 530));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paqueteria.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -50, 450, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic del mouse en el componente jbPais. Si el panel
     * de dirección está presente, lo oculta. Si el panel de estado está
     * presente, lo oculta. Si el panel de país no está creado, lo crea y lo
     * muestra. Si el panel de país ya está creado, lo muestra.
     *
     * @param evt El evento de clic del mouse
     */
    private void jbPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPaisMouseClicked
        if (direccionPanel != null) {
            direccionPanel.setVisible(false);
        }

        if (estadoPanel != null) {
            estadoPanel.setVisible(false);
        }

        if (paisPanel == null) {
            this.crearPanelPais();
        } else {
            this.paisPanel.setVisible(true);
        }
    }//GEN-LAST:event_jbPaisMouseClicked

    /**
     * Maneja el evento de clic del mouse en el componente jbEstado. Si el panel
     * de dirección está presente, lo oculta. Si el panel de país está presente,
     * lo oculta. Si el panel de estado no está creado, crea el panel de país si
     * no está creado, lo oculta y luego crea el panel de estado y lo muestra.
     * Si el panel de estado ya está creado, lo muestra. Limpia el combo de
     * estados y llena el combo de países en el panel de estado.
     *
     * @param evt El evento de clic del mouse
     */
    private void jbEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEstadoMouseClicked
        if (direccionPanel != null) {
            direccionPanel.setVisible(false);
        }

        if (paisPanel != null) {
            paisPanel.setVisible(false);
        }

        if (estadoPanel == null) {
            if (this.paisPanel == null) {
                crearPanelPais();
                this.paisPanel.setVisible(false);
            }
            this.crearPanelEstado();
        } else {
            this.estadoPanel.setVisible(true);
        }
        this.estadoPanel.limpiarCombo();
        this.estadoPanel.llenarComboPais(listaPais);

    }//GEN-LAST:event_jbEstadoMouseClicked

    /**
     * Maneja el evento de clic del mouse en el componente jbDireccion. Si el
     * panel de estado está presente, lo oculta. Si el panel de país está
     * presente, lo oculta. Si el panel de dirección no está creado, crea el
     * panel de país si no está creado, lo oculta, crea el panel de estado si no
     * está creado, lo oculta, y luego crea el panel de dirección y lo muestra.
     * Si el panel de dirección ya está creado, lo muestra. Limpia el combo de
     * direcciones, llena el combo de países y llena el combo de estados en el
     * panel de dirección.
     *
     * @param evt El evento de clic del mouse
     */
    private void jbDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbDireccionMouseClicked
        if (estadoPanel != null) {
            estadoPanel.setVisible(false);
        }

        if (paisPanel != null) {
            paisPanel.setVisible(false);
        }

        if (direccionPanel == null) {
            if (this.paisPanel == null) {
                crearPanelPais();
                this.paisPanel.setVisible(false);
                if (this.estadoPanel == null) {
                    crearPanelEstado();
                    this.estadoPanel.setVisible(false);
                }
            }
            this.crearPanelDireccion();
        } else {
            this.direccionPanel.setVisible(true);
        }
        this.direccionPanel.limpiarCombo();
        this.direccionPanel.llenarComboPais(listaPais);
        this.direccionPanel.llenarComboEstado(listaEstado);
    }//GEN-LAST:event_jbDireccionMouseClicked

    /**
     * Maneja el evento de clic del mouse en el componente jbCerrar Si se le da
     * a "si" en el optionPane se cierra el programa Si se le da a "no" en el
     * optionPane no pasa nada y el programa sigue
     *
     * @param evt El evento de clic del mouse
     */
    private void jbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerrarMouseClicked
        int opcion = JOptionPane.showOptionDialog(null,
                "¿Desea cerrar el programa?",
                "Confirmación", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Sí", "No"}, "No");

        if (opcion == JOptionPane.YES_OPTION) {
            // Código para cerrar el programa
            System.exit(0);
        }
    }//GEN-LAST:event_jbCerrarMouseClicked

    /**
     * Crea y agrega un panel de país al contenedor principal. Inicializa una
     * nueva lista de países. Configura las propiedades del panel de país, como
     * su posición y tamaño. Agrega el panel de país al contenedor principal.
     * Realiza una revalidación y repintado del contenedor principal para
     * reflejar los cambios.
     */
    public void crearPanelPais() {
        this.listaPais = new ArrayList<>();
        paisPanel = new PaisPanel(this.listaPais);
        paisPanel.setBounds(120, 70, 808, 523);
        this.add(paisPanel);
        this.revalidate();
        this.repaint();
    }

    /**
     * Crea y agrega un panel de estado al contenedor principal. Inicializa una
     * nueva lista de estados. Configura las propiedades del panel de estado,
     * como su posición y tamaño. Agrega el panel de estado al contenedor
     * principal. Realiza una revalidación y repintado del contenedor principal
     * para reflejar los cambios.
     */
    public void crearPanelEstado() {
        this.listaEstado = new ArrayList<>();
        estadoPanel = new EstadoPanel(this.listaEstado, this.listaPais);
        estadoPanel.setBounds(120, 70, 808, 523);
        this.add(estadoPanel);
        this.revalidate();
        this.repaint();
    }

    /**
     * Crea y agrega un panel de dirección al contenedor principal. Inicializa
     * una nueva lista de direcciones. Configura las propiedades del panel de
     * dirección, como su posición y tamaño. Agrega el panel de dirección al
     * contenedor principal. Realiza una revalidación y repintado del contenedor
     * principal para reflejar los cambios.
     */
    public void crearPanelDireccion() {
        this.listaDireccion = new ArrayList<>();
        direccionPanel = new DireccionPanel(this.listaDireccion,
                this.listaEstado, this.listaPais);
        direccionPanel.setBounds(120, 70, 808, 523);
        this.add(direccionPanel);
        this.revalidate();
        this.repaint();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FramePrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbDireccion;
    private javax.swing.JButton jbEstado;
    private javax.swing.JButton jbPais;
    // End of variables declaration//GEN-END:variables
}
