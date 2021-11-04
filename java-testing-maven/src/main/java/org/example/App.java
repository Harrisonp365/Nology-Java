package org.example;

public class App {
    public static void main( String[] args ) {
        RegularTriangle tri = new RegularTriangle(123.);
        System.out.printf("Side length %f%n", tri.getSide());
        tri.setSide(522D);
        System.out.printf("Side length %f%n", tri.getSide());

        tri.setSide(null);
        try{
            System.out.printf("Side length %f%n", tri.getPerimeter());
        } catch (TriangleException error) {
            System.out.printf("get Perim has failed%n");
            System.out.printf("The error: %s%n", error.toString());
        }
        //exceptions always must be handled but errors do not have to be
    }
}
