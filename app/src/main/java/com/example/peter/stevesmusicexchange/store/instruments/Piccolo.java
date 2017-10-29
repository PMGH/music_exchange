package com.example.peter.stevesmusicexchange.store.instruments;

/**
 * Created by Peter on 28/10/2017.
 */

public class Piccolo extends Instrument {

    public Piccolo(String make, String model, String material, String colour, double boughtPrice, double sellPrice) {
        super(make, model, material, colour, InstrumentType.WOODWIND, boughtPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Eeeooo WWWoooo";
    }
}
