package next;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private int index;
    private Registry registry;
    private String name;
    private ChatIIf obj;

    public Client(String name) throws RemoteException, NotBoundException {
        this.name = name;
        this.registry = LocateRegistry.getRegistry("localhost",55555);
        this.obj = (ChatIIf) registry.lookup("chat");
    }

    public void sendMsg(String msg) throws RemoteException {
        obj.sendMsg(name+ ": "+msg);
    }

    public void getMsg() throws RemoteException {
        ArrayList<String> array = obj.getMsg();
        for(int i=index; i<array.size(); i++){
            System.out.println( array.get(i));
        }
        this.index = array.size();
    }

    public static void main(String[] args) throws NotBoundException, RemoteException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String uname = scanner.nextLine();

        Client client = new Client(uname);

        new Thread(()->{
            while (true){
                try {
                    client.getMsg();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        System.out.println("Msg type here, 'exit' for quite.");
        while (true){
            String msg = scanner.nextLine();
            client.sendMsg(msg);
        }
    }
}
