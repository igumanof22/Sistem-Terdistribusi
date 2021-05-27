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
public class Tugas4_TampilConf_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br_1007 = new BufferedReader(new FileReader("File_1811081007/app.conf"));
        String line_1007;
        
        while ((line_1007 = br_1007.readLine()) != null) {          
            String[] data = line_1007.split("#");
            System.out.println("Host     : "+data[0]);
            System.out.println("Username : "+data[1]);
            System.out.println("Password : "+data[2]);
            System.out.println("Database : "+data[3]);
        }
        br_1007.close();
    }
}
