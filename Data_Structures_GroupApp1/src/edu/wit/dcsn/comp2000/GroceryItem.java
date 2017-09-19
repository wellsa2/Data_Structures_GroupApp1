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
	final private String SIZE;
	final private String WEIGHT;
	final private String FIRMNESS;
	final private boolean FRAGILE;
	
	public GroceryItem(String name, String size, String weight, String firmness, String breakable)
	{
		this.NAME = name;
		this.SIZE=size;
		this.WEIGHT=weight;
		this.FIRMNESS=firmness;
		this.FRAGILE=(breakable.equals("breakable"))? true : false;
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
		return String.format("%s", NAME);
	}
}
