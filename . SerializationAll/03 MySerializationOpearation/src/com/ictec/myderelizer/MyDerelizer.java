package com.ictec.myderelizer;

import com.ictec.myserrilizer.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyDerelizer {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:/Student.scr");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            ois.close();

            System.out.println("Id: "+s.getId() +" Name: "+s.getName()+ " pswd: "+ s.getPswd() +" age: "+s.getAge());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
