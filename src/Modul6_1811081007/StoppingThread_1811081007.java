/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_1811081007;

import java.io.IOException;

/**
 *
 * @author RyderPhantom
 */
public class StoppingThread_1811081007 extends Thread{
    @Override
    public void run(){
        int count = 1;
        System.out.println("I can count. Watch me go!!");
        for(;;){
            System.out.print(count++ + " ");
            try{
                Thread.sleep(500);
            } catch(InterruptedException ex){
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter_1007 = new StoppingThread_1811081007();
        counter_1007.start();
        
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        counter_1007.stop();
    }
}
