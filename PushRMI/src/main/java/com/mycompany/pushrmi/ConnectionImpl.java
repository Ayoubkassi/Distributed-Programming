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
public class ConnectionImpl extends UnicastRemoteObject implements ConnectionInterface{
    
    ConnectionImpl() throws RemoteException {
            // constructor required by unicastRemoteObject
    }
    
    @Override
    public void connect(String nickname, String receiver) throws RemoteException {
        System.out.println("Hello "+nickname+" u're connected and u're receiver is "+receiver);
    }

    @Override
    public void disconnect(String nickname) throws RemoteException {
        System.out.println("Bye "+nickname);
    }
    
}
