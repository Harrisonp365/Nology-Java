package com.nology;

public class Pet {
    //Variables
    private String name;
    private int age;
    private Person owner;

    //Constructor
    public Pet(String name, int age) { this.name = name; this.age = age; }

    //Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    //Public Methods
    public void DescribeYourself() {
        System.out.println("My name is: " + name + ", and my age is: " + age);
    }

    public String getOwnerName() { return owner.getName(); }

    public void adopt(Person newOwner) {
        if(owner != null) {
            owner.unadopt();
        }

        owner = newOwner;
    }

    //Private Methods
}