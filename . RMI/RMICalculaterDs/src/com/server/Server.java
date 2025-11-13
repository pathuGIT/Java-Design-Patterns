package com.server;

import com.Impl.CalculatorImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorImpl calculator = new CalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(55555);
            registry.rebind("calculator", calculator);
            System.out.println("Server running..");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
