/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author RyderPhantom
 */
public class ReadInputStream_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (InputStream fileInput_1811081007 = new FileInputStream("File_1811081007/ReadInputStream_1811081007.txt")) {
            int data_1811081007 = fileInput_1811081007.read();
            
            while(data_1811081007 != -1){
                System.out.print((char)data_1811081007);
                data_1811081007 = fileInput_1811081007.read();
            }
        }
    }
}
