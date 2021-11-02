package com.nology;

import com.nology.MakesSound;

public class Pig implements MakesSound {
    String sound = "oink";
    String name = "George";

    public Pig(){}

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public void makeSounds() {
        System.out.println("Hi i'm " + name + " and I like to " + sound);
    }
}
