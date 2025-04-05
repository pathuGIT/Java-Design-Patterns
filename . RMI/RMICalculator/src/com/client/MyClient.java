package com.client;

import com.cal.MyCalcInter;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            //1. locate the registry
            Registry registry = LocateRegistry.getRegistry("localhost",45555);
            //2. locating the remote object
            MyCalcInter mycal = (MyCalcInter) registry.lookup("MyCalServer");
            mycal.add(5,10);
            System.out.println(mycal.sub(10,5));
            System.out.println(mycal.div(15,3));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
