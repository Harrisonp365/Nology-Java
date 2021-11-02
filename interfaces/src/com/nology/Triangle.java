package com.nology;

public class Triangle implements Area, Perimeter{
    double a = 0;
    double b = 0;
    double c = 0;

    public Triangle(double a) {
        this.a = this.b = this.c = a;
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        double perim;
        perim = this.a + this.b + this.c;
        return perim;
    }

    public double getArea() {
        double rtnArea;
        rtnArea = this.a;
        return rtnArea;
    }
}
