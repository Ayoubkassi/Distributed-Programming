/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javarmi;

import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author kassi
 */
public class JavaRMIServer {

    public static void main(String[] args) {
       try {
            MyRemoteInterface remoteObject = new MyRemoteObject();
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("MyRemoteObject", remoteObject);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
