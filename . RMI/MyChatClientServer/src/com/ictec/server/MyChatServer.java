package com.ictec.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyChatServer {
    public static void main(String[] args) {
        ServerSocket myServer = null;
        Socket myClient1 = null;
        Socket myClient2 = null;

        DataOutputStream dos1 = null;
        DataInputStream dis1 = null;

        DataOutputStream dos2 = null;
        DataInputStream dis2 = null;

        Scanner sc = null;

        try {
            myServer = new ServerSocket(55555);
            myClient1 = myServer.accept();
            myClient2 = myServer.accept();

            dos1 = new DataOutputStream(myClient1.getOutputStream());
            dis1 = new DataInputStream(myClient1.getInputStream());

            dos2 = new DataOutputStream(myClient2.getOutputStream());
            dis2 = new DataInputStream(myClient2.getInputStream());

            sc = new Scanner(System.in);

            //Reading the hello msg from client
            String msg1 = dis1.readUTF();
            String msg2 = dis2.readUTF();

            System.out.println(msg1);
            System.out.println(msg2);

            //sending hello msg to the client
            String sMsg = "Server : Hello Client...!!!";
            dos1.writeUTF(sMsg);
            dos2.writeUTF(sMsg);
            dos1.flush();
            dos2.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {

            try {
                //Reading msg from the client
                String msg1 = dis1.readUTF();
                String msg2 = dis2.readUTF();
                System.out.println(msg1);
                System.out.println(msg2);

                //If client says bye
                if (msg1.equalsIgnoreCase("bye")) {
                    myClient1.close();
                    break;
                }
                if (msg2.equalsIgnoreCase("bye")) {
                    myClient2.close();
                    break;
                }

                //Sending msg to the client
                System.out.println("Enter the msg to send to the client : ");
                msg1 = "Server : " + sc.nextLine();
                msg2 = "Server : " + sc.nextLine();
                dos1.writeUTF(msg1);
                dos2.writeUTF(msg2);
                dos1.flush();
                dos2.flush();

                if (msg1.equalsIgnoreCase("bye")) {
                    myClient1.close();
                    break;
                }
                if (msg2.equalsIgnoreCase("bye")) {
                    myClient2.close();
                    break;
                }

                //dis.close();
                //dos.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
