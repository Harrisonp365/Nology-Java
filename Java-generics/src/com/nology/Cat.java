package com.nology;

public class Cat extends Animal{
    String name;

    public Cat(String name) {
        this.noise = "meow";
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
