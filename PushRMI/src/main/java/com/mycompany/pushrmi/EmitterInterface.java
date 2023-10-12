/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pushrmi;

import java.rmi.Remote;

/**
 *
 * @author kassi
 */
public interface EmitterInterface extends Remote {
       void sendMessage(String to , String message);
}
