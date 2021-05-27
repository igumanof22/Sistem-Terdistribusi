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
public class ExtendThread_1811081007 extends Thread{
    int threadNumber;
    
    public ExtendThread_1811081007(int num){
        threadNumber = num;
    }
    
    @Override
    public void run(){
        System.out.println("I'm thread number : "+threadNumber);
        try{
            Thread.sleep(5000);
        } catch(InterruptedException ex){
            System.out.println(threadNumber+" is finished");
        }
        System.out.println(threadNumber+" is finished!");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating thread 1");
        Thread t1_1007 = new ExtendThread_1811081007(1);
        
        System.out.println("Creating thread 2");
        Thread t2_1007 = new ExtendThread_1811081007(2);
        
        t1_1007.start();
        t2_1007.start();
    }
}
