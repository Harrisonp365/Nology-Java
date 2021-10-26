package com.nology;

public class Main {
    public static void main(String[] args) {

//        Person Harry = new Person("Harry", 25);
//        Pet Rocko = new Pet("Rocko", 16);
//        Harry.AdoptPet(Rocko);
//        Person Oscar = new Person("Oscar", 23);
//        Oscar.AdoptPet(Rocko);
//        Harry.DescribeYourself();
//        Oscar.DescribeYourself();
//        System.out.println(Rocko.getOwnerName());

        Animal Dog = new Animal("Dog", "woof");
        Animal Bear = new Animal("bear", "roar");
        Animal Cat = new Animal();
        System.out.println(Dog.getSound());
        System.out.println(Bear.getSound());
        System.out.println(Cat.getSound());

    }
}
