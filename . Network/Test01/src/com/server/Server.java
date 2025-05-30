package com.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            ServerSocket serverSocket = new ServerSocket(5555);
            Socket socket = serverSocket.accept();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            String message = "";

            while (true) {
                //send message
                System.out.print("me: ");
                message = scanner.nextLine();
                objectOutputStream.writeObject(message);

                //receive message
                message = (String) objectInputStream.readObject();
                System.out.println("Message from client: " + message);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
