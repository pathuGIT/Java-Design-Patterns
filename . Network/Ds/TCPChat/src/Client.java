import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Socket client = new Socket("localhost",5005)){
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            Scanner scanner = new Scanner(System.in);

            while(true){
                //write client msg
                System.out.print("me: ");
                String msg = scanner.nextLine();
                if(msg.equalsIgnoreCase("exit")){
                    break;
                }
                out.writeUTF(msg);

                //read server msg
                System.out.println("server: "+in.readUTF());
            }
            scanner.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
