/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author RyderPhantom
 */
public class Tugas1_WriteRead_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path_1811081007 = "File_1811081007/File_1811081007.dat";
        
        try (OutputStream output_1811081007 = new FileOutputStream(path_1811081007)) {
            System.out.println("Opened "+path_1811081007+" for writing");
            String data_1811081007 = "Menulis teks menggunakan OutputStream \n>>> By MIGII (1811081007) <<<";
            
            for (int i = 0; i < data_1811081007.length(); i++) {
                output_1811081007.write((byte) data_1811081007.charAt(i));
            }
            System.out.println("DONE!!!!");
        }
        
        System.out.println();
        System.out.println("Read File "+path_1811081007);
        System.err.println("-----------------------------------");
        try (InputStream fileInput_1811081007 = new FileInputStream(path_1811081007)) {
            int data_1811081007 = fileInput_1811081007.read();
            
            while(data_1811081007 != -1){
                System.out.print((char)data_1811081007);
                data_1811081007 = fileInput_1811081007.read();
            }
            System.out.println();
        }
    }
}
