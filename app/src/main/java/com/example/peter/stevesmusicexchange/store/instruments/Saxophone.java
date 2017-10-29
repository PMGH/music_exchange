package com.example.peter.stevesmusicexchange.store.instruments;

/**
 * Created by Peter on 27/10/2017.
 */

public class Saxophone extends Instrument {

    public Saxophone(String make, String model, String material, String colour, double boughtPrice, double sellPrice) {
        super(make, model, material, colour, InstrumentType.BRASS, boughtPrice, sellPrice);
    }

    @Override
    public String play() {
        return "Doo Doo do do do do do";
    }
}
