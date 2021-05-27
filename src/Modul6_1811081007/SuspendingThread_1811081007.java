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
public class SuspendingThread_1811081007 extends Thread{
    @Override
    public void run(){
        int count = 1;
        System.out.println("I can count. Watch me go!");
        for(;;){
            System.out.print(count++ +" ");
            try{
                Thread.sleep(500);
            } catch(InterruptedException ex){
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter_1107 = new SuspendingThread_1811081007();
        counter_1107.start();
        System.out.println("Press any enter to SUSPEND the thread counting");
        System.in.read();
        counter_1107.suspend();
        System.out.println("Press any enter to RESUME the thread counting");
        System.in.read();
        counter_1107.resume();
        System.out.println("Press any enter to STOP the thread counting");
        System.in.read();
        counter_1107.stop();
    }
}
