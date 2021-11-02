package com.nology;

public class Rhombus implements Area, Perimeter{
    double height;

    public Rhombus(double height) {
        this.height = height;
    }
    public double getPerimeter() {
        double perim;
        perim = height * 4;
        return perim;
    }

    public double getArea() {
        double area;
        area = height * height;
        return area;
    }
}
