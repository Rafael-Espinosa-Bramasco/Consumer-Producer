/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class ProducerThread extends Thread{
    
    StatusGUI statusREF;
    
    public ProducerThread(StatusGUI s){
        this.statusREF = s;
    }
    
    @Override
    public void run(){
        while(true){
            if(statusREF.isProducerAvalible()){
            }
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
