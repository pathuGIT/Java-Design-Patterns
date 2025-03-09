import java.io.*;

public class MyDesrializer {
    File file;
    FileInputStream fis;
    ObjectInputStream ois;

    public void desrializer(){
        file = new File("F:/Animal.scr");
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            while (true){
                Cat cat = (Cat) ois.readObject();
                System.out.println(cat.toString());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void universityDesrializer(){
        file = new File("F:/Employee.scr");
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    UniversityEmployee universityEmployee = (UniversityEmployee) ois.readObject();
                    System.out.println(universityEmployee.toString());
                    System.out.println("ls");
                } catch (EOFException e) {
                    // End of file reached, break the loop
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void carDesrializer(){
        file = new File("F:/Vehicle.scr");
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Car car = (Car) ois.readObject();
                    System.out.println(car.toString());
                } catch (EOFException e) {
                    // End of file reached, break the loop
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
