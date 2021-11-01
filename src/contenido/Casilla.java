
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
case 1:JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/pagar.jpg",160,165));saldo1-=50;lab.setText(String.valueOf(saldo1));break;
case 2: JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/robo.jpg",160,165));saldo1-=20;lab.setText(String.valueOf(saldo1));break;
case 3: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/boloT.jpg",160,165));saldo1+=50;lab.setText(String.valueOf(saldo1));break;
case 4: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/cumpleaños.jpg",160,165));saldo1+=10;lab.setText(String.valueOf(saldo1));break;
case 5: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/error banco.jpg",160,165));saldo1+=100;lab.setText(String.valueOf(saldo1));break;
case 6: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/pase gasto.jpg",160,165));saldo1-=100;lab.setText(String.valueOf(saldo1));break;   
  }
  return 1; //para que lea el metodo y el valor de devoluciòn sea verdadero y muestre el contenido del switch
  }
  //////////////////////////////////////////
 
  
  public void comprar(int numeroCasilla,int saldoJ,JLabel lab){
      int c;
     
      switch(numeroCasilla){
case 1:  c =  JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/safari.png",150,165));
int res1=0;       
if(c==0){jf.Prt1.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
        res1=saldoJ-60;
        lab.setText(String.valueOf(res1));};saldoJ=res1;break;

case 2:  randomTJ(saldoJ,lab);break;

case 3:  c = JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/aurora.png",150,165));     
int res3=0;
if(c==0){jf.Prt3.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
 res3=saldoJ-60;
lab.setText(String.valueOf(res3));};saldoJ=res3;break;

case 4:  JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
       
case 5:   c= JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));        
int res5=0;
if(c==0){jf.Prt4.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
        res5=saldoJ-200;
        lab.setText(String.valueOf(res5));};saldoJ=res5;break;

case 6:   c=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/sanJose.png",150,165));   
int res6=0;
if(c==0){jf.Prt5.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
 res6=saldoJ-100;
lab.setText(String.valueOf(res6));};saldoJ=res6;break;

case 7:  randomTJ(saldoJ,lab);break;

case 8:   c=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/puertoQ.png",150,165));  
int res8=0;
if(c==0){jf.Prt8.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
 res8=saldoJ-100;
lab.setText(String.valueOf(res8));};saldoJ=res8;break;

case 9:   c=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/puertoB.png",150,165));     
int res9=0;
if(c==0){jf.Prt9.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
res9=saldoJ-120;
lab.setText(String.valueOf(res9));};saldoJ=res9;break;

case 10: break;

case 11: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/antigua.png",150,165));
int res11=0;    
if(c==0){jf.Prt11.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
      res11=saldoJ-140;
     lab.setText(String.valueOf(res11));};saldoJ=res11;break;

case 12: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/luz.jpg",150,165));
int res12=0;
if(c==0){jf.Prt12.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
 res12=saldoJ-200;
lab.setText(String.valueOf(res12));};saldoJ=res12;;break;
     

case 13: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/mateoF.png",150,165));
int res13=0;
if(c==0){jf.Prt13.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
 res13=saldoJ-140;
lab.setText(String.valueOf(res13));};saldoJ=res13;break;

case 14: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/castF.png",150,165));
int res14=0;     
if(c==0){jf.Prt14.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
     res14=saldoJ-160;
    lab.setText(String.valueOf(res14));}; saldoJ=res14;break;
//
case 15: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));
int res15=0;
if(c==0){jf.Prt15.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
res15=saldoJ-200;
lab.setText(String.valueOf(res15));};saldoJ=res15;break;

case 16: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/desp.png",150,165));
int res16=0;
if(c==0){jf.Prt16.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
res16=saldoJ-180;
lab.setText(String.valueOf(res16));};saldoJ=res16;break;

case 17: randomTJ(saldoJ,lab);break;

case 18: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/cemaco.png",150,165));
int res18=0;
if(c==0){jf.Prt18.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
 res18=saldoJ-180;
lab.setText(String.valueOf(res18));};saldoJ=res18;break;

case 19: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/megap.png",150,165));
int res19=0;
if(c==0){jf.Prt19.setText("j1");JOptionPane.showMessageDialog(null, "comprado");
res19=saldoJ-200;
lab.setText(String.valueOf(res19));};saldoJ=res19;break;

case 20: break;   

