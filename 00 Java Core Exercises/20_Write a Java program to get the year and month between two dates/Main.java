import java.time.*;

public class Main{
	public static void main(String[] args){
		LocalDate today = LocalDate.now();
		LocalDate otherday = LocalDate.of(2017,3, 14);
		
		Period obj = Period.between(otherday,today); //period used to find diffenernce
		System.out.println("Years: "+obj.getYears()+" Monthes: "+obj.getMonths());
		
	}
}
