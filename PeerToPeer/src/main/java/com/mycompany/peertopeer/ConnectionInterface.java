/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.peertopeer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kassi
 */

public interface ConnectionInterface extends Remote {
    void connect(String pseudo) throws RemoteException;
    void disconnect(String pseudo) throws RemoteException;
    DialogueInterface getDialogue() throws RemoteException;
}
