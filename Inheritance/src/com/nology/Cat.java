package com.nology;

public class Cat extends Animal{
    int numOfWhiskers;

    public Cat() {
        super("Cat", 4);
        numOfWhiskers = 8;
    }

    public void log() {
        System.out.println("I am a " + species + " and i have " + numOfLegs + " legs and I have " + numOfWhiskers + " Whiskers");
    }
}
