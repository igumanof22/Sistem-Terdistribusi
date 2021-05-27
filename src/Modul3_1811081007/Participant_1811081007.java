/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081007;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author RyderPhantom
 */
public class Participant_1811081007 implements Serializable{
    private String firstName;
    private String lastName;
    private int age;

    public Participant_1811081007(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Participant_1811081007() {
        
    } 

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    
    public void printData_1007(){
        System.out.println("Nama\t: "+firstName+" "+lastName);
        System.out.println("Usia\t: "+age);
    }
    
    public void saveObject_1007(Participant_1811081007 Obj_1007){
        try(FileOutputStream fos_1007 = new FileOutputStream("File_1811081007/Object_1007.txt")){
            ObjectOutputStream oos_1007 = new ObjectOutputStream(fos_1007);
            oos_1007.writeObject(Obj_1007);
            oos_1007.flush();
            oos_1007.close();
        } catch (Exception e){
            System.err.println(e);
        }
    }
    
    public void readObject_1007(Participant_1811081007 Obj_1007){
        try(FileInputStream fis_1007 = new FileInputStream("File_1811081007/Object_1007.txt")){
            ObjectInputStream ois_1007 = new ObjectInputStream(fis_1007);
            Obj_1007 = (Participant_1811081007) ois_1007.readObject();
            Obj_1007.printData_1007();
        } catch(Exception e){
            System.err.println(e);
        }
    }
    
    public static void main(String[] args) {
//        Participant_1811081007 Is_1007 = new Participant_1811081007("M. Ikhsan", "Gumanof", 21);
//        Is_1007.saveObject_1007(Is_1007);
//        Is_1007.readObject_1007(Is_1007);

        Participant_1811081007 Is_1007 = new Participant_1811081007();
        Is_1007.setFirstName("M. Ikhsan");
        Is_1007.setLastName("Gumanof");
        Is_1007.setAge(21);
        
        Is_1007.saveObject_1007(Is_1007);
        Is_1007.readObject_1007(Is_1007);
    }
}
