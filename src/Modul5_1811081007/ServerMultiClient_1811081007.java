/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081007;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RyderPhantom
 */
public class ServerMultiClient_1811081007 {
    public static void main(String[] args) {
        int portNumber = 123;
        boolean listening = true;
        
        try(ServerSocket serverSocket_1007 = new ServerSocket(portNumber);){
            while(listening){
                Socket clientSocket = serverSocket_1007.accept();
                new ServerThread_1811081007(clientSocket).start();
            }
        } catch(IOException e){
            Logger.getLogger(Server_1811081007.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(e);
        }
    }
}
