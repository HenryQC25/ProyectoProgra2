
package contenido;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class Casilla {



validacionC ca1 = new validacionC();validacionC ca9 = new validacionC();validacionC ca17 = new validacionC();validacionC ca25 = new validacionC();validacionC ca33 = new validacionC();
validacionC ca2 = new validacionC();validacionC ca10 = new validacionC();validacionC ca18 = new validacionC();validacionC ca26 = new validacionC();validacionC ca34 = new validacionC();
validacionC ca3 = new validacionC();validacionC ca11 = new validacionC();validacionC ca19 = new validacionC();validacionC ca27 = new validacionC();validacionC ca35 = new validacionC();
validacionC ca4 = new validacionC();validacionC ca12 = new validacionC();validacionC ca20 = new validacionC();validacionC ca28 = new validacionC();validacionC ca36 = new validacionC();
validacionC ca5 = new validacionC();validacionC ca13 = new validacionC();validacionC ca21 = new validacionC();validacionC ca29 = new validacionC();validacionC ca37 = new validacionC();
validacionC ca6 = new validacionC();validacionC ca14 = new validacionC();validacionC ca22 = new validacionC();validacionC ca30 = new validacionC();validacionC ca38 = new validacionC();
validacionC ca7 = new validacionC();validacionC ca15 = new validacionC();validacionC ca23 = new validacionC();validacionC ca31 = new validacionC();validacionC ca39 = new validacionC();
validacionC ca8 = new validacionC();validacionC ca16 = new validacionC();validacionC ca24 = new validacionC();validacionC ca32 = new validacionC();validacionC ca40 = new validacionC();


  Juego jf;


public int i;

    
//metodo para agregar icono
  public Icon icono(String ruta, int ancho, int alto ){
    Icon im = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
    return im;
    }
 ///////////////////////////// 
  
  
   public int JOP(String enc,String mensaje,String op1,String op2,String ruta, int W,int H){
        Object [] opciones = {op1,op2};
       JOptionPane.showOptionDialog(null,mensaje,enc,JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icono(ruta,W,H),opciones,opciones[0]);
      
  return 1;
  
  }
  
  
  public int randomTJ(int saldo1,JLabel lab){
      
  int res=(int)(Math.random()*6)+1;
  switch(res){
case 1:JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/pagar.jpg",160,165));saldo1-=50;lab.setText(String.valueOf("Q"+saldo1));break;
case 2: JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/robo.jpg",160,165));saldo1-=20;lab.setText(String.valueOf("Q"+saldo1));break;
case 3: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/boloT.jpg",160,165));saldo1+=10;lab.setText(String.valueOf("Q"+saldo1));break;
case 4: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/cumpleaños.jpg",160,165));saldo1+=50;lab.setText(String.valueOf("Q"+saldo1));break;

case 5: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/error banco.jpg",160,165));saldo1+=100;lab.setText(String.valueOf("Q"+saldo1));break;
case 6: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/pase gasto.jpg",160,165));saldo1+=50;lab.setText(String.valueOf("Q"+saldo1));break;   
  }
  return 1; //para que lea el metodo y el valor de devoluciòn sea verdadero y muestre el contenido del switch
  }
  //////////////////////////////////////////
 
  
  public void comprar(int numeroCasilla,int saldoJ,JLabel lab){
      int c;
      //Object [] opciones = {"comprar","pasar"};
      switch(numeroCasilla){
case 1: int c1 =  JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/safari.png",150,165));
        if(c1==0){jf.prt1.setText("j1");
        JOptionPane.showMessageDialog(null, "comprado");
        }break;
case 2:  randomTJ(saldoJ,lab);break;
case 3: int c2 = JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/aurora.png",150,165));
        //JOptionPane.showOptionDialog(null,"pos6","p1",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icono("/tarjetas/aurora.png",150,165),opciones,opciones[0]);
if(c2==0){jf.prt2.setText("j1");JOptionPane.showMessageDialog(null, "comprado");};break;
case 4:  JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
       
case 5:  int c3= JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165)); 
       
       if(c3==0){jf.prt4.setText("j1");JOptionPane.showMessageDialog(null, "comprado");};break;
case 6:  int c4=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/sanJose.png",150,165));   
if(c4==0){jf.prt5.setText("j1");JOptionPane.showMessageDialog(null, "comprado");};break;
case 7:  randomTJ(saldoJ,lab);break;
case 8:  int c5=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/puertoQ.png",150,165));  
if(c5==0){jf.prt8.setText("j1");JOptionPane.showMessageDialog(null, "comprado");};break;
case 9:  int c6=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/puertoB.png",150,165));     
if(c6==0){jf.prt9.setText("j1");JOptionPane.showMessageDialog(null, "comprado");};break;
case 10: break;
case 11: c=JOP("p1","pos11","comprar","pasar","/tarjetas/antigua.png",150,165);if(c==0){
     ca11.estado ="j1";JOptionPane.showMessageDialog(null, "comprado");}break;
case 12: c=JOP("p1","pos12","comprar","pasar","/tarjetas/luz.jpg",150,165);if(c==0){
     ca12.estado ="j1";};break; 
case 13: c=JOP("p1","pos13","comprar","pasar","/tarjetas/mateoF.png",150,165);if(c==0){
     ca13.estado ="1";};break;
case 14: c=JOP("p1","pos14","comprar","pasar","/tarjetas/castF.png",150,165);if(c==0){
     ca14.estado ="j1";};break;
case 15: c=JOP("p1","pos15","comprar","pasar","/tarjetas/taxi1.jpg",150,165);if(c==0){
     ca15.estado ="j1";};break;
case 16: c=JOP("p1","pos16","comprar","pasar","/tarjetas/desp.png",150,165);if(c==0){
     ca16.estado ="j1";};break;
case 17: randomTJ(saldoJ,lab);break;
case 18: c=JOP("p1","pos18","comprar","pasar","/tarjetas/cemaco.png",150,165);if(c==0){
     ca18.estado ="j1";};break;
case 19: c=JOP("p1","pos19","comprar","pasar","/tarjetas/megap.png",150,165);if(c==0){
     ca19.estado ="j1";};break;
case 20: break;   
case 21: c=JOP("p1","pos21","comprar","pasar","/tarjetas/campero.png",150,165);if(c==0){
     ca21.estado ="j1";};break;
case 22: randomTJ(saldoJ,lab);break;
case 23: c=JOP("p1","pos23","comprar","pasar","/tarjetas/india.png",150,165);if(c==0){
     ca23.estado ="j1";};break;
case 24: c=JOP("p1","pos24","comprar","pasar","/tarjetas/gallo.png",150,165);if(c==0){
     ca24.estado ="j1";};break;
case 25: c=JOP("p1","pos25","comprar","pasar","/tarjetas/taxi1.jpg",150,165);if(c==0){
     ca25.estado ="j1";};break;
case 26: c=JOP("p1","pos26","comprar","pasar","/tarjetas/pradera.png",150,165);if(c==0){
     ca26.estado ="j1";};break;
case 27: c=JOP("p1","pos27","comprar","pasar","/tarjetas/miraF.png",150,165);if(c==0){
     ca27.estado ="j1";};break;
case 28: c=JOP("p1","pos28","comprar","pasar","/tarjetas/agua.jpg",150,165);if(c==0){
     ca28.estado ="j1";};break;   
case 29: c=JOP("p1","pos29","comprar","pasar","/tarjetas/tikal.png",150,165);if(c==0){
     ca29.estado ="j1";};break;
case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;

case 31: c=JOP("p1","pos31","comprar","pasar","/tarjetas/petapa.png",150,165);if(c==0){
     ca31.estado ="j1";};break;
case 32: c=JOP("p1","pos32","comprar","pasar","/tarjetas/xetulul.png",150,165);if(c==0){
     ca32.estado ="j1";};break;
case 33: randomTJ(saldoJ,lab);break;
case 34: c=JOP("p1","pos34","comprar","pasar","/tarjetas/xocomil.png",150,165);if(c==0){
     ca34.estado ="j1";};break;
case 35: c=JOP("p1","pos35","comprar","pasar","/tarjetas/taxi1.jpg",150,165);if(c==0){
     ca35.estado ="j1";};break;
case 36: randomTJ(saldoJ,lab);break;
case 37: c=JOP("p1","pos37","comprar","pasar","/tarjetas/atitlan.png",150,165);if(c==0){
     ca37.estado="j1";};break;
case 38: c=JOP("p1","pos38","comprar","pasar","/tarjetas/ShucosP.jpg",150,165);if(c==0){
     ca38.estado ="j1";};break;
case 39: c=JOP("p1","pos39","comprar","pasar","/tarjetas/tikalRuina.png",150,165);if(c==0){
     ca39.estado ="j1";};break;

}
       }
    public void pagar(){
    JOptionPane.showMessageDialog(null, "Paga");
    }
  ////////////////////////
    

