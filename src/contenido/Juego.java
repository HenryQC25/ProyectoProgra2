
package contenido;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Juego extends javax.swing.JFrame {
   ////////////////Para el movimiento
    Timer time = new Timer();
   ////////////////////////////
    //variables temporales para llevar a clases jugadores
   
    int cont1=0;int cont2=0; int saldo=1500;int cant; 
    /////////////
//constructor class jugador
   jugador jugador1 = new jugador();
   ///////////////////////////
    /////////variable de imagen para ajustar y colocar en label 
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
        seleccionarPersonaje();
        this.labD1.setVisible(false);
        this.labD2.setVisible(false);
        this.labDado.setVisible(false);
        this.botonturno.setEnabled(false);
        this.jButton1.setEnabled(false);
        this.HB1.setEnabled(true);this.HB2.setEnabled(false);HB3.setEnabled(false);HB4.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondoPanel1();
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
        casillaCarcel1 = new javax.swing.JLabel();
        tarjetasLab = new javax.swing.JLabel();
        botonturno = new javax.swing.JButton();
        HB4 = new javax.swing.JCheckBox();
        HB1 = new javax.swing.JCheckBox();
        HB2 = new javax.swing.JCheckBox();
        HB3 = new javax.swing.JCheckBox();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        iniciarPartida = new javax.swing.JButton();
        jugadorTlb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        saldo1 = new javax.swing.JLabel();
        saldo2 = new javax.swing.JLabel();
        saldo3 = new javax.swing.JLabel();
        saldo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(191, 248, 223));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j4.setText("jugador4");
        jPanel1.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 630, 60, 50));

        j1.setText("jugador1");
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 60, 80, 30));

        j2.setText("jugador2");
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 250, 80, 30));

        j3.setText("jugador3");
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 450, 60, 50));

        selecJ4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ4.setEnabled(false);
        selecJ4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ4ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, -1));

        selecJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ1.setEnabled(false);
        selecJ1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ1ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 110, -1, -1));

        selecJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ2.setEnabled(false);
        selecJ2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ2ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 310, -1, -1));

        selecJ3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Botella", "Tecun", "among", "chucho" }));
        selecJ3.setEnabled(false);
        selecJ3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selecJ3ItemStateChanged(evt);
            }
        });
        jPanel1.add(selecJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 510, -1, -1));

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labDado.setText("dados");
        labDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labDadoMouseClicked(evt);
            }
        });
        panelFondo.add(labDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 220, 180));
        panelFondo.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 890, 60, 50));
        panelFondo.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 940, 60, 50));
        panelFondo.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 940, 60, 50));
        panelFondo.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 890, 60, 50));
        panelFondo.add(labD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 90, 90));
        panelFondo.add(labD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 90));

        cantidados.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cantidados.setForeground(new java.awt.Color(255, 0, 51));
        panelFondo.add(cantidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 30, 20));

        casillaCarcel1.setBackground(new java.awt.Color(240, 22, 6));
        casillaCarcel1.setText("carcel");
        casillaCarcel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        casillaCarcel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casillaCarcel1.setOpaque(true);
        casillaCarcel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelFondo.add(casillaCarcel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 910, 50, 40));

        tarjetasLab.setBackground(new java.awt.Color(255, 204, 51));
        tarjetasLab.setText("tarjetas y funciones");
        tarjetasLab.setOpaque(true);
        panelFondo.add(tarjetasLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 170, 220));

        jPanel1.add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1530, 1000));

        botonturno.setBackground(new java.awt.Color(255, 255, 51));
        botonturno.setText("Terminar turno");
        botonturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonturnoActionPerformed(evt);
            }
        });
        jPanel1.add(botonturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 860, 200, 50));

        HB4.setText("habilitar");
        HB4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HB4StateChanged(evt);
            }
        });
        jPanel1.add(HB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 610, -1, -1));

        HB1.setText("habilitar");
        HB1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HB1StateChanged(evt);
            }
        });
        jPanel1.add(HB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 30, -1, -1));

        HB2.setText("habilitar");
        HB2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HB2StateChanged(evt);
            }
        });
        jPanel1.add(HB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 220, -1, -1));

        HB3.setText("habilitar");
        HB3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HB3StateChanged(evt);
            }
        });
        jPanel1.add(HB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 420, -1, -1));

        s1.setText("Personaje");
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 10, 90, 90));

        s2.setText("Personaje");
        jPanel1.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 180, 90, 90));

        s3.setText("Personaje");
        jPanel1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 370, 90, 90));

        s4.setText("Personaje");
        jPanel1.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 560, 90, 90));

        iniciarPartida.setBackground(new java.awt.Color(255, 0, 0));
        iniciarPartida.setText("iniciar");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 780, 200, 40));

        jugadorTlb.setText("jugador turno");
        jPanel1.add(jugadorTlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 930, 130, 50));

        jButton1.setText("Mover Pieza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 940, -1, -1));

        saldo1.setText("Q.1500");
        jPanel1.add(saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 100, 100, 30));

        saldo2.setText("Q.");
        jPanel1.add(saldo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 290, 100, 30));

        saldo3.setText("Q.");
        jPanel1.add(saldo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 510, 100, 30));

        saldo4.setText("Q.");
        jPanel1.add(saldo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 690, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1890, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
////////////////////////////////////////////////////////////////
    //Para el fondo de los Jpanel
    class fondoPanel extends JPanel {
    Image imagen;
    public void paint(Graphics i){
     imagen = new ImageIcon(getClass().getResource("/ImagenesP/fondoTablero.png")).getImage();
    i.drawImage(imagen,0,0,getWidth(),getHeight(),this);  setOpaque(false);  //getWidth() y getHeigth() adopta el tamaño del panel
   super.paint(i); //pasa parametro i de la clase padre paint
    } 
    
    }    
    fondoPanel fondo =new fondoPanel(); //sirve para editar desde el panel de diseño 
    ////////////////
     class fondoPanel1 extends JPanel {
    Image imagen;
    public void paint(Graphics i){
     imagen = new ImageIcon(getClass().getResource("/ImagenesP/fondoG.jpg")).getImage();
    i.drawImage(imagen,0,0,getWidth(),getHeight(),this);  setOpaque(false);  //getWidth() y getHeigth() adopta el tamaño del panel
   super.paint(i); //pasa parametro i de la clase padre paint
    } 
    }    
    fondoPanel1 fondo1 =new fondoPanel1(); //sirve para editar desde el panel de diseño 
        // hasta qui fondo de los jpanel
    /////////////////////////////////////
    //funion muestra el gif y está para otras imagenes que deben resultar al inicio 
    private void imagenes(){
  this.scImagen(this.labDado, "src/ImagenesP/dados.gif");

 }
 ////////////////////////////////////////////////////////
 //dados random del 1 al 6  
 public void dados(){
 dado1=(int)(Math.random()*6)+1;
 dado2=(int)(Math.random()*6)+1;
 resultado=dado1+dado2; String resultLab= String.valueOf(resultado);
 cantidados.setText(resultLab);
 }
///////// /////////////////////////////////////////////////
 //funcion para mostrar imagen de dados dependiendo el numero que salga del 1 al 6
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
  ///////////////////////////////
 //opciones para seleccionar personaje
 public void seleccionarPersonaje(){
String personaje1=selecJ1.getSelectedItem().toString();String personaje2=selecJ2.getSelectedItem().toString();
String personaje3=selecJ3.getSelectedItem().toString();String personaje4=selecJ4.getSelectedItem().toString();
 switch(personaje1){
     case "Seleccionar": this.scImagen(this.lab1, "");this.scImagen(this.s1, "");break;
     case "Botella": this.scImagen(this.lab1, "src/ImagenesP/botella2.png");this.scImagen(this.s1, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab1, "src/ImagenesP/tecun.png");this.scImagen(this.s1, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab1, "src/ImagenesP/among.png");this.scImagen(this.s1, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab1, "src/ImagenesP/chucho.png"); this.scImagen(this.s1, "src/ImagenesP/chucho.png");break;
 }
 switch(personaje2){
     case "Seleccionar": this.scImagen(this.lab2, "");this.scImagen(this.s2, "");break;
     case "Botella": this.scImagen(this.lab2, "src/ImagenesP/botella2.png");this.scImagen(this.s2, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab2, "src/ImagenesP/tecun.png");this.scImagen(this.s2, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab2, "src/ImagenesP/among.png");this.scImagen(this.s2, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab2, "src/ImagenesP/chucho.png"); this.scImagen(this.s2, "src/ImagenesP/chucho.png");break;
 }
 switch(personaje3){
     case "Seleccionar": this.scImagen(this.lab3, "");this.scImagen(this.s3, "");break;
     case "Botella": this.scImagen(this.lab3, "src/ImagenesP/botella2.png");this.scImagen(this.s3, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab3, "src/ImagenesP/tecun.png");this.scImagen(this.s3, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab3, "src/ImagenesP/among.png");this.scImagen(this.s3, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab3, "src/ImagenesP/chucho.png"); this.scImagen(this.s3, "src/ImagenesP/chucho.png");break;
 }
 switch(personaje4){
     case "Seleccionar": this.scImagen(this.lab4, "");this.scImagen(this.s4, "");break;
     case "Botella": this.scImagen(this.lab4, "src/ImagenesP/botella2.png");this.scImagen(this.s4, "src/ImagenesP/botella2.png");break;
     case "Tecun": this.scImagen(this.lab4, "src/ImagenesP/tecun.png");this.scImagen(this.s4, "src/ImagenesP/tecun.png");break;
     case "among": this.scImagen(this.lab4, "src/ImagenesP/among.png");this.scImagen(this.s4, "src/ImagenesP/among.png");break;
     case "chucho": this.scImagen(this.lab4, "src/ImagenesP/chucho.png"); this.scImagen(this.s4, "src/ImagenesP/chucho.png");break;
 }
 }
   //////////////////////////////////////// 
 //funcion para habilitar al jugador y su pieza  
 public final void habilitarJugador(){  
    if(HB1.isSelected()){
    selecJ1.setEnabled(true);
    HB2.setEnabled(true);
    }else{
    selecJ1.setEnabled(false);selecJ1.setSelectedItem("Seleccionar");
    selecJ2.setEnabled(false);selecJ2.setSelectedItem("Seleccionar");
    HB2.setSelected(false);
    HB2.setEnabled(false);
    } 
    if(HB2.isSelected()&& HB2.isEnabled()){
    selecJ2.setEnabled(true);
    HB3.setEnabled(true);
    }else{
    selecJ2.setEnabled(false);selecJ2.setSelectedItem("Seleccionar");
    selecJ3.setEnabled(false);selecJ3.setSelectedItem("Seleccionar");
    HB3.setSelected(false);
    HB3.setEnabled(false);
    } 
    if(HB3.isSelected()){
    selecJ3.setEnabled(true);
    HB4.setEnabled(true);
    }else{
    selecJ3.setEnabled(false);selecJ3.setSelectedItem("Seleccionar");
    selecJ4.setEnabled(false);selecJ4.setSelectedItem("Seleccionar");
    HB4.setSelected(false);
    HB4.setEnabled(false);
    }
      if(HB4.isSelected()){
    selecJ4.setEnabled(true);
    }else{
    selecJ4.setEnabled(false);selecJ4.setSelectedItem("Seleccionar");
    }    
    }
    //////////////////////////////////////////////////////////////////
    // esta funcion ajusta imagen y permite colocar en varios label
    private void scImagen(JLabel lbl, String ruta){
    this.imagen = new ImageIcon(ruta);
    this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT)); 
    lbl.setIcon(this.icono);
    this.repaint();
    }
