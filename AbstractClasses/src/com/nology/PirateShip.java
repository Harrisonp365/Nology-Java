package com.nology;

public class PirateShip extends Vessel{

    PirateShip() {
        vesselType = "Pirate ship";
        setBouyancy(5000);
    }

    public void fireWeapons() {
        System.out.println("Time to fire the cannons boys");
    }
}
