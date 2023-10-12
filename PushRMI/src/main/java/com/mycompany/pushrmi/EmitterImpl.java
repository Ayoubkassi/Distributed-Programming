/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pushrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author kassi
 */
public class EmitterImpl extends UnicastRemoteObject implements EmitterInterface{
    
    EmitterImpl() throws RemoteException {
        // constructor needed by the unicast remote object
    }
    
    @Override
    public void sendMessage(String to, String message) {
        // implement very basic sendMessage
        // soime logic for receiver and also for the sender 
        // for the moment we can just perform some type of printing and look about it later
        System.out.println("Message to : "+to+ "\nmessage : "+message);
    }
    
}
