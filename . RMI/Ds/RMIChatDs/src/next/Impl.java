package next;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Impl extends UnicastRemoteObject implements ChatIIf {
    private ArrayList<String> array;

    public Impl() throws RemoteException {
        super();
        this.array = new ArrayList<>();
    }

    @Override
    public void sendMsg(String msg) throws RemoteException {
        array.add(msg);
    }

    @Override
    public ArrayList<String> getMsg() throws RemoteException {
        return array;
    }
}
