package com.nology;

public abstract class AbstractClass {

    float aProperty;

    public void setProperty(float prop) {
        aProperty = prop;
    }

    public float getFloatProperty() {
        return aProperty;
    }

    public abstract void undefinedMethod();
}
