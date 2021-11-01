
package contenido;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class Casilla {




  Juego jf;




    
//metodo para agregar icono
  public Icon icono(String ruta, int ancho, int alto ){
    Icon im = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));
    return im;
    }
 ///////////////////////////// 
  
 /////////////////////////////////////////////////// 
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
 
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void comprar(int numeroCasilla,int saldoJ,JLabel lab){
      int c; String j = jf.jugadorTlb.getText(); 
     
      switch(numeroCasilla){
       
case 1:  c =  JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/safari.png",150,165));
       
int res1=0;
if(c==0){jf.Prt1.setText(j);JOptionPane.showMessageDialog(null, "comprado");
        res1=saldoJ-60;
        lab.setText(String.valueOf(res1));};saldoJ=res1;break;

case 2:  randomTJ(saldoJ,lab);break;

case 3:  c = JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/aurora.png",150,165));     
int res3=0;
if(c==0){jf.Prt3.setText(j);JOptionPane.showMessageDialog(null, "comprado");
 res3=saldoJ-60;
lab.setText(String.valueOf(res3));};saldoJ=res3;break;

case 4:  JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
       
case 5:   c= JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));        
int res5=0;
if(c==0){jf.Prt4.setText(j);JOptionPane.showMessageDialog(null, "comprado");
        res5=saldoJ-200;
        lab.setText(String.valueOf(res5));};saldoJ=res5;break;

case 6:   c=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/sanJose.png",150,165));   
int res6=0;
if(c==0){jf.Prt5.setText(j);JOptionPane.showMessageDialog(null, "comprado");
 res6=saldoJ-100;
lab.setText(String.valueOf(res6));};saldoJ=res6;break;

case 7:  randomTJ(saldoJ,lab);break;

case 8:   c=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/puertoQ.png",150,165));  
int res8=0;
if(c==0){jf.Prt8.setText(j);JOptionPane.showMessageDialog(null, "comprado");
 res8=saldoJ-100;
lab.setText(String.valueOf(res8));};saldoJ=res8;break;

case 9:   c=JOptionPane.showConfirmDialog(null,"pos1","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/puertoB.png",150,165));     
int res9=0;
if(c==0){jf.Prt9.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res9=saldoJ-120;
lab.setText(String.valueOf(res9));};saldoJ=res9;break;

case 10: break;

case 11: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/antigua.png",150,165));
int res11=0;    
if(c==0){jf.Prt11.setText(j);JOptionPane.showMessageDialog(null, "comprado");
      res11=saldoJ-140;
     lab.setText(String.valueOf(res11));};saldoJ=res11;break;

case 12: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/luz.jpg",150,165));
int res12=0;
if(c==0){jf.Prt12.setText(j);JOptionPane.showMessageDialog(null, "comprado");
 res12=saldoJ-200;
lab.setText(String.valueOf(res12));};saldoJ=res12;;break;
     
case 13: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/mateoF.png",150,165));
int res13=0;
if(c==0){jf.Prt13.setText(j);JOptionPane.showMessageDialog(null, "comprado");
 res13=saldoJ-140;
lab.setText(String.valueOf(res13));};saldoJ=res13;break;

case 14: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/castF.png",150,165));
int res14=0;     
if(c==0){jf.Prt14.setText(j);JOptionPane.showMessageDialog(null, "comprado");
     res14=saldoJ-160;
    lab.setText(String.valueOf(res14));}; saldoJ=res14;break;

case 15: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));
int res15=0;
if(c==0){jf.Prt15.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res15=saldoJ-200;
lab.setText(String.valueOf(res15));};saldoJ=res15;break;

case 16: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/desp.png",150,165));
int res16=0;
if(c==0){jf.Prt16.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res16=saldoJ-180;
lab.setText(String.valueOf(res16));};saldoJ=res16;break;

case 17: randomTJ(saldoJ,lab);break;

case 18: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/cemaco.png",150,165));
int res18=0;
if(c==0){jf.Prt18.setText(j);JOptionPane.showMessageDialog(null, "comprado");
 res18=saldoJ-180;
lab.setText(String.valueOf(res18));};saldoJ=res18;break;

case 19: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/megap.png",150,165));
int res19=0;
if(c==0){jf.Prt19.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res19=saldoJ-200;
lab.setText(String.valueOf(res19));};saldoJ=res19;break;

case 20: break;   

