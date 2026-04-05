import java.util.ArrayList;

public class Account{
	private String name;
	private int age;
	private int id;
	private int total;
	
	private static ArrayList<Account> acc = new ArrayList<Account>();
	
	public Account(String name, int age, int id, int total){
		this.name = name;
		this.age = age;
		this.id = id;
		this.total = total;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setId(int Id){
		this.id = Id;
	}
	public int getId(){
		return id;
	}
	
	public void setTotal(int total){
		this.total = total;
	}
	public int getTotal(){
		return total;
	}
	
	//Deposite the account
	public void deposite(int xx){
		total += xx;
	}
	//Withdrow the account
	public void withdrow(int xx){
		total -= xx;
	}
	
	public static ArrayList<Account> shareAccArr(){
		return acc;
	}
	

}