import java.io.*;
import java.util.*;

public class Main{
	public static Random rand = new Random();
	
	public static char simpal(){
		int n = rand.nextInt(122 - 97 + 1)+97;
		char x = (char)n;
		return x;
	}
	public static char capital(){
		int n = rand.nextInt(90 - 65 + 1)+65;
		char x = (char)n;
		return x;
	}
	public static char numbers(){
		int n = rand.nextInt(57 - 48 + 1)+48;
		char x = (char)n;
		return x;
	}
	public static char symbol(){
		int W = rand.nextInt(46 - 33 + 1)+33;
		int X = rand.nextInt(64 - 58 + 1)+58;
		int Y = rand.nextInt(96 - 91 + 1)+91;
		int Z = rand.nextInt(126 - 123 + 1)+123;
		
		
		
		int ans = rand.nextInt(90 - 87 + 1)+87;
		char itocha = (char)ans;
		char x;
		
		if(itocha == 'W'){
			x = (char)W;
		}else if(itocha == 'X'){
			x = (char)X;
		}else if(itocha == 'Y'){
			x = (char)Y;
		}else{
			x = (char)Z;
		}
		return x;
		
	}
	public static int getNumber(){
		int INT = rand.nextInt(15 - 0 + 1)+0;
		return INT;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Input the lengh: ");
		int input = scn.nextInt();
		
		System.out.println("\nOutput: ");
		for(int u=0; u<input; u++){
			if(u<((input/4))){
				System.out.print(simpal());
			}else if(u<((input/3)+(input/3))){
				System.out.print(symbol());
			}else if(u<((input/2)+(input/2)-2)){
				System.out.print(capital());
			}else if(u<input){
				System.out.print(numbers());
			}
			
		}
		System.out.print("\n");
	}
}