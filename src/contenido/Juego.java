/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenido;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hquen
 */
public class Juego extends javax.swing.JFrame {
    //
    private ImageIcon imagen;
    private Icon icono;
    //variables dados
    int dado1,dado2,resultado;
//
     
 //constructor inicial
    public Juego() {
        initComponents();
        setLocationRelativeTo(null); //para que aparezca en el centro
        imagenes();
       
        this.labD1.setVisible(false);
        this.labD2.setVisible(false);
        this.labDado.setVisible(false);
        this.botonturno.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        j4 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        selecJ4 = new javax.swing.JComboBox<>();
        selecJ1 = new javax.swing.JComboBox<>();
        selecJ2 = new javax.swing.JComboBox<>();
        selecJ3 = new javax.swing.JComboBox<>();
        panelFondo = new fondoPanel();
        labDado = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        labD2 = new javax.swing.JLabel();
        labD1 = new javax.swing.JLabel();
        cantidados = new javax.swing.JLabel();
        botonturno = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        iniciarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(191, 248, 223));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j4.setText("jugador4");
        jPanel1.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 580, 60, 50));

        j1.setText("jugador1");
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 110, 60, 50));

        j2.setText("jugador2");
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 260, 60, 50));

        j3.setText("jugador3");
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 430, 60, 50));

        selecJ4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ4ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 600, -1, -1));

        selecJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ1ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 130, -1, -1));

        selecJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ2ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 280, -1, -1));

        selecJ3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ3ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 440, -1, -1));

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labDado.setText("dados");
        labDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labDadoMouseClicked(evt);
            }
        });
        panelFondo.add(labDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 220, 180));
        panelFondo.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 780, 60, 60));
        panelFondo.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 840, 60, 50));
        panelFondo.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 840, 60, 50));
        panelFondo.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 780, 70, 60));
        panelFondo.add(labD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 90, 90));
        panelFondo.add(labD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 90));

        cantidados.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cantidados.setForeground(new java.awt.Color(255, 0, 51));
        panelFondo.add(cantidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, -1, -1));

        jPanel1.add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 1510, 890));

        botonturno.setBackground(new java.awt.Color(255, 255, 51));
        botonturno.setText("Terminar turno");
        botonturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonturnoActionPerformed(evt);
            }
        });
        jPanel1.add(botonturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 890, 180, 70));

        jCheckBox1.setText("habilitar");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 560, -1, -1));

        jCheckBox2.setText("habilitar");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 90, -1, -1));

        jCheckBox3.setText("habilitar");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 230, -1, -1));

        jCheckBox4.setText("habilitar");
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 400, -1, -1));

        s1.setText("Personaje");
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 20, 90, 90));

        s2.setText("Personaje");
        jPanel1.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 180, 90, 90));

        s3.setText("Personaje");
        jPanel1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 330, 90, 90));

        s4.setText("Personaje");
        jPanel1.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 490, 90, 90));

        iniciarPartida.setBackground(new java.awt.Color(255, 0, 0));
        iniciarPartida.setText("iniciar");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 770, 180, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1890, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//evento click label de gif dados
    private void labDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDadoMouseClicked
          this.labD1.setVisible(true);
         this.labD2.setVisible(true);
        dados(); carasDados();
       this.labDado.setVisible(false);
    }//GEN-LAST:event_labDadoMouseClicked

    private void botonturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonturnoActionPerformed
        this.labDado.setVisible(true);
        this.labD1.setVisible(false);
         this.labD2.setVisible(false);
         this.cantidados.setText("");
    }//GEN-LAST:event_botonturnoActionPerformed

    private void selecJ1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecJ1ItemStateChanged
    
        seleccionarPersonaje();
        
    }//GEN-LAST:event_selecJ1ItemStateChanged

    private void selecJ2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecJ2ItemStateChanged
        seleccionarPersonaje();
    }//GEN-LAST:event_selecJ2ItemStateChanged

    private void selecJ3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecJ3ItemStateChanged
        seleccionarPersonaje();
    }//GEN-LAST:event_selecJ3ItemStateChanged

    private void selecJ4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selecJ4ItemStateChanged
      seleccionarPersonaje();
    }//GEN-LAST:event_selecJ4ItemStateChanged

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
    this.botonturno.setEnabled(true);
    this.labDado.setVisible(true);
    this.iniciarPartida.setVisible(false);
        
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    // esta funcion ajusta imagen y permite colocar en varios label
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
//
class fondoPanel extends JPanel {
    Image imagen;
   
