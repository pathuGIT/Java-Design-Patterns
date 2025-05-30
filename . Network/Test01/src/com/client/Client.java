package com.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("localhost", 5555);
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream obje = new ObjectOutputStream(socket.getOutputStream());
            String message = "";

            while (true) {
                //view message
                message = (String) objectInputStream.readObject();
                System.out.println("Message from server: " + message);

                //send message
                System.out.print("me: ");
                message = scanner.nextLine();
                obje.writeObject(message);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
