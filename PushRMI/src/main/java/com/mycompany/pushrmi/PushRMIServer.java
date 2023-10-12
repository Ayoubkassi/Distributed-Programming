/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pushrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kassi
 */
public class PushRMIServer {

    private final static int PORT = 1099;
    private final static String appName = "chat";
    
    public static void main(String[] args) {
        try{
            // create my connection object   
            ConnectionInterface myConnection = new ConnectionImpl();
            Registry registry = LocateRegistry.createRegistry(PORT);
            Naming.rebind(appName, myConnection);
            System.out.println("Server is runing on PORT : "+PORT);
            
               // here server must perform a call to the client 
             // it's bidirection so him to he can take new conenctions
            Registry registryOut = LocateRegistry.getRegistry("localhost", 1099);
            ReceiverInterface receiver =   (ReceiverInterface)registryOut.lookup("chat");
            
            
            receiver.receive("ayoub", "Hello and welcome");
            receiver.initClients(new ArrayList<>(List.of("Ayoub", "IKram","Kniza")));
            receiver.addClient("hiba");
            receiver.removeClient("ikram");
             
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
