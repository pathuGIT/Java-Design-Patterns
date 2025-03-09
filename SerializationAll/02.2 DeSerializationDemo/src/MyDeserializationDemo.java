import java.io.*;

public class MyDeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:/student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s;
            while (true) {
                s = (Student) ois.readObject();
                System.out.println("Id: " + s.getId() + " Name: " + s.getName());
            }
//            Student s1 = (Student) ois.readObject();
//            System.out.println(s1.getId()+" "+s1.getName());
//
//            Student s2 = (Student) ois.readObject();
//            System.out.println(s2.getId()+" "+s2.getName());


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
