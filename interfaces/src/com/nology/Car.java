package com.nology;

public class Car implements Vehicle{
    private double speed;
    private double formula = 0.447;
    private double speedMS;

    public Car(double speed) {
        this.speed = speed;
    }

    private void convertSpeed() {
        this.speedMS = this.speed * formula;
    }

    @Override
    public void getSpeed() {
        convertSpeed();
        System.out.println(speedMS + " m/s");
    }

    public double decreaseSpeed(double n) {
        this.speed = this.speed - n;
        convertSpeed();
        System.out.println(speedMS + " m/s");
        return speedMS;
    }

    public void setCarSpeed(int speed) {
        this.speed = speed;
    }

    public void getCarSpeed() {
        convertSpeed();
        System.out.println(speedMS + " m/s");
    }
}
