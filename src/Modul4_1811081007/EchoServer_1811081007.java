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
public class EchoServer_1811081007 {
    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 4096;
    private DatagramSocket socket_1007;
    
    public EchoServer_1811081007(){
        try {
            socket_1007 = new DatagramSocket(SERVICE_PORT);
            System.out.println("Server active on port "+socket_1007.getLocalPort());
        } catch (Exception e) {
            System.err.println("Unable to bind port");
        }
    }
    
    public void serviceClients(){
        byte[] buffer = new byte[BUFSIZE];
        for (;;){
            try {
                DatagramPacket packet_1007 = new DatagramPacket(buffer, BUFSIZE);
                socket_1007.receive(packet_1007);
                String msg = "Packet received from "+packet_1007.getAddress()
                        +":"+packet_1007.getPort()
                        +" of length "+packet_1007.getLength();
                System.out.println(msg);
                socket_1007.send(packet_1007);
            } catch (IOException e) {
                System.err.println("Error : "+e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        EchoServer_1811081007 server_1007 = new EchoServer_1811081007();
        server_1007.serviceClients();
    }
}
