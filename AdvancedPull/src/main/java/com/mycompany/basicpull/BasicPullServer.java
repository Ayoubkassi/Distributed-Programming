/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basicpull;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author kassi
 */
public class BasicPullServer {
    
    private static final int PORT = 1099;
    
    public static void main(String[] args) {
        // establisg the server connection using remoteObject 
        try{
        ConnectionInterface remoteObject = new ConnectionImpl();
        Registry resgistry = LocateRegistry.createRegistry(PORT);
        Naming.rebind("chat",remoteObject);
        System.out.println("Server is running on port : "+ PORT);
        }catch(Exception e){
               e.printStackTrace();
        }
    }
}
