package com.example.peter.stevesmusicexchange.store.instruments;

/**
 * Created by Peter on 28/10/2017.
 */

public class DrumSet extends Instrument {

    private String drumSetType;

    public DrumSet(String make, String model, String material, String colour, double boughtPrice, double sellPrice, String drumSetType) {
        super(make, model, material, colour, InstrumentType.PERCUSSION, boughtPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Boom Boom Bang Bang";
    }
}
