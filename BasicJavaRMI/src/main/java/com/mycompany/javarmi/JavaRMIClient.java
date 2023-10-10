/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi;

import java.rmi.Naming;

/**
 *
 * @author kassi
 */
public class JavaRMIClient {
    
    
    public static void main(String[] args) {
        try {
            MyRemoteInterface remoteObject = (MyRemoteInterface) Naming.lookup("rmi://127.0.0.1/MyRemoteObject");
            String message = remoteObject.sayHello();
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
