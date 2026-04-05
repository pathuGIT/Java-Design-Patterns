import java.util.*;

public class Main{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		int after1Year;
		int befor1Year;
		int currDate;
		
		cal.add(Calendar.YEAR, -1);
		after1Year = cal.get(Calendar.DATE);
		
		cal.add(Calendar.YEAR, 1);
		befor1Year = cal.get(Calendar.DATE);
		
		cal.add(Calendar.YEAR, 0);
		currDate = cal.get(Calendar.DATE);
		
		if(after1Year == currDate && befor1Year == currDate){
			System.out.println("Yes Date are same");
		}else{
			System.out.println("No Date are not same");
		}
		
	}
}