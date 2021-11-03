package com.nology;

public class AnimalBand<T extends Animal>{
    public Animal bandMember;

    public AnimalBand(T animal) {
        bandMember = animal;
    }

    public String play() {
        return bandMember.makeYourNoise();
    }
}
