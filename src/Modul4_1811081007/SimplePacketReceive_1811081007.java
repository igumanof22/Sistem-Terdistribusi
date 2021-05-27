/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811081007;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author RyderPhantom
 */
public class SimplePacketReceive_1811081007 {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket_1007 = new DatagramSocket(2000);
        DatagramPacket packet_1007 = new DatagramPacket(new byte[256], 256);
        socket_1007.receive(packet_1007);
        
        String message = new String(packet_1007.getData(), 0, packet_1007.getLength());
        System.out.println(message);
    }
}
