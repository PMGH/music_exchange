package com.example.peter.stevesmusicexchange.InstrumentTest;

import com.example.peter.stevesmusicexchange.store.instruments.InstrumentType;
import com.example.peter.stevesmusicexchange.store.instruments.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 27/10/2017.
 */

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", "DGX660", "Metal", "Black", 600.00, 850.00, "Digital");
    }

    @Test
    public void canPlay(){
        assertEquals("Dum dum dum do da dum", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(250.00, piano.calculateMarkup(), 0.1);
        assertEquals(250.00, piano.getMarkup(), 0.1);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

}
