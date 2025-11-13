package com.Impl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote {
    double sum(double a, double b) throws RemoteException;
    double mul(double a, double b) throws RemoteException;
    double div(double a, double b) throws RemoteException;
    double sub(double a, double b) throws RemoteException;
}
