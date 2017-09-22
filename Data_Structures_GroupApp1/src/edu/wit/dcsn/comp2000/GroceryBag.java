package edu.wit.dcsn.comp2000;


/**
 * A class that implements a bag of GroceryItems using ResizableArrayBag
 * The bag fills based on weight, size, and holdingType
 * Default Constructor must contain an item to be able to define holdingType
 * @author horowitzb
 *
 */
public class GroceryBag {
	private int weightLeft = 10; //Maximum weight
	private int spaceLeft = 10; //Maximum size
	private char holdingType = '?'; //type of item the bag can hold.
	private ResizableArrayBag<GroceryItem> bag;

	/**
	 * defines what type of item grocerybag can hold, and adds the first item
	 * @param item
	 */
	public GroceryBag(GroceryItem item) {
		add(item); 
		holdingType = getItemType(item);
	}

	/**
	 * if the item can be held by the bag type, 
	 * @param item
	 */
	public boolean add(GroceryItem item) {
		if (canHold(item)) {
			bag.add(item);
			return true;
		}
		return false;
	}
	/** 
	 * removes one unspecified entry from this bag and adjusts the weightleft and spaceleft accordingly, if possible
	 * @return Either the removed entry, if the removal
     * was successful, or null.
	 */
	public GroceryItem remove() {
		GroceryItem removed = bag.remove();
		if (!bag.isEmpty()) {
			weightLeft += removed.getWeight().weightValue;
			spaceLeft += removed.getSize().sizeValue;
		}
		return removed;
	}

	/** Removes one occurrence of a given entry from this bag and adjusts weighleft and spaceleft accordingly.
    *	@param item  The entry to be removed.
    *	@return  True if the removal was successful, or false if not.
    */
	public boolean remove(GroceryItem item) {
		boolean removed = bag.remove(item);
		if(removed) {
			weightLeft += item.getWeight().weightValue;
			spaceLeft += item.getSize().sizeValue;
		}
		return removed;
	}// end remove

	/**
	 * removes all entries from the bag
	 */
	public void clear() {
		bag.clear();
	}
	
	/** Counts the number of times a given entry appears in this bag.
    *	@param item  The entry to be counted.
    *	@return  The number of times anEntry appears in this bag. */
	public int getFrequencyOf(GroceryItem item) {
		return bag.getFrequencyOf(item);
	}
	
	/**
	 * returns the holdingtype of item
	 * @param item
	 * @return a char representing the holdingtype of item
	 */
	private char getItemType(GroceryItem item) {
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

	/**
	 * get method for weightLeft
	 * @return weighLeft
	 */
	public int getWeightLeft() {
		return weightLeft;
	}// end getWeightLeft

	/**
	 * get method for spaceLeft
	 * @return spaceLeft
	 */
	public int getSpaceLeft() {
		return spaceLeft;
	}// end getSpaceLeft

	/**
	 * @param item
	 * @return true if the bag is the same type of the item, or if the holdingType is undefined
	 */
	private boolean isCorrectType(GroceryItem item) {
		return holdingType == getItemType(item) || holdingType == '?';
	}

	/**
	 * @param item
	 * @return true if the bag has enough size and space left for item
	 */
	private boolean hasRoom(GroceryItem item) {
		return item.getSize().sizeValue > spaceLeft && item.getWeight().weightValue > weightLeft;
	}

	/**
	 * @param item
	 * @return true if bag can hold item
	 */
	public boolean canHold(GroceryItem item) {
		return hasRoom(item) && isCorrectType(item);
	}
	
	/**
	 * toString method for bag
	 */
	public String toString() {
		GroceryItem[] bagArray = bag.toArray();
		StringBuilder bagString = new StringBuilder();
		for(GroceryItem item : bagArray) {
			bagString.append(item).toString();
		}
		return bagString.toString();
	}
}
