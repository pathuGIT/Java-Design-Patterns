import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.file.Files;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] packet = new byte[1024];

            File file = new File("D://aswe.txt");
            byte[] fileData = Files.readAllBytes(file.toPath());
            DatagramPacket datagramPacket = new DatagramPacket(fileData, fileData.length, InetAddress.getByName("localhost"), 5000);
            socket.send(datagramPacket);

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
