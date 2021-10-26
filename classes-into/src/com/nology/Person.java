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
    public String getPet() {
        if(pet != null) {
            return pet.getName();
        }
        return "I don't have a pet";
    }

    //Public Methods
    public void DescribeYourself() {
        System.out.println("My name is: " + name + ", and my age is: " + age);
        System.out.println("My pets name is:" + getPet());
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    //Private Methods

    //override methods
    @Override
    public String toString() {
        return name;
    }
}
