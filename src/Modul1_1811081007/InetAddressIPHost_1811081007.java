/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081007;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author RyderPhantom
 */
public class InetAddressIPHost_1811081007 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("Get Host From IP Address");
        String ip = "172.253.118.106";
        System.out.println("Hostname from IP "+ip+" "+InetAddress.getByName(ip).getHostName());
        
        System.out.println("Get IP Addres from Hostname");
        String host = "www.facebook.com";
        System.out.println("IP Address dari Hostname "+host+" "+InetAddress.getByName(host).getHostAddress());
        
        System.out.println("Cek Koneksi");
        String IPPC = "172.26.29.119";
        InetAddress cek1811081007 = InetAddress.getByName(IPPC);
        if(cek1811081007.isReachable(2000)){
            System.out.println("Reply");
        } else{
            System.out.println("Timeout");
        }
    }
}
