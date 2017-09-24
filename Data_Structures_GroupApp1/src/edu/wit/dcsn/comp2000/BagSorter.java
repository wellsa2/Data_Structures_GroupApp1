package edu.wit.dcsn.comp2000;


public class BagSorter  {
	/* 
	* if a bag is full create a new bag
	* use 3 bags with max of 9 items
	*/
	private GroceryItem[] items; //array to store groceries
	private int n; //# of item per bag
	
	public static final int DEFAULT_MAX_SIZE = 9; //declares max amount
	
	//default sized, empty bag
	public Bag(){
		items = new GroceryItem[DEFAULT_MAX_SIZE];
		n = 0;
	}
	//adds items and returns false if bag is full   
	public boolean add(GroceryItem item) {
		if (item == null)
			throw new IllegalArgumentException("item cannot be null");     
		if (n == items.length)
			return false;
		else 
		{
			items[n] = item;    
			n++;
        
			return true;
		}
	}
	
	//is it empty?
	public boolean isEmpty(){
		return items == 0;
	}
	//is it full?
	public boolean isFull() {
		return (n == items.length);
	}
	
	public twoBag(){
		items = new GroceryItem[DEFAULT_MAX_SIZE];
		n = 0;
	}
	    
	public boolean add(GroceryItem item) {
		if (item == null)
			throw new IllegalArgumentException("item cannot be null");     
		if (n == items.length)
			return false;
		else 
		{
			items[n] = item;    
			n++;
        
			return true;
		}
	}
	
	//is it empty?
	public boolean isEmpty(){
		return items == 0;
	}
	//is it full?
	public boolean isFull() {
		return (n == items.length);
	}
	
	public threeBag(){
		items = new GroceryItem[DEFAULT_MAX_SIZE];
		n = 0;
	}
	    
	public boolean add(GroceryItem item) {
		if (item == null)
			throw new IllegalArgumentException("item cannot be null");     
		if (n == items.length)
			return false;
		else 
		{
			items[n] = item;    
			n++;
        
			return true;
		}
	}
	
	//is it empty?
	public boolean isEmpty(){
		return items == 0;
	}
	//is it full?
	public boolean isFull() {
		return (n == items.length);
	}
					
}

