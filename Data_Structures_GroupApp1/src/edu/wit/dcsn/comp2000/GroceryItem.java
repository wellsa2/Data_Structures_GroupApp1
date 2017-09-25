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
	final private boolean FRAGILITY;
	
	public GroceryItem(String name, ItemSize size, ItemWeight weight, ItemFirmness firmness, String fragility)
	{
		NAME = name;
		SIZE=size;
		WEIGHT=weight;
		FIRMNESS=firmness;
		FRAGILITY=(fragility.equalsIgnoreCase("breakable"))?true:false;
	}

	public String getName() {
		return NAME;
	}
	
	public ItemSize getSize()
	{
		return SIZE;

	}
	
	public ItemWeight getWeight()
	{
		return WEIGHT;
	}
	
	public ItemFirmness getFirmness()
	{
		return FIRMNESS;
	}
	
	public boolean getFragile()
	{
		return FRAGILITY;
	}
	
	//TODO Format system output
	@Override
	public String toString()
	{
		return String.format("Item: %s\t Size: %s\t Weight: %s\t Firmness: %s\t Breakable: %s\t %n",
				NAME, SIZE.toString(), WEIGHT.toString(), FIRMNESS.toString(), FRAGILITY);
	}
	
	public boolean equals(GroceryItem item) {
		return this.toString().equalsIgnoreCase(item.toString());
	}
	
	public static void main(String[] args)
	{
		GroceryItem item = new GroceryItem("pickle", ItemSize.LARGE, ItemWeight.HEAVY, ItemFirmness.FIRM, "unbreakable");
		System.out.print(item.toString());
	}
}
