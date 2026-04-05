import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
	public static void main(String[] args){
		LocalDateTime obj = LocalDateTime.now();
		DateTimeFormatter mformat = DateTimeFormatter.ofPattern("HH");
		String D = obj.format(mformat);
		
		//Add a 1 hour to current hour
		int a = Integer.parseInt(D) + 1;
		System.out.println("Local Time hour Is: "+a);
		
	}
}
