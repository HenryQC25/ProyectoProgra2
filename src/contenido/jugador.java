
package contenido;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import contenido.Juego;
 public class jugador extends Thread {
 
 private final JLabel etiq;
 private final Juego j;
  
 public jugador(JLabel etiq, Juego lab){
 this.etiq = etiq;
 this.j = lab;
 }
 
 
 public void avanzar(){

     
 
 for(int i=j.getlab1().getLocation().x ;i>j.getcasillaC().getLocation().x;i--){
     try {
        System.out.println(","+i);
          j.getlab1().setLocation(i, j.getlab1().getLocation().y);
         Thread.sleep(50);
     } catch (InterruptedException ex) {
         Logger.getLogger(jugador.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     
     
      }
 
 
 
 
/* while(true){
 try{
     sleep((int)(Math.random()*1000));
     lab1=lab.getlab1().getLocation().x;
     if(lab1>lab.getcasillaC().getLocation().x){
     etiq.setLocation(etiq.getLocation().x-20,etiq.getLocation().y);
     lab.repaint();
     
     }else{
     break;
     }
 }catch(InterruptedException e){
 System.out.println(e);
 }
   }*/
     }
     
 
}
