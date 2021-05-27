/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081007;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author RyderPhantom
 */
public class Tugas1_InetAddress_1811081007 {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Get Host From IP Address");
        String ip = "172.253.118.106";
        String ip2 = "36.89.222.203";
        System.out.println("Hostname from IP "+ip+" "+InetAddress.getByName(ip).getHostName());
        System.out.println("Hostname from IP "+ip2+" "+InetAddress.getByName(ip2).getHostName());
        
        System.out.println("Get IP Address from Hostname");
        String host = "sia.poltekatipdg.ac.id";
        String host2 = "siakad.pnp.ac.id";
        System.out.println("IP Address dari Hostname "+host+" "+InetAddress.getByName(host).getHostAddress());
        System.out.println("IP Address dari Hostname "+host2+" "+InetAddress.getByName(host2).getHostAddress());
    }
}
