/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peertopeer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author kassi
 */
public class PeerToPeer {

     public static void main(String[] args) {
        try {
            // Set up the server
            ConnectionInterface server = new ConnectionImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // Use a specific port
            registry.rebind("chatServer", server);
            System.out.println("Chat server is running...");

            // Handle client connections
            // Implement logic for clients to connect to the server and establish peer-to-peer connections

            // Facilitate message exchange
            // Enable clients to send and receive messages using the peer-to-peer architecture

            // Provide a user interface
            // Optionally, create a user interface for clients to interact with the chat application
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
