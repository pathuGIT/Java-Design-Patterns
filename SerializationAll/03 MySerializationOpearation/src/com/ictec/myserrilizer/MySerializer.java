package com.ictec.myserrilizer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MySerializer {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("F:/Student.scr");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Student(1, "kamal", 1234, 22));
            oos.writeObject(new Student(2, "kamal", 5678, 35));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
