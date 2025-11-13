package com.client;

import com.HelloImpl.HelloInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry client = LocateRegistry.getRegistry("Localhost",55555);
            HelloInterface out = (HelloInterface) client.lookup("hello");

            System.out.println(out.Hello());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
