package com.Impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements CalculatorInterface {
    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double sum(double a, double b) throws RemoteException {
        return a+b;
    }

    @Override
    public double mul(double a, double b) throws RemoteException {
        return a*b;
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        return a/b;
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
        return a-b;
    }
}
