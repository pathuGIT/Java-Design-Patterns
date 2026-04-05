import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		float swap;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter num1: ");
		float x = obj.nextFloat();
		System.out.print("Enter num2: ");
		float y = obj.nextFloat();
		
		swap = x;
		x = y;
		y = swap;
		
		System.out.println("\nAfter Swapping");
		System.out.println("num1: "+x);
		System.out.println("num2: "+y);
	}
	
	
}