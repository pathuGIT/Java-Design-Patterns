package com.database;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Connection;

public interface Student extends Remote {
    public String viewStudents() throws RemoteException;
}
