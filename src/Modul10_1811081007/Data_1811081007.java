/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081007;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public void salam() throws RemoteException {
        try {
            DatagramSocket socket_1007 = new DatagramSocket(9899);
            DatagramPacket packet_1007 = new DatagramPacket(new byte[256], 256);
            socket_1007.receive(packet_1007);
            
            String message = new String(packet_1007.getData(), 0, packet_1007.getLength());
            System.out.println("Assalamu'alaikum ["+message+"]");
        } catch (SocketException ex) {
            Logger.getLogger(Data_1811081007.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Data_1811081007.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
