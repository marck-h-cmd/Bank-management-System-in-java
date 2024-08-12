/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import logica.*;
/**
 *
 * @author Felix Chávez
 */
public class LoginEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form LoginEmpleado
     */
    public LoginEmpleado() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passClave = new javax.swing.JPasswordField();
        panelBtnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        panelBtnVolver = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Empleado");
        setMaximumSize(new java.awt.Dimension(520, 315));
        setMinimumSize(new java.awt.Dimension(520, 315));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleadoicon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EUREKABANK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lblClave.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblClave.setText("Clave");
        lblClave.setToolTipText("");
        jPanel3.add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 72, 22));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        lblUsuario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        lblUsuario.setToolTipText("");
        jPanel3.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 22));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 10));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, -1));

        passClave.setForeground(new java.awt.Color(204, 204, 204));
        passClave.setText("********");
        passClave.setBorder(null);
        passClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passClaveMousePressed(evt);
            }
        });
        passClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passClaveKeyTyped(evt);
            }
        });
        jPanel3.add(passClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 210, 30));

        panelBtnEntrar.setBackground(new java.awt.Color(68, 171, 181));

        lblEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel3.add(panelBtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        panelBtnVolver.setBackground(new java.awt.Color(68, 171, 181));

        lblVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVolver.setForeground(new java.awt.Color(255, 255, 255));
        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setText("VOLVER");
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel3.add(panelBtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 80, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 300, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if(String.valueOf(passClave.getPassword()).isEmpty()) {
            passClave.setText("********");
            passClave.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void passClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passClaveMousePressed
        if(String.valueOf(passClave.getPassword()).equals("********")) {
            passClave.setText("");
            passClave.setForeground(Color.black);
        }
        if(txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passClaveMousePressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        usuario = txtUsuario.getText();
        clave = String.valueOf(passClave.getPassword());
        respuesta = BLEmpleado.buscarEmpleadoLogin(usuario, clave);
        if(respuesta!=null) {
            MainFrm frm = new MainFrm();
            frm.setCodigoEmpleado(BLEmpleado.buscarEmpleadoPorUser(usuario));
            frm.setUser(1, respuesta, false);
            frm.setVisible(true);
            frm.pack();
            frm.setLocationRelativeTo(null);
            this.dispose();
        } else {
            showMessageDialog(null, "Codigo o clave erronea, intente nuevamente", "Login Empleado",0);
            txtUsuario.setText("Ingrese su clave");
            txtUsuario.setForeground(Color.gray);
            passClave.setText("********");
            passClave.setForeground(Color.gray);
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        LoginMenu frm = new LoginMenu();
        frm.setVisible(true);
        frm.pack();
        frm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE)
            evt.consume();
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void passClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passClaveKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE)
            evt.consume();
    }//GEN-LAST:event_passClaveKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel panelBtnEntrar;
    private javax.swing.JPanel panelBtnVolver;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    private String usuario, clave, respuesta;
}
