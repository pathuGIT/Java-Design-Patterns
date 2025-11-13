package com.impl;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatInterface extends Remote {

    void sendMessage(String msg, String username) throws RemoteException;
    ArrayList<String> getMessages() throws RemoteException;
}
