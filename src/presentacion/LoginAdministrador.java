/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Felix Chávez
 */
public class LoginAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdministrador
     */
    public LoginAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtAdmi = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        panelBtnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EUREKABANK");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lblNombre.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblNombre.setText("Código");
        lblNombre.setToolTipText("");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 72, 22));

        txtAdmi.setForeground(new java.awt.Color(204, 204, 204));
        txtAdmi.setText("Ingrese su nombre de usuario");
        txtAdmi.setBorder(null);
        txtAdmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAdmiMousePressed(evt);
            }
        });
        txtAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdmiKeyTyped(evt);
            }
        });
        jPanel4.add(txtAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        lblUser.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblUser.setText("Usuario");
        lblUser.setToolTipText("");
        jPanel4.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 22));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 10));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, -1));

        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("********");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });
        jPanel4.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 210, 30));

        panelBtnEntrar.setBackground(new java.awt.Color(68, 171, 181));

        lblEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnEntrarLayout = new javax.swing.GroupLayout(panelBtnEntrar);
        panelBtnEntrar.setLayout(panelBtnEntrarLayout);
        panelBtnEntrarLayout.setHorizontalGroup(
            panelBtnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelBtnEntrarLayout.setVerticalGroup(
            panelBtnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(panelBtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        panelBtnVolver.setBackground(new java.awt.Color(68, 171, 181));

        lblVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVolver.setForeground(new java.awt.Color(255, 255, 255));
        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setText("VOLVER");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtnVolverLayout = new javax.swing.GroupLayout(panelBtnVolver);
        panelBtnVolver.setLayout(panelBtnVolverLayout);
        panelBtnVolverLayout.setHorizontalGroup(
            panelBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelBtnVolverLayout.setVerticalGroup(
            panelBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(panelBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 80, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 300, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adminicon.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdmiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdmiMousePressed
        if(txtAdmi.getText().equals("Ingrese su nombre de usuario")) {
            txtAdmi.setText("");
            txtAdmi.setForeground(Color.black);
        }
        if(String.valueOf(txtContra.getPassword()).isEmpty()) {
            txtContra.setText("********");
            txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtAdmiMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if(String.valueOf(txtContra.getPassword()).equals("********")) {
            txtContra.setText("");
            txtContra.setForeground(Color.black);
        }
        if(txtAdmi.getText().isEmpty()) {
            txtAdmi.setText("Ingrese su nombre de usuario");
            txtAdmi.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        user = txtAdmi.getText();
        password = String.valueOf(txtContra.getPassword());
        if(user.compareToIgnoreCase("admin")==0 && password.compareToIgnoreCase("admin")==0) {
            MainFrm frm = new MainFrm();
            frm.setUser(0, "administrador", true);
            frm.setVisible(true);
            frm.pack();
            frm.setLocationRelativeTo(null);
            this.dispose();
        } else {
            showMessageDialog(null, "Administrador o contraseña erronea, intente nuevamente", "Login Administrador",0);
            txtAdmi.setText("Ingrese su nombre de usuario");
            txtAdmi.setForeground(Color.gray);
            txtContra.setText("********");
            txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        LoginMenu frm = new LoginMenu();
        frm.setVisible(true);
        frm.pack();
        frm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtAdmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdmiKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE)
            evt.consume();
    }//GEN-LAST:event_txtAdmiKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE)
            evt.consume();
    }//GEN-LAST:event_txtContraKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel panelBtnEntrar;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JTextField txtAdmi;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables
    private String user, password;
}
