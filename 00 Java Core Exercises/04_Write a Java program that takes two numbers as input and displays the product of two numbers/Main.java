import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter First num: ");
		int n1 = obj.nextInt();
		
		System.out.println("Enter First num: ");
		int n2 = obj.nextInt();
		
		int ans = n1*n2;
		System.out.println(n1+" * "+n2+" = "+ans);
	}
}