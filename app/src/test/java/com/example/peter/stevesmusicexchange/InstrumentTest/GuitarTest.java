package com.example.peter.stevesmusicexchange.InstrumentTest;

import com.example.peter.stevesmusicexchange.store.instruments.Guitar;

import org.junit.Before;
import org.junit.Test;

import static com.example.peter.stevesmusicexchange.store.instruments.InstrumentType.STRINGS;
import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 27/10/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Ibanez", "Iron Label RGDIX6PB", "Mahogany", "Black", 900.00, 1200.00, 7, "DiMarzio");
    }

    @Test
    public void canPlay(){
        assertEquals("Wow woooow", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300.00, guitar.calculateMarkup(), 0.1);
        assertEquals(300.00, guitar.getMarkup(), 0.1);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(STRINGS, guitar.getType());
    }

}
