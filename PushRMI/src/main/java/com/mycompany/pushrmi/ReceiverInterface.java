/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pushrmi;

import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author kassi
 */
public interface ReceiverInterface extends Remote {
    
    void receive(String from , String message);
    void initClients(List<String> clients);
    void addClient(String client);
    void removeClient(String client);
    
}
