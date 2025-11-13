import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FIleInterface extends Remote {
    void upload(byte[] file, String name) throws RemoteException;
}
