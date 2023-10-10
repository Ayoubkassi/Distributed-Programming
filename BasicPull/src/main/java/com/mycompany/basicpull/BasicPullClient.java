/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicpull;

import java.rmi.Naming;

/**
 *
 * @author kassi
 */
public class BasicPullClient {
    
    public static void main(String[] args) {
        try{
            MyRemoteInterface remoteObject = (MyRemoteObject) Naming.lookup("rmi://127.0.0.1/chat");
            // establish connection first
            remoteObject.connect("Ayoub");
            String clients[] = remoteObject.getClients();
            remoteObject.sendMessage("Ayoub", "Kniza", "petitaaaa");
            String[] messages = remoteObject.getMessages("Ayoub");
            remoteObject.disconnect("Ayoub");
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
