package com.client;

import com.database.DatabaseConnect;
import com.database.Student;
import com.database.StudentController;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;

public class MyStudent {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",55555);
            Student student = (Student) registry.lookup("studentdata");
            System.out.println(student.viewStudents());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }

    }
}
