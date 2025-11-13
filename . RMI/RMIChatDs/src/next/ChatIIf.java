package next;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatIIf extends Remote {
    void sendMsg(String msg) throws RemoteException;
    ArrayList<String> getMsg() throws RemoteException;
}
