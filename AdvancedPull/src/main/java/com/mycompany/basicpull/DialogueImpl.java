/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicpull;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author kassi
 */
public class DialogueImpl extends UnicastRemoteObject implements DialogueInterface {

    public DialogueImpl() throws RemoteException {
    }
    
   


    @Override
    public String[] getClients() throws RemoteException {
        return new String[]{"Ayoub","Kniza","Chaimae","Ihssane"};
    }

    @Override
    public void sendMessage(String from, String to, String message) throws RemoteException {
        System.out.println("Message has been send from "+from+" to "+to+" \n content of the message is : "+message);
    }

    @Override
    public String[] getMessages(String pseudo) throws RemoteException {
        return new String[]{"Hello Guys","How are u ?","Thanks everything is cool","LGTM!"};
    }
    
}