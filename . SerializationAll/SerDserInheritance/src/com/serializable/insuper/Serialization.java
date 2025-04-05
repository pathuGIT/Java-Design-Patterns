package com.serializable.insuper;

import java.io.*;

public class Serialization {
    public void serialize(Object obj, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(obj);
        oos.flush();
        oos.close();

    }
}
