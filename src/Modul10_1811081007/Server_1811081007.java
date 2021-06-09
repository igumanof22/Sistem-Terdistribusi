/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081007;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author RyderPhantom
 */
public class Server_1811081007 {
    public static void main(String[] args) throws RemoteException, NotBoundException{
        Registry registry_1007 = LocateRegistry.createRegistry(1009);
        
        Data_1811081007 data_1007 = new Data_1811081007();
        registry_1007.rebind("data", data_1007);
        
        System.out.println("Server is running");
    }
}
