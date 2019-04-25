package com.util;

import com.gildedrose.Item;

public class Util {
	
	public static void decreaseQuality(Item item, int val) {

		if (item.quality > 0) {

			if (item.sellIn > 0) {
				item.sellIn--;
				item.quality -= val;
				if (item.quality < 0) {
					item.quality = 0;
				}
			} else {
				item.sellIn--;
				item.quality -= (val * 2);
				if (item.quality < 0) {
					item.quality = 0;
				}
			}

		} else {
			item.sellIn--;
		}
	}

	public static void increaseQuality(Item item, int val) {
		if (item.quality < 50) {
			item.sellIn--;
			item.quality += val;
			if (item.quality > 50) {
				item.quality = 50;
			}
		} else {
			item.sellIn--;
		}
	}

	public static void manageSulfuras(Item item) {
		if (item.sellIn != Contants.SULFURAS_SELLIN || item.quality != Contants.SULFURAS_QUALITY) {
			item.sellIn = Contants.SULFURAS_SELLIN;
			item.quality = Contants.SULFURAS_QUALITY;
		}
	}

	public static void increaseBackstageQuality(Item item) {
		if (item.sellIn < 0) {
			item.quality = 0;
		} else if (item.sellIn <= 5) {
			increaseQuality(item, 3);
		} else if (item.sellIn <= 10) {
			increaseQuality(item, 2);
		} else {
			increaseQuality(item, 1);
		}
	}

}
