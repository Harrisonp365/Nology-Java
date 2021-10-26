package com.nology;

public class Animal {
    private String name = "Cat";
    private String sound = "meow";
    public static String type = "animal";

    //Constructors
    public Animal() {}
    public Animal(String name, String sound) { this.name = name; this.sound = sound; }

    public String getSound() {
        return sound;
    }

}
