package com.nology;

public abstract class Container {
    protected double volume;

    public abstract double getVolume();
    public double teaspoonCount() {
        double vol = getVolume();
        return vol / 150;
    };
}
