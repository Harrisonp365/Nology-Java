package com.nology;

public class ShotGlass extends Container {
    //using ENUMS
    final double ausSize = 30;
    final double usSize = 44;
    final double polSize = 50;

    enum countryCodes {
        Aus, US, Pol
    };

    countryCodes currentCountry;

    public ShotGlass(countryCodes country) {
        currentCountry = country;
    }

    public double getVolume() {

        switch(currentCountry) {
            case Aus: return ausSize;
            case US: return usSize;
            case Pol: return polSize;
            default: return -1;
        }
    }
}
