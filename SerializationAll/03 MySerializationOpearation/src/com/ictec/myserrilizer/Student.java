package com.ictec.myserrilizer;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private transient int pswd; //not getting serialized
    private static int age; //not getting serialized

    public Student(int id, String name, int pswd, int age) {
        this.id = id;
        this.name = name;
        this.pswd = pswd;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPswd() {
        return pswd;
    }

    public void setPswd(int pswd) {
        this.pswd = pswd;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Student.age = age;
    }
}
