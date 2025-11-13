package com.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface {

    private  ArrayList<String> messageList;

    public ChatImpl() throws RemoteException {
        super();
        messageList = new ArrayList<>();
    }



    @Override
    public void sendMessage(String msg,  String username) throws RemoteException {
        messageList.add(username+ ": " + msg);
    }

    @Override
    public ArrayList<String> getMessages() throws RemoteException {
        return messageList;
    }
}
