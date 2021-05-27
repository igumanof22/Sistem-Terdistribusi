/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811081007;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author RyderPhantom
 */
public class PacketReceiveDemo_1811081007 {
    public static void main(String[] args) {
        System.out.println("Packet Receive\n=============");
        System.out.println("Binding to local port 2000");
        
        try (DatagramSocket socket_1007 = new DatagramSocket(2000)){
            System.out.println("Bound to local port "+socket_1007.getLocalPort());
            
            DatagramPacket packet_1007 = new DatagramPacket(new byte[256], 256);
            socket_1007.receive(packet_1007);
            System.out.println("Packet Received!");
            
            InetAddress ia_1007 = packet_1007.getAddress();
            System.out.println("Sent by\t\t: "+ia_1007.getHostAddress());
            System.out.println("Sent from\t: "+packet_1007.getPort());
            
            ByteArrayInputStream bin_1007 = new ByteArrayInputStream(packet_1007.getData());
            BufferedReader br_1007 = new BufferedReader(new InputStreamReader(bin_1007));
            System.out.print("Message\t\t: "+br_1007.readLine());
            System.out.println("");
        } catch (IOException e) {
            System.err.println("Error : "+e.getMessage());
        }
    }
}
