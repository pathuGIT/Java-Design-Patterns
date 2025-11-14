import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(5005)){
            try(Socket client = server.accept()){
                DataOutputStream out = new DataOutputStream(client.getOutputStream());
                DataInputStream in = new DataInputStream(client.getInputStream());
                Scanner scanner = new Scanner(System.in);
                while (true){
                    // show client message
                    System.out.println("client: "+in.readUTF());

                    // get user input
                    System.out.print("me: ");
                    String msg = scanner.nextLine();
                    if(msg.equalsIgnoreCase("exit")){
                        break;
                    }
                    out.writeUTF(msg);
                }
                scanner.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
