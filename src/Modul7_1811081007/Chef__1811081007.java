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
public class Chef__1811081007 implements Runnable{
    Counter_1811081007 myCounter_1007;
    int countAmount_1007;

    public Chef__1811081007(Counter_1811081007 myCounter_1007, int countAmount_1007) {
        this.myCounter_1007 = myCounter_1007;
        this.countAmount_1007 = countAmount_1007;
    }

    @Override
    public void run() {
        for (int i = 1; i < countAmount_1007; i++) {
            myCounter_1007.increaseCount();
            System.out.println("Pesanan "+myCounter_1007.getCount()+" telah selesai");
        }
    }
    
    
}
