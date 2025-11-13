import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;

public class ChatClient {
    private ChatService chatService;
    private String username;
    private int lastMessageIndex;

    public ChatClient(String username) throws Exception {
        this.username = username;
        this.lastMessageIndex = 0;

        // Connect to the RMI registry and lookup the service
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        chatService = (ChatService) registry.lookup("ChatService");
    }

    public void sendMessage(String message) throws Exception {
        chatService.sendMessage(username, message);
    }

    public void displayMessages() throws Exception {
        List<String> messages = chatService.getMessages();
        // Display only new messages
        for (int i = lastMessageIndex; i < messages.size(); i++) {
            System.out.println(messages.get(i));
        }
        lastMessageIndex = messages.size();
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            ChatClient client = new ChatClient(username);

            // Start a thread to periodically fetch and display messages
            new Thread(() -> {
                while (true) {
                    try {
                        client.displayMessages();
                        Thread.sleep(2000); // Check for new messages every 2 seconds
                    } catch (Exception e) {
                        System.err.println("Error fetching messages: " + e.toString());
                    }
                }
            }).start();

            // Main thread handles user input for sending messages
            System.out.println("Type your messages (type 'exit' to quit):");
            while (true) {
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                client.sendMessage(message);
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}