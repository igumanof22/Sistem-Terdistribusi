/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081007;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class Client_1811081007 {
    public static void main(String[] args) {
        String hostname = "localhost";
        int portNumber = 123;
        
        try(
                Socket echoSocket_1007 = new Socket(hostname, portNumber);
                BufferedOutputStream bos_1007 = new BufferedOutputStream(echoSocket_1007.getOutputStream());
                ObjectOutputStream oos_1007 = new ObjectOutputStream(bos_1007);
                BufferedReader in_1007 = new BufferedReader(new InputStreamReader(echoSocket_1007.getInputStream()));
                BufferedReader stdIn_1007 = new BufferedReader(new InputStreamReader(System.in));){
            String msg;
            while((msg = stdIn_1007.readLine()) != null){
                oos_1007.writeObject(new Pesan_1811081007("Eko", msg));
                oos_1007.flush();
                System.out.println("Client Receive : "+in_1007.readLine());
            }
        } catch(IOException e){
            Logger.getLogger(Client_1811081007.class.getName()).log(Level.SEVERE,null, e);
            System.err.println(e);
        }
    }
}
