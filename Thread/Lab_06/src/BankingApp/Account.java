package BankingApp;

public class Account{
    private double balance;
    private String name;
    private int age;
    private String nic;

    public Account(String name, int age, String nic, double balance) {
        this.balance = balance;
        this.name = name;
        this.age = age;
        this.nic = nic;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNic() {
        return nic;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String geta(){
        return name + " | Age: " + age + " | NIC: " + nic + " | Balance: $" + balance;
    }

}
