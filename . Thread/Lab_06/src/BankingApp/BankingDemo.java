package BankingApp;

public class BankingDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        new Thread(bank,"OPENACC").start();
        new Thread(bank,"SHOWACC").start();
        new Thread(bank,"WITHDRAW").start();
        new Thread(bank,"DEPOSIT").start();
    }
}
