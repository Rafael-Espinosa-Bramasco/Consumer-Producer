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
public class ConsumerThread extends Thread{
    
    StatusGUI statusREF;
    int lastIndex;
    
    public ConsumerThread(StatusGUI s){
        this.statusREF = s;
        this.lastIndex = 0;
    }
    
    @Override
    public void run(){
        while(true){
            if(statusREF.isConsumerAvalible()){
                statusREF.setConsumerStatus(2);
            }
            
            try {
                statusREF.setConsumerStatus(1);
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
