package com.externalizable.insuper;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        File file = new File("D:/temp/serializable4.ser");
        Cat cat = new Cat("qqqq",3,"zzqqqqqqqqqqqqq");
        try {
            new Serialization().serialize(cat, file);
            new Desrialization().deserilize(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
