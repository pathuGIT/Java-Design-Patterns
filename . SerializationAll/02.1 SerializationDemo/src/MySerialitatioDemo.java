import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MySerialitatioDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 22);
        Student s2 = new Student("Amal Doe", 22);

        try {
            FileOutputStream fos = new FileOutputStream("F:/student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
