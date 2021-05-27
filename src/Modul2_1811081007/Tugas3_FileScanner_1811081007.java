/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class Tugas3_FileScanner_1811081007 {
    public static void main(String[] args) throws IOException {
        int pilih;
        String cara,isi, path_1811081007 = "File_1811081007/FileLat3_1007.dat";
        boolean loop = true;
        
        while(loop){
            System.out.println("Welcome!!!!\nSilahkan pilih menu dibawah!!");
            System.out.println("Menu Pilihan : ");
            System.out.println("1. Tulis FIle");
            System.out.println("2. Tampilkan Isi File");
            System.out.println("3. Keluar");
            System.out.print("pilih : ");
            Scanner input = new Scanner(System.in);
            pilih = input.nextInt();
            input.nextLine();
            System.out.println();
        
            switch (pilih) {
                case 1:    
                    System.out.println("Pilih cara tulis file : ");
                    System.out.println("a. OutputStream");
                    System.out.println("b. BufferedWriter");
                    System.out.print("Pilihan : ");
                    cara = input.nextLine();
                
                    if (cara.equals("a")) {
                        try (OutputStream output_1811081007 = new FileOutputStream(path_1811081007, true)) {
                            System.out.println("Opened "+path_1811081007+" for writing");
                            System.out.println("Tuliskan isi file");
                            isi = input.nextLine();
                            isi = isi+" (OutputStream)\n";
                        
                            for (int i = 0; i < isi.length(); i++) {
                                output_1811081007.write((byte) isi.charAt(i));
                            }
                            System.out.println("DONE!!!!");
                            System.out.println("-----------------------------------");
                        }
                    } else{
                        File file_1007 = new File(path_1811081007);
                        System.out.println("Tuliskan isi File");
                        isi = input.nextLine();
                        isi = isi+" (BufferedWriter)\n";
                        FileWriter fw_1007 = new FileWriter(file_1007, true);
                        try (BufferedWriter bw_1007 = new BufferedWriter(fw_1007)) {
                            bw_1007.write(isi);
                        }
                        System.out.println("DONE!!!!");
                        System.out.println("-----------------------------------");
                    } break;
                case 2:
                    try (InputStream fileInput_1811081007 = new FileInputStream(path_1811081007)) {
                        int data_1811081007 = fileInput_1811081007.read();
                     
                        while(data_1811081007 != -1){
                            System.out.print((char)data_1811081007);
                            data_1811081007 = fileInput_1811081007.read();
                        }
                        System.out.println();
                        System.out.println("----------------------------------");
                    }   break;
                case 3:
                    System.out.println("Good Bye!!!!");
                    loop = false;
                    break;
                default:
                    System.out.println("Input menu salah");
                    System.out.println("-----------------------------------------------");
                    break;
            }
        }
    }
}
