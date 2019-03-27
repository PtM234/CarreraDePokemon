/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarreraDePokemon;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author tapia
 */
public class Pokemon extends JLabel implements Runnable{
    private JLabel lbl;
    private int distancia;
    
    public Pokemon(JLabel lab, int dist){
        this.lbl = lab;
        this.distancia = dist;
}

    public void run(){
        int e = lbl.getY();
        do{
          
            try {
                Random ran = new Random();
                e = e-ran.nextInt(10);
                lbl.setLocation(lbl.getX(), e);
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pokemon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(e<distancia);
        System.out.println("Llegue" + Thread.currentThread());
    }
    }
    

