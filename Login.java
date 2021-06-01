/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import rsscalelabel.RSScaleLabel;
/**
 *
 * @author Kevin
 */
public class Login extends javax.swing.JFrame {
    
    public Login() {
        setSize(1280,720);
        this.setLocationRelativeTo(rootPane);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bchef = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bjefe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bcajero = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Busuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bchef.setBackground(new java.awt.Color(40, 55, 168));
        Bchef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/chef-masculino.png"))); // NOI18N
        Bchef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(40, 55, 168), new java.awt.Color(40, 55, 168), new java.awt.Color(40, 55, 168), new java.awt.Color(40, 55, 168)));
        Bchef.setBorderPainted(false);
        Bchef.setContentAreaFilled(false);
        Bchef.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bchef.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Bchef.setDefaultCapable(false);
        Bchef.setEnabled(false);
        Bchef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BchefActionPerformed(evt);
            }
        });
        getContentPane().add(Bchef, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 170, 250, 350));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 215, 0));
        jLabel1.setText("Chef");
        jLabel1.setPreferredSize(new java.awt.Dimension(53, 25));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde def.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 400));

        Bjefe.setBackground(new java.awt.Color(40, 55, 168));
        Bjefe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/jefe.png"))); // NOI18N
        Bjefe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bjefe.setBorderPainted(false);
        Bjefe.setContentAreaFilled(false);
        Bjefe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bjefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BjefeActionPerformed(evt);
            }
        });
        getContentPane().add(Bjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 170, 250, 350));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 215, 0));
        jLabel2.setText("Jefe");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde def.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 300, 400));

        Bcajero.setBackground(new java.awt.Color(40, 55, 168));
        Bcajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/cajero.png"))); // NOI18N
        Bcajero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bcajero.setBorderPainted(false);
        Bcajero.setContentAreaFilled(false);
        Bcajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bcajero.setEnabled(false);
        Bcajero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Bcajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 250, 350));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 215, 0));
        jLabel3.setText("Cajero");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 25));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde def.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 300, 400));

        Busuario.setBackground(new java.awt.Color(40, 55, 168));
        Busuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/usuario.png"))); // NOI18N
        Busuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Busuario.setBorderPainted(false);
        Busuario.setContentAreaFilled(false);
        Busuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Busuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 250, 350));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 215, 0));
        jLabel4.setText("Comensal");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 25));
        jLabel4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde def.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 300, 400));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Apagar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 60, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BG/bg.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BchefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BchefActionPerformed

    }//GEN-LAST:event_BchefActionPerformed

    private void BjefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BjefeActionPerformed
        Login_Ventana entrar = new Login_Ventana("jefe");
        entrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BjefeActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcajero;
    private javax.swing.JButton Bchef;
    private javax.swing.JButton Bjefe;
    private javax.swing.JButton Busuario;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
