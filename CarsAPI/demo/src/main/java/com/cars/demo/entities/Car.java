package com.cars.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;
    @Getter @Setter
    private String brand;
    @Getter @Setter
    private String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Car(){}
}
