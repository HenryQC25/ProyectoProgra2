package contenido;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Juego extends javax.swing.JFrame {

    ////////////////////////////
    //objetos par usar las variables y poder reutilizar codigo 
    jugador ju1 = new jugador();
    jugador ju2 = new jugador();
    jugador ju3 = new jugador();
    jugador ju4 = new jugador();
    Casilla c1 = new Casilla();
    Casilla c2 = new Casilla();
    Casilla c3 = new Casilla();
    Casilla c4 = new Casilla();

    //cantidad que funcionar√° para almacenar el valor de los dados e incrementar el contador de los jugadores
    int cant;

    ///////////////////////////
    /////////variable de imagen para ajustar y colocar en label 
    private ImageIcon imagen;
    private Icon icono;
    //variables dados
    int dado1, dado2, resultado;
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
        this.HB1.setEnabled(true);
        this.HB2.setEnabled(false);
        HB3.setEnabled(false);
        HB4.setEnabled(false);

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
        Prt1 = new javax.swing.JLabel();
        Prt5 = new javax.swing.JLabel();
        Prt3 = new javax.swing.JLabel();
        Prt4 = new javax.swing.JLabel();
        Prt9 = new javax.swing.JLabel();
        Prt8 = new javax.swing.JLabel();
        Prt11 = new javax.swing.JLabel();
        Prt12 = new javax.swing.JLabel();
        Prt13 = new javax.swing.JLabel();
        Prt14 = new javax.swing.JLabel();
        Prt15 = new javax.swing.JLabel();
        Prt16 = new javax.swing.JLabel();
        Prt19 = new javax.swing.JLabel();
        Prt18 = new javax.swing.JLabel();
        Prt21 = new javax.swing.JLabel();
        Prt23 = new javax.swing.JLabel();
        Prt24 = new javax.swing.JLabel();
        Prt28 = new javax.swing.JLabel();
        Prt27 = new javax.swing.JLabel();
        Prt29 = new javax.swing.JLabel();
        Prt25 = new javax.swing.JLabel();
        Prt26 = new javax.swing.JLabel();
        prt22 = new javax.swing.JLabel();
        Prt31 = new javax.swing.JLabel();
        Prt32 = new javax.swing.JLabel();
        Prt34 = new javax.swing.JLabel();
        Prt35 = new javax.swing.JLabel();
        Prt37 = new javax.swing.JLabel();
        Prt39 = new javax.swing.JLabel();
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
        pagar1 = new javax.swing.JButton();
        pagar2 = new javax.swing.JButton();
        pagar3 = new javax.swing.JButton();
        pagar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(191, 248, 223));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j4.setBackground(new java.awt.Color(255, 153, 153));
        j4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j4.setText("jugador4");
        j4.setOpaque(true);
        jPanel1.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 650, 80, 30));

        j1.setBackground(new java.awt.Color(255, 153, 153));
        j1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j1.setText("jugador1");
        j1.setOpaque(true);
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 60, 80, 30));

        j2.setBackground(new java.awt.Color(255, 153, 153));
        j2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j2.setText("jugador2");
        j2.setOpaque(true);
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 250, 80, 30));

        j3.setBackground(new java.awt.Color(255, 153, 153));
        j3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j3.setText("jugador3");
        j3.setOpaque(true);
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 470, 80, 30));

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
        panelFondo.add(labDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 210, 160));
        panelFondo.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 890, 60, 50));
        panelFondo.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 940, 60, 50));
        panelFondo.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 940, 60, 50));
        panelFondo.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 890, 60, 50));
        panelFondo.add(labD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 90, 90));
        panelFondo.add(labD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 90));

        cantidados.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cantidados.setForeground(new java.awt.Color(255, 0, 51));
        panelFondo.add(cantidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 30, 20));

        Prt1.setBackground(new java.awt.Color(0, 153, 255));
        Prt1.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt1.setText(".");
        Prt1.setOpaque(true);
        panelFondo.add(Prt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 830, 30, 30));

        Prt5.setBackground(new java.awt.Color(0, 153, 255));
        Prt5.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt5.setText(".");
        Prt5.setOpaque(true);
        panelFondo.add(Prt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 830, 30, 30));

        Prt3.setBackground(new java.awt.Color(0, 153, 255));
        Prt3.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt3.setText(".");
        Prt3.setOpaque(true);
        panelFondo.add(Prt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 830, 30, 30));

        Prt4.setBackground(new java.awt.Color(0, 153, 255));
        Prt4.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt4.setText(".");
        Prt4.setOpaque(true);
        panelFondo.add(Prt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 830, 30, 30));

        Prt9.setBackground(new java.awt.Color(0, 153, 255));
        Prt9.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt9.setText(".");
        Prt9.setOpaque(true);
        panelFondo.add(Prt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 830, 30, 30));

        Prt8.setBackground(new java.awt.Color(0, 153, 255));
        Prt8.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt8.setText(".");
        Prt8.setOpaque(true);
        panelFondo.add(Prt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 830, 30, 30));

        Prt11.setBackground(new java.awt.Color(0, 153, 255));
        Prt11.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt11.setText(".");
        Prt11.setOpaque(true);
        panelFondo.add(Prt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 800, 30, 30));

        Prt12.setBackground(new java.awt.Color(0, 153, 255));
        Prt12.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt12.setText(".");
        Prt12.setOpaque(true);
        panelFondo.add(Prt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, 30, 30));

        Prt13.setBackground(new java.awt.Color(0, 153, 255));
        Prt13.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt13.setText(".");
        Prt13.setOpaque(true);
        panelFondo.add(Prt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 30, 30));

        Prt14.setBackground(new java.awt.Color(0, 153, 255));
        Prt14.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt14.setText(".");
        Prt14.setOpaque(true);
        panelFondo.add(Prt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 30, 30));

        Prt15.setBackground(new java.awt.Color(0, 153, 255));
        Prt15.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt15.setText(".");
        Prt15.setOpaque(true);
        panelFondo.add(Prt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 30, 30));

        Prt16.setBackground(new java.awt.Color(0, 153, 255));
        Prt16.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt16.setText(".");
        Prt16.setOpaque(true);
        panelFondo.add(Prt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 30, 30));

        Prt19.setBackground(new java.awt.Color(0, 153, 255));
        Prt19.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt19.setText(".");
        Prt19.setOpaque(true);
        panelFondo.add(Prt19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 30, 30));

        Prt18.setBackground(new java.awt.Color(0, 153, 255));
        Prt18.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt18.setText(".");
        Prt18.setOpaque(true);
        panelFondo.add(Prt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 30, 30));

        Prt21.setBackground(new java.awt.Color(102, 153, 255));
        Prt21.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt21.setText(".");
        Prt21.setOpaque(true);
        panelFondo.add(Prt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 30, 30));

        Prt23.setBackground(new java.awt.Color(0, 153, 255));
        Prt23.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt23.setText(".");
        Prt23.setOpaque(true);
        panelFondo.add(Prt23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 30, 30));

        Prt24.setBackground(new java.awt.Color(0, 153, 255));
        Prt24.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt24.setText(".");
        Prt24.setOpaque(true);
        panelFondo.add(Prt24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 30, 30));

        Prt28.setBackground(new java.awt.Color(0, 153, 255));
        Prt28.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt28.setText(".");
        Prt28.setOpaque(true);
        panelFondo.add(Prt28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, 30, 30));

        Prt27.setBackground(new java.awt.Color(0, 153, 255));
        Prt27.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt27.setText(".");
        Prt27.setOpaque(true);
        panelFondo.add(Prt27, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 30, 30));

        Prt29.setBackground(new java.awt.Color(0, 153, 255));
        Prt29.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt29.setText(".");
        Prt29.setOpaque(true);
        panelFondo.add(Prt29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, 30, 30));

        Prt25.setBackground(new java.awt.Color(0, 153, 255));
        Prt25.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt25.setText(".");
        Prt25.setOpaque(true);
        panelFondo.add(Prt25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 30, 30));

        Prt26.setBackground(new java.awt.Color(0, 153, 255));
        Prt26.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt26.setText(".");
        Prt26.setOpaque(true);
        panelFondo.add(Prt26, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 30, 30));

        prt22.setBackground(new java.awt.Color(255, 102, 102));
        prt22.setText(".");
        prt22.setOpaque(true);
        panelFondo.add(prt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2170, 140, 30, 30));

        Prt31.setBackground(new java.awt.Color(0, 153, 255));
        Prt31.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt31.setText(".");
        Prt31.setOpaque(true);
        panelFondo.add(Prt31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, 30, 30));

        Prt32.setBackground(new java.awt.Color(0, 153, 255));
        Prt32.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt32.setText(".");
        Prt32.setOpaque(true);
        panelFondo.add(Prt32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 240, 30, 30));

        Prt34.setBackground(new java.awt.Color(0, 153, 255));
        Prt34.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt34.setText(".");
        Prt34.setOpaque(true);
        panelFondo.add(Prt34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 400, 30, 30));

        Prt35.setBackground(new java.awt.Color(0, 153, 255));
        Prt35.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt35.setText(".");
        Prt35.setOpaque(true);
        panelFondo.add(Prt35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 480, 30, 30));

        Prt37.setBackground(new java.awt.Color(0, 153, 255));
        Prt37.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt37.setText(".");
        Prt37.setOpaque(true);
        panelFondo.add(Prt37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 640, 30, 30));

        Prt39.setBackground(new java.awt.Color(0, 153, 255));
        Prt39.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        Prt39.setText(".");
        Prt39.setOpaque(true);
        panelFondo.add(Prt39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 800, 30, 30));

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
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 10, 90, 90));

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

        saldo1.setBackground(new java.awt.Color(153, 255, 255));
        saldo1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        saldo1.setText("1500");
        saldo1.setOpaque(true);
        jPanel1.add(saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 100, 100, 30));

        saldo2.setBackground(new java.awt.Color(153, 255, 255));
        saldo2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        saldo2.setText("1500");
        saldo2.setOpaque(true);
        jPanel1.add(saldo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 290, 100, 30));

        saldo3.setBackground(new java.awt.Color(153, 255, 255));
        saldo3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        saldo3.setText("1500");
        saldo3.setOpaque(true);
        jPanel1.add(saldo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 510, 100, 30));

        saldo4.setBackground(new java.awt.Color(153, 255, 255));
        saldo4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        saldo4.setText("1500");
        saldo4.setOpaque(true);
        jPanel1.add(saldo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 690, 100, 30));

        pagar1.setText("pagar");
        pagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar1ActionPerformed(evt);
            }
        });
        jPanel1.add(pagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 140, -1, -1));

        pagar2.setText("pagar");
        pagar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar2ActionPerformed(evt);
            }
        });
        jPanel1.add(pagar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 330, -1, -1));

        pagar3.setText("pagar");
        pagar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar3ActionPerformed(evt);
            }
        });
        jPanel1.add(pagar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 550, -1, -1));

        pagar4.setText("pagar");
        pagar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar4ActionPerformed(evt);
            }
        });
        jPanel1.add(pagar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 730, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1890, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

////////////////////////////////////////////////////////////////
    //Para el fondo de los Jpanel
    class fondoPanel extends JPanel {

        Image imagen;

        public void paint(Graphics i) {  //parametros (imagen, ancho, altura)
            imagen = new ImageIcon(getClass().getResource("/ImagenesP/fondoTablero.png")).getImage();
            i.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);  //getWidth() y getHeigth() adopta el tama√Īo del panel
            super.paint(i); //carga propiedades i de la clase padre paint
        }

    }
    fondoPanel fondo = new fondoPanel(); //sirve para editar desde el panel de dise√Īo  //hay que ir al custom del panel y agregarlo
    ////////////////

    class fondoPanel1 extends JPanel {

        Image imagen;

        public void paint(Graphics i) {
            imagen = new ImageIcon(getClass().getResource("/ImagenesP/fondoG.jpg")).getImage();
            i.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);  //getWidth() y getHeigth() adopta el tama√Īo del panel
            super.paint(i); //pasa parametro i de la clase padre paint
        }
    }
    fondoPanel1 fondo1 = new fondoPanel1(); //sirve para editar desde el panel de dise√Īo 
    // hasta qui fondo de los jpanel
    /////////////////////////////////////
    //funion muestra el gif y est√° para otras imagenes que deben resultar al inicio 

    private void imagenes() {
        this.scImagen(this.labDado, "src/ImagenesP/dados.gif");

    }
    ////////////////////////////////////////////////////////
    //dados random del 1 al 6  

    public void dados() {
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        resultado = dado1 + dado2;
        String resultLab = String.valueOf(resultado);
        cantidados.setText(resultLab);
    }
