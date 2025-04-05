package com.serializable.insuper;

import java.io.*;

public class Desirializable {
    public void Desirializable(File file){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Cat cat = (Cat) objectInputStream.readObject();
            System.out.println(cat.getSound()+cat.getName()+cat.getAge());
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
