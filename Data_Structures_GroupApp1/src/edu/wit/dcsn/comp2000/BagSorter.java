package edu.wit.dcsn.comp2000;


public class BagSorter implements GroceryItem {
	//TODO all logic
	/* 
	* make a new (empty) bag and fill it with items that corresponds
	* to each pair of Weight+Firmness. Max of 10 items a bag. The program should
	* traverse through groceries-1.txt to
	*/
	private Grocery[] items; //array to store groceries
	
	private int numItems; //# of item per bag
	
	public static final int DEFAULT_MAX_SIZE = 10; //declares max amount
	
	//default sized, empty bag
	public Bag(){
		items = new Grocery[DEFAILT_MAX_SIZE];
		numItems = 0;
	}
	
	//TODO: add item from list that contains the words soft and light 
	public boolean add(Grocery item){
	
		
	}
	
	/* TODO:
	* make new bags that will take whatever the first bag didn't.
	* then fill this bag and see if there are items left
	*/
	
					
}

