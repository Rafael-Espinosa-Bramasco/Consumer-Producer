/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class ConsumerThread extends Thread{
    
    StatusGUI statusREF;
    int index;
    
    public ConsumerThread(StatusGUI s){
        this.statusREF = s;
        this.index = 0;
    }
    
    @Override
    public void run(){
        int ranNum;
        int actualChanges;
        
        Random rand = new Random();
        
        while(true){
            try {
                statusREF.addConsumerMessage("Attempting to work");
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(statusREF.isConsumerAvalible()){
                statusREF.setConsumerStatus(2);
                ranNum = rand.nextInt(8) + 3;
                
                actualChanges = 0;
                
                for(int i = 0 ; i < ranNum && statusREF.getContinerSize() > 0 ; i++){
                    if(index == 35){
                        index = 0;
                    }
                    
                    statusREF.modCont(index, '*');
                    index++;
                    actualChanges++;
                    statusREF.setContinerSize(statusREF.getContinerSize()-1);
                    
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                statusREF.addContainerMessage(String.valueOf(actualChanges).concat(" elements consumed!"));
                statusREF.showanimationConsumer(actualChanges);
                try {
                    Thread.sleep(250*actualChanges);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                statusREF.setStatus(0);
                
                try {
                    statusREF.setConsumerStatus(0);
                    statusREF.addSystemMessage("Free (No people using the container)");
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ConsumerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                continue;
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
