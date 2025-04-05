import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MyFileWritten {

    FileOutputStream fos;

    public MyFileWritten(FileOutputStream fos) {
        this.fos = fos;
    }

    Scanner sc = new Scanner(System.in);

    public void Writer(){
        try {

            System.out.print("Enter Text: ");
            String txt = sc.nextLine();

            fos.write(txt.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
