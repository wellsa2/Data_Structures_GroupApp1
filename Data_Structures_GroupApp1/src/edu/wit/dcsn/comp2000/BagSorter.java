package edu.wit.dcsn.comp2000;

import java.util.ArrayList;

/**
 * A class that puts the grocery items in an ArrayList from ListSorter 
 * into correct grocery bags.
 * @author Avery Loftin
 * @version 1.0
 */
public class BagSorter
{
	private ArrayList<GroceryItem> items; // ArrayList to store grocery items
	public ArrayList<GroceryBag> bags; // ArrayList to hold grocery bags
	
	
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
				} // end if
			} // end for
			if (!foundBag)
			{
				bags.add(new GroceryBag(item));
			} // end if
		} // end for
	} // end default constructor
	
	
	public ArrayList<GroceryBag> getBags()
	{
		return bags;
	} // end getBags
	
	
	public String toString() 
	{
		String returnString = "";
		for (int i = 0; i < bags.size(); i++) {
			returnString += String.format("Bag " + i + "%n" + bags.get(i).toString());
		}
		return returnString;
	} // end toString			
} // end BagSorter

