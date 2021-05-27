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
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author RyderPhantom
 */
public class AudioWav_1811081007 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path_1007 = "File_1811081007/bell.wav";
        
        InputStream is_1007 = new FileInputStream(path_1007);
        AudioStream audioStream_1007 = new AudioStream(is_1007);
        AudioPlayer.player.start(audioStream_1007);
    }
}
