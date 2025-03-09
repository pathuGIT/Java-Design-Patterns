import java.io.*;

public class MySerializer {
    File file;
    FileOutputStream fos;
    ObjectOutputStream oos;

    public void serializer(Cat cat){
        file = new File("F:/Animal.scr");
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(cat);
            fos.flush();
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void universitySerializer(UniversityEmployee universityEmployee){
        file = new File("F:/Employee.scr");
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(universityEmployee);
            fos.flush();
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void carSerializer(Car car){
        file = new File("F:/Vehicle.scr");
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(car);
            fos.flush();
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
