package com.nology;

public class Dog implements MakesSound {
    int age = 10;
//    String breed = "cavalier";
    public Dog(int age){ this.age = age;}

    @Override
    public void makeSounds() {
        if(age < 14) {
            System.out.println("I am a dog and I like to Bark");
        } else {
            System.out.println("I am an old dog and I love to snore");
        }

    }
}