/////////////////////////////////////////////////////////////////////
    //genera turnos y de guia muestra en un label el turno de cada jugador
    public void turnos(){
    if(HB4.isSelected()&& HB1.isSelected()&& HB2.isSelected()&& HB3.isSelected()){    
        switch (jugadorTlb.getText()) {
            case "j1":
                jugadorTlb.setText("j2");
                break;
            case "j2":
                jugadorTlb.setText("j3");
                break;
            case "j3":
                jugadorTlb.setText("j4");
                break;
            case "j4":
                jugadorTlb.setText("j1");    
                break;
            default:
                break;
        }
      }else
     if(HB1.isSelected()&&HB2.isSelected()&&HB3.isSelected()){    
        switch (jugadorTlb.getText()) {
            case "j1":
                jugadorTlb.setText("j2");
                break;
            case "j2":
                jugadorTlb.setText("j3");
                break;
            case "j3":
                jugadorTlb.setText("j1");       
                break;
            
        }
      }else
     if(HB1.isSelected()&&HB2.isSelected()){    
         
   switch (jugadorTlb.getText()) {
            case "j1":                
            
                jugadorTlb.setText("j2");                 
                  break;
            case "j2":               
                 
                jugadorTlb.setText("j1");               
                 break;
      }
     }
    }
    /////////////////////////////////
   public void moverPieza2(int cont){
   switch (cont) {
            case 1:lab2.setLocation(1270,910);break;
            case 2:lab2.setLocation(1140,910);break;
            case 3:lab2.setLocation(1020,910);break;
            case 4:lab2.setLocation(900,910);break;
            case 5:lab2.setLocation(770,910);break;
            case 6:lab2.setLocation(650,910);break;
            case 7:lab2.setLocation(520,910);break;
            case 8:lab2.setLocation(400,910);break;
            case 9:lab2.setLocation(270,910);break;
            case 10:lab2.setLocation(100,890);break;
            case 11:lab2.setLocation(90,786);break;
            case 12:lab2.setLocation(90,703);break;
            case 13:lab2.setLocation(90,621);break; 
   }
   }
    public void moverPieza1( int cont){  
        System.out.println(cont);
       
       switch (cont) {
            case 1:lab1.setLocation(1210,910);break;
            case 2:lab1.setLocation(1080,910);break;
            case 3:lab1.setLocation(960,910);break;
            case 4:lab1.setLocation(840,910);break;
            case 5:lab1.setLocation(710,910);break;
            case 6:lab1.setLocation (590,910);break;
            case 7:lab1.setLocation(460,910);break;
            case 8:lab1.setLocation(340,910);break;
            case 9:lab1.setLocation(210,910);break;
            case 10:lab1.setLocation(40,890);break;
            case 11:lab1.setLocation(30,786);break;
            case 12:lab1.setLocation(30, 703);break;
            case 13:lab1.setLocation(30,621);break; 
           
        }
    }
    //////////////
    void verificar(){
    int i=JOptionPane.showConfirmDialog(null, "desea comprar zoo aurora");
    if(i==0){
    saldo=saldo-60;
    saldo1.setText("Q"+saldo);
    }
    }
    //////
    public void tarjetasCasilla(){
    switch(cont1){
        case 1: JOptionPane.showConfirmDialog(null, "desea comprar el safari chapin");break;
         case 2: JOptionPane.showMessageDialog(null, "le toca vanzar");  ;break;
        case 3: verificar();break;
    }
    }
    /////////////////////////////////
 
 ///////////////////////////////////////////////////////////////////   
