package com.nology;

public class Person<T> {
    T favouriteThing;

    public Person(T favouriteThing){
        this.favouriteThing = favouriteThing;
    }

    public void tellUsYourFav() {
        System.out.println(favouriteThing.toString());
    }
}
