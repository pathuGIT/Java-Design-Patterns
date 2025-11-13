import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws IOException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 55555);
        FIleInterface fIleInterface = (FIleInterface) registry.lookup("fileServer");

        File file = new File("D://copy.txt");
        byte[] fileData = Files.readAllBytes(file.toPath());
        fIleInterface.upload(fileData, file.getName());
    }
}
