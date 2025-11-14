import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.file.Files;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(5000);
            byte[] packet = new byte[1024];

            DatagramPacket datagramPacket = new DatagramPacket(packet, packet.length);
            socket.receive(datagramPacket);

            File file = new File("copy.txt");
            Files.write(file.toPath(), datagramPacket.getData());

         } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
