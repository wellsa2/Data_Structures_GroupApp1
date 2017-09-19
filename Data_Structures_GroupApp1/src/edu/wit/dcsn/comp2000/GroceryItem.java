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
	final private Size SIZE;
	final private Weight WEIGHT;
	final private Firmness FIRMNESS;
	final private Fragility FRAGILILITY;
	
	public GroceryItem(String name, Size size, Weight weight, Firmness firmness, Fragility fragility)
	{
		this.NAME = name;
		this.SIZE=size;
		this.WEIGHT=weight;
		this.FIRMNESS=firmness;
		this.FRAGILILITY=fragility;
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
