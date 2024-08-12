/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import entidades.*;
import logica.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
/**
 *
 * @author Manuel Arteaga
 */
public class IFrmListaSucursal extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmListaSucursal
     */
    public IFrmListaSucursal() {
        initComponents();
        inicializarDatos(); 
    }
    private void inicializarDatos() {
    lista = BLSucursal.listarSucursales();
    llenarTabla();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lblOrdenar = new javax.swing.JLabel();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSucursales = new javax.swing.JTable();

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.gif"))); // NOI18N
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblOrdenar.setText("Ordenar por: ");

        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        rbtnNombre.setText("Nombre");
        rbtnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNombreActionPerformed(evt);
            }
        });

        tblSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Ciudad", "Direccion", "Contcuenta", "tipo"
            }
        ));
        jScrollPane1.setViewportView(tblSucursales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnCodigo)
                        .addGap(32, 32, 32)
                        .addComponent(rbtnNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnCodigo)
                    .addComponent(rbtnNombre))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                         
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        if(rbtnCodigo.isSelected()) {
            Collections.sort(lista);
            llenarTabla();
        }
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNombreActionPerformed
        if(rbtnNombre.isSelected()) {
            Collections.sort(lista, new SucursalCompararNombre());
            llenarTabla();
        }
    }//GEN-LAST:event_rbtnNombreActionPerformed
    
    private void llenarTabla() {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        iterador = lista.iterator();
        while(iterador.hasNext()) {
            sucursal = iterador.next();
            fila[0] = sucursal.getCodigo();
            fila[1] = sucursal.getNombre();
            fila[2] = sucursal.getCiudad();
            fila[3] = sucursal.getDireccion();
            fila[4] = sucursal.getContCuenta();
             if (sucursal instanceof SucursalDepartamental) {
            fila[5] = "Departamental";
        } else if (sucursal instanceof SucursalProvincial) {
            fila[5] = "Provincial";
        } else {
            fila[5] = "Central";
        }
            modelo.addRow(fila);            
        }
        tblSucursales.setModel(modelo);
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrdenar;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JTable tblSucursales;
    // End of variables declaration//GEN-END:variables
private DefaultTableModel modelo;
private ArrayList<Sucursal> lista;
private String columnas[] = {"Código", "Nombre", "Ciudad", "Dirección", "Cuentas"};
private Object fila[] = new Object[columnas.length];
private Iterator<Sucursal> iterador;
private Sucursal sucursal;
}
