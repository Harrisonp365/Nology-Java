package com.nology;

public class Animal {
    private String name = "Cat";
    private String sound = "meow";

    //Constructors
    public Animal() {}
    public Animal(String name, String sound) { this.name = name; this.sound = sound; }

    public String getSound() {
        return sound;
    }
}
