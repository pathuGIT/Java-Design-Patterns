import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int x;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number");
		x = obj.nextInt();
		
		int y = x;
		
		for(int j=1; j<=12; j++){
			int ans = y*j;
			System.out.println(y+" * "+j+" = "+ans);
		}
	}
}