import java.io.*;
import java.util.Scanner;

public class MyFileOperationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File file = new File("F:/Data.txt");
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        int choice;
        do{
            System.out.println("01 Write");
            System.out.println("02 Read");
            System.out.println("03 Exit");
            System.out.print("Select Answer: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    new MyFileWritten(fos).Writer();
                    break;
                case 2:
                    System.out.println("Your File Contained,");
                    new MyFileReader().Reader();
                    break;
            }
        }while(choice != 0);
    }
}
