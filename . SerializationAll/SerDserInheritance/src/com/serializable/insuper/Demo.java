package com.serializable.insuper;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat("mja", 2, "zww");
        File file = new File("D:/temp/serializable2.ser");
        try {
            new Serialization().serialize(cat, file);
            new Desirializable().Desirializable(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
