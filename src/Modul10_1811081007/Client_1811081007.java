/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081007;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author RyderPhantom
 */
public class Client_1811081007 {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        DataInterface_1811081007 data_1007 = (DataInterface_1811081007) Naming.lookup("rmi://localhost:1009/data");
        System.out.println("Client is Connect to Server");
        
        data_1007.FirstMethod();
        data_1007.SecondMethod();
        
        System.out.println("Finish");
    }
}
