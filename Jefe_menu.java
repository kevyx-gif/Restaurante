/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Kevin
 */
public class Jefe_menu extends javax.swing.JFrame {

    /**
     * Creates new form Jefe_menu
     */
    public Jefe_menu() {
        setSize(1280,720);
        this.setLocationRelativeTo(rootPane);
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

        t_1 = new javax.swing.JLabel();
        AgregarB = new javax.swing.JButton();
        bg_b1 = new javax.swing.JLabel();
        t_2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bg_b2 = new javax.swing.JLabel();
        t_3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        bg_b3 = new javax.swing.JLabel();
        regresarB = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_1.setFont(new java.awt.Font("Leelawadee", 3, 24)); // NOI18N
        t_1.setForeground(new java.awt.Color(0, 0, 0));
        t_1.setText("Agregar Datos");
        getContentPane().add(t_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        AgregarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/añadiendo.png"))); // NOI18N
        AgregarB.setBorderPainted(false);
        AgregarB.setContentAreaFilled(false);
        AgregarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 185, -1, -1));

        bg_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde cuadrado_2.png"))); // NOI18N
        getContentPane().add(bg_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 170, 340, 360));

        t_2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        t_2.setForeground(new java.awt.Color(0, 0, 0));
        t_2.setText("Eliminar Datos");
        getContentPane().add(t_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/eliminar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 185, -1, -1));

        bg_b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde cuadrado_2.png"))); // NOI18N
        getContentPane().add(bg_b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 170, 340, 360));

        t_3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        t_3.setForeground(new java.awt.Color(0, 0, 0));
        t_3.setText("Editar Datos");
        getContentPane().add(t_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/editar.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 185, -1, -1));

        bg_b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcos/borde cuadrado_2.png"))); // NOI18N
        getContentPane().add(bg_b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 170, 340, 360));

        regresarB.setText("Regresar");
        regresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBActionPerformed(evt);
            }
        });
        getContentPane().add(regresarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BG/bg_jf_menu.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBActionPerformed
        Login regreso = new Login();
        regreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarBActionPerformed

    private void AgregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBActionPerformed
        System.out.println("Si le das al boton");
    }//GEN-LAST:event_AgregarBActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jefe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jefe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jefe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jefe_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jefe_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarB;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg_b1;
    private javax.swing.JLabel bg_b2;
    private javax.swing.JLabel bg_b3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton regresarB;
    private javax.swing.JLabel t_1;
    private javax.swing.JLabel t_2;
    private javax.swing.JLabel t_3;
    // End of variables declaration//GEN-END:variables
}