//evento click label de gif dados
    private void labDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDadoMouseClicked
         
        this.labD1.setVisible(true);
         this.labD2.setVisible(true);
        dados(); carasDados();
       this.labDado.setVisible(false); //oculta el gif 
       botonturno.setEnabled(false);
       jButton1.setEnabled(true);
    }//GEN-LAST:event_labDadoMouseClicked
/////////////////
    //termina el turno del jugador e inicia el siguiente
  
  
    private void botonturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonturnoActionPerformed
   
        this.labDado.setVisible(true);
        this.labD1.setVisible(false);
        this.labD2.setVisible(false);
        this.cantidados.setText("");       
        turnos(); 
    
    }//GEN-LAST:event_botonturnoActionPerformed
////////////  
    
////////////// 
    //estos eventos son para los combobox y seleccionar imagen de personaje
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
/////////
    //boton para iniciar partida
    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
    
    
    
   if(HB1.isSelected() && HB2.isSelected()){
   JOptionPane.showMessageDialog(this, "Que inicie la Partida");
   this.labDado.setVisible(true);
    this.iniciarPartida.setVisible(false);
    this.jugadorTlb.setText("j1");
    HB1.setVisible(false);HB2.setVisible(false);HB3.setVisible(false);HB4.setVisible(false);
   }else if(HB1.isSelected()==false || HB1.isSelected()&&HB2.isSelected()==false){
   JOptionPane.showMessageDialog(this, "Debe seleccionar 2 jugador como mínimo");
   }
    /*float cont=15;
    jugador1.setSaldo(cont);
    System.out.println(jugador1.getSaldo());*/
    }//GEN-LAST:event_iniciarPartidaActionPerformed
