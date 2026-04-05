import java.io.File;
import java.io.FilenameFilter;

public class Main{
	public static void main(String[] args){
		File mf = new File("C:\\Users\\Pathum\\Documents\\java");
		
		//filter file extension 
		FilenameFilter obj = new FilenameFilter(){
			@Override
			public boolean accept(File dir,String name){
				return name.endsWith(".java");
			}
		};
		
		String[] list = mf.list(obj); //list the files inside the directory
		
		for(String i: list){
			System.out.println(i);
		}
	}
}