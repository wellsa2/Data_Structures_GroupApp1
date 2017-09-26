package edu.wit.dcsn.comp2000;


/**
 * A class that implements a bag of GroceryItems using a Bag
 * The bag fills based on weight, size, and holdingType
 * Default Constructor must contain an item to be able to define holdingType
 * @author horowitzb
 */
public class GroceryBag
{
	private int weightLeft = 10; // Maximum weight
	private int spaceLeft = 10; // Maximum size
	private char holdingType = '?'; // type of item the bag can hold.
	private ResizableArrayBag<GroceryItem> bag; //Bag to hold
	private boolean initialized; // ensures item is properly initialized

	
	/**
	 * Creates new bag, defines what type of item can be held, and adds the first item
	 * @param item
	 */
	public GroceryBag(GroceryItem item)
	{
		if (item == null || (weightLeft > item.getWeight().weightValue && spaceLeft > item.getSize().sizeValue))
		{
			initialized = false;
			System.exit(1);
		} // end if
		bag = new ResizableArrayBag<>();
		holdingType = getItemType(item);
		bag.add(item); //skips add method's checkInitialization
		weightLeft -= item.getWeight().weightValue;
		spaceLeft -= item.getSize().sizeValue;
		initialized = true;
	} // end constructor

	
	/**
	 * If item can be held by this bag it's added and true is returned, otherwise false is returned
	 * @param item  GroceryItem to be added to the bag
	 * @return true if add was successful, false if unsuccessful
	 */
	public boolean add(GroceryItem item)
	{
		checkInitialization();
		if (canHold(item))
		{
			bag.add(item);
			weightLeft -= item.getWeight().weightValue;
			spaceLeft -= item.getSize().sizeValue;
			return true;
		} // end if
		return false;
	} // end add
	
	
	/** 
	 * removes one unspecified entry from this bag if possible
	 * @return Either the removed entry, if the removal
     * was successful, or null.
	 */
	public GroceryItem remove()
	{
		checkInitialization();
		GroceryItem removed = bag.remove();
		if (removed != null) {
			weightLeft += removed.getWeight().weightValue;
			spaceLeft += removed.getSize().sizeValue;
		} // end if
		return removed;
	} // end remove

	
	/** Removes one occurrence of a given entry from this bag
    *	@param item  The entry to be removed.
    *	@return  True if the removal was successful, or false if not.
    */
	public boolean remove(GroceryItem item)
	{
		checkInitialization();
		boolean removed = bag.remove(item);
		if(removed) {
			weightLeft += item.getWeight().weightValue;
			spaceLeft += item.getSize().sizeValue;
		} // end if
		return removed;
	}// end remove

	
	/**
	 * removes all entries from the bag
	 */
	public void clear()
	{
		checkInitialization();
		while (!isEmpty())
		{
			bag.remove();
		} // end while
	} // end clear
	
	
	/** 
	 * Counts the number of times a given entry appears in this bag.
     *	@param item  The entry to be counted.
     *	@return  The number of times anEntry appears in this bag. 
     */
	public int getFrequencyOf(GroceryItem item)
	{
		checkInitialization();
		return bag.getFrequencyOf(item);
	} // end getFrequencyOf
	
	
	/**
	 * returns the holding type of item
	 * @param item GroceryItem to get the type of
	 * @return a char representing the holding type of item
	 */
	private static char getItemType(GroceryItem item)
	{
		if (item.getFragile())
		{
			return 'a'; // breakable items put in bag with light items
		} // end if
		else
		{
			switch (item.getWeight().weightValue)
			{
				case 1:
					return 'a';
				case 2:
					return 'b';
				case 3:
					return 'c';
				default:
					return 'c'; 
			} // end switch
		} // end else
	} // end getItemType

	
	/**
	 * get method for weightLeft
	 * @return weightLeft weight available in the bag
	 */
	public int getWeightLeft()
	{
		checkInitialization();
		return weightLeft;
	}// end getWeightLeft

	
	/**
	 * get method for spaceLeft
	 * @return spaceLeft space available in the bag
	 */
	public int getSpaceLeft()
	{
		checkInitialization();
		return spaceLeft;
	}// end getSpaceLeft
	
	
	/**
	 * returns true if the bag is empty, false if it has items
	 * @return true if empty
	 */
	public boolean isEmpty()
	{
		return bag.isEmpty();
	}

	
	/**
	 * checks if the GroceryItem is the correct type for this bag
	 * @param item GroceryItem to be added
	 * @return true if the bag is the same type of the item, or if the holdingType is undefined
	 */
	private boolean isCorrectType(GroceryItem item)
	{
		checkInitialization();
		return holdingType == getItemType(item) || holdingType == '?';
	} // end isCorrectType

	
	/**
	 * Checks if the bag has room for this size and weight of item
	 * @param item GroceryItem to check size and weight with bag
	 * @return true if the bag has enough size and space left for item
	 */
	private boolean hasRoom(GroceryItem item)
	{
		checkInitialization();
		return spaceLeft >= item.getSize().sizeValue && weightLeft >= item.getWeight().weightValue;
	} // end hasRoom

	
	/**
	 * Checks if item has proper weight, size, and type to go in this bag
	 * @param item GroceryItem to ensure can go in this bag
	 * @return true if bag can hold item, otherwise false
	 */
	public boolean canHold(GroceryItem item)
	{
		checkInitialization();
		return hasRoom(item) && isCorrectType(item);
	} // end canHold
	
	
	/**
	 * toString method for bag
	 * @return A string representation of the contents of this bag
	 */
	public String toString()
	{
		checkInitialization();
		Object[] bagArray = bag.toArray();
		StringBuilder bagString = new StringBuilder();
		for(Object item : bagArray)
		{
			bagString.append((GroceryItem) item).toString();
		} // end for
		return bagString.toString();
	} // end toString
	
	
	/** Retrieves all entries that are in this bag.
     *	@return  A newly allocated array of all the entries in this bag.
     */
	public GroceryItem[] toArray()
	{
		checkInitialization();
		return bag.toArray();
	}//end toArray
	
	
	/** Tests whether this bag contains a given entry.
    @param anEntry  The entry to locate.
    @return  True if this bag contains item, or false otherwise. */
	public boolean contains(GroceryItem item)
	{
		checkInitialization();
		return bag.contains(item);
	}//end contains


	/**
	 * ensures grocery bag has been properly initialized
	 */
	private void checkInitialization()
	{
		if (!initialized)
		{
			throw new SecurityException("Grocery bag is not properly initialized.");
		} // end checkInitialization
	} // end checkInitialization
	
	/**
	 * Unit Tester for GroceryBag
	 */
	public static void main(String[] args)
	{
		System.out.println( "\n----------\nTesting GroceryBag:\n" );
		
	} // end main

} // end GroceryBag
