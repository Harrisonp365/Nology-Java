package com.nology;

public class Student extends Person{
    String cohort;

    public Student(String name, String cohort) {
        super(name);
        this.cohort = cohort;
    }

    public void sayYourName() {
        System.out.println("My name is " + name + " and I am from the " + cohort + " cohort.");
    }
}

