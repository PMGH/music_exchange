package com.example.peter.stevesmusicexchange.AccessoryTest;

import com.example.peter.stevesmusicexchange.store.accessories.GuitarStrings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 28/10/2017.
 */

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Ernie Ball", 4.99, 6.99);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.00, guitarStrings.calculateMarkup(), 0.1);
        assertEquals(2.00, guitarStrings.getMarkup(), 0.1);
    }

}
