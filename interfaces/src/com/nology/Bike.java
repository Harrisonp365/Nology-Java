package com.nology;

public class Bike implements Vehicle {
    private double speedMPH;
    private double speedKMH;
    private double conversionRate = 1.60;

    public Bike(double speed) {
        this.speedMPH = speed;
    }

    private void convertBikeSpeed() {
        this.speedKMH = this.speedMPH * conversionRate;
    }

    @Override
    public void getSpeed() {
        convertBikeSpeed();
        System.out.println(this.speedKMH + " km/h");
    }
    @Override
    public double decreaseSpeed(double n) {
        this.speedMPH = this.speedMPH - n;
        convertBikeSpeed();
        System.out.println(speedKMH + " km/h");
        return speedKMH;
    }

    public void setSpeed(double speed) {
        this.speedMPH = speed;
        convertBikeSpeed();
    }

    public double getBikeSpeed() {
        double rtnSpeed = this.speedMPH;
        System.out.println(rtnSpeed + " miles/h");
        return rtnSpeed;
    }

}
