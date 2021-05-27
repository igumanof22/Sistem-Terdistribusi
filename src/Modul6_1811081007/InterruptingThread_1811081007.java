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
public class InterruptingThread_1811081007 extends Thread{
    @Override
    public void run(){
        System.out.println("I feel sleppy, wake me up in eight hours");
        try{
            Thread.sleep(1000 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
        } catch(InterruptedException ex){
            System.out.println("Just five minutes more......");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread sleepy_1007 = new InterruptingThread_1811081007();
        sleepy_1007.start();
        
        System.out.println("Press enter to interrupt the thread");
        System.in.read();
        
        sleepy_1007.interrupt();
    }
}
