package com.serializable.insub;

import java.io.*;

public class Deserilization {
    public static void deserilize(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Cat cat = (Cat) objectInputStream.readObject();
            System.out.println(cat.getName()+cat.getColor());
            objectInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
