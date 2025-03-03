package BankingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    private static Service instance;

    public static Service getInstance(){
        if(instance == null){
            instance = new Service();
        }
        return instance;
    }

    private final ArrayList<Account> accounts = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    private Service() {
        accounts.add(new Account("Kamal", 25, "987654321V", 1000.0));
        accounts.add(new Account("Saman", 30, "123456789V", 2000.0));
        accounts.add(new Account("Nimal", 28, "456789123V", 1500.0));
    }

    public synchronized void createAccount() {
        Account account = new Account("Gayan", 12, "456789121V", 500.0);
        accounts.add(account);
        System.out.println("Account created: " + account.geta());
    }

    public synchronized void showAccounts() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("List of Accounts:");
            for (Account account : accounts) {
                System.out.println(account.geta());
            }
        }
    }

    public synchronized void withdraw() {
        new Transaction(accounts).withdraw(100, "Kamal");
    }

    public synchronized void deposit() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        new Transaction(accounts).deposit(200, "Kamal");
    }
}
