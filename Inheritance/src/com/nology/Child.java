package com.nology;

public class Child extends ParentClass {
    public Child (float data) { super(data); }

    public void childMethod() {
        System.out.println("Child method says : " + data);
    }
}
