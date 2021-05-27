/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_1811081007;

import java.io.IOException;

/**
 *
 * @author RyderPhantom
 */
public class WaitNotify_1811081007 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread notificationThread_1007 = new WaitNotify_1811081007();
        
        notificationThread_1007.start();
        
        synchronized (notificationThread_1007){
            notificationThread_1007.wait();
        }
        
        System.out.println("The wait is Over");
    }

    @Override
    public void run() {
        System.out.println("hit Enter to stopwaiting thread");
        
        try{
            System.in.read();
        } catch(IOException ioe){
            
        }
        
        synchronized(this){
            this.notifyAll();
        }
    }
    
    
}
