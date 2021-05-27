/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081007;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class Tugas2_InetAddress_1811081007 {
    public static void main(String[] args) throws UnknownHostException {
        String host;
        
        Scanner input = new Scanner(System.in);
   
        System.out.println("Cek IP Address dari Hostname");
        System.out.print("Hostname : ");
        host = input.nextLine();
        System.out.println("IP Address dari Hostname "+host+" "+InetAddress.getByName(host).getHostAddress());
        
    }
    
//    public void Menu() throws UnknownHostException{
//        String ip, host;
//        int pilih;
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Pilih menu berikut");
//        System.out.println("1. Hostname -> IP Address");
//        System.out.println("2. IP Address -> Hostname");
//        System.out.print("Pilihan : ");
//        pilih = input.nextInt();
//        input.nextLine();
//        
//        switch (pilih) {
//            case 1:
//                System.out.println("Cek Hostname dari IP Address");
//                System.out.print("IP Address : ");
//                ip = input.nextLine();
//                System.out.println("Hostname dari IP Address "+ip+" "+InetAddress.getByName(ip).getHostAddress());
//                break;
//            case 2:
//                System.out.println("Cek IP Address dari Hostname");
//                System.out.print("Hostname : ");
//                host = input.nextLine();
//                System.out.println("IP Address dari Hostname "+host+" "+InetAddress.getByName(host).getHostAddress());
//                break;
//            default:
//                System.out.println("Tidak Ada Menunya boss");
//                break;
//        }
//    }
}
