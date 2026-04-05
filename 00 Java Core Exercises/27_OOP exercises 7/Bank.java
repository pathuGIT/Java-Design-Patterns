import java.util.ArrayList;

public class Bank{
	ArrayList<Account> getAccArr = Account.shareAccArr();
	
	//add data to array
	public void addAcc(Account account){
		getAccArr.add(account);
	}
	
	//remove data from array
	public void remAcc(Account account){
		getAccArr.remove(account);
	}
	
	//Deposite
	public void dep(Account account, int value){
		account.deposite(value);
		
	}
	//Withrdrow
	public void with(Account account, int value){
		account.withdrow(value);
		
	}
	
}