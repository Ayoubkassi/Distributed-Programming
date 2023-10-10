/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.javarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kassi
 */
public interface MyRemoteInterface extends Remote{
    public String sayHello() throws RemoteException;
}
