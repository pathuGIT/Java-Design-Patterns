package com.client;

import com.impl.ChatInterface;

import java.nio.charset.StandardCharsets;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {
    private Registry registry;
    private ChatInterface chatInterface;
    private String username;
    private int index = 0;

    public Client(String username) {
        try {
            this.registry = LocateRegistry.getRegistry("localhost", 44444);
            this.chatInterface  = (ChatInterface) registry.lookup("chatServer");
            this.username = username;
            //this.index = 0;

        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String msg){
        try {
            chatInterface.sendMessage(msg, username);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void getMessages() throws RemoteException {
        ArrayList<String> messages = chatInterface.getMessages();
        for (int i = index; i < messages.size(); i++) {
            if(index == 0){
                continue;
            }
            System.out.println(messages.get(i));
        }
        index = messages.size();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String uname = scanner.next();

        Client client = new Client(uname);
        client.sendMessage("Joined!");
        new Thread(() -> {
            while (true){
                try {
                    client.getMessages();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        System.out.println("Type msg. 'exit' for quite.");
        while (true){
            String msg = scanner.nextLine();

            if (msg.equals("exit")){
                break;
            }
            client.sendMessage(msg);
            System.out.println();
        }

    }
}
