package Vistas;

import AccesoADatos.PacienteData;
import AccesoADatos.TelefonoData;
import Entidades.Paciente;
//import Entidades.Telefono;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class MainNutriApp extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    PacienteData pd = new PacienteData();
    TelefonoData td = new TelefonoData();
    private boolean ejecucion = true;
    Paciente mod = new Paciente();

    public MainNutriApp() {
//        jcbPacientes.setSelectedIndex(-1);
        initComponents();
        head();
        cargarCombox();
        jcbPacientes.setSelectedIndex(-1);
        jbGuardarMod.setVisible(false);
        jbMod.setEnabled(false);
        jbEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTab = new javax.swing.JTabbedPane();
        tabPacientes = new javax.swing.JTabbedPane();
        panelInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jcbPacientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbMod = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbReinicio = new javax.swing.JButton();
        panelCarga = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbGuardarMod = new javax.swing.JButton();
        tabDietas = new javax.swing.JTabbedPane();
        tabComidas = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        SliderLD = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1125, 803));
        setPreferredSize(new java.awt.Dimension(1125, 800));

        contenedorTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        tabPacientes.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPacientes);

        jcbPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbPacientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPacientesItemStateChanged(evt);
            }
        });

        jLabel2.setText("Paciente");

        jbMod.setText("Modificar");
        jbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbReinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/reinicio1_preview_rev_1.png"))); // NOI18N
        jbReinicio.setBorder(null);
        jbReinicio.setBorderPainted(false);
        jbReinicio.setContentAreaFilled(false);
        jbReinicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jbReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jbMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMod)
                    .addComponent(jbEliminar)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jbReinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPacientes.addTab("Info", panelInfo);
        panelInfo.getAccessibleContext().setAccessibleName("InfoPacientes");

        jLabel4.setText("Nombre y Apellido");

        jLabel5.setText("DNI");

        jLabel6.setText("Domicilio");

        jLabel7.setText("Teléfono");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbGuardarMod.setText("Guardar modificación");
        jbGuardarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jtNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(242, 242, 242))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardarMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(110, 110, 110)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbGuardarMod))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCargaLayout = new javax.swing.GroupLayout(panelCarga);
        panelCarga.setLayout(panelCargaLayout);
        panelCargaLayout.setHorizontalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCargaLayout.setVerticalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPacientes.addTab("Carga datos", panelCarga);
        panelCarga.getAccessibleContext().setAccessibleName("CargarPacientes");

        contenedorTab.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Vistas/personita3_preview_rev_1.png")), tabPacientes); // NOI18N
        tabPacientes.getAccessibleContext().setAccessibleName("Pacientes");

        contenedorTab.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Vistas/relojito_preview_rev_1.png")), tabDietas); // NOI18N
        contenedorTab.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Vistas/comida_preview_rev_1.png")), tabComidas); // NOI18N
        contenedorTab.addTab("tab1", jTabbedPane4);
        contenedorTab.addTab("tab1", jTabbedPane6);

        SliderLD.setMajorTickSpacing(2);
        SliderLD.setMaximum(2);
        SliderLD.setMinimum(1);
        SliderLD.setMinorTickSpacing(1);
        SliderLD.setSnapToTicks(true);
        SliderLD.setValue(1);
        SliderLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/img/icon_4968-removebg-preview.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Clinica de nutrición (1)_preview_rev_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderLD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SliderLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTab)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(contenedorTab, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contenedorTab.getAccessibleContext().setAccessibleName("Pestañas");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPacientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPacientesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (ejecucion) {
                ejecucion = false;
            } else {
                jbMod.setEnabled(true);
                jbEliminar.setEnabled(true);
                modelo.setRowCount(0);
                Paciente pac = (Paciente) jcbPacientes.getSelectedItem();
                for (Paciente p : pd.listarPaciente()) {
                    if (p.getIdPaciente() == pac.getIdPaciente()) {
                        modelo.addRow(new Object[]{
                            p.getIdPaciente(),
                            p.getNombre(),
                            p.getDni(),
                            p.getDomicilio(),
                            p.getTel()
                        });
                    }
                }
            }
        }
    }//GEN-LAST:event_jcbPacientesItemStateChanged

    private void jbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModActionPerformed
        tabPacientes.setSelectedIndex(1);
        mod = (Paciente) jcbPacientes.getSelectedItem();
        jtNombre.setText(mod.getNombre());
        jtDomicilio.setText(mod.getDomicilio());
        jtDni.setText(String.valueOf(mod.getDni()));
        jtTelefono.setText(String.valueOf(mod.getTel()));
        jbGuardarMod.setVisible(true);
        jbGuardar.setVisible(false);
        jbMod.setEnabled(false);
        jbEliminar.setEnabled(false);
        llenarTabla();
        jcbPacientes.setSelectedIndex(-1);

    }//GEN-LAST:event_jbModActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Paciente p = new Paciente();
        try {
            if (!jtDni.getText().isEmpty()) {
                p.setDni(Integer.parseInt(jtDni.getText()));
            }
            if (!jtNombre.getText().isEmpty()) {
                p.setNombre(jtNombre.getText());
            }
            if (!jtDomicilio.getText().isEmpty()) {
                p.setDomicilio(jtDomicilio.getText());
            }
            if (!jtTelefono.getText().isEmpty()) {
                p.setTel(Integer.parseInt(jtTelefono.getText()));
                p.setActivo(true);
                pd.guardarPaciente(p);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Uno o más campos se encuentran vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los campos 'DNI' y 'Teléfono' solo admiten números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbGuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarModActionPerformed

        try {
            if (!jtDni.getText().isEmpty()) {
                mod.setDni(Integer.parseInt(jtDni.getText()));
            }
            if (!jtNombre.getText().isEmpty()) {
                mod.setNombre(jtNombre.getText());
            }
            if (!jtDomicilio.getText().isEmpty()) {
                mod.setDomicilio(jtDomicilio.getText());
            }
            if (!jtTelefono.getText().isEmpty()) {
                mod.setTel(Integer.parseInt(jtTelefono.getText()));
                mod.setActivo(true);
                pd.modificarPaciente(mod);
                mod = null;
                limpiar();
                jbGuardarMod.setVisible(false);
                jbGuardar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Uno o más campos se encuentran vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los campos 'DNI' y 'Teléfono' solo admiten números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbGuardarModActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        mod = (Paciente) jcbPacientes.getSelectedItem();
        int eliminar = JOptionPane.showConfirmDialog(null, "Desea eliminar al paciente " + mod.getNombre(), "¿Está seguro?",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eliminar == JOptionPane.OK_OPTION) {
            pd.eliminarPaciente(mod.getIdPaciente());
            cargarCombox();
            llenarTabla();
            jcbPacientes.setSelectedIndex(-1);
            jbMod.setEnabled(false);
            jbEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReinicioActionPerformed
        cargarCombox();
        jcbPacientes.setSelectedIndex(-1);
        llenarTabla();
        jbMod.setEnabled(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbReinicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatSolarizedLightIJTheme.setup();
            UIManager.put("Button.arc", 999);
            UIManager.put("Component.arc", 999);
            UIManager.put("TextComponent.arc", 999);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainNutriApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider SliderLD;
    private javax.swing.JTabbedPane contenedorTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbGuardarMod;
    private javax.swing.JButton jbMod;
    private javax.swing.JButton jbReinicio;
    private javax.swing.JComboBox<Paciente> jcbPacientes;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JPanel panelCarga;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JTabbedPane tabComidas;
    private javax.swing.JTabbedPane tabDietas;
    private javax.swing.JTabbedPane tabPacientes;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables

    private void head() {
        modelo.addColumn("Id Paciente");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        tablaPacientes.setModel(modelo);
        llenarTabla();
    }

    private void llenarTabla() {
        modelo.setRowCount(0);
        for (Paciente p : pd.listarPaciente()) {
            modelo.addRow(new Object[]{
                p.getIdPaciente(),
                p.getNombre(),
                p.getDni(),
                p.getDomicilio(),
                p.getTel()
            });
        }
    }

    private void cargarCombox() {
        jcbPacientes.removeAllItems();
        for (Paciente p : pd.listarPaciente()) {
            jcbPacientes.addItem(p);
        }
    }

    private void limpiar() {
        jtDni.setText("");
        jtNombre.setText("");
        jtDomicilio.setText("");
        jtTelefono.setText("");
    }
}
