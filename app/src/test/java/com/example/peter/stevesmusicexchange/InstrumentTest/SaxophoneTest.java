package com.example.peter.stevesmusicexchange.InstrumentTest;

import com.example.peter.stevesmusicexchange.store.instruments.InstrumentType;
import com.example.peter.stevesmusicexchange.store.instruments.Saxophone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 27/10/2017.
 */

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Keilworth", "MKX Alto", "German Brass", "Brass", 2450.00, 2900.00);
    }

    @Test
    public void canPlay(){
        assertEquals("Doo Doo do do do do do", saxophone.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(450.00, saxophone.calculateMarkup(), 0.1);
        assertEquals(450.00, saxophone.getMarkup(), 0.1);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

}
