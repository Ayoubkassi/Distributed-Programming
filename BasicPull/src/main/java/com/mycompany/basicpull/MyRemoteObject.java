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
public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface {

    public MyRemoteObject() throws RemoteException {
    }
    
   

    @Override
    public void connect(String pseudo) throws RemoteException {
        System.out.println("Welcome "+pseudo+" u are connected!");
    }

    @Override
    public void disconnect(String pseudo) throws RemoteException {
        System.out.println("Bye "+pseudo+" u are disconnected!");
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
