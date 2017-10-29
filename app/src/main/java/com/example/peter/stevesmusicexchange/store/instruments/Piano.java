package com.example.peter.stevesmusicexchange.store.instruments;

/**
 * Created by Peter on 27/10/2017.
 */

public class Piano extends Instrument {

    private String pianoType;

    public Piano(String make, String model, String material, String colour, double boughtPrice, double sellPrice, String pianoType) {
        super(make, model, material, colour, InstrumentType.KEYBOARD, boughtPrice, sellPrice);
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "Dum dum dum do da dum";
    }
}
