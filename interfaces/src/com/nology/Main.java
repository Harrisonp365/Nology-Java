package com.nology;
//What is polymorphism?
//--ArrayList, Vector, LinkedList <-- all have same basic methods from List interface
//What are interfaces?
//Interfaces are a way of forcing the implimentation of methods
//How can we use interfaces?
//Inheritance VS polymorphism
public class Main {

    public static void main(String[] args) {
//	Pig newPig = new Pig();
//	newPig.makeSounds();
//	Dog newDog = new Dog(15);
//	newDog.makeSounds();

//		Bike bike1 = new Bike(100);
//		bike1.getSpeed();
//        bike1.getBikeSpeed();
//		bike1.setSpeed(110);
//        bike1.getSpeed();
//        bike1.getBikeSpeed();
//        bike1.decreaseSpeed(10);
//
//        Car car1 = new Car(100);
//        car1.getSpeed();
//        car1.getCarSpeed();
//        car1.setCarSpeed(110);
//        car1.getSpeed();
//        car1.getCarSpeed();
//        car1.decreaseSpeed(10);

        Triangle newTri = new Triangle(10, 15);
        System.out.println(newTri.getPerimeter());
        System.out.println(newTri.getArea());

        Circle newCircle = new Circle(5);
        System.out.println(newCircle.getPerimeter());
        System.out.println(newCircle.getArea());

        Rhombus newRom = new Rhombus(5);
        System.out.println(newRom.getPerimeter());
        System.out.println(newRom.getArea());
    }
}
