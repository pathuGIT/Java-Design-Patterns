package com.HelloImpl;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
    public HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String Hello() throws RemoteException {
        return "Hello Pathuma..";
    }


}
