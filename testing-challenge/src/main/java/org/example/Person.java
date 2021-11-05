package org.example;

import lombok.Getter;
import lombok.Setter;

public class Person {
    final Double tax = 25.0;
    @Getter
    @Setter
    private Double salary;
    @Getter
    @Setter
    private Double superRate;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;

    public Person(){}

    public Person(String firstName, String lastName){
        //unemployed
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Double superRate, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.superRate = superRate;
        this.salary = salary;
    }

    public Double getSalaryAfterTax(){
        Double salaryAfterTax = getSalary() / .25;
        return salaryAfterTax;
    }

    public Double getSuperAmount(){
        Double superAmt = getSuperRate() * getSalaryAfterTax();
        return superAmt;
    }

    public Double getSalaryPackageAmount(){
        Double salaryPack = getSuperAmount() + getSalaryAfterTax();

    return salaryPack;
    }
}
