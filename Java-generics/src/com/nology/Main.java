package com.nology;

//GENERICS
//In arrayList<T>, the T is the generic type
//<T> is a type that could be anything

//How can we support multiptle types?
// how can we implement generics in Java?
//How do we add bound to our generics?

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("One");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");

        Person<Bird> Harry = new Person<>(new Bird("Mango"));
        Harry.tellUsYourFav();
        Person<Cat> Danni = new Person<>(new Cat("Beryl"));
        Danni.tellUsYourFav();

        ListUtil<ArrayList> myArrList = new ListUtil<>(stringArrayList);
        System.out.println(myArrList.join("_ "));

        AnimalBand<Bird> borbBand = new AnimalBand<Bird>(Harry.favouriteThing);
        System.out.println(borbBand.play());
    }
}
