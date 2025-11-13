import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Impl extends UnicastRemoteObject implements FIleInterface {

    public Impl() throws RemoteException {
        super();
    }

    @Override
    public void upload(byte[] file, String name) throws RemoteException {
        try {
            File file1 = new File(name);
            Files.write(file1.toPath(), file);
            System.out.println("File copied successfully...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
