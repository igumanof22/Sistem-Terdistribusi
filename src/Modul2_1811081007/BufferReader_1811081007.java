/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author RyderPhantom
 */
public class BufferReader_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br_1007 = new BufferedReader(new FileReader("File_1811081007/WriteBufferWriter_1007.txt"));
        String line_1007;
        
        while ((line_1007 = br_1007.readLine()) != null) {            
            System.out.println(line_1007);
        }
        br_1007.close();
    }
}
