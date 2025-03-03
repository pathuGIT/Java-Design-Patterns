package BankingApp;

import java.util.ArrayList;

public class Transaction {
    private final ArrayList<Account> accounts;

    public Transaction(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public synchronized void withdraw(double amount, String name) {
        for (Account account : accounts) {
            if (account.getName().equalsIgnoreCase(name)) {
                if (account.getBalance() >= amount) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Withdraw Rs." + amount + " from " + account.getName() + " Account. Curr balance: "+account.getBalance());
                } else {
                    System.out.println("Insufficient balance for " + account.getName());
                }
                return;
            }
        }
        System.out.println("Account not found: " + name);
    }

    public synchronized void deposit(double amount, String name) {
        for (Account account : accounts) {
            if (account.getName().equalsIgnoreCase(name)) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Deposit Rs." + amount + " to " + account.getName() + " Account. Curr balance: "+account.getBalance());
                return;
            }
        }
        System.out.println("Account not found: " + name);
    }
}
