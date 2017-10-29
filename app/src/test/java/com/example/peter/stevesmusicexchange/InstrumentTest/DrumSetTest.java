package com.example.peter.stevesmusicexchange.InstrumentTest;

import com.example.peter.stevesmusicexchange.store.instruments.DrumSet;
import com.example.peter.stevesmusicexchange.store.instruments.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 28/10/2017.
 */

public class DrumSetTest {

    DrumSet drumSet;

    @Before
    public void before(){
        drumSet = new DrumSet("Roland", "TD-11KV", "Metal", "Black", 1000.00, 1250.00, "Electronic");
    }

    @Test
    public void canPlay(){
        assertEquals("Boom Boom Bang Bang", drumSet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(250.00, drumSet.calculateMarkup(), 0.1);
        assertEquals(250.00, drumSet.getMarkup(), 0.1);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drumSet.getType());
    }
}
