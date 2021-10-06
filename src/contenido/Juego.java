/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenido;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hquen
 */
public class Juego extends javax.swing.JFrame {
    //
    private ImageIcon imagen;
    private Icon icono;
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
        // 
 private void imagenes(){
  this.scImagen(this.l1, "src/ImagenesP/dados.gif");
  this.scImagen(this.l2, "src/ImagenesP/botellaBPpsd.png");
  this.scImagen(this.l4, "src/ImagenesP/among.png");
 }
    //
     
 //constructor inicial
    public Juego() {
        initComponents();
        setLocationRelativeTo(null); //para que aparezca en el centro
        imagenes();
    }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        l6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        l7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(191, 248, 223));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(195, 227, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setText("l1");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 140, 60, 50));

        l2.setText("botella");
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 50, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 150, -1, -1));

        l4.setText("l1");
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 700, 50, 50));

        l5.setText("l1");
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 730, 60, 50));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 300, -1, -1));

        l6.setText("l1");
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 290, 60, 50));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 440, -1, -1));

        l7.setText("l1");
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 430, 60, 50));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 560, -1, -1));

        l8.setText("l1");
        jPanel1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 550, 60, 50));

        l9.setText("l1");
        jPanel1.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 730, 60, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 160, 30));

        jButton2.setText("jButton1");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 840, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -60, 1900, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
