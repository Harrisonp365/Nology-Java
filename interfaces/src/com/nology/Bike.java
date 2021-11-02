package com.nology;

public class Bike implements Vehicle {
    private double speedMPH;
    private double speedKMH;

    public Bike(double speed) {
        this.speedMPH = speed;
    }

    private void convertSpeed() {
        this.speedKMH = this.speedMPH * 1.60;
    }

    @Override
    public void getSpeed() {
        convertSpeed();
        System.out.println(this.speedKMH + " km/h");
    }
    @Override
    public double decreaseSpeed(double n) {
        this.speedMPH = this.speedMPH - n;
        convertSpeed();
        System.out.println(speedKMH + " km/h");
        return speedKMH;
    }

    public void setSpeed(double speed) {
        this.speedMPH = speed;
        convertSpeed();
    }

    public double getBikeSpeed() {
        double rtnSpeed = this.speedMPH;
        System.out.println(rtnSpeed + " miles/h");
        return rtnSpeed;
    }

}
