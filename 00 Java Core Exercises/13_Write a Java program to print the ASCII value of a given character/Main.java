import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter any character: ");
		String CH = obj.nextLine();
		
		char[] ch = new char[1];
		ch[0] = CH.charAt(0);
		
		int out = ch[0];
		System.out.println("The ASCII value is: "+out);
		
		
	}
}
