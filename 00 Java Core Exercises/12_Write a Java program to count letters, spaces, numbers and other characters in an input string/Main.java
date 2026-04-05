import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class Main{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = obj.nextLine();
		
		char[] ch = str.toCharArray();
		int letrCoun = 0;
		int numCoun = 0;
		int spaCoun = 0;
		int othCoun = 0;
		
		for(char c : ch){
			
			if(Pattern.matches("[a-zA-Z]", Character.toString(c)) == true){
				letrCoun += 1;
				
			}else if(Pattern.matches("\\d+", Character.toString(c)) == true){
				numCoun += 1;
			}else if(Pattern.matches("\\s+", Character.toString(c)) == true){
				spaCoun += 1;
			}else{
				othCoun += 1;
			}
		}
		
		System.out.println("Letter: "+letrCoun);
		System.out.println("Number: "+numCoun);
		System.out.println("Space: "+spaCoun);
		System.out.println("Other: "+othCoun);
	}
}
