package com.externalizable.insuper;

import java.io.*;

public class Animal implements Externalizable {
    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.color);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setColor(in.readObject().toString());
    }
}
