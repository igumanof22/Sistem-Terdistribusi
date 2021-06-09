/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_1811081007;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class Client_asSalam_1811081007 {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException, SocketException, IOException {
        DataInterface_1811081007 data_1007 = (DataInterface_1811081007) Naming.lookup("rmi://localhost:1009/data");
        System.out.println("Client is Connect to Server");
        
        data_1007.salam();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Nama Anda : ");
        String message = in.nextLine();
        DatagramSocket socket_1007 = new DatagramSocket();
        DatagramPacket packet_1007 = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 9899);
        socket_1007.send(packet_1007);
        socket_1007.close();
        
        System.out.println("Finish");
    }
}
