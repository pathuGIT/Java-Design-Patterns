import java.util.Scanner;

public class Main{
	final double PI = 3.14159;
	
	public static void main(String[] args){
		Main mob = new Main();
		double y = mob.PI;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Radius: ");
		double x = obj.nextFloat();
		
		double Aans = y*x*x;
		double Pans = 2*y*x;
		System.out.println("Circle Area is: "+Aans);
		System.out.println("Circle Perimeter is: "+Pans);
		
		
	}
	
	
}