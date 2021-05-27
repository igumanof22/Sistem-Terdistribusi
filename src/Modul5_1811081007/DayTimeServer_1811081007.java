/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081007;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author RyderPhantom
 */
public class DayTimeServer_1811081007 {
    public static final int SERVICE_PORT = 13;
    
    public static void main(String[] args) {
        try{
            ServerSocket server_1007 = new ServerSocket(SERVICE_PORT);
            System.out.println("Daytime Server Started");
            
            for(;;){
                Socket nextClient_1007 = server_1007.accept();
                
                System.out.println("Received request from "+nextClient_1007.getInetAddress()+" : "+nextClient_1007.getPort());
                
                OutputStream out_1007 = nextClient_1007.getOutputStream();
                PrintStream pout_1007 =  new PrintStream(out_1007);
                
                pout_1007.print(new java.util.Date());
                
                out_1007.flush();
                out_1007.close();
                nextClient_1007.close();
            } 
        } catch(BindException be){
            System.err.println("Server already running on port "+SERVICE_PORT);
        } catch(IOException e){
            System.err.println("I/O error - "+e);
        }
    }
}
