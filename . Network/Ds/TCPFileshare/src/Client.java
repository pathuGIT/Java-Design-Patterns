import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.nio.file.Files;

public class Client {
    public static void main(String[] args) throws IOException {
        try(Socket socket = new Socket("localhost",5999)){
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //client ready to send data
            File file = new File("D://aswe.txt"); //file path
            byte[] dataFile = Files.readAllBytes(file.toPath()); //convert file to bytes

            // send file bytes
            out.writeInt(dataFile.length); //setup file data length
            out.write(dataFile); //add file data to server
        }

    }
}
