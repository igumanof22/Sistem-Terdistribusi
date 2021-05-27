/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_1811081007;

/**
 *
 * @author RyderPhantom
 */
public class CountingThread_1811081007 implements Runnable{
    Counter_1811081007 myCounter;
    int countAmount;

    public CountingThread_1811081007(Counter_1811081007 counter, int amount) {
        myCounter = counter;
        countAmount = amount;
    }

    @Override
    public void run() {
        for (int i = 1; i < countAmount; i++) {
            myCounter.increaseCount();
            System.out.print(" "+myCounter.getCount());
        }
    }    
    
    public static void main(String[] args) throws InterruptedException {
        Counter_1811081007 c__1007 = new Counter_1811081007();
        Runnable runner_1007 = new CountingThread_1811081007(c__1007, 10);
        
        System.out.println("Starting counting threads");
        
        Thread t1__1007 = new Thread(runner_1007);
        Thread t2__1007 = new Thread(runner_1007);
        Thread t3__1007 = new Thread(runner_1007);
        
        t1__1007.start();
        t2__1007.start();
        t3__1007.start();
        
        t1__1007.join();
        t2__1007.join();
        t3__1007.join();
        
        System.out.println();
        System.out.println("Counter value is "+ c__1007.getCount());
    }
}
