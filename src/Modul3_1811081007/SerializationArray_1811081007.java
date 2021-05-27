/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081007;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author RyderPhantom
 */
public class SerializationArray_1811081007 {
    public void SerializationArray_1811081007(ArrayList<Mahasiswa_1811081007> tampung_1007, String path_1007){
        try(ObjectOutputStream ous_1007 = new ObjectOutputStream(new FileOutputStream(path_1007))){
            ous_1007.writeObject(tampung_1007);
        } catch(Exception e){
            System.err.println("Error "+e);
        }
    }
    
    public static void main(String[] args) {
        SerializationArray_1811081007 array_1811081007 = new SerializationArray_1811081007();
        ArrayList<Mahasiswa_1811081007> tampung_1007 = new ArrayList<>();
        String path_1007 = "File_1811081007/SerializationArray_1007.txt";
        
        tampung_1007.add(new Mahasiswa_1811081007("M. Ikhsan Gumanof", "1811081007", "L", "082381573787"));
        tampung_1007.add(new Mahasiswa_1811081007("M. Ikhsan Gumanof", "1811081007", "L", "082381573787"));
        tampung_1007.add(new Mahasiswa_1811081007("M. Ikhsan Gumanof", "1811081007", "L", "082381573787"));
        tampung_1007.add(new Mahasiswa_1811081007("M. Ikhsan Gumanof", "1811081007", "L", "082381573787"));
        
        array_1811081007.SerializationArray_1811081007(tampung_1007, path_1007);
    }
}