case 21: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/campero.png",150,165));
int res21=0;
if(c==0){jf.Prt21.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res21=saldoJ-220;
lab.setText(String.valueOf(res21));};saldoJ=res21;break;

case 22: randomTJ(saldoJ,lab);break;

case 23: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/india.png",150,165));
int res23=0;
if(c==0){jf.Prt23.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res19=saldoJ-220;
lab.setText(String.valueOf(res23));};saldoJ=res23;break;

case 24: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/gallo.png",150,165));
int res24=0;
if(c==0){jf.Prt24.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res24=saldoJ-240;
lab.setText(String.valueOf(res24));};saldoJ=res24;break;


case 25: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));
int res25=0;
if(c==0){jf.Prt25.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res25=saldoJ-200;
lab.setText(String.valueOf(res25));};saldoJ=res25;break;


case 26: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/pradera.png",150,165));
int res26=0;
if(c==0){jf.Prt26.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res26=saldoJ-260;
lab.setText(String.valueOf(res26));};saldoJ=res26;break;  

case 27: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/miraF.png",150,165));
int res27=0;
if(c==0){jf.Prt27.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res27=saldoJ-260;
lab.setText(String.valueOf(res27));};saldoJ=res27;break;

case 28: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/agua.jpg",150,165));
int res28=0;
if(c==0){jf.Prt28.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res28=saldoJ-200;
lab.setText(String.valueOf(res28));};saldoJ=res28;break;
 

case 29: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/tikal.png",150,165));
int res29=0;
if(c==0){jf.Prt29.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res29=saldoJ-200;
lab.setText(String.valueOf(res29));};saldoJ=res29;break;


case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;

case 31: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/petapa.png",150,165));
int res31=0;
if(c==0){jf.Prt31.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res31=saldoJ-300;
lab.setText(String.valueOf(res31));};saldoJ=res31;break;


case 32: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/xetulul.png",150,165));
int res32=0;
if(c==0){jf.Prt32.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res32=saldoJ-300;
lab.setText(String.valueOf(res32));};saldoJ=res32;break;


case 33: randomTJ(saldoJ,lab);break;

case 34: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/xocomil.png",150,165));
int res34=0;
if(c==0){jf.Prt34.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res34=saldoJ-320;
lab.setText(String.valueOf(res34));};saldoJ=res34;break;


case 35: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/taxi1.jpg",150,165));
int res35=0;
if(c==0){jf.Prt35.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res35=saldoJ-200;
lab.setText(String.valueOf(res35));};saldoJ=res35;break;


case 36: randomTJ(saldoJ,lab);break;

case 37: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/atitlan.png",150,165));
int res37=0;
if(c==0){jf.Prt37.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res37=saldoJ-350;
lab.setText(String.valueOf(res37));};saldoJ=res37;break;


