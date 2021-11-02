package com.nology;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double perim;
        perim = 2 * Math.PI * this.radius;
        return perim;
    }

    public double getArea() {
        double rtnArea;
        rtnArea = Math.PI * radius * radius;
        return rtnArea;
    }

}
