package com.cal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements MyCalcInter {

    public MyCalculator() throws RemoteException {
        super();
    }

    @Override
    public void add(int a, int b) throws RuntimeException {
        System.out.println(a+b);
    }

    @Override
    public int sub(int a, int b) throws RuntimeException {
        return a-b;
    }

    @Override
    public int div(int a, int b) throws RuntimeException, ArithmeticException {
        return a/b;
    }
}
