/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_1811081007;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author RyderPhantom
 */
public class AudioMp3_1811081007 {
    private static Player player;
    private static String path;
    
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        path = "File_1811081007/fox.mp3";
        FileInputStream file_1007 = new FileInputStream(path);
        BufferedInputStream bis_1007 = new BufferedInputStream(file_1007);
        
        player = new Player(bis_1007);
        new Thread(){
            @Override
            public void run(){
                try{
                    player.play();
                } catch (JavaLayerException ex) {
                }
            }
        }.start();
    }
}
