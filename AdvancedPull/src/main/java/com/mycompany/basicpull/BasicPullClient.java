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
//            DialogueInterface remoteObject = (DialogueInterface) Naming.lookup("rmi://127.0.0.1/chat");
//            // establish connection first
//            remoteObject.connect("Ayoub");
//            String clients[] = remoteObject.getClients();
//            remoteObject.sendMessage("Ayoub", "Kniza", "petitaaaa");
//            String[] messages = remoteObject.getMessages("Ayoub");
//            remoteObject.disconnect("Ayoub");

    // so now we can have factory design pattern we start by create just interface for the connection and from it we can craete new class for the dialogue
    
            ConnectionInterface myConnection = (ConnectionInterface) Naming.lookup("rmi://127.0.0.1/chat");
            myConnection.connect("Ayoub");

            // Get the client-side DialogueInterface implementation

            String clients[] = myConnection.getDialogue().getClients();
            myConnection.getDialogue().sendMessage("Ayoub", "Kniza", " petita");
            String[] messages = myConnection.getDialogue().getMessages("Ayoub");

            myConnection.disconnect("Ayoub");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
