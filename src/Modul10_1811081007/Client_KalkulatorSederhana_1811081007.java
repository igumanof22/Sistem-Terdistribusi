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
//Running 2x baru bisa jalan
public class Client_KalkulatorSederhana_1811081007 {
    //Running 2x baru bisa jalan
    public static void main(String[] args) throws RemoteException, SocketException, NotBoundException, MalformedURLException, IOException {
        DataInterface_1811081007 data_1007 = (DataInterface_1811081007) Naming.lookup("rmi://localhost:1009/data");
        System.out.println("Client is Connect to Server");
        
        Scanner in = new Scanner(System.in);
        System.out.println("+ - / x");
        System.out.print("Input (ex. 2 + 2) : ");
        String message = in.nextLine();
        DatagramSocket socket_1007 = new DatagramSocket();
        DatagramPacket packet_1007 = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 1009);
        socket_1007.send(packet_1007);
        socket_1007.close();
        
        data_1007.KalkulatorSederhana();
        
        System.out.println("Finish");
    }
}