    public void paint(Graphics i){
     imagen = new ImageIcon(getClass().getResource("/ImagenesP/tablero.jpg")).getImage();
    i.drawImage(imagen,0,0,getWidth(),getHeight(),this);  setOpaque(false);  //getWidth() y getHeigth() adopta el tamaño del panel
   super.paint(i); //pasa parametro i de la clase padre paint
    } 
    }    
    fondoPanel fondo =new fondoPanel(); //sirve para editar desde el panel de diseño 
        // 
    
 private void imagenes(){
  this.scImagen(this.labDado, "src/ImagenesP/dados.gif");
  
 }
    //
 //dados random del 1 al 6  
 public void dados(){
 dado1=(int)(Math.random()*6)+1;
 dado2=(int)(Math.random()*6)+1;
 String vD2 =String.valueOf(dado1); 
 resultado=dado1+dado2; String resultLab= String.valueOf(resultado);
 cantidados.setText(resultLab);
 }
///////// 
 public void carasDados(){
 int caraD1 = dado1;
 int caraD2 = dado2;
 switch(caraD1){
     case 1:this.scImagen(labD1, "src/dadosCaras/cara1.png");break;
     case 2:this.scImagen(labD1, "src/dadosCaras/cara2.png");break;
     case 3:this.scImagen(labD1, "src/dadosCaras/cara3.png");break;
     case 4:this.scImagen(labD1, "src/dadosCaras/cara4.png");break;
     case 5:this.scImagen(labD1, "src/dadosCaras/cara5.png");break;
     case 6:this.scImagen(labD1, "src/dadosCaras/cara6.png");break;
 }
 switch(caraD2){
     case 1:this.scImagen(this.labD2, "src/dadosCaras/cara1.png");break;
     case 2:this.scImagen(this.labD2, "src/dadosCaras/cara2.png");break;
     case 3:this.scImagen(this.labD2, "src/dadosCaras/cara3.png");break;
     case 4:this.scImagen(this.labD2, "src/dadosCaras/cara4.png");break;
     case 5:this.scImagen(this.labD2, "src/dadosCaras/cara5.png");break;
     case 6:this.scImagen(this.labD2, "src/dadosCaras/cara6.png");break;
 }
 }
  ////////////
 public void seleccionarPersonaje(){
String personaje1=selecJ1.getSelectedItem().toString();String personaje2=selecJ2.getSelectedItem().toString();
String personaje3=selecJ3.getSelectedItem().toString();String personaje4=selecJ4.getSelectedItem().toString();
 switch(personaje1){
     case "Botella": this.scImagen(this.lab1, "src/ImagenesP/botella2.png");this.scImagen(this.s1, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab1, "src/ImagenesP/tecun.png");this.scImagen(this.s1, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab1, "src/ImagenesP/among.png");this.scImagen(this.s1, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab1, "src/ImagenesP/chucho.png"); this.scImagen(this.s1, "src/ImagenesP/chucho.png");break;
 }
 switch(personaje2){
     case "Botella": this.scImagen(this.lab2, "src/ImagenesP/botella2.png");this.scImagen(this.s2, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab2, "src/ImagenesP/tecun.png");this.scImagen(this.s2, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab2, "src/ImagenesP/among.png");this.scImagen(this.s2, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab2, "src/ImagenesP/chucho.png"); this.scImagen(this.s2, "src/ImagenesP/chucho.png");break;
 }
 switch(personaje3){
     case "Botella": this.scImagen(this.lab3, "src/ImagenesP/botella2.png");this.scImagen(this.s3, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab3, "src/ImagenesP/tecun.png");this.scImagen(this.s3, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab3, "src/ImagenesP/among.png");this.scImagen(this.s3, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab3, "src/ImagenesP/chucho.png"); this.scImagen(this.s3, "src/ImagenesP/chucho.png");break;
 }
 switch(personaje4){
     case "Botella": this.scImagen(this.lab4, "src/ImagenesP/botella2.png");this.scImagen(this.s4, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab4, "src/ImagenesP/tecun.png");this.scImagen(this.s4, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab4, "src/ImagenesP/among.png");this.scImagen(this.s4, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab4, "src/ImagenesP/chucho.png"); this.scImagen(this.s4, "src/ImagenesP/chucho.png");break;
 }
 
 }
 
////
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
    private javax.swing.JButton botonturno;
    private javax.swing.JLabel cantidados;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel labD1;
    private javax.swing.JLabel labD2;
    private javax.swing.JLabel labDado;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JComboBox<String> selecJ1;
    private javax.swing.JComboBox<String> selecJ2;
    private javax.swing.JComboBox<String> selecJ3;
    private javax.swing.JComboBox<String> selecJ4;
    // End of variables declaration//GEN-END:variables
}
