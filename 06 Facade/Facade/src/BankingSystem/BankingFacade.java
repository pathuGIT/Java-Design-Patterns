package BankingSystem;

public class BankingFacade {
    private AccountService accountService;
    private TransactionService transactionService;
    private NotificationService notificationService;

    public BankingFacade(AccountService accountService, TransactionService transactionService, NotificationService notificationService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
        this.notificationService = notificationService;
    }

    public void openAccount(String name) {
        accountService.openAcc("kamal");
        notificationService.notification();
    }

    public void deposit() {
        transactionService.deposit();
        notificationService.notification();
        accountService.getBalance();
    }

    public void withdraw() {
        transactionService.withdraw();
        notificationService.notification();
        accountService.getBalance();
    }

}
