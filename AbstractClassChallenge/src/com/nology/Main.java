package com.nology;

public class Main {

    public static void main(String[] args) {
        LatteGlass latte = new LatteGlass(150);
        System.out.println(latte.teaspoonCount());
        ShotGlass ausShot = new ShotGlass(ShotGlass.countryCodes.Aus);
        System.out.println(ausShot.teaspoonCount());
        Mug mug = new Mug(300);
        System.out.println(mug.teaspoonCount());
    }
}
