package com.externalizable.insub;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        File file = new File("D:/temp/serializable3.ser");
        Cat cat = new Cat("xss",3,"red");
        try {
            new Serialization().serialize(cat, file);
            new Desrialization().deserilize(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
