package com.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Socket client = null;
        DataInputStream in = null;
        DataOutputStream out = null;

        try {
            client = new Socket("localhost", 55555);
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
            String input;
            String response;

            do {
                System.out.print("Client:: ");
                input = sc.nextLine();
                out.writeUTF(input);
                out.flush();

                response = in.readUTF();
                System.out.println("Server:: " + response);

            } while (!input.equalsIgnoreCase("exit"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (client != null) client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}