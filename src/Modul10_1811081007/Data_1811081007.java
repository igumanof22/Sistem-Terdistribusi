/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081007;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author RyderPhantom
 */
public class Data_1811081007 extends UnicastRemoteObject implements DataInterface_1811081007{

    public Data_1811081007() throws RemoteException{
    }
    
    @Override
    public void FirstMethod() throws RemoteException {
        System.out.println("Running First Method");
    }

    @Override
    public void SecondMethod() throws RemoteException {
        System.out.println("Running Second Method");
    }
    
}
