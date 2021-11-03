package com.nology;

public abstract class Vessel {
    protected double bouyancy;
    protected String vesselType;

    public String getVesselType() {
        return vesselType;
    }

    public void setVessel(String type) {
        vesselType = type;
    }

    public void setBouyancy(float bouyancy){
        this.bouyancy = bouyancy;
    }

    public boolean doesItFloat(double weight) {
        if(weight > bouyancy) {
            System.out.println("The vessel has sunk");
            return false;
        }
            System.out.println("The vessel can float");
            return false;
    }

    public abstract void fireWeapons();
}
