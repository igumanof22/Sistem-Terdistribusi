/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081007;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class Server_1811081007 {
    public static void main(String[] args) {
        int portNumber = 123;
        try(
                ServerSocket serverSocket_1007 = new ServerSocket(portNumber);
                Socket clientSocket_1007 = serverSocket_1007.accept();
                PrintWriter out_1007 = new PrintWriter(clientSocket_1007.getOutputStream(), true);
                BufferedInputStream bis_1007 = new BufferedInputStream(clientSocket_1007.getInputStream());
                ObjectInputStream ois_1007 = new ObjectInputStream(bis_1007);){
            Pesan_1811081007 pesan;
            while((pesan = (Pesan_1811081007) ois_1007.readObject()) != null){
                System.out.println("Server Receive : "+pesan.toString());
                out_1007.println("Pesan diterima");
            }
        } catch(IOException | ClassNotFoundException e){
            Logger.getLogger(Server_1811081007.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(e);
        }
    }
}
