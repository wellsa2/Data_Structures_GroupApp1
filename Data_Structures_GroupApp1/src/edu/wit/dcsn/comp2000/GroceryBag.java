package edu.wit.dcsn.comp2000;

//TODO document, define bag types, implement isCorrectType
public class GroceryBag {
	private int weightLeft = 10;
	private int spaceLeft = 10;
	private int holdingType;

	public GroceryBag() 
	{

	}
	
	public int getWeightLeft()
	{
		return weightLeft;
	}//end getWeightLeft
	
	public int getSpaceLeft()
	{
		return spaceLeft;
	}//end getSpaceLeft
	
	//TODO define bag types and implement isCorrectType
	private boolean isCorrectType(GroceryItem item) {
		
	}
	
	//TODO
	public boolean canHold(GroceryItem item) {
		return item.getSize().sizeValue > spaceLeft && item.getWeight().weightValue > weightLeft && isCorrectType(item);
	}
}
