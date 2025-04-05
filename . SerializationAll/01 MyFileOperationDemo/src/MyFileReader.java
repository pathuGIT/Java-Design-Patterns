import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    File file;
    FileInputStream fileInputStream;

    public void Reader(){
//        file = new File("F:/Data.txt");
//        if(file.exists()){
//            try {
//                fileInputStream = new FileInputStream(file);
//                while(fileInputStream.read() ){
//                    f
//                }
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
        try {
            File myObj = new File("F:/Data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
