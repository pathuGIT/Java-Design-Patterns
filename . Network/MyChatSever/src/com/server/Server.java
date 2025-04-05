package com.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        Scanner scanner = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(55555);
            System.out.println("Server is waiting for a client...");
            socket = serverSocket.accept();
            System.out.println("Client connected.");
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String response;
            String message;

            do {
                message = dataInputStream.readUTF();
                System.out.println("Client:: " + message);

                if (message.equalsIgnoreCase("exit")) {
                    response = "Goodbye!";
                } else {
                    System.out.print("Server:: ");
                    response = scanner.nextLine();
                }
                dataOutputStream.writeUTF(response);
                dataOutputStream.flush();

            } while (!message.equalsIgnoreCase("exit"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataOutputStream != null) dataOutputStream.close();
                if (dataInputStream != null) dataInputStream.close();
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