////////////
    //estos eventos permiten habilitar a los jugadores 
    private void HB2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HB2StateChanged
      habilitarJugador();
    }//GEN-LAST:event_HB2StateChanged

    private void HB1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HB1StateChanged
        habilitarJugador();
    }//GEN-LAST:event_HB1StateChanged

    private void HB3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HB3StateChanged
         habilitarJugador();
    }//GEN-LAST:event_HB3StateChanged

    private void HB4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HB4StateChanged
        habilitarJugador();
    }//GEN-LAST:event_HB4StateChanged
////
    ///////boton mover
 
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        try{
            cant=Integer.parseInt(cantidados.getText()); 
            System.out.println(cont1);
         switch(jugadorTlb.getText()){
             case "j1": cont1+=cant;moverPieza1(cont1); moverPieza2(cont2);break;
             case "j2":  cont2+=cant;moverPieza2(cont2);moverPieza1(cont1);break;
         }
     
      tarjetasCasilla();
     }catch(Exception e){
     JOptionPane.showMessageDialog(null, "debe tirar dados");
     }
          botonturno.setEnabled(true);
          this.jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed
///////////////////////////////
    
   //main del juego
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
    private javax.swing.JCheckBox HB1;
    private javax.swing.JCheckBox HB2;
    private javax.swing.JCheckBox HB3;
    private javax.swing.JCheckBox HB4;
    private javax.swing.JButton botonturno;
    private javax.swing.JLabel cantidados;
    private javax.swing.JLabel casillaCarcel1;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugadorTlb;
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
    private javax.swing.JLabel saldo1;
    private javax.swing.JLabel saldo2;
    private javax.swing.JLabel saldo3;
    private javax.swing.JLabel saldo4;
    private javax.swing.JComboBox<String> selecJ1;
    private javax.swing.JComboBox<String> selecJ2;
    private javax.swing.JComboBox<String> selecJ3;
    private javax.swing.JComboBox<String> selecJ4;
    private javax.swing.JLabel tarjetasLab;
    // End of variables declaration//GEN-END:variables

}
