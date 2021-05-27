/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081007;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RyderPhantom
 */
public class Tugas2_MenuSerializationArray_1811081007 {
    
    public void MenuSerializationArray_1811081007(ArrayList<Penduduk_1811081007> tampung_1007, String path_1007){
        try(ObjectOutputStream ous_1007 = new ObjectOutputStream(new FileOutputStream(path_1007))){
            ous_1007.writeObject(tampung_1007);
        } catch(Exception e){
            System.err.println("Error "+e);
        }
    }
    
    public static void main(String[] args) {
        Tugas2_MenuSerializationArray_1811081007 array_1811081007 = new Tugas2_MenuSerializationArray_1811081007();
        Penduduk_1811081007 data_1007 = new Penduduk_1811081007();
        ArrayList<Penduduk_1811081007> tampung_1007 = new ArrayList<>();
        String path_1007 = "File_1811081007/FileLat2Modul3_1007.txt";
        Scanner input = new Scanner(System.in);
        int pilih;
        boolean loop = true;
        
        while(loop){
            System.out.println("Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Keluar");
            System.out.print("Pilih : "); 
            pilih = input.nextInt(); input.nextLine();
            
            switch(pilih){
                case 1:
                    System.out.print("No. NIK\t\t: ");
                    data_1007.setNIK(input.nextLine());
                    System.out.print("Nama\t\t: ");
                    data_1007.setNama(input.nextLine());
                    System.out.print("No. KK\t\t: ");
                    data_1007.setKK(input.nextLine());
                    System.out.print("Alamat\t\t: ");
                    data_1007.setAlamat(input.nextLine());
                    System.out.print("Pendidikan\t: ");
                    data_1007.setPendidikan(input.nextLine());
                    
                    tampung_1007.add(data_1007);
                    array_1811081007.MenuSerializationArray_1811081007(tampung_1007, path_1007);
                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.println("Bye!!!");
                    loop = false;
                    break;
                default:
                    System.out.println("Input Menu Salah");
                    break;
            }
        }
    }
}