public void casillaOP(int numeroCasilla,int saldoJ,JLabel lab){
switch(numeroCasilla){
case 1:  if(".".equals(jf.prt1.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.prt1.getText())){pagar();}break;
case 2:  randomTJ(saldoJ,lab);break;
case 3:  if(".".equals(jf.prt2.getText())){
comprar(numeroCasilla,saldoJ,lab);}else  if(!"".equals(jf.prt2.getText())){pagar();}break;
case 4:   JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
case 5:   if(".".equals(jf.prt4.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.prt4.getText())){pagar();}break;
case 6:  if(".".equals(jf.prt5.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.prt5.getText())){pagar();}break;
case 7:  randomTJ(saldoJ,lab);break; 
case 8:  if(".".equals(jf.prt8.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.prt8.getText())){pagar();}break;
case 9:  if(".".equals(jf.prt9.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.prt9.getText())){pagar();}break;
case 10: break;
case 11: if("".equals(ca10.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 12: if("".equals(ca11.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;  
case 13:if("".equals(ca12.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 14: if("".equals(ca14.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 15: if("".equals(ca15.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 16: if("".equals(ca16.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 17: randomTJ(saldoJ,lab);break;
case 18: if("".equals(ca18.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 19: if("".equals(ca19.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 20: break;   
case 21: if("".equals(ca21.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 22: randomTJ(saldoJ,lab);break;
case 23: if("".equals(ca23.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 24: if("".equals(ca24.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 25: if("".equals(ca25.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 26: if("".equals(ca26.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 27: if("".equals(ca27.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 28: if("".equals(ca28.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;   
case 29: if("".equals(ca29.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;
case 31: if("".equals(ca31.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 32: if("".equals(ca32.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 33: randomTJ(saldoJ,lab);break;
case 34: if("".equals(ca34.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 35: if("".equals(ca35.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 36: randomTJ(saldoJ,lab);break;
case 37: if("".equals(ca37.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;
case 38:JOP("p1","pos38","comprar","pasar","/tarjetas/ShucosP.jpg",150,165);break;
case 39: if("".equals(ca39.estado)){
comprar(numeroCasilla,saldoJ,lab);}else{pagar();}break;

}
}     
}
