package edu.wit.dcsn.comp2000;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * class ListReader has an ArrayList storing multiple objects
 * of type GroceryItem with a default constructor to fill it 
 * with info from an text file full of grocery items and their traits
 * Has a get method for the whole ArrayList and a get 
 * method for individual items and a toString method
 * @author Brandon Horowitz
 */
public class ListReader 
{
	private ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>(20);
	private boolean initialized;
	
	
	/**
	 * default constructor. uses groceries-1.txt as input string / filename
	 */
	public ListReader() 
	{
		this(System.getProperty("user.dir") + File.separator + "groceries-1.txt");
	}
	
	
	/**
	 * constructor fills groceryList with objects of type GroceryItem from a provided text file 
	 * @param GroceriesTextFile text file to read from
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
			System.out.println(System.getProperty("user.dir") + File.separator + "groceries-1.txt has been found");
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File " + GroceriesTextFile + " not found");
			initialized = false;
		}
		initialized = true;
	}//end ListReader constructor	
	
	
	/**
	 * returns the full GroceryList
	 * @return groceryList the ArrayList of GroceryItems
	 */
	public ArrayList<GroceryItem> getGroceryList()
	{
		checkInitialization();
		return groceryList;
	}//end getGroceryList
	
	
	/**
	 * returns GroceryItem at location i in the array
	 *
	 * @param int i  index of desired GroceryItem
	 * @return groceryItem  the GroceryItem at the supplied index
	 */
	public GroceryItem getGroceryItem(int i)
	{
		checkInitialization();
		return groceryList.get(i);
	}//end getGroceryItem
	
	
	/**
	 * returns a string containing all GroceryItem objects
	 * @return a string of the GroceryItems in the grocery list
	 */
	public String toString()
	{
		checkInitialization();
		StringBuilder listString = new StringBuilder();
		for(int i = 0; i < groceryList.size(); i++)
		{
			listString.append(groceryList.get(i).toString());
		}
		return listString.toString();
	} // end toString
	
	
	/**
	 * checks if ListReader has been properly initialized
	 */
	private void checkInitialization()
	{
		if (!initialized)
		{
			throw new SecurityException("ListReader is not properly initialized.");
		}
	} // end checkInitialization
	
	
	/**
	 * Unit Tester for ListReader
	 */
	public static void main(String[] args)
	{
System.out.println( "\n----------\nTesting ListReader:\n" );
		
		testConstructors();
		
		testGetters();
		
		testEquals();
	} // end main


	private static void testEquals() {
		// TODO Auto-generated method stub
		
	}


	private static void testGetters() {
		// TODO Auto-generated method stub
		
	}


	private static void testConstructors() {
		// TODO Auto-generated method stub
		
	}
	
	
}// end ListReader class