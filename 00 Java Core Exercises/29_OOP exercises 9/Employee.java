import java.time.LocalDate; //import current date
import java.time.format.DateTimeFormatter; //import formatter

public class Employee{
	private String name;
	private double salery;
	private String date;
	
	
	public Employee(String name, double salery, String date){
		this.name = name;
		this.salery = salery;
		this.date = date;
	}
	
	public String getName(){
		return name;
	}
	public double getSalery(){
		return salery;
	}
	public String getDate(){
		return date;
	}
	
	//convert string type date into date object
	public LocalDate parseDate(String userDate){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return LocalDate.parse(date,formatter);
	}
	
	//calculate service year
	public int serviseYear(){
		LocalDate nowDate = LocalDate.now(); //current date
		LocalDate hireDate = parseDate(getDate()); //call to the parseDate() method and assign it to hireDate object
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy"); //this is the pattern to filter the year
		
		//string type date convert to integer type using 'Integer.parseInt()' 
		int year = Integer.parseInt(nowDate.format(myFormat)) - Integer.parseInt(hireDate.format(myFormat));
		
		return year;
	}
	
	//display the employee details
	public void empDetail(){
		System.out.println("\nEmployee name: "+name+"\nSalery: "+salery+"\nHire date: "+date+"\nYears of service: "+serviseYear());
	}
}