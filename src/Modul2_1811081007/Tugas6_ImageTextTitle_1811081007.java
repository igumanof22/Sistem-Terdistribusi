/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author RyderPhantom
 */
public class Tugas6_ImageTextTitle_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Image image_1007 = null;
        String lokasiImage = null, Title = null;
        
        BufferedReader br_1007 = new BufferedReader(new FileReader("File_1811081007/ImageTitle.txt"));
        String line_1007;
        
        while ((line_1007 = br_1007.readLine()) != null) {            
            String[] data = line_1007.split("@");
            lokasiImage = data[0];
            Title = data[1];
        }
        br_1007.close();
        
        File sourceFile_1007 = new File("File_1811081007/"+lokasiImage);
        image_1007 = ImageIO.read(sourceFile_1007);
        
        InputStream is_1007 = new BufferedInputStream(new FileInputStream(sourceFile_1007));
        image_1007 = ImageIO.read(is_1007);
        
        JFrame frame_1007 = new JFrame();
        JLabel label_1007 = new JLabel(new ImageIcon(image_1007));
        frame_1007.getContentPane().add(label_1007, BorderLayout.CENTER);
        frame_1007.pack();
        frame_1007.setTitle(Title);
        frame_1007.setVisible(true);
    }
}
