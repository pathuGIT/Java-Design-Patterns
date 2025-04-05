package com.serializable.insuper;

public class Cat extends Animal {
    private String sound;

    public Cat(String name, int age, String sound) {
        super(name, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
