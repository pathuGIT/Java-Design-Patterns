import java.io.File;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
	
		try{
			File nf = new File("exam.txt");
			nf.createNewFile();
			
			if(nf.canRead()){	//used canRead() and canWrite()
				System.out.println("can read");
			}else if(nf.canWrite()){
				System.out.println("can write");
			}else{
				System.out.println("both no");
			}
			
		}catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace(); 
		}
		
		
	}
}