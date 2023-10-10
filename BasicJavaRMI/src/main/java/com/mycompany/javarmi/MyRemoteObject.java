/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author kassi
 */
public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface {
    public MyRemoteObject() throws RemoteException {
        // Constructor
    }

    public String sayHello() throws RemoteException {
        return "Bismi Allah";
    }
}
