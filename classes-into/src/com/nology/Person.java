package com.nology;

public class Person {
    //Variables
    private String name;
    private int age;
    private Pet pet;

    //Constructor
    public Person(String name, int age) { this.name = name; this.age = age; }

    //Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPetsName() {
        if(pet != null) {
            return pet.getName();
        }
        return "I don't have a pet";
    }

    //Public Methods
    public void DescribeYourself() {
        System.out.println("My name is: " + name + ", and my age is: " + age);
        System.out.println("My pets name is:" + getPetsName());
    }

    public void AdoptPet(Pet pet) {
        this.pet = pet;
        pet.adopt(this);
    }

    public void unadopt() {
        pet = null;
    }

    //Private Methods
}
