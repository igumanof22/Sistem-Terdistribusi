/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_1811081007;

/**
 *
 * @author RyderPhantom
 */
public class WaitingThreadDead_1811081007 extends Thread{
    @Override
    public void run(){
        System.out.println("This thread feels a little ill.....");
        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread dying_1007 = new WaitingThreadDead_1811081007();
        dying_1007.start();
        
        System.out.println("Waiting for thread death");
        dying_1007.join();
        System.out.println("Thread has died");
    }
}
