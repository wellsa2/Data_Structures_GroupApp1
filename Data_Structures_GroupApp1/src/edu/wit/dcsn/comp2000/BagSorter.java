package edu.wit.dcsn.comp2000;

import java.util.ArrayList;
import java.util.Arrays;

public class BagSorter  {
	/* 
	* if a bag is full create a new bag
	* use 3 bags with max of 9 items
	*/
	private ArrayList<GroceryItem> items; //array to store grocery items
	public ArrayList<GroceryBag> bags; //array to hold grocery bags
	
	//default sized, empty bag
	public BagSorter()
	{
		items = new ListReader().getGroceryList();
		bags = new ArrayList<>();
		for (GroceryItem item : items)
		{
			boolean foundBag  = false;
			for (int i = 0; i < bags.size() && !foundBag; i++)
			{
				if (bags.get(i).add(item))
				{
					foundBag = true;
				}
			}
			if (!foundBag)
			{
				bags.add(new GroceryBag(item));
			}
		}
	}
	
	public ArrayList<GroceryBag> getBags()
	{
		return bags;
	}
	
	public String toString() 
	{
		String returnString = "";
		for (int i = 0; i < bags.size(); i++) {
			returnString += String.format("Bag " + i + "%n" + bags.get(i).toString());
		}
		return returnString;
	}
					
}

