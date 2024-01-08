/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peertopeer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author kassi
 */

public class ConnectionImpl extends UnicastRemoteObject implements ConnectionInterface {
    public ConnectionImpl() throws RemoteException {
    }

    @Override
    public void connect(String pseudo) throws RemoteException {
        System.out.println("Welcome " + pseudo + " you are connected!");
    }

    @Override
    public void disconnect(String pseudo) throws RemoteException {
        System.out.println("Bye " + pseudo + " you are disconnected!");
    }

    @Override
    public DialogueInterface getDialogue() throws RemoteException {
        return new DialogueImpl();
    }
}