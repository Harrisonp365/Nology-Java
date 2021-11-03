package com.nology;

public class Bird extends Animal{
    String name;

    public Bird(String name) {
        this.noise = "scream";
        this.name = name;
    }

    public String toString() {
        return this.name.toString();
    }
}
