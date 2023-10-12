/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pushrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kassi
 */
public interface ConnectionInterface extends Remote {
    void connect(String nickname , String receiver) throws RemoteException;
    void disconnect(String nickname) throws RemoteException;
}