case 21: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/campero.png",150,165));
if(c==0){jf.Prt21.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-220;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 22: randomTJ(saldoJ,lab);break;

case 23: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/india.png",150,165));
if(c==0){jf.Prt23.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-220;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 24: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/gallo.png",150,165));
if(c==0){jf.Prt24.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-240;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 25: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));
if(c==0){jf.Prt25.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-200;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 26: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/pradera.png",150,165));
  if(c==0){jf.Prt26.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-260;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 27: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/miraF.png",150,165));
if(c==0){jf.Prt27.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-260;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 28: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/agua.jpg",150,165));
if(c==0){jf.Prt28.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-200;lab.setText(String.valueOf("Q"+saldoJ));};break;  

case 29: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/tikal.png",150,165));
if(c==0){jf.Prt19.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-280;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;

case 31: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/petapa.png",150,165));
if(c==0){jf.Prt31.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-300;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 32: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/xetulul.png",150,165));
 if(c==0){jf.Prt32.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-300;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 33: randomTJ(saldoJ,lab);break;

case 34: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/xocomil.png",150,165));
if(c==0){jf.Prt34.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-320;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 35: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));
if(c==0){jf.Prt35.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-200;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 36: randomTJ(saldoJ,lab);break;

case 37: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/atitlan.png",150,165));
if(c==0){jf.Prt37.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-350;lab.setText(String.valueOf("Q"+saldoJ));};break;

case 38: JOptionPane.showMessageDialog(null,"pos11","xd",JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/ShucosP.jpg",150,165));        

case 39: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/tikalRuina.png",150,165));
if(c==0){jf.Prt39.setText("j1");JOptionPane.showMessageDialog(null, "comprado");saldoJ=saldoJ-400;lab.setText(String.valueOf("Q"+saldoJ));};break;

}
       }
    public void pagar(int numeroCasilla,int saldoJ,JLabel lab){
    JOptionPane.showMessageDialog(null, "Paga");
    }
  ////////////////////////
    

public void casillaOP(int numeroCasilla,int saldoJ,JLabel lab){
switch(numeroCasilla){
case 1:  if(".".equals(jf.Prt1.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.Prt1.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 2:  randomTJ(saldoJ,lab);break;
case 3:  if(".".equals(jf.Prt3.getText())){
comprar(numeroCasilla,saldoJ,lab);}else  if(!"".equals(jf.Prt3.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 4:   JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
case 5:   if(".".equals(jf.Prt4.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.Prt4.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 6:  if(".".equals(jf.Prt5.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.Prt5.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 7:  randomTJ(saldoJ,lab);break; 
case 8:  if(".".equals(jf.Prt8.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.Prt8.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 9:  if(".".equals(jf.Prt9.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!"".equals(jf.Prt9.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 10: break;
case 11: if(".".equals(jf.Prt11.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 12: if(".".equals(jf.Prt12.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;  
case 13:if(".".equals(jf.Prt13.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 14: if(".".equals(jf.Prt14.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 15: if(".".equals(jf.Prt15.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 16: if(".".equals(jf.Prt16.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 17: randomTJ(saldoJ,lab);break;
case 18: if(".".equals(jf.Prt18.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 19: if(".".equals(jf.Prt19.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 20: break;   
case 21: if(".".equals(jf.Prt21.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 22: randomTJ(saldoJ,lab);break;
case 23: if(".".equals(jf.Prt23.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 24: if(".".equals(jf.Prt24.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 25: if(".".equals(jf.Prt25.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 26: if(".".equals(jf.Prt26.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 27: if(".".equals(jf.Prt27.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 28: if(".".equals(jf.Prt28.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;   
case 29: if(".".equals(jf.Prt29.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;
case 31: if(".".equals(jf.Prt31.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 32: if(".".equals(jf.Prt32.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 33: randomTJ(saldoJ,lab);break;
case 34: if(".".equals(jf.Prt34.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 35: if(".".equals(jf.Prt35.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 36: randomTJ(saldoJ,lab);break;
case 37: if(".".equals(jf.Prt37.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;
case 38:JOP("p1","pos38","","pasar","/tarjetas/ShucosP.jpg",150,165);break;
case 39: if(".".equals(jf.Prt39.getText())){
comprar(numeroCasilla,saldoJ,lab);}else{pagar(numeroCasilla,saldoJ,lab);}break;

}
}     
}
