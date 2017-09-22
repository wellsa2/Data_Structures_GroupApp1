package edu.wit.dcsn.comp2000;


public class BagSorter  {
	//TODO all logic
	/* 
	* if a bag is full create a new bag
	* use as many bag as needed
	*/
	private GroceryItem[] items; //array to store groceries
	private int numItems; //# of item per bag
	
	public static final int DEFAULT_MAX_SIZE = 6; //declares max amount
	
	//default sized, empty bag
	public Bag(){
		items = new GroceryItem[DEFAULT_MAX_SIZE];
		numItems = 0;
	}
	//is it empty?
	public boolean isEmpty(){
		return == 0;
	}
	
	public boolean removeItems(Bag twoBag){
        // check input
        if (twoBag == null || twoBag.numItems() == 0)
            return false;
	//
	
	
	
	/* TODO:6
	* make new bags that will take whatever the first bag didn't.
	* then fill this bag and see if there are items left
	*/
	
					
}

