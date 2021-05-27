/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author RyderPhantom
 */
public class WriteOutputStream_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path_1811081007 = "File_1811081007/WriteOutputStream_1811081007.txt";
        
        try (OutputStream output_1811081007 = new FileOutputStream(path_1811081007)) {
            System.out.println("Opened "+path_1811081007+" for writing");
            String data_1811081007 = "Menulis teks menggunakan OutputStream \n>>> By MIGII (1811081007) <<<";
            
            for (int i = 0; i < data_1811081007.length(); i++) {
                output_1811081007.write((byte) data_1811081007.charAt(i));
            }
            System.out.println("DONE!!!");
        }
    }
}
