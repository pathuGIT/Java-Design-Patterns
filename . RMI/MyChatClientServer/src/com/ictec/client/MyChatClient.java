package com.ictec.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyChatClient extends Thread{
    private String name;
    private Socket myClient;
    private DataOutputStream dos;
    private DataInputStream dis;
    private Scanner sc;

    public MyChatClient(Socket myClient, String name) {
        this.myClient = myClient;
        this.sc = new Scanner(System.in);
        this.name = name;
    }

    @Override
    public void run() {
        try {
            dos = new DataOutputStream(myClient.getOutputStream());
            dis = new DataInputStream(myClient.getInputStream());

            //Send Hello msg to server
            String message = name+" : Hello Server...!!!";
            dos.writeUTF(message);
            dos.flush();

            //Read hello msg from the server
            String rMsg = dis.readUTF();
            System.out.println(rMsg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            System.out.println("Enter a msg to send to server : ");
            String msg = name+" : "+sc.nextLine();
            try {
                //Send msg to the server
                dos.writeUTF(msg);
                dos.flush();

                //If client says by, closing client
                if (msg.equalsIgnoreCase("bye")){
                    myClient.close();
                    break;//System.exit(0);
                }

                //Reading msg from server
                msg = dis.readUTF();
                System.out.println(msg);

                //If server says by, closing client
                if (msg.equalsIgnoreCase("bye")){
                    myClient.close();
                    break;//System.exit(0);
                }

                //dis.close();
                //dos.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyChatClient client = new MyChatClient(new Socket("localhost",55555),"kamal");
            client.start();


            MyChatClient client2 = new MyChatClient(new Socket("localhost",55555),"nayana");
            client2.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
