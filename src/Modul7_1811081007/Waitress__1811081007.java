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
public class Waitress__1811081007 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        int count_1007 = 0;
        
        Thread notifyThread_1007 = new Waitress__1811081007();
        notifyThread_1007.start();
        
        Counter_1811081007 myCounter_1007= new Counter_1811081007();
        
        Runnable runner_1007 = new Chef__1811081007(myCounter_1007, 10);
        Thread t1 = new Thread(runner_1007);
        t1.start();
        System.out.print("");
        t1.join();
        System.out.println("");
        System.out.println("Total Pesanan "+myCounter_1007.getCount());
        System.out.println("-----------------------------");
        System.out.println("Pelayan mengantarkan Makanan (Tekan Enter Jika Pesanan telah Selesai)");
        
        synchronized(notifyThread_1007){
            notifyThread_1007.wait();
        }
        
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Pesanan Selesai");
    }

    @Override
    public void run() {
        System.out.println("Chef sedang membuat makanan sesuai pesanan");
        System.out.println("------------------------------------------");
        try{
            System.in.read();
        } catch(IOException ioe){
            
        }
        
        synchronized(this){
            this.notifyAll();
        }
    }
    
    
}
