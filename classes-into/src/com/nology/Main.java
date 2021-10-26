package com.nology;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        AdoptionCenter.InitAdoptionCenter();
//        Person Harry = new Person("Harry", 25);
//        Pet Rocko = new Pet("Rocko", 16);
//        AdoptionCenter.singleton.adoptPet(Harry, Rocko);
//        System.out.println(Harry);

        Calculator.InitCalculator();
        Scanner scan = new Scanner(System.in);

        System.out.println(Calculator.menu(5, 1, '+'));
        System.out.println(Calculator.menu(5, 1, '-'));
        System.out.println(Calculator.menu(5, 2, '*'));
        System.out.println(Calculator.menu(5, 1, '/'));
        System.out.println(Calculator.menu(5, 2, '^'));
        System.out.println(Calculator.menu(5, 0.5,'s'));
    }
}
