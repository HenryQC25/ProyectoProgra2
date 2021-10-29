
package contenido;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;


public class Casilla extends validacionC {
public Casilla(){};
    
public int contadorCarcel=0;
public boolean estado=false;
public String propietario;
public int i;
//metodo para agregar icono
  public Icon icono(String ruta, int ancho, int alto ){
    Icon im = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
    return im;
    }
 ///////////////////////////// 
   public int JOP(String enc,String mensaje,String op1,String op2,String op3,String ruta, int W,int H){
 
  
        Object [] opciones = {op1,op2,op3};
      i= JOptionPane.showOptionDialog(null,mensaje,enc,JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icono(ruta,W,H),opciones,opciones[0]);
  return i;
  }
  
  
  public int randomTJ(int saldo1,JLabel lab){
  int res=(int)(Math.random()*3)+1;
  switch(res){
      case 1: JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/pagar.jpg",160,165));saldo1+=50;lab.setText(String.valueOf("Q"+saldo1));break;
      case 2: JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/ShucosP.jpg",160,165));saldo1+=50;lab.setText(String.valueOf("Q"+saldo1));break;
      case 3: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/boloT.jpg",160,165));saldo1+=50;lab.setText(String.valueOf("Q"+saldo1));break;
      case 4: JOptionPane.showMessageDialog(null," " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));saldo1+=50;lab.setText(String.valueOf("Q"+saldo1));break;
   
  }
  return saldo1; //para que lea el metodo y el valor de devoluciòn sea verdadero y muestre el contenido del switch
  }
  
    

public void casillaOP(int numeroCasilla,int saldoJ,JLabel lab){
switch(numeroCasilla){
case 1:  JOP("p1","pos1","comprar","subastar","pasar","/tarjetas/safari.png",150,150);break;
case 2:  JOP("p1","pos2","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 3:  JOP("p1","pos3","comprar","subastar","pasar","/tarjetas/aurora.png",150,150);break;
case 4:  JOP("p1","pos4","comprar","subastar","pasar","/tarjetas/chonteM.jpg",150,150);break;    
case 5:  JOP("p1","pos5","comprar","subastar","pasar","/tarjetas/taxi.jpg",150,150);break;
case 6:  JOP("p1","pos6","comprar","subastar","pasar","/tarjetas/sanJose.png",150,150);break;
case 7:  /*JOP("p1","pos7","comprar","subastar","pasar","/tarjetas/cara1.png",150,150)*/randomTJ(saldoJ,lab);break;
case 8:  JOP("p1","pos8","comprar","subastar","pasar","/tarjetas/puertoQ.png",150,150);break;
case 9:  JOP("p1","pos9","comprar","subastar","pasar","/tarjetas/puertoB.png",150,150);break;
case 10: JOP("p1","pos10","comprar","subastar","pasar","/tarjetas/carcel.jpg",150,150);break;
case 11: JOP("p1","pos11","comprar","subastar","pasar","/tarjetas/antigua.png",150,150);break;
case 12: JOP("p1","pos12","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;    
case 13: JOP("p1","pos13","comprar","subastar","pasar","/tarjetas/mateoF.png",150,150);break;
case 14: JOP("p1","pos14","comprar","subastar","pasar","/tarjetas/castF.png",150,150);break;
case 15: JOP("p1","pos15","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 16: JOP("p1","pos16","comprar","subastar","pasar","/tarjetas/desp.png",150,150);break;
case 17: JOP("p1","pos17","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 18: JOP("p1","pos18","comprar","subastar","pasar","/tarjetas/cemaco.png",150,150);break;
case 19: JOP("p1","pos19","comprar","subastar","pasar","/tarjetas/megap.png",150,150);break;
case 20: JOP("p1","pos20","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;   
case 21: JOP("p1","pos21","comprar","subastar","pasar","/tarjetas/campero.png",150,150);break;
case 22: JOP("p1","pos22","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 23: JOP("p1","pos23","comprar","subastar","pasar","/tarjetas/india.png",150,150);break;
case 24: JOP("p1","pos24","comprar","subastar","pasar","/tarjetas/gallo.png",150,150);break;
case 25: JOP("p1","pos25","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 26: JOP("p1","pos26","comprar","subastar","pasar","/tarjetas/pradera.png",150,150);break;
case 27: JOP("p1","pos27","comprar","subastar","pasar","/tarjetas/miraF.png",150,150);break;
case 28: JOP("p1","pos28","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;   
case 29: JOP("p1","pos29","comprar","subastar","pasar","/tarjetas/tikal.png",150,150);break;
case 30: JOP("p1","pos30","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 31: JOP("p1","pos31","comprar","subastar","pasar","/tarjetas/petapa.png",150,150);break;
case 32: JOP("p1","pos32","comprar","subastar","pasar","/tarjetas/xetulul.png",150,150);break;
case 33: JOP("p1","pos33","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 34: JOP("p1","pos34","comprar","subastar","pasar","/tarjetas/xocomil.png",150,150);break;
case 35: JOP("p1","pos35","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 36: JOP("p1","pos36","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
case 37: JOP("p1","pos37","comprar","subastar","pasar","/tarjetas/atitlan.png",150,150);break;
case 38: JOP("p1","pos38","comprar","subastar","pasar","/tarjetas/ShucosP.png",150,150);break;
case 39: JOP("p1","pos39","comprar","subastar","pasar","/tarjetas/tikalRuina.png",150,150);break;
case 40: JOP("p1","pos40","comprar","subastar","pasar","/tarjetas/cara1.png",150,150);break;
}
}     
}
