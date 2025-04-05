package com.server;

import com.cal.MyCalcInter;
import com.cal.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            //1. create registry
            Registry registry = LocateRegistry.createRegistry(45555);

            //2. binding the remote object (register mycalc)
            MyCalculator myCal = new MyCalculator();
            registry.rebind("MyCalServer",myCal);

            //3 add
            System.out.println("server  running");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
