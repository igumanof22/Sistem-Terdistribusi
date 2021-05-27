/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1_1811081007;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class TugasRumah1_CekKoneksi_1811081007{
    public static void main(String[] args) throws UnknownHostException, IOException{
        String oktet3;
        int oktet1;
      
        Scanner input = new Scanner(System.in);
   
        System.out.println("Cek Koneksi IP Address");
        System.out.print("IP Address (3 Oktet Pertama) : ");
        oktet3 = input.nextLine();
        System.out.print("IP Address (Oktet Terakhir) : ");
        oktet1 = input.nextInt();
        input.nextLine();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("");
        
        for (int i = oktet1; i < 256; i++) {
            if (InetAddress.getByName(oktet3+"."+i).isReachable(2000)){
                System.out.println("IP Address "+oktet3+"."+i+" : Reply");
            } else{
                System.out.println("IP Address "+oktet3+"."+i+" : Timeout");
            }
        }
    }
}
