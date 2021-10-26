package com.nology;

public class AdoptionCenter {
    //Static members
    public static AdoptionCenter singleton;
    public static boolean isAdoptionLegal = true;
    public static void InitAdoptionCenter() {
        if(singleton != null) {
            return;
        }
        singleton = new AdoptionCenter();
    }

    public boolean isOpen = false;



    AdoptionCenter() { isOpen = true; singleton = this; }

    public void adoptPet(Person person, Pet pet) {

        if(pet.getOwner() != null || person.getPet() != null) {
            System.out.println(String.format("The person %s can not adopt %s", person.getName(), pet.getName()));
            return;
        }

        person.setPet(pet);
        pet.setPerson(person);
    }
}
