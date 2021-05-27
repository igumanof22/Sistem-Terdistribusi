/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081007;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RyderPhantom
 */
public class DeserializeArray_1811081007 {
    public static void main(String[] args) {
        DeserializeArray_1811081007 deserialize_1007 = new DeserializeArray_1811081007();
        System.out.println("Deserialize Object");
        System.out.println("----------------------");
        ArrayList<Mahasiswa_1811081007> newList = deserialize_1007.deserialize_1007("File_1811081007/SerializationArray_1007.txt");
        for(Mahasiswa_1811081007 mhs : newList){
            System.out.println("Nama\t: "+mhs.getNama()
                    +"\nNo. Bp\t: "+mhs.getNoBp()
                    +"\nJenis Kelamin\t: "+mhs.getJekel()
                    +"\nNo Telp\t: "+mhs.getNoTelp());
            System.out.println("");
        }
    }
    
    public ArrayList<Mahasiswa_1811081007> deserialize_1007(String fileName){
        ArrayList<Mahasiswa_1811081007> mhsList = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            mhsList = (ArrayList<Mahasiswa_1811081007>) in.readObject();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
        return mhsList;
    }    
}
