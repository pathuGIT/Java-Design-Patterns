import java.util.ArrayList;

public class Main{
	public static ArrayList<Account> getAccArr = Account.shareAccArr();
	public static void showAcc(){
		
		for(Account i: getAccArr){
			System.out.println(i.getName()+","+i.getAge()+","+i.getTotal());
		}
	}
	
	public static void main(String[] args){
		Account acc1 = new Account("Kamal",22,101,12000);
		Account acc2 = new Account("Anu",21,102,15000);
		
		Bank BnkObj = new Bank();
		//create account
		BnkObj.addAcc(acc1);
		BnkObj.addAcc(acc2);
		
		System.out.println("\nBefore remove account");
		showAcc();
		
		//remove account
		BnkObj.remAcc(acc1);
		
		System.out.println("\nAfter remove account");
		showAcc();
		
		BnkObj.dep(acc2,1045); //deposite the money
		showAcc();
		
		BnkObj.with(acc2,500); //withdrow the money
		showAcc();
	}
}