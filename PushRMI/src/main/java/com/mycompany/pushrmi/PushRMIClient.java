/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pushrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author kassi
 */
public class PushRMIClient {
    
    public static void main(String[] args) {
        
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ConnectionInterface connection =   (ConnectionInterface)registry.lookup("chat");
            connection.connect("Ayoub","Kniza");
            // now craete other remote for the emiter
            EmitterInterface emitter = (EmitterInterface) registry.lookup("chat");
            emitter.sendMessage("kniza", "Hello petita miss u");
            
            connection.disconnect("Ayoub");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
