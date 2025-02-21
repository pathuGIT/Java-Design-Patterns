package BankingSystem;

public class AccountService {
    public void openAcc(String name){
        System.out.println("Account is opened. for: "+name);
    }
    public void getBalance() {
        System.out.println("Display current balance");
    }

    public void updateBalance() {
        System.out.println("Update current balance");
    }
    public void deleteAcc(){
        System.out.println("Account is deleted.");
    }

}
