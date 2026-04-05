import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		int out = 1;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Input number p: ");
		int x = obj.nextInt();
		System.out.print("Input power n: ");
		int y = obj.nextInt();
		
		for(int i=0; i<y; i++){
			out = out * x;
		}
		System.out.printf("\n The %d to the power %d is: %d\n",x,y,out);
		
	}
}
