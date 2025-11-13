package com.server;

import com.impl.ChatImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ChatImpl chat = new ChatImpl();
            Registry registry = LocateRegistry.createRegistry(44444);
            registry.rebind("chatServer", chat);

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
