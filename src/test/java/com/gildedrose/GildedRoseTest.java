package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void testDefault() {
        Item[] items = new Item[] { new Item("foo", 0, 0) , new Item("Elixir of the Mongoose", 5, 7)};
//        GildedRose app = new GildedRose(items);
        GildedRose.items = items;
        GildedRose.updateQuality();
        assertEquals("foo", GildedRose.items[0].name);
        assertEquals(-1, GildedRose.items[0].sellIn);
        assertEquals(0, GildedRose.items[0].quality);
        assertEquals("Elixir of the Mongoose", GildedRose.items[1].name);
        assertEquals(4, GildedRose.items[1].sellIn);
        assertEquals(6, GildedRose.items[1].quality);
    }

}
