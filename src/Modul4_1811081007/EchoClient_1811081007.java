/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_1811081007;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author RyderPhantom
 */
public class EchoClient_1811081007 {
    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 256;
    
    public static void main(String[] args) throws SocketException, IOException{
        String hostname = "localhost";
        InetAddress ia_1007 = InetAddress.getByName(hostname);
        DatagramSocket socket_1007 = new DatagramSocket();
        socket_1007.setSoTimeout(2000);
        
        BufferedReader br_1007 = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            System.out.println("Write your message here...");
            ByteArrayOutputStream bout_1007 = new ByteArrayOutputStream();
            PrintStream pout_1007 = new PrintStream(bout_1007);
            pout_1007.print(br_1007.readLine());
            
            byte[] barray_1007 = bout_1007.toByteArray();
            DatagramPacket packet_1007 = new DatagramPacket(barray_1007, barray_1007.length, ia_1007, SERVICE_PORT);
            System.out.println("Sending packet to "+hostname);
            socket_1007.send(packet_1007);
            
            System.out.println("Waiting for packet....");
            byte[] recbuf_1007 = new byte[BUFSIZE];
            DatagramPacket receivePacket_1007 = new DatagramPacket(recbuf_1007, BUFSIZE);
            
            boolean timeout = false;
            try{
                socket_1007.receive(receivePacket_1007);
            } catch(InterruptedIOException InEx){
                timeout = true;
            }
            
            if (!timeout) {
                System.out.println("Packet Received!");
                System.out.println("Details : "+receivePacket_1007.getAddress());
                ByteArrayInputStream bin_1007 = new ByteArrayInputStream(receivePacket_1007.getData(), 0, receivePacket_1007.getLength());
                BufferedReader br2_1007 = new BufferedReader(new InputStreamReader(bin_1007));
                System.out.println(br2_1007.readLine());
            } else{
                System.out.println("Packet lost!");
            }
        }
    }
}
