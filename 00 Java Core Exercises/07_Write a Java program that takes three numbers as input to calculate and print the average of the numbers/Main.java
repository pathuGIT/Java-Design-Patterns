import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter num1: ");
		float x = obj.nextFloat();
		System.out.print("Enter num2: ");
		float y = obj.nextFloat();
		System.out.print("Enter num3: ");
		float z = obj.nextFloat();
		
		
		System.out.print("Average is: "+((x+y+z)/3));
		
		
		
	}
	
	
}