package com.client;

import com.Impl.CalculatorInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 55555);
            CalculatorInterface object = (CalculatorInterface) registry.lookup("calculator");

            int a = 10;
            int b = 5;

            System.out.println("Add (10, 5)");
            System.out.println("Ans: "+object.sum(a,b));

            System.out.println("Sub(10, 5)");
            System.out.println("Ans: "+object.sub(a,b));

            System.out.println("Mul (10, 5)");
            System.out.println("Ans: "+object.mul(a,b));

            System.out.println("Div (10, 5)");
            System.out.println("Ans: "+object.div(a,b));

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
