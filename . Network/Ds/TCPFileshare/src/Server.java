import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

public class Server {
    public static void main(String[] args) throws IOException {
        try(ServerSocket server = new ServerSocket(5999)){
            try (Socket socket = server.accept()){
                DataInputStream in = new DataInputStream(socket.getInputStream()); //server open to read
                int length = in.readInt(); //get input size
                byte[] fileData = new byte[length]; //setup bucket for that size

                in.readFully(fileData); //assign data to bucket

                File newfile = new File("copy.txt"); //new file
                Files.write(newfile.toPath(), fileData); //convert bucket data to new file (copy.txt)
            }
        }
    }
}
