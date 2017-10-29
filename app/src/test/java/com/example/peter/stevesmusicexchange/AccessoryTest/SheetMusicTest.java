package com.example.peter.stevesmusicexchange.AccessoryTest;

import com.example.peter.stevesmusicexchange.store.accessories.SheetMusic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 28/10/2017.
 */

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Absolute Beginners Guitar", 6.99, 9.99);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, sheetMusic.calculateMarkup(), 0.1);
        assertEquals(3.00, sheetMusic.getMarkup(), 0.1);
    }
}
