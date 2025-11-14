import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(5008);
            Scanner scanner = new Scanner(System.in);
            byte[] packet = new byte[1024];

            while(true){
                //read msg
                DatagramPacket receivePacket = new DatagramPacket(packet, packet.length);
                socket.receive(receivePacket);
                String rMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("client: "+rMsg);

                //send msg
                System.out.print("me: ");
                String msg = scanner.nextLine();
                if(msg.equalsIgnoreCase("exit")){
                    break;
                }
                byte[] msgData = msg.getBytes();
                //DatagramSocket serverSend = new DatagramSocket();
                DatagramPacket sendPacket = new DatagramPacket( msgData, msgData.length, receivePacket.getAddress(), receivePacket.getPort());
                socket.send(sendPacket);

            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
