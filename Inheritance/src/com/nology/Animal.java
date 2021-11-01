package com.nology;

public class Animal {
    String species;
    int numOfLegs;

    public Animal(String species, int numOfLegs){
        this.species = species;
        this.numOfLegs = numOfLegs;
    }

    public void log(){
        System.out.println("This is an animal");
        System.out.println("I am a " + species + " and i have " + numOfLegs + " legs.");
    }
}
