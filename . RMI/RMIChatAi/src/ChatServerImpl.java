import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatServerImpl extends UnicastRemoteObject implements ChatService {
    private List<String> messages;

    public ChatServerImpl() throws RemoteException {
        super();
        messages = new ArrayList<>();
    }

    @Override
    public void sendMessage(String username, String message) throws RemoteException {
        messages.add(username + ": " + message);
    }

    @Override
    public List<String> getMessages() throws RemoteException {
        return messages;
    }

    public static void main(String[] args) {
        try {
            // Create and export the server object
            ChatServerImpl server = new ChatServerImpl();
            // Create RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);
            // Bind the server object to the registry
            registry.rebind("ChatService", server);
            System.out.println("Chat Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}