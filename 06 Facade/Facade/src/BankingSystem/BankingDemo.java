package BankingSystem;

public class BankingDemo {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        AccountService accountService = new AccountService();
        NotificationService notificationService = new NotificationService();

        BankingFacade bankingFacade = new BankingFacade(accountService,transactionService,notificationService);
        bankingFacade.openAccount("Nimal");
        bankingFacade.deposit();
        bankingFacade.withdraw();
    }
}
