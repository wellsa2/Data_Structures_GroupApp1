package edu.wit.dcsn.comp2000;

import java.util.ArrayList;

//TODO document, define bag types, implement isCorrectType
public class GroceryBag {
	private int weightLeft = 10;
	private int spaceLeft = 10;
	private char holdingType = '?';
	private ResizableArrayBag<GroceryItem> bag;

	public GroceryBag(GroceryItem item) {
		add(item);
		holdingType = getItemType(item);
	}

	public void add(GroceryItem item) {
		if (canHold(item)) {
			bag.add(item);
		}
	}

	public GroceryItem remove() {
		GroceryItem removed = bag.remove();
		if (!bag.isEmpty()) {
			weightLeft += removed.getWeight().weightValue;
			spaceLeft += removed.getSize().sizeValue;
		}
		return removed;
	}

	public boolean remove(GroceryItem item) {
		boolean removed = bag.remove(item);
		if(removed) {
			weightLeft += item.getWeight().weightValue;
			spaceLeft += item.getSize().sizeValue;
		}
		return removed;
	}// end remove

	public char getItemType(GroceryItem item) {
		if (item.getFragile()) {
			return 'a';
		} else {
			switch (item.getWeight().weightValue) {
			case 1:
				return 'a';
			case 2:
				return 'b';
			case 3:
				return 'c';
			}
		}
		return '?';
	}

	public int getWeightLeft() {
		return weightLeft;
	}// end getWeightLeft

	public int getSpaceLeft() {
		return spaceLeft;
	}// end getSpaceLeft

	// TODO define bag types and implement isCorrectType
	private boolean isCorrectType(GroceryItem item) {
		return holdingType == getItemType(item) || holdingType == '?';
	}

	private boolean hasRoom(GroceryItem item) {
		return item.getSize().sizeValue > spaceLeft && item.getWeight().weightValue > weightLeft;
	}

	// TODO
	public boolean canHold(GroceryItem item) {
		return hasRoom(item) && isCorrectType(item);
	}
}
