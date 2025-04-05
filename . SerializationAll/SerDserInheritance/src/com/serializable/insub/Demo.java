package com.serializable.insub;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        File file = new File("D:/temp/serializable.ser");
        Cat cat = new Cat("yelow","chilly");
        try {
            Serialization.serialize(cat,file);
            Deserilization.deserilize(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
