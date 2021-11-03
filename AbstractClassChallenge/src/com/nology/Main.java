package com.nology;

public class Main {

    public static void main(String[] args) {
        LatteGlass latte = new LatteGlass(150);
        System.out.println(latte.teaspoonCount());
        ShotGlass ausShot = new ShotGlass(ShotGlass.countryCodes.Aus);
        System.out.println(ausShot.teaspoonCount());
        ShotGlass usShot = new ShotGlass(ShotGlass.countryCodes.US);
        System.out.println(usShot.teaspoonCount());
        ShotGlass polShot = new ShotGlass(ShotGlass.countryCodes.Pol);
        System.out.println(polShot.teaspoonCount());
        Mug mug = new Mug(300);
        System.out.println(mug.teaspoonCount());
    }
}
