package edu.wit.dcsn.comp2000;


public class BagSorter extends GroceryBag {
	//TODO all logic
	/* 
	* make a new (empty) bag and fill it with items that corresponds
	* to each pair of firmness. Max of 12 items a bag. The program should
	* traverse through groceries-1.txt to
	*/
	private GroceryItem[] items; //array to store groceries
	
	private int numItems; //# of item per bag
	
	public static final int DEFAULT_MAX_SIZE = 12; //declares max amount
	
	//default sized, empty bag
	public BagA(){
		items = new GroceryItem[DEFAULT_MAX_SIZE];
		numItems = 0;
	}
	
	
	/* TODO:
	* make new bags that will take whatever the first bag didn't.
	* then fill this bag and see if there are items left
	*/
	
					
}