case 38: JOptionPane.showMessageDialog(null,"pos11","xd",JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/ShucosP.jpg",150,165));;break;        

case 39: c=JOptionPane.showConfirmDialog(null,"pos11","xd",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE ,icono("/tarjetas/tikalRuina.png",150,165));
int res39=0;
if(c==0){jf.Prt39.setText(j);JOptionPane.showMessageDialog(null, "comprado");
res39=saldoJ-400;
lab.setText(String.valueOf(res39));};saldoJ=res39;break;


}
       }
  
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //Metodo para pagar
 /* public int verificarDeuda(String propietario,String deudor){
   int s1=Integer.parseInt(jf.saldo1.getText());int s2=Integer.parseInt(jf.saldo2.getText());
   int s3=Integer.parseInt(jf.saldo3.getText());int s4=Integer.parseInt(jf.saldo4.getText());
   int suma,resta;
   if("j1".equals(propietario) && "j2".equals(deudor)){
   suma=s1+2;resta=s2-2; jf.saldo1.setText(String.valueOf(suma));jf.saldo2.setText(String.valueOf(resta));
   }else if("j1".equals(propietario) && "j3".equals(deudor)){
   suma=s1+2;resta=s3-2; jf.saldo1.setText(String.valueOf(suma));jf.saldo3.setText(String.valueOf(resta));   
   }else if("j1".equals(propietario) && "j4".equals(deudor)){
   suma=s1+2;resta=s4-2; jf.saldo1.setText(String.valueOf(suma));jf.saldo4.setText(String.valueOf(resta));   
   }else 
       if("j2".equals(propietario) && "j1".equals(deudor)){
   suma=s2+2;resta=s1-2; jf.saldo2.setText(String.valueOf(suma));jf.saldo1.setText(String.valueOf(resta));
       
   }else if("j2".equals(propietario) && "j3".equals(deudor)){
   suma=s2+2;resta=s3-2; jf.saldo2.setText(String.valueOf(suma));jf.saldo3.setText(String.valueOf(resta));
   
   }else if("j2".equals(propietario) && "j4".equals(deudor)){
   suma=s2+2;resta=s4-2; jf.saldo2.setText(String.valueOf(suma));jf.saldo4.setText(String.valueOf(resta));
       
   }else
       if("j3".equals(propietario) && "j1".equals(deudor)){
   suma=s3+2;resta=s1-2; jf.saldo3.setText(String.valueOf(suma));jf.saldo1.setText(String.valueOf(resta));
       
   }else if("j3".equals(propietario) && "j2".equals(deudor)){
   suma=s3+2;resta=s2-2; jf.saldo3.setText(String.valueOf(suma));jf.saldo2.setText(String.valueOf(resta));
   
   }else if("j3".equals(propietario) && "j4".equals(deudor)){
   suma=s3+2;resta=s4-2; jf.saldo3.setText(String.valueOf(suma));jf.saldo4.setText(String.valueOf(resta));
       
   }else
       if("j4".equals(propietario) && "j1".equals(deudor)){
   suma=s4+2;resta=s1-2; jf.saldo4.setText(String.valueOf(suma));jf.saldo1.setText(String.valueOf(resta));
       
   }else if("j4".equals(propietario) && "j2".equals(deudor)){
   suma=s4+2;resta=s2-2; jf.saldo4.setText(String.valueOf(suma));jf.saldo2.setText(String.valueOf(resta));
   
   }else if("j4".equals(propietario) && "j3".equals(deudor)){
   suma=s4+2;resta=s3-2; jf.saldo4.setText(String.valueOf(suma));jf.saldo3.setText(String.valueOf(resta));
   }
   return 1;
  }*/
  ////////////////////////////////////////////////////////////////
    public void pagar(int numeroCasilla,int saldoJ,JLabel lab){
   String j = jf.jugadorTlb.getText();
switch(numeroCasilla){
    
case 1:      
 String p1=jf.Prt1.getText();
if(!p1.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/safari.png",160,165));JOptionPane.showMessageDialog(null, "págueme >:v");
//verificarDeuda(p1,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;
        
case 2:  randomTJ(saldoJ,lab);break;

case 3:      
String p3=jf.Prt3.getText();
if(!p3.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/aurora.png",160,165)); 
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p3,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 4:  JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
       
case 5:        
String p4=jf.Prt4.getText();
if(!p4.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/taxi1.jpg",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p4,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 6:      
String p5=jf.Prt5.getText();
if(!p5.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/sanJose.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p5,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 7:  randomTJ(saldoJ,lab);break;

case 8:   
String p8=jf.Prt8.getText();
if(!p8.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/puertoQ.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p8,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 9:      
String p9=jf.Prt9.getText();
if(!p9.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/puertoB.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p9,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 10: break;

case 11: 
String p11=jf.Prt11.getText();
if(!p11.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/antigua.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p11,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 12:
String p12=jf.Prt12.getText();
if(!p12.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/luz.jpg",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p12,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;
     
case 13: 
String p13=jf.Prt13.getText();
if(!p13.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/mateoF.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p13,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 14:
String p14=jf.Prt14.getText();
if(!p14.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/castF.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p14,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 15: 
String p15=jf.Prt15.getText();
if(!p15.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/taxi1.jpg",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p15,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 16: 
String p16=jf.Prt16.getText();
if(!p16.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/desp.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p16,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 17: randomTJ(saldoJ,lab);break;

case 18:
String p18=jf.Prt18.getText();
if(!p18.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/cemaco.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p18,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 19:
String p19=jf.Prt19.getText();
if(!p19.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/megap.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p19,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 20: break;   

case 21: 
String p21=jf.Prt21.getText();
if(!p21.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/campero.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p21,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 22: randomTJ(saldoJ,lab);break;

case 23:
String p23=jf.Prt23.getText();
if(!p23.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/india.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p23,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 24:
String p24=jf.Prt24.getText();
if(!p24.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/gallo.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p24,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 25: 
String p25=jf.Prt25.getText();
if(!p25.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/taxi1.jpg",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p25,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 26: 
  String p26=jf.Prt26.getText();
if(!p26.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/pradera.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p26,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 27: 
String p27=jf.Prt27.getText();
if(!p27.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/miraF.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p27,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 28: 
String p28=jf.Prt28.getText();
if(!p28.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/agua.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p28,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 29: 
String p29=jf.Prt29.getText();
if(!p29.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/tikal.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p29,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;

case 31:
String p31=jf.Prt31.getText();
if(!p31.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/petapa.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
    //  verificarDeuda(p31,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 32: 
 String p32=jf.Prt32.getText();
if(!p32.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/xetulul.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p32,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 33: randomTJ(saldoJ,lab);break;

case 34: 
String p34=jf.Prt34.getText();
if(!p34.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/xocomil.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p34,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 35: 
String p35=jf.Prt35.getText();
if(!p35.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/taxi1.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
      //verificarDeuda(p35,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 36: randomTJ(saldoJ,lab);break;

case 37: 
String p37=jf.Prt37.getText();
if(!p37.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/atitlan.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p37,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

case 38: JOptionPane.showMessageDialog(null,"pos11","xd",JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/ShucosP.jpg",150,165));        

case 39: 
String p39=jf.Prt39.getText();
if(!p39.equals(j)){
    JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/tikalRuina.png",160,165));
      JOptionPane.showMessageDialog(null, "págueme >:v");
     // verificarDeuda(p39,j);
}else{
JOptionPane.showMessageDialog(null,"  " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/propietario.jpg",160,165)); 
};break;

}
      //  JOptionPane.showMessageDialog(null, "Paga");
    }
  //////////////////////////////////////////
    

public void casillaOP(int numeroCasilla,int saldoJ,JLabel lab){
switch(numeroCasilla){
case 1:  if(".".equals(jf.Prt1.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt1.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 2:  randomTJ(saldoJ,lab);break;
case 3:  if(".".equals(jf.Prt3.getText())){
comprar(numeroCasilla,saldoJ,lab);}else  if(!".".equals(jf.Prt3.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 4:   JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/chonteM.jpg",160,165));break;
case 5:   if(".".equals(jf.Prt4.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt4.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 6:  if(".".equals(jf.Prt5.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt5.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 7:  randomTJ(saldoJ,lab);break; 
case 8:  if(".".equals(jf.Prt8.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt8.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 9:  if(".".equals(jf.Prt9.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt9.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 10: break;
case 11: if(".".equals(jf.Prt11.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt11.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 12: if(".".equals(jf.Prt12.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt12.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 13:if(".".equals(jf.Prt13.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt13.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 14: if(".".equals(jf.Prt14.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt14.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 15: if(".".equals(jf.Prt15.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt15.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 16: if(".".equals(jf.Prt16.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt16.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 17: randomTJ(saldoJ,lab);break;
case 18: if(".".equals(jf.Prt18.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt18.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 19: if(".".equals(jf.Prt19.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt19.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 20: break;   
case 21: if(".".equals(jf.Prt21.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt21.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 22: randomTJ(saldoJ,lab);break;
case 23: if(".".equals(jf.Prt23.getText())){ 
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt23.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 24: if(".".equals(jf.Prt24.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt24.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 25: if(".".equals(jf.Prt25.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt25.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 26: if(".".equals(jf.Prt26.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt26.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 27: if(".".equals(jf.Prt27.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt27.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 28: if(".".equals(jf.Prt28.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt28.getText())){pagar(numeroCasilla,saldoJ,lab);}break;   
case 29: if(".".equals(jf.Prt29.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt29.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 30: JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/carcel.jpg",160,165));break;
case 31: if(".".equals(jf.Prt31.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt31.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 32: if(".".equals(jf.Prt32.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt32.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 33: randomTJ(saldoJ,lab);break;
case 34: if(".".equals(jf.Prt34.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt34.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 35: if(".".equals(jf.Prt35.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt35.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 36: randomTJ(saldoJ,lab);break;
case 37: if(".".equals(jf.Prt37.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt37.getText())){pagar(numeroCasilla,saldoJ,lab);}break;
case 38:JOptionPane.showMessageDialog(null," Pagas Q50 de multa " , "xd", JOptionPane.INFORMATION_MESSAGE,icono("/tarjetas/ShucosP.jpg",160,165));break;
case 39: if(".".equals(jf.Prt39.getText())){
comprar(numeroCasilla,saldoJ,lab);}else if(!".".equals(jf.Prt39.getText())){pagar(numeroCasilla,saldoJ,lab);}break;

}
}     
}
