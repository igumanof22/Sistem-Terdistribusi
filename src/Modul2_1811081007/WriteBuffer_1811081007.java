/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author RyderPhantom
 */
public class WriteBuffer_1811081007 {
    public static void main(String[] args) throws IOException {
        String path_1007 = "File_1811081007/WriteBufferWriter_1007.txt";
        File file_1007 = new File(path_1007);
        String isi_1007 = "Menulis file dengan BufferWriter";
        FileWriter fw_1007 = new FileWriter(file_1007);
        try (BufferedWriter bw_1007 = new BufferedWriter(fw_1007)) {
            bw_1007.write(isi_1007);
        }
    }
}
