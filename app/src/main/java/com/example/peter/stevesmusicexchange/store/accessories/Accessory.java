package com.example.peter.stevesmusicexchange.store.accessories;

import com.example.peter.stevesmusicexchange.store.behaviours.Sellable;

/**
 * Created by Peter on 28/10/2017.
 */

public abstract class Accessory implements Sellable {

    private String make;
    private double boughtPrice;
    private double sellPrice;
    private double markup;

    public Accessory(String make, double boughtPrice, double sellPrice) {
        this.make = make;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.markup = calculateMarkup();
    }

    public String getMake() {
        return make;
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
