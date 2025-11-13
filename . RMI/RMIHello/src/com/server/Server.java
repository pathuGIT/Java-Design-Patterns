package com.server;

import com.HelloImpl.HelloImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl helloObject = new HelloImpl();
            Registry server = LocateRegistry.createRegistry(55555);
            server.rebind("hello", helloObject);

            System.out.println("Server running...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
