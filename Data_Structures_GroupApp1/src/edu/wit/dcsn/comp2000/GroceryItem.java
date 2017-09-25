package edu.wit.dcsn.comp2000;

/**
 * Data type for grocery items
 * @author wellsa1
 * @version 1.0
 */
public class GroceryItem {
	final private String NAME; // name of item
	final private ItemSize SIZE; // size of item
	final private ItemWeight WEIGHT; // weight of item
	final private ItemFirmness FIRMNESS; // firmness of item
	final private boolean FRAGILITY; // is breakable
	private boolean initialized;
	
	
	/**
	 * Creates a new GroceryItem
	 * @param name  the name of the item
	 * @param size  the size of the item
	 * @param weight  the weight of the item
	 * @param firmness  the firmness of the item
	 * @param fragility  breakable or unbreakable
	 */
	public GroceryItem(String name, ItemSize size, ItemWeight weight, ItemFirmness firmness, String fragility)
	{
		if (name == null || size == null || weight == null|| firmness == null || fragility == null)
		{
			initialized = false;
			System.exit(1);
		}
		NAME = name;
		SIZE=size;
		WEIGHT=weight;
		FIRMNESS=firmness;
		FRAGILITY=(fragility.equalsIgnoreCase("breakable"))?true:false;
		initialized = true;
	} // end constructor

	
	/**
	 * returns the name of the item
	 * @return the name of the item
	 */
	public String getName()
	{
		checkInitialization();
		return NAME;
	} // end getName
	
	
	/**
	 * returns the size of the item
	 * @return the size of the item
	 */
	public ItemSize getSize()
	{
		checkInitialization();
		return SIZE;
	} // end getSize
	
	
	/**
	 * returns the weight of the item
	 * @return the weight of the item
	 */
	public ItemWeight getWeight()
	{
		checkInitialization();
		return WEIGHT;
	} // end getWeight
	
	
	/**
	 * returns the firmness of the item
	 * @return the firmness of the item
	 */
	public ItemFirmness getFirmness()
	{
		checkInitialization();
		return FIRMNESS;
	} // end getFirmness
	
	
	/**
	 * returns true if the item is breakable, false if it's unbreakable
	 * @return true if breakable, false if unbreakable
	 */
	public boolean getFragile()
	{
		checkInitialization();
		return FRAGILITY;
	} // end getFragile
	
	
	/**
	 * returns a string representation of the grocery item's traits
	 * @return a string representation of the item's traits
	 */
	@Override
	public String toString()
	{
		checkInitialization();
		return String.format("Item: %-15s Size: %s\t Weight: %s\t Firmness: %s\t Breakable: %s\t %n",
				NAME, SIZE.toString(), WEIGHT.toString(), FIRMNESS.toString(), FRAGILITY);
	} // end toString
	
	
	/**
	 * returns true if the items have the same traits
	 * @param item item to compare to this one
	 * @return true if they have the same traits, false if they are different
	 */
	public boolean equals(GroceryItem item)
	{
		checkInitialization();
		return this.toString().equalsIgnoreCase(item.toString());
	} // end equals
	
	/**
	 * ensures GroceryItem has been properly initialized
	 */
	private void checkInitialization()
	{
		if (!initialized)
		{
			throw new SecurityException("Grocery item is not properly initialized.");
		} // end checkInitialization
	} // end checkInitialization
} // end GroceryItem
