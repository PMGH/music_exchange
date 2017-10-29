package com.example.peter.stevesmusicexchange.InstrumentTest;

import com.example.peter.stevesmusicexchange.store.instruments.InstrumentType;
import com.example.peter.stevesmusicexchange.store.instruments.Piccolo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 28/10/2017.
 */

public class PiccoloTest {

    Piccolo piccolo;

    @Before
    public void before(){
        piccolo = new Piccolo("Bulgheroni", "601R", "Cocus Wood", "Brown", 4000.00, 5500.00);;
    }

    @Test
    public void canPlay(){
        assertEquals("Eeeooo WWWoooo", piccolo.play());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.WOODWIND, piccolo.getType());
    }
}
