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
	
	
	/**
	 * creates a bag sorter that puts grocery items from the default
	 * ListReader into an ArrayList of bags
	 */
	public BagSorter()
	{
		this(new ListReader());
	} // end default constructor
	
	
	/**
	 * creates a bag sorter that puts grocery items from the
	 * supplied ListReader into an ArrayList of bags
	 * @param listreader
	 */
	public BagSorter(ListReader listreader)
	{
		items = listreader.getGroceryList();
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
	}
	
	
	/**
	 * returns the arraylist of filled bags
	 * @return ArrayList of bags
	 */
	public ArrayList<GroceryBag> getBags()
	{
		return bags;
	} // end getBags
	
	/**
	 * gets the GroceryBag at the specified index
	 * @param i  index of desired bag
	 * @return  the GroceryBag at the supplied index
	 */
	public GroceryBag getBagAt(int i)
	{
		return bags.get(i);
	} // end getBagAt
	
	
	/**
	 * returns a string representation of the contents of each bag
	 * @return a string representation of the contents of each bag
	 */
	public String toString() 
	{
		String returnString = "";
		for (int i = 0; i < bags.size(); i++) {
			returnString += String.format("Bag " + i + "%n" + bags.get(i).toString());
		}
		return returnString;
	} // end toString
	
	
	/**
	 * Unit Test Driver for BagSorter
	 */
	public static void main(String[] args)
	{
		System.out.println("Testing Class BagSorter!");
	} // end main
} // end BagSorter

