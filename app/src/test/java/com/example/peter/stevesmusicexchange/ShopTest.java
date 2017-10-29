package com.example.peter.stevesmusicexchange;

import com.example.peter.stevesmusicexchange.store.Shop;
import com.example.peter.stevesmusicexchange.store.accessories.DrumSticks;
import com.example.peter.stevesmusicexchange.store.accessories.GuitarStrings;
import com.example.peter.stevesmusicexchange.store.instruments.DrumSet;
import com.example.peter.stevesmusicexchange.store.instruments.Guitar;
import com.example.peter.stevesmusicexchange.store.instruments.Piano;
import com.example.peter.stevesmusicexchange.store.instruments.Piccolo;
import com.example.peter.stevesmusicexchange.store.instruments.Saxophone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 28/10/2017.
 */

public class ShopTest {

    Shop shop;
    DrumSet drumSet;
    Guitar guitar;
    Guitar guitar2;
    Piano piano;
    Piccolo piccolo;
    Saxophone saxophone;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    GuitarStrings guitarStrings2;

    @Before
    public void before(){
        shop = new Shop("Steve's Music Exchange");
        drumSet = new DrumSet("Roland", "TD-11KV", "Metal", "Black", 1000.00, 1250.00, "Electronic");
        guitar = new Guitar("Ibanez", "Iron Label RGDIX6PB", "Mahogany", "Black", 900.00, 1200.00, 7, "DiMarzio");
        guitar2 = new Guitar("Ibanez", "Iron Label RGDIX6PB", "Mahogany", "Black", 900.00, 1200.00, 7, "DiMarzio");
        piano = new Piano("Yamaha", "DGX660", "Metal", "Black", 600.00, 850.00, "Digital");
        piccolo = new Piccolo("Bulgheroni", "601R", "Cocus Wood", "Brown", 4000.00, 5500.00);
        saxophone = new Saxophone("Keilworth", "MKX Alto", "German Brass", "Brass", 2450.00, 2900.00);
        drumSticks = new DrumSticks("Vic Firth", 8.00, 11.99);
        guitarStrings = new GuitarStrings("Ernie Ball", 4.99, 6.99);
        guitarStrings2 = new GuitarStrings("D'Addario", 10.95, 14.95);
    }

    @Test
    public void shopStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToInventory(){
        shop.add(drumSticks);
        shop.add(guitar);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromInventory(){
        shop.add(drumSticks);
        shop.add(guitar);

        shop.remove(guitar);

        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void calculateProfitStartsZero(){
        assertEquals(0, shop.calculateProfit(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        shop.add(drumSticks);
        shop.add(guitar);

        assertEquals(303.99, shop.calculateProfit(), 0.01);
    }

    @Test
    public void canCalculateOutgoing(){
        shop.add(drumSticks);
        shop.add(guitar);

        assertEquals(908.00, shop.calculateOutgoing(), 0.01);
    }

    @Test
    public void hasStockCount(){
        shop.add(drumSticks);
        shop.add(guitar);

        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canGetStockCountByType(){
        shop.add(drumSet);
        shop.add(guitar);
        shop.add(guitar2);
        shop.add(piano);
        shop.add(piccolo);
        shop.add(saxophone);
        shop.add(drumSticks);
        shop.add(guitarStrings);
        shop.add(guitarStrings2);

        assertEquals(1, shop.stockCountByType("DrumSet"));
        assertEquals(2, shop.stockCountByType("Guitar"));
        assertEquals(1, shop.stockCountByType("Piano"));
        assertEquals(1, shop.stockCountByType("Piccolo"));
        assertEquals(1, shop.stockCountByType("Saxophone"));
        assertEquals(1, shop.stockCountByType("DrumSticks"));
        assertEquals(2, shop.stockCountByType("GuitarStrings"));
    }

}
