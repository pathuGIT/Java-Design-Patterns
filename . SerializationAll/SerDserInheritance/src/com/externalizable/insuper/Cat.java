package com.externalizable.insuper;

import java.io.*;

public class Cat extends Animal implements Externalizable {
    private String name;
    private int age;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String color) {
        super(color);
        this.name = name;
        this.age = age;
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);  // Serialize parent class fields
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in); // Deserialize parent class fields
        this.name = (String) in.readObject();
        this.age = in.readInt();
    }
}
