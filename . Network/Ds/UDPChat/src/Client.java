import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            byte[] packet = new byte[1024];

            while(true){
                //send msg
                System.out.print("me: ");
                String msg = scanner.nextLine();
                if(msg.equalsIgnoreCase("exit")){
                    break;
                }
                byte[] msgData = msg.getBytes();
                //DatagramSocket serverSend = new DatagramSocket();
                DatagramPacket sendPacket = new DatagramPacket( msgData, msgData.length, InetAddress.getByName("localhost") , 5008);
                socket.send(sendPacket);

                //read msg
                DatagramPacket receivePacket = new DatagramPacket(packet, packet.length, sendPacket.getAddress(), sendPacket.getPort());
                socket.receive(receivePacket);
                String rMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("server: "+rMsg);

            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
