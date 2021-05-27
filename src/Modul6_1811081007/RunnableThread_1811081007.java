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
public class RunnableThread_1811081007 implements  Runnable{

    @Override
    public void run() {
        System.out.println("I am an instance of the java.lang.Runnable interface");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable object");
        
        Runnable run = (Runnable) new RunnableThread_1811081007();
        
        System.out.println("Creating first thread");
        Thread t1_1007 = new Thread(run);
        
        System.out.println("Creating second thread");
        Thread t2_1007 = new Thread(run);
        
        System.out.println("Starting both threads");
        t1_1007.start();
        t2_1007.start();
    }
}
