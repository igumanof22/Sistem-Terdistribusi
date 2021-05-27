/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081007;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author RyderPhantom
 */
public class Tugas1_SerializationScanner_1811081007 implements Serializable{
    private String Nama;
    private String NoBp;
    private String Jekel;
    private String NoTelp;

    public Tugas1_SerializationScanner_1811081007() {
        
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNoBp(String NoBp) {
        this.NoBp = NoBp;
    }

    public void setJekel(String Jekel) {
        this.Jekel = Jekel;
    }

    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }
    
    public void printData_1007(){
        System.out.println("Nama\t\t: "+Nama);
        System.out.println("No. Bp\t\t: "+NoBp);
        System.out.println("Jenis Kelamain\t: "+Jekel);
        System.out.println("No. Telp\t: "+NoTelp);
    }
    
    public void saveObject_1007(Tugas1_SerializationScanner_1811081007 Obj_1007){
        try(FileOutputStream fos_1007 = new FileOutputStream("File_1811081007/Lat1Modul3_1007.txt")){
            ObjectOutputStream oos_1007 = new ObjectOutputStream(fos_1007);
            oos_1007.writeObject(Obj_1007);
            oos_1007.flush();
            oos_1007.close();
        } catch (Exception e){
            System.err.println(e);
        }
    }
    
    public void readObject_1007(Tugas1_SerializationScanner_1811081007 Obj_1007){
        try(FileInputStream fis_1007 = new FileInputStream("File_1811081007/Lat1Modul3_1007.txt")){
            ObjectInputStream ois_1007 = new ObjectInputStream(fis_1007);
            Obj_1007 = (Tugas1_SerializationScanner_1811081007) ois_1007.readObject();
            Obj_1007.printData_1007();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        Scanner input = new Scanner(System.in);
        Tugas1_SerializationScanner_1811081007 isScanner_1811081007 = new Tugas1_SerializationScanner_1811081007();
        System.out.print("Nama\t\t: "); 
        isScanner_1811081007.setNama(input.nextLine());
        System.out.print("No. Bp\t\t: ");
        isScanner_1811081007.setNoBp(input.nextLine());
        System.out.print("Jenis Kelamain\t: ");
        isScanner_1811081007.setJekel(input.nextLine());
        System.out.print("No. Telp\t: ");
        isScanner_1811081007.setNoTelp(input.nextLine());
        
        
        System.out.println("-----------------------------------");
        String pathmusic = "File_1811081007/success.mp3";
        FileInputStream file_1007 = new FileInputStream(pathmusic);
        BufferedInputStream bis_1007 = new BufferedInputStream(file_1007);
        
        Player player = new Player(bis_1007);
        try{
            isScanner_1811081007.saveObject_1007(isScanner_1811081007);
            new Thread(){
                @Override
                public void run(){
                    try{
                        player.play();
                    } catch (JavaLayerException ex) {
                    }
                }
            }.start();
            isScanner_1811081007.readObject_1007(isScanner_1811081007);
        } catch(Exception e){      
        }
    }
}
