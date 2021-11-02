package com.nology;

public class Triangle {
    double width;
    double height;
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        double perim;
        perim = this.width * this.height;
        return perim;
    }

    public double getArea() {
        double rtnArea;
        rtnArea = this.width;
        return rtnArea;
    }
}
