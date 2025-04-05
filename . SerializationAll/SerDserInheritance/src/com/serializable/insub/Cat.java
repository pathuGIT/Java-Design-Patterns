package com.serializable.insub;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    private String name;
    public Cat(String color, String name) {
        super(color);
        this.name = name;
    }

    public Cat(String color) {
        super(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getColor());
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        setColor((String) in.readObject());
    }
}
