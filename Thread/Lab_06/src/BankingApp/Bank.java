package BankingApp;

public class Bank implements Runnable{


    @Override
    public void run() {
        String service = Thread.currentThread().getName();

        if(service.equalsIgnoreCase("openacc")){
            Service.getInstance().createAccount();
        } else if (service.equalsIgnoreCase("showacc")) {
            Service.getInstance().showAccounts();
        } else if (service.equalsIgnoreCase("withdraw")) {
            Service.getInstance().withdraw();
        } else if (service.equalsIgnoreCase("deposit")) {
            Service.getInstance().deposit();
        }
    }
}
