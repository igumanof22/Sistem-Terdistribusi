/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811081007;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author RyderPhantom
 */
public class SimplePacketSend_1811081007 {
    public static void main(String[] args) throws IOException, SocketException, UnknownHostException {
        DatagramSocket socket_1007 = new DatagramSocket();
        String message = "Hello World!!!";
        DatagramPacket packet_1007 = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 2000);
        socket_1007.send(packet_1007);
        socket_1007.close();
    }
}
