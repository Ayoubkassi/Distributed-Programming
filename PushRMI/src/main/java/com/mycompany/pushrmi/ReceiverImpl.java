/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pushrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author kassi
 */
public class ReceiverImpl extends UnicastRemoteObject implements ReceiverInterface{
    // clients gonna be common between all type of users means static
       
    private static List<String> clients;
    
     // needed constuctor for unicastRemoteobject
       ReceiverImpl() throws RemoteException{
           
       }
    
    
    @Override
    public void receive(String from, String message) {
        System.out.println("message received from : "+from + "\nmessage : "+message);
    }

    @Override
    public void initClients(List<String> clients) {
        this.clients = clients;
        
    }

    @Override
    public void addClient(String client) {
        this.clients.add(client);
    }

    @Override
    public void removeClient(String client) {
        this.clients.remove(client);
    }
    
}
