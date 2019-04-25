package com.gildedrose;

import com.util.Util;

class GildedRose {
	static Item[] items;

	public static void updateQuality() {
		String[] itemTypes = { "Aged Brie", "Sulfuras", "Backstage passes", "Conjured" };

		for (Item item : items) {
			// check if the item's name contains one of the itemType label and set the item
			// to it itemType otherwise it's default
			String strItemType = "default";
			for (String itemType : itemTypes) {
				if (item.name.contains(itemType)) {
					strItemType = itemType;
					break;
				}
			}
            // depending on the itemType process the operation
			switch (strItemType) {

			case "Aged Brie":
				Util.increaseQuality(item, 1);
				break;

			case "Sulfuras":
				Util.manageSulfuras(item);
				break;

			case "Backstage passes":
				Util.increaseBackstageQuality(item);
				break;

			case "Conjured":
				Util.decreaseQuality(item, 2);
				break;

			default:
				Util.decreaseQuality(item, 1);
				break;
			}

		}

	}
}