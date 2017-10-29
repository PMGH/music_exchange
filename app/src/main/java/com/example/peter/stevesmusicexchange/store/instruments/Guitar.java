package com.example.peter.stevesmusicexchange.store.instruments;

/**
 * Created by Peter on 27/10/2017.
 */

public class Guitar extends Instrument {

    private int numStrings;
    private String pickup;

    public Guitar(String make, String model, String material, String colour, double boughtPrice, double sellPrice, int numStrings, String pickup) {
        super(make, model, material, colour, InstrumentType.STRINGS, boughtPrice, sellPrice);
        this.numStrings = numStrings;
        this.pickup = pickup;
    }

    @Override
    public String play() {
        return "Wow woooow";
    }
}
