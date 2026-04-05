import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner getPath = new Scanner(System.in);
		System.out.print("Input the path: ");
		String path = getPath.nextLine();
		File mf = new File(path);
		
		System.out.print("\nOutput: \n");
		for(String i: mf.list()){
			System.out.println(i);
		}
		
	}
}