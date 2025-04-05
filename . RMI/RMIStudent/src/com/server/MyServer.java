package com.server;

import com.database.StudentController;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(55555);

            StudentController studentController = new StudentController();
            registry.rebind("studentdata", studentController);

            System.out.println("Server Running...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
