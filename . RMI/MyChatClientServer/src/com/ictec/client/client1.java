package com.ictec.client;

import java.io.IOException;
import java.net.Socket;

public class client1 {
    public static void main(String[] args) {
        try {
            MyChatClient client = new MyChatClient(new Socket("localhost",55555),"kamal");
            client.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
