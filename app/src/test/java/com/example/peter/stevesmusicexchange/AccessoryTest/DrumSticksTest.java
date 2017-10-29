package com.example.peter.stevesmusicexchange.AccessoryTest;

import com.example.peter.stevesmusicexchange.store.accessories.DrumSticks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 28/10/2017.
 */

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Vic Firth", 8.00, 11.99);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.99, drumSticks.calculateMarkup(), 0.1);
        assertEquals(3.99, drumSticks.getMarkup(), 0.1);
    }
}
