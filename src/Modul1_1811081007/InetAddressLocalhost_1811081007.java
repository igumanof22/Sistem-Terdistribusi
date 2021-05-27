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
public class InetAddressLocalhost_1811081007 {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Localhost");
        InetAddress localhost1811081007 = InetAddress.getLocalHost();
        System.out.println("Name "+localhost1811081007.getHostName());
        System.out.println("IP Address "+localhost1811081007.getHostAddress());
        System.out.println(localhost1811081007);
    }
}
