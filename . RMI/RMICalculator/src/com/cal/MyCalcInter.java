package com.cal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyCalcInter extends Remote {
    public void add(int a, int b) throws RemoteException;
    public int sub(int a, int b) throws RemoteException;
    public int div(int a, int b) throws RemoteException;
}
