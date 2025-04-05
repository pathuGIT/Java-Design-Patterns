package com.externalizable.insub;

import java.io.*;

public class Cat extends Animal implements Externalizable {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(color);
        this.name = name;
        this.age = age;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(age);
        out.writeObject(getColor());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setName((String)in.readObject());
        setAge((Integer)in.readObject());
        setColor((String)in.readObject());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
