package com.nology;

public class Car implements Vehicle{
    private double speed;
    private double formula = 2.237;
    private double speedMS;

    public Car(double speed) {
        this.speed = speed;
    }

    private void convertCarSpeed() {
        this.speedMS = this.speed * formula;
    }

    @Override
    public void getSpeed() {
        convertCarSpeed();
        System.out.println(speedMS + " m/s");
    }

    public double decreaseSpeed(double n) {
        this.speed = this.speed - n;
        convertCarSpeed();
        System.out.println(speedMS + " m/s");
        return speedMS;
    }

    public void setCarSpeed(int speed) {
        this.speed = speed;
    }

    public double getCarSpeed() {
        System.out.println(speed + " mph");
        System.out.println(speedMS + " m/s");
        return speed;
    }
}
