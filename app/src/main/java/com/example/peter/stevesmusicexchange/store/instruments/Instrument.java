package com.example.peter.stevesmusicexchange.store.instruments;

import com.example.peter.stevesmusicexchange.store.behaviours.Playable;
import com.example.peter.stevesmusicexchange.store.behaviours.Sellable;

/**
 * Created by Peter on 27/10/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    private String make;
    private String model;
    private String material;
    private String colour;
    private InstrumentType type;
    private double boughtPrice;
    private double sellPrice;
    private double markup;

    public Instrument(String make, String model, String material, String colour, InstrumentType type, double boughtPrice, double sellPrice) {
        this.make = make;
        this.model = model;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.markup = calculateMarkup();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getMarkup() {
        return markup;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }
}
