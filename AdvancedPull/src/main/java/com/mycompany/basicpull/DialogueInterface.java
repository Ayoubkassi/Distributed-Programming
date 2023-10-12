/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.basicpull;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kassi
 */
public interface DialogueInterface extends Remote{
    
    public String[] getClients() throws RemoteException;
    public void sendMessage(String from , String to , String message) throws RemoteException ;
    public String[] getMessages(String pseudo) throws RemoteException;
    
}
