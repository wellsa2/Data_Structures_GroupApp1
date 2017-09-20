package edu.wit.dcsn.comp2000;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * class ListReader has an arraylist storing multiple objects
 * of type GroceryItem with a default constructor to fill it 
 * with info from an input string that corresponds to a text 
 * file has a get method for the whole arraylist has a get 
 * method for individual arraylists has a toString method
 * @author Brandon Horowitz
 */
public class ListReader 
	{
	
	//instance variables
	/**
	 * resizeable array (arraylist) holding type GroceryItem
	 */
	private ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>(20);
	
	//constructors
	
	/**
	 * default constructor. uses groceries-1.txt as input string / filename
	 */
	public ListReader() 
	{
		this("groceries-1.txt");
	}
	
	/**
	 * constructor fills groceryList with objects of type GroceryItem from a provided text file 
	 * @param GroceriesTextFile
	 */
	public ListReader(String GroceriesTextFile)
		{
		try
			{
			Scanner sc = new Scanner(new FileReader(GroceriesTextFile));
			while(sc.hasNext())
				{
				groceryList.add(new GroceryItem(sc.next(), ItemSize.interpretDescription(sc.next()), ItemWeight.interpretDescription(sc.next()), ItemFirmness.interpretDescription(sc.next()), sc.next()));
				}
			} 
		catch (FileNotFoundException e)
			{
			System.out.println("File " + GroceriesTextFile + " not found");
			}	
		}//end ListReader constructor	
	
	//public methods
	
	/**
	 * returns the full GroceryList
	 * @return groceryList
	 */
	public ArrayList<GroceryItem> getGroceryList(){
		return groceryList;
	}//end getGroceryList
	
	/**
	 *returns GroceryItem at location i in the array
	 *
	 * @param int i
	 * @return groceryItem
	 */
	public GroceryItem getGroceryItem(int i) {
		return groceryList.get(i);
	}//end getGroceryItem
	
	/**
	 * returns a string containing a toString of all GroceryItem objects
	 */
	public String toString() {
		StringBuilder listString = new StringBuilder();
		for(int i = 0; i < groceryList.size(); i++) {
			listString.append(groceryList.get(i).toString());
		}
		return listString.toString();
	}
	}// end ListReader class
