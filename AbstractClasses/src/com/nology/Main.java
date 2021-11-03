package com.nology;

public class Main {
    //What are abstract classes
    //How are they differ from regular classes?
    //How do they differ from interfaces?
    //What is a function signature?
    //What does the abstract keyword do?
    public static void main(String[] args) {
//	AbstractChild childClass = new AbstractChild();
//	childClass.setProperty(30);
//	childClass.undefinedMethod();

	RowBoat rowBoat = new RowBoat();
	rowBoat.setVessel("RowBoat");
	rowBoat.setBouyancy(100);
	rowBoat.fireWeapons();
	rowBoat.doesItFloat(50);

	PirateShip pirate = new PirateShip();
	pirate.fireWeapons();
	pirate.doesItFloat(5000);
    }
}
