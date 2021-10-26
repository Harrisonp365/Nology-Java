package com.nology;
import java.lang.Math;

public class Calculator {

    public static Calculator singleton;

    public static void InitCalculator(){
        if(singleton != null) {
            return;
        }
        singleton = new Calculator();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if(a == 0 || b == 0)
            return 0;

        return a / b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double a, double b) {
        return Math.pow(a, b);
    }

    public static double menu(double a, double b, char op) {
        switch(op) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            case '^':
                return power(a, b);
            case 's':
                return sqrt(a, b);
            default:
                System.out.println("Unable to perform calculation");
        }
        return 0;
    }
}