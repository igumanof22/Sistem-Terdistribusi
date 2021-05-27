/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
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
public class Image_1811081007 {
    public static void main(String[] args) throws IOException {
        Image image_1007 = null;
        
        File sourceFile_1007 = new File("File_1811081007/xiao.png");
        image_1007 = ImageIO.read(sourceFile_1007);
        
        InputStream is_1007 = new BufferedInputStream(new FileInputStream(sourceFile_1007));
        image_1007 = ImageIO.read(is_1007);
        
        JFrame frame_1007 = new JFrame();
        JLabel label_1007 = new JLabel(new ImageIcon(image_1007));
        frame_1007.getContentPane().add(label_1007, BorderLayout.CENTER);
        frame_1007.pack();
        frame_1007.setVisible(true);
    }
}
