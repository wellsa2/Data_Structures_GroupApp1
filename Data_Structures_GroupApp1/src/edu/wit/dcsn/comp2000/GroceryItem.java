package edu.wit.dcsn.comp2000;
/**
 * Data type for grocery items
 * 
 * @author wellsa1
 * 
 */
//TODO documentation
public class GroceryItem {
	final private String NAME;
	final private ItemSize SIZE;
	final private ItemWeight WEIGHT;
	final private ItemFirmness FIRMNESS;
	final private boolean FRAGILILITY;
	
	public GroceryItem(String name, ItemSize size, ItemWeight weight, ItemFirmness firmness, String fragility)
	{
		NAME = name;
		SIZE=size;
		WEIGHT=weight;
		FIRMNESS=firmness;
		FRAGILILITY=(fragility.equalsIgnoreCase("breakable"))?true:false;
	}

	public String getName() {
		return NAME;
	}
	
	public String getSize()
	{
		return SIZE;

	}
	
	public String getWeight()
	{
		return WEIGHT;
	}
	
	public String getFirmness()
	{
		return FIRMNESS;
	}
	
	public boolean getFragile()
	{
		return FRAGILE;
	}
	
	//TODO Format system output
	@Override
	public String toString()
	{
		return String.format("%s %-10s %s %-10s %s %-10s %s %-10s %s %n", NAME, SIZE, WEIGHT, FIRMNESS, FRAGILE);
	}
}
