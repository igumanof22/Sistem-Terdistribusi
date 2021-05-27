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
public class Counter_1811081007 {
    private int countValue_1007;

    public Counter_1811081007() {
        countValue_1007 = 0;
    }

    public Counter_1811081007(int start) {
        countValue_1007 = start;
    }
    
    public synchronized void increaseCount(){
        int count = countValue_1007;
        
        try{
            Thread.sleep(5);
        } catch (InterruptedException ie){
            
        }
        
        count = count + 1;
        countValue_1007 = count;
    }
    
    public synchronized int getCount(){
        return countValue_1007;
    }
}