///////// /////////////////////////////////////////////////
    //funcion para mostrar imagen de dados dependiendo el numero que salga del 1 al 6

    public void carasDados() {
        int caraD1 = dado1;
        int caraD2 = dado2;
        switch (caraD1) {
            case 1:
                this.scImagen(labD1, "src/dadosCaras/cara1.png");
                break;
            case 2:
                this.scImagen(labD1, "src/dadosCaras/cara2.png");
                break;
            case 3:
                this.scImagen(labD1, "src/dadosCaras/cara3.png");
                break;
            case 4:
                this.scImagen(labD1, "src/dadosCaras/cara4.png");
                break;
            case 5:
                this.scImagen(labD1, "src/dadosCaras/cara5.png");
                break;
            case 6:
                this.scImagen(labD1, "src/dadosCaras/cara6.png");
                break;
        }
        switch (caraD2) {
            case 1:
                this.scImagen(this.labD2, "src/dadosCaras/cara1.png");
                break;
            case 2:
                this.scImagen(this.labD2, "src/dadosCaras/cara2.png");
                break;
            case 3:
                this.scImagen(this.labD2, "src/dadosCaras/cara3.png");
                break;
            case 4:
                this.scImagen(this.labD2, "src/dadosCaras/cara4.png");
                break;
            case 5:
                this.scImagen(this.labD2, "src/dadosCaras/cara5.png");
                break;
            case 6:
                this.scImagen(this.labD2, "src/dadosCaras/cara6.png");
                break;
        }
    }
    ///////////////////////////////
    //opciones para seleccionar personaje

    public void seleccionarPersonaje() {
        String personaje1 = selecJ1.getSelectedItem().toString();    //items almacenados en Jcombobox
        String personaje2 = selecJ2.getSelectedItem().toString();
        String personaje3 = selecJ3.getSelectedItem().toString();
        String personaje4 = selecJ4.getSelectedItem().toString();
        switch (personaje1) {
            case "Seleccionar":
                this.scImagen(this.lab1, "");
                this.scImagen(this.s1, "");
                break;
            case "Botella":
                this.scImagen(this.lab1, "src/ImagenesP/botella2.png");
                this.scImagen(this.s1, "src/ImagenesP/botella2.png");
                ju1.nombre = "jugador1";
                break;
            case "Tecun":
                this.scImagen(this.lab1, "src/ImagenesP/tecun.png");
                this.scImagen(this.s1, "src/ImagenesP/tecun.png");
                ju1.nombre = "jugador1";
                break;
            case "among":
                this.scImagen(this.lab1, "src/ImagenesP/among.png");
                this.scImagen(this.s1, "src/ImagenesP/among.png");
                ju1.nombre = "jugador1";
                break;
            case "chucho":
                this.scImagen(this.lab1, "src/ImagenesP/chucho.png");
                this.scImagen(this.s1, "src/ImagenesP/chucho.png");
                ju1.nombre = "jugador1";
                break;

        }
        switch (personaje2) {
            case "Seleccionar":
                this.scImagen(this.lab2, "");
                this.scImagen(this.s2, "");
                break;
            case "Botella":
                this.scImagen(this.lab2, "src/ImagenesP/botella2.png");
                this.scImagen(this.s2, "src/ImagenesP/botella2.png");
                ju2.nombre = "jugador2";
                break;
            case "Tecun":
                this.scImagen(this.lab2, "src/ImagenesP/tecun.png");
                this.scImagen(this.s2, "src/ImagenesP/tecun.png");
                ju2.nombre = "jugador2";
                break;
            case "among":
                this.scImagen(this.lab2, "src/ImagenesP/among.png");
                this.scImagen(this.s2, "src/ImagenesP/among.png");
                ju2.nombre = "jugador2";
                break;
            case "chucho":
                this.scImagen(this.lab2, "src/ImagenesP/chucho.png");
                this.scImagen(this.s2, "src/ImagenesP/chucho.png");
                ju2.nombre = "jugador2";
                break;
        }
        switch (personaje3) {
            case "Seleccionar":
                this.scImagen(this.lab3, "");
                this.scImagen(this.s3, "");
                break;
            case "Botella":
                this.scImagen(this.lab3, "src/ImagenesP/botella2.png");
                this.scImagen(this.s3, "src/ImagenesP/botella2.png");
                ju3.nombre = "jugador3";
                break;
            case "Tecun":
                this.scImagen(this.lab3, "src/ImagenesP/tecun.png");
                this.scImagen(this.s3, "src/ImagenesP/tecun.png");
                ju3.nombre = "jugador3";
                break;
            case "among":
                this.scImagen(this.lab3, "src/ImagenesP/among.png");
                this.scImagen(this.s3, "src/ImagenesP/among.png");
                ju3.nombre = "jugador3";
                break;
            case "chucho":
                this.scImagen(this.lab3, "src/ImagenesP/chucho.png");
                this.scImagen(this.s3, "src/ImagenesP/chucho.png");
                ju3.nombre = "jugador3";
                break;
        }
        switch (personaje4) {
            case "Seleccionar":
                this.scImagen(this.lab4, "");
                this.scImagen(this.s4, "");
                break;
            case "Botella":
                this.scImagen(this.lab4, "src/ImagenesP/botella2.png");
                this.scImagen(this.s4, "src/ImagenesP/botella2.png");
                ju4.nombre = "jugador4";
                break;
            case "Tecun":
                this.scImagen(this.lab4, "src/ImagenesP/tecun.png");
                this.scImagen(this.s4, "src/ImagenesP/tecun.png");
                ju4.nombre = "jugador4";
                break;
            case "among":
                this.scImagen(this.lab4, "src/ImagenesP/among.png");
                this.scImagen(this.s4, "src/ImagenesP/among.png");
                ju4.nombre = "jugador4";
                break;
            case "chucho":
                this.scImagen(this.lab4, "src/ImagenesP/chucho.png");
                this.scImagen(this.s4, "src/ImagenesP/chucho.png");
                ju4.nombre = "jugador4";
                break;
        }
    }
    //////////////////////////////////////// 
    //funcion para habilitar al jugador y su pieza  

    public final void habilitarJugador() {
        if (HB1.isSelected()) {
            selecJ1.setEnabled(true);
            HB2.setEnabled(true);
        } else {
            selecJ1.setEnabled(false);
            selecJ1.setSelectedItem("Seleccionar");
            selecJ2.setEnabled(false);
            selecJ2.setSelectedItem("Seleccionar");
            HB2.setSelected(false);
            HB2.setEnabled(false);
        }
        if (HB2.isSelected() && HB2.isEnabled()) {
            selecJ2.setEnabled(true);
            HB3.setEnabled(true);
        } else {
            selecJ2.setEnabled(false);
            selecJ2.setSelectedItem("Seleccionar");
            selecJ3.setEnabled(false);
            selecJ3.setSelectedItem("Seleccionar");
            HB3.setSelected(false);
            HB3.setEnabled(false);
        }
        if (HB3.isSelected()) {
            selecJ3.setEnabled(true);
            HB4.setEnabled(true);
        } else {
            selecJ3.setEnabled(false);
            selecJ3.setSelectedItem("Seleccionar");
            selecJ4.setEnabled(false);
            selecJ4.setSelectedItem("Seleccionar");
            HB4.setSelected(false);
            HB4.setEnabled(false);
        }
        if (HB4.isSelected()) {
            selecJ4.setEnabled(true);
        } else {
            selecJ4.setEnabled(false);
            selecJ4.setSelectedItem("Seleccionar");
        }
    }

    //////////////////////////////////////////////////////////////////
    // esta funcion ajusta imagen y permite colocar en varios label
    private void scImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }

    /////////////////////////////////////////////////////////////////
    //genera turnos y de guia muestra en un label el turno de cada jugador
    public void turnos() {
        if (HB4.isSelected() && HB1.isSelected() && HB2.isSelected() && HB3.isSelected()) {
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
            }
        } else if (HB1.isSelected() && HB2.isSelected() && HB3.isSelected()) {
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
        } else if (HB1.isSelected() && HB2.isSelected()) {
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

    //////////////////////////////////
    public void moverPieza4() {
        int saldoj4 = Integer.parseInt(saldo4.getText());
        if (ju4.contadorJ > 40) {
            int res4 = ju4.contadorJ - 40;
            ju4.contadorJ = res4;
            int sumaSaldo = saldoj4 + 200;
            saldo4.setText(String.valueOf(sumaSaldo));
            saldoj4 = sumaSaldo;
        } else {
            switch (ju4.contadorJ) {
                case 1:
                    lab4.setLocation(1270, 950);
                    break;
                case 2:
                    lab4.setLocation(1140, 950);
                    break;
                case 3:
                    lab4.setLocation(1020, 950);
                    break;
                case 4:
                    lab4.setLocation(900, 950);
                    break;
                case 5:
                    lab4.setLocation(770, 950);
                    break;
                case 6:
                    lab4.setLocation(650, 950);
                    break;
                case 7:
                    lab4.setLocation(520, 950);
                    break;
                case 8:
                    lab4.setLocation(400, 950);
                    break;
                case 9:
                    lab4.setLocation(270, 950);
                    break;
                case 10:
                    lab4.setLocation(100, 930);
                    break;
                case 11:
                    lab4.setLocation(90, 827);
                    break;
                case 12:
                    lab4.setLocation(90, 744);
                    break;
                case 13:
                    lab4.setLocation(90, 661);
                    break;
                case 14:
                    lab4.setLocation(90, 581);
                    break;
                case 15:
                    lab4.setLocation(90, 500);
                    break;
                case 16:
                    lab4.setLocation(90, 420);
                    break;
                case 17:
                    lab4.setLocation(90, 337);
                    break;
                case 18:
                    lab4.setLocation(90, 257);
                    break;
                case 19:
                    lab4.setLocation(90, 176);
                    break;
                case 20:
                    lab4.setLocation(90, 50);
                    break;
                case 21:
                    lab4.setLocation(270, 50);
                    break;
                case 22:
                    lab4.setLocation(400, 50);
                    break;
                case 23:
                    lab4.setLocation(520, 50);
                    break;
                case 24:
                    lab4.setLocation(650, 50);
                    break;
                case 25:
                    lab4.setLocation(770, 50);
                    break;
                case 26:
                    lab4.setLocation(900, 50);
                    break;
                case 27:
                    lab4.setLocation(1020, 50);
                    break;
                case 28:
                    lab4.setLocation(1140, 50);
                    break;
                case 29:
                    lab4.setLocation(1270, 50);
                    break;
                case 30:
                    lab4.setLocation(1440, 60);
                    break;
                case 31:
                    lab4.setLocation(1460, 176);
                    break;
                case 32:
                    lab4.setLocation(1460, 257);
                    break;
                case 33:
                    lab4.setLocation(1460, 337);
                    break;
                case 34:
                    lab4.setLocation(1460, 420);
                    break;
                case 35:
                    lab4.setLocation(1460, 500);
                    break;
                case 36:
                    lab4.setLocation(1460, 581);
                    break;
                case 37:
                    lab4.setLocation(1460, 661);
                    break;
                case 38:
                    lab4.setLocation(1460, 744);
                    break;
                case 39:
                    lab4.setLocation(1460, 827);
                    break;
                case 40:
                    lab4.setLocation(1440, 930);
                    break;
            }
        }
    }

    /////////////////////////////////
    public void moverPieza3() {
        int saldoj3 = Integer.parseInt(saldo3.getText());
        if (ju3.contadorJ > 40) {
            int res3 = ju3.contadorJ - 40;
            ju3.contadorJ = res3;
            int sumaSaldo = saldoj3 + 200;
            saldo3.setText(String.valueOf(sumaSaldo));
        } else {
            // System.out.println(ju3.contadorJ);
            switch (ju3.contadorJ) {
                case 1:
                    lab3.setLocation(1210, 950);
                    break;
                case 2:
                    lab3.setLocation(1080, 950);
                    break;
                case 3:
                    lab3.setLocation(960, 950);
                    break;
                case 4:
                    lab3.setLocation(840, 950);
                    break;
                case 5:
                    lab3.setLocation(710, 950);
                    break;
                case 6:
                    lab3.setLocation(590, 950);
                    break;
                case 7:
                    lab3.setLocation(460, 950);
                    break;
                case 8:
                    lab3.setLocation(340, 950);
                    break;
                case 9:
                    lab3.setLocation(210, 950);
                    break;
                case 10:
                    lab3.setLocation(40, 930);
                    break;
                case 11:
                    lab3.setLocation(30, 827);
                    break;
                case 12:
                    lab3.setLocation(30, 744);
                    break;
                case 13:
                    lab3.setLocation(30, 661);
                    break;
                case 14:
                    lab3.setLocation(30, 581);
                    break;
                case 15:
                    lab3.setLocation(30, 500);
                    break;
                case 16:
                    lab3.setLocation(30, 420);
                    break;
                case 17:
                    lab3.setLocation(30, 337);
                    break;
                case 18:
                    lab3.setLocation(30, 257);
                    break;
                case 19:
                    lab3.setLocation(30, 176);
                    break;
                case 20:
                    lab3.setLocation(30, 50);
                    break;
                case 21:
                    lab3.setLocation(210, 50);
                    break;
                case 22:
                    lab3.setLocation(340, 50);
                    break;
                case 23:
                    lab3.setLocation(460, 50);
                    break;
                case 24:
                    lab3.setLocation(590, 50);
                    break;
                case 25:
                    lab3.setLocation(710, 50);
                    break;
                case 26:
                    lab3.setLocation(840, 50);
                    break;
                case 27:
                    lab3.setLocation(960, 50);
                    break;
                case 28:
                    lab3.setLocation(1080, 50);
                    break;
                case 29:
                    lab3.setLocation(1210, 50);
                    break;
                case 30:
                    lab3.setLocation(1380, 60);
                    break;
                case 31:
                    lab3.setLocation(1400, 176);
                    break;
                case 32:
                    lab3.setLocation(1400, 257);
                    break;
                case 33:
                    lab3.setLocation(1400, 337);
                    break;
                case 34:
                    lab3.setLocation(1400, 420);
                    break;
                case 35:
                    lab3.setLocation(1400, 500);
                    break;
                case 36:
                    lab3.setLocation(1400, 581);
                    break;
                case 37:
                    lab3.setLocation(1400, 661);
                    break;
                case 38:
                    lab3.setLocation(1400, 744);
                    break;
                case 39:
                    lab3.setLocation(1400, 827);
                    break;
                case 40:
                    lab3.setLocation(1380, 930);
                    break;
            }
        }
    }

    /////////////////////////////////
    public void moverPieza2() {
        int saldoj2 = Integer.parseInt(saldo2.getText());
        if (ju2.contadorJ > 40) {
            int res2 = ju2.contadorJ - 40;
            ju2.contadorJ = res2;
            int sumaSaldo = saldoj2 + 200;
            saldo2.setText(String.valueOf(sumaSaldo));
        } else {
            //  System.out.println(ju2.contadorJ);

            switch (ju2.contadorJ) {
                case 1:
                    lab2.setLocation(1270, 910);
                    break;
                case 2:
                    lab2.setLocation(1140, 910);
                    break;
                case 3:
                    lab2.setLocation(1020, 910);
                    break;
                case 4:
                    lab2.setLocation(900, 910);
                    break;
                case 5:
                    lab2.setLocation(770, 910);
                    break;
                case 6:
                    lab2.setLocation(650, 910);
                    break;
                case 7:
                    lab2.setLocation(520, 910);
                    break;
                case 8:
                    lab2.setLocation(400, 910);
                    break;
                case 9:
                    lab2.setLocation(270, 910);
                    break;
                case 10:
                    lab2.setLocation(100, 890);
                    break;
                case 11:
                    lab2.setLocation(90, 786);
                    break;
                case 12:
                    lab2.setLocation(90, 703);
                    break;
                case 13:
                    lab2.setLocation(90, 621);
                    break;
                case 14:
                    lab2.setLocation(90, 541);
                    break;
                case 15:
                    lab2.setLocation(90, 460);
                    break;
                case 16:
                    lab2.setLocation(90, 380);
                    break;
                case 17:
                    lab2.setLocation(90, 299);
                    break;
                case 18:
                    lab2.setLocation(90, 217);
                    break;
                case 19:
                    lab2.setLocation(90, 136);
                    break;
                case 20:
                    lab2.setLocation(90, 10);
                    break;
                case 21:
                    lab2.setLocation(270, 10);
                    break;
                case 22:
                    lab2.setLocation(400, 10);
                    break;
                case 23:
                    lab2.setLocation(520, 10);
                    break;
                case 24:
                    lab2.setLocation(650, 10);
                    break;
                case 25:
                    lab2.setLocation(770, 10);
                    break;
                case 26:
                    lab2.setLocation(900, 10);
                    break;
                case 27:
                    lab2.setLocation(1020, 10);
                    break;
                case 28:
                    lab2.setLocation(1140, 10);
                    break;
                case 29:
                    lab2.setLocation(1270, 10);
                    break;
                case 30:
                    lab2.setLocation(1440, 20);
                    break;
                case 31:
                    lab2.setLocation(1460, 136);
                    break;
                case 32:
                    lab2.setLocation(1460, 217);
                    break;
                case 33:
                    lab2.setLocation(1460, 299);
                    break;
                case 34:
                    lab2.setLocation(1460, 380);
                    break;
                case 35:
                    lab2.setLocation(1460, 460);
                    break;
                case 36:
                    lab2.setLocation(1460, 541);
                    break;
                case 37:
                    lab2.setLocation(1460, 621);
                    break;
                case 38:
                    lab2.setLocation(1460, 703);
                    break;
                case 39:
                    lab2.setLocation(1460, 786);
                    break;
                case 40:
                    lab2.setLocation(1440, 890);
                    break;
            }
        }
    }
    /////////////////////////////////

    public void moverPieza1() {
        int saldoj1 = Integer.parseInt(saldo1.getText());
        if (ju1.contadorJ > 40) {

            int res1 = ju1.contadorJ - 40;
            ju1.contadorJ = res1;
            int sumaSaldo = saldoj1 + 200;
            saldo1.setText(String.valueOf(sumaSaldo));
        } else {
            //   System.out.println(ju1.contadorJ);

            switch (ju1.contadorJ) {
                case 1:
                    lab1.setLocation(1210, 910);
                    lab1.setVisible(true);
                    break;
                case 2:
                    lab1.setLocation(1080, 910);
                    lab1.setVisible(true);
                    break;
                case 3:
                    lab1.setLocation(960, 910);
                    lab1.setVisible(true);
                    break;
                case 4:
                    lab1.setLocation(840, 910);
                    lab1.setVisible(true);
                    break;
                case 5:
                    lab1.setLocation(710, 910);
                    lab1.setVisible(true);
                    break;
                case 6:
                    lab1.setLocation(590, 910);
                    lab1.setVisible(true);
                    break;
                case 7:
                    lab1.setLocation(460, 910);
                    lab1.setVisible(true);
                    break;
                case 8:
                    lab1.setLocation(340, 910);
                    lab1.setVisible(true);
                    break;
                case 9:
                    lab1.setLocation(210, 910);
                    lab1.setVisible(true);
                    break;
                case 10:
                    lab1.setLocation(40, 890);
                    lab1.setVisible(true);
                    break;
                case 11:
                    lab1.setLocation(30, 786);
                    lab1.setVisible(true);
                    break;
                case 12:
                    lab1.setLocation(30, 703);
                    lab1.setVisible(true);
                    break;
                case 13:
                    lab1.setLocation(30, 621);
                    lab1.setVisible(true);
                    break;
                case 14:
                    lab1.setLocation(30, 541);
                    lab1.setVisible(true);
                    break;
                case 15:
                    lab1.setLocation(30, 460);
                    lab1.setVisible(true);
                    break;
                case 16:
                    lab1.setLocation(30, 380);
                    lab1.setVisible(true);
                    break;
                case 17:
                    lab1.setLocation(30, 299);
                    lab1.setVisible(true);
                    break;
                case 18:
                    lab1.setLocation(30, 217);
                    lab1.setVisible(true);
                    break;
                case 19:
                    lab1.setLocation(30, 136);
                    lab1.setVisible(true);
                    break;
                case 20:
                    lab1.setLocation(30, 10);
                    lab1.setVisible(true);
                    break;
                case 21:
                    lab1.setLocation(210, 10);
                    lab1.setVisible(true);
                    break;
                case 22:
                    lab1.setLocation(340, 10);
                    lab1.setVisible(true);
                    break;
                case 23:
                    lab1.setLocation(460, 10);
                    lab1.setVisible(true);
                    break;
                case 24:
                    lab1.setLocation(590, 10);
                    lab1.setVisible(true);
                    break;
                case 25:
                    lab1.setLocation(710, 10);
                    lab1.setVisible(true);
                    break;
                case 26:
                    lab1.setLocation(840, 10);
                    lab1.setVisible(true);
                    break;
                case 27:
                    lab1.setLocation(960, 10);
                    lab1.setVisible(true);
                    break;
                case 28:
                    lab1.setLocation(1080, 10);
                    lab1.setVisible(true);
                    break;
                case 29:
                    lab1.setLocation(1210, 10);
                    lab1.setVisible(true);
                    break;
                case 30:
                    lab1.setLocation(1380, 20);
                    lab1.setVisible(true);
                    break;
                case 31:
                    lab1.setLocation(1400, 136);
                    lab1.setVisible(true);
                    break;
                case 32:
                    lab1.setLocation(1400, 217);
                    lab1.setVisible(true);
                    break;
                case 33:
                    lab1.setLocation(1400, 299);
                    lab1.setVisible(true);
                    break;
                case 34:
                    lab1.setLocation(1400, 380);
                    lab1.setVisible(true);
                    break;
                case 35:
                    lab1.setLocation(1400, 460);
                    lab1.setVisible(true);
                    break;
                case 36:
                    lab1.setLocation(1400, 541);
                    lab1.setVisible(true);
                    break;
                case 37:
                    lab1.setLocation(1400, 621);
                    lab1.setVisible(true);
                    break;
                case 38:
                    lab1.setLocation(1400, 703);
                    lab1.setVisible(true);
                    break;
                case 39:
                    lab1.setLocation(1400, 786);
                    lab1.setVisible(true);
                    break;
                case 40:
                    lab1.setLocation(1380, 890);
                    lab1.setVisible(true);
                    break;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////   
//evento click label de gif dados
    private void labDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDadoMouseClicked

        this.labD1.setVisible(true);   //activa label de dados
        this.labD2.setVisible(true);
        dados();
        carasDados();
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
        if (HB1.isSelected() && HB2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Que inicie la Partida");
            this.labDado.setVisible(true);
            this.iniciarPartida.setVisible(false);
            this.jugadorTlb.setText("j1");
            HB1.setVisible(false);
            HB2.setVisible(false);
            HB3.setVisible(false);
            HB4.setVisible(false);
        } else if (HB1.isSelected() == false || HB1.isSelected() && HB2.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar 2 jugador como m√≠nimo");
        }

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
    Casilla cj;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int s1 = Integer.parseInt(saldo1.getText());    //valor de los saldos
            int s2 = Integer.parseInt(saldo2.getText());
            int s3 = Integer.parseInt(saldo3.getText());
            int s4 = Integer.parseInt(saldo4.getText());

            cant = Integer.parseInt(cantidados.getText()); //cantidad de los label dados en cant que es nuestra variable global

            switch (jugadorTlb.getText()) {  //jugadorTlb es el label que muestra turnos en el frame
                case "j1":
                    ju1.contadorJ += cant; //para avanzar correctamente el contador de cada jugador incrementa y se resetea en la funcion de movimiento 
                    moverPieza1(); //metodos o funciones para vanzar y actualizar posicion de las piezas segun fueron seleccionadas o habilitadas
                    moverPieza2();
                    moverPieza3();
                    moverPieza4();
                    c1.casillaOP(ju1.contadorJ, s1, saldo1); //pasa parmetros para la clase casilla y empezar a mostrar tarjetas
                                                   //saldo# solo es el de saldo del jugador label
                    break;
                case "j2":
                    ju2.contadorJ += cant;
                    moverPieza2();
                    moverPieza1();
                    moverPieza3();
                    moverPieza4();
                    c2.casillaOP(ju2.contadorJ, s2, saldo2);

                    break;
                case "j3":
                    ju3.contadorJ += cant;
                    moverPieza3();
                    moverPieza2();
                    moverPieza1();
                    moverPieza4();
                    c3.casillaOP(ju3.contadorJ, s3, saldo3);

                    break;
                case "j4":
                    ju4.contadorJ += cant;
                    moverPieza4();
                    moverPieza1();
                    moverPieza2();
                    moverPieza3();
                    c4.casillaOP(ju4.contadorJ, s4, saldo4);

                    break;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe tirar dados");
        }

        botonturno.setEnabled(true);
        this.jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar1ActionPerformed
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("pagar j1"));   //para poder pagar por un problema que surgio se debe hacer manualmente
            int s1 = Integer.parseInt(saldo1.getText());
            s1 += valor;
            saldo1.setText(String.valueOf(s1));
        } catch (Exception e) {

        }
    }//GEN-LAST:event_pagar1ActionPerformed

    private void pagar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar2ActionPerformed
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("pagar j2"));
            int s2 = Integer.parseInt(saldo2.getText());
            s2 += valor;
            saldo2.setText(String.valueOf(s2));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pagar2ActionPerformed

    private void pagar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar3ActionPerformed
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("pagar j3"));
            int s3 = Integer.parseInt(saldo3.getText());
            s3 += valor;
            saldo3.setText(String.valueOf(s3));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pagar3ActionPerformed

    private void pagar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar4ActionPerformed
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("pagar j4"));
            int s4 = Integer.parseInt(saldo4.getText());
            s4 += valor;
            saldo4.setText(String.valueOf(s4));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pagar4ActionPerformed

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
    public static javax.swing.JLabel Prt1;
    public static javax.swing.JLabel Prt11;
    public static javax.swing.JLabel Prt12;
    public static javax.swing.JLabel Prt13;
    public static javax.swing.JLabel Prt14;
    public static javax.swing.JLabel Prt15;
    public static javax.swing.JLabel Prt16;
    public static javax.swing.JLabel Prt18;
    public static javax.swing.JLabel Prt19;
    public static javax.swing.JLabel Prt21;
    public static javax.swing.JLabel Prt23;
    public static javax.swing.JLabel Prt24;
    public static javax.swing.JLabel Prt25;
    public static javax.swing.JLabel Prt26;
    public static javax.swing.JLabel Prt27;
    public static javax.swing.JLabel Prt28;
    public static javax.swing.JLabel Prt29;
    public static javax.swing.JLabel Prt3;
    public static javax.swing.JLabel Prt31;
    public static javax.swing.JLabel Prt32;
    public static javax.swing.JLabel Prt34;
    public static javax.swing.JLabel Prt35;
    public static javax.swing.JLabel Prt37;
    public static javax.swing.JLabel Prt39;
    public static javax.swing.JLabel Prt4;
    public static javax.swing.JLabel Prt5;
    public static javax.swing.JLabel Prt8;
    public static javax.swing.JLabel Prt9;
    private javax.swing.JButton botonturno;
    private javax.swing.JLabel cantidados;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jugadorTlb;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel labD1;
    private javax.swing.JLabel labD2;
    private javax.swing.JLabel labDado;
    private javax.swing.JButton pagar1;
    private javax.swing.JButton pagar2;
    private javax.swing.JButton pagar3;
    private javax.swing.JButton pagar4;
    private javax.swing.JPanel panelFondo;
    public static javax.swing.JLabel prt22;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    public javax.swing.JLabel saldo1;
    public javax.swing.JLabel saldo2;
    public javax.swing.JLabel saldo3;
    public javax.swing.JLabel saldo4;
    private javax.swing.JComboBox<String> selecJ1;
    private javax.swing.JComboBox<String> selecJ2;
    private javax.swing.JComboBox<String> selecJ3;
    private javax.swing.JComboBox<String> selecJ4;
    // End of variables declaration//GEN-END:variables

}
