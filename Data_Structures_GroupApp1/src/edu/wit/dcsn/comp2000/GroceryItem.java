package edu.wit.dcsn.comp2000;



/**
 * Data type for grocery items
 * 
 * @author wellsa1
 * 
 */
//TODO documentation
public class GroceryItem {
	final private String SIZE;
	final private String WEIGHT;
	final private String FIRMNESS;
	final private boolean FRAGILE;
	
	
	public GroceryItem(String size, String weight, String firmness, boolean fragile)
	{
		this.SIZE=size;
		this.WEIGHT=weight;
		this.FIRMNESS=firmness;
		this.FRAGILE=fragile;
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
		return String.format("");
	}
}
