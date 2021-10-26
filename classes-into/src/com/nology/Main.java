package com.nology;

public class Main {
    public static void main(String[] args) {

        AdoptionCenter.InitAdoptionCenter();
        Person Harry = new Person("Harry", 25);
        Pet Rocko = new Pet("Rocko", 16);
        AdoptionCenter.singleton.adoptPet(Harry, Rocko);


//        Animal Dog = new Animal("Dog", "woof");
//        Animal Bear = new Animal("bear", "roar");
//        Animal Cat = new Animal();
//        System.out.println(Dog.getSound());
//        System.out.println(Bear.getSound());
//        System.out.println(Cat.getSound());
//        System.out.println(Dog.type);
    }
}
