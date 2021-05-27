/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811081007;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author RyderPhantom
 */
public class PacketSendDemo_1811081007 {
    public static void main(String[] args) {
        System.out.println("Packet Send\n=============");
        String hostname = "localhost";
        
        try (DatagramSocket socket_1007 = new DatagramSocket()){
            System.out.println("Bound to local port "+socket_1007.getLocalPort());
            
            ByteArrayOutputStream bout_1007 = new ByteArrayOutputStream();
            PrintStream pout_1007 = new PrintStream(bout_1007);
            pout_1007.print("Hello World!!");
            
            byte[] barray_1007 = bout_1007.toByteArray();    
            DatagramPacket packet_1007 = new DatagramPacket(barray_1007, barray_1007.length);
            
            System.out.println("Looking up hostname "+hostname);
            InetAddress ia_1007 = InetAddress.getByName(hostname);
            System.out.println("Hostname received as "+ia_1007.getHostAddress());
            
            packet_1007.setAddress(ia_1007);
            packet_1007.setPort(2000);
            socket_1007.send(packet_1007);
            System.out.println("Packet sent!");
        } catch(SocketException se){
            System.err.println("Error Socket : "+se.getMessage());
        } catch(IOException e){
            System.err.println("Error : "+e.getMessage());
        }
    }
}
