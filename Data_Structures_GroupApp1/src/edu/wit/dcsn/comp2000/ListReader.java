package edu.wit.dcsn.comp2000;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class ListReader 
	{
	
	private ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>(20);
	
	public ListReader(String GroceriesTextFile)
		{
		try
			{
			Scanner sc = new Scanner(new FileReader(GroceriesTextFile));
			while(sc.hasNext())
				{
				groceryList.add(new GroceryItem(sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));
				}
			} 
		catch (FileNotFoundException e)
			{
			System.out.println("File " + GroceriesTextFile + " not found");
			}	
		}//end ListReader constructor	
	
	/**
	 * 
	 * @return groceryList
	 */
	public ArrayList<GroceryItem> getGroceryList(){
		return groceryList;
	}//end getGroceryList
	
	/**
	 *
	 * @param int i
	 * @return groceryItem at int i
	 */
	public GroceryItem getGroceryItem(int i) {
		return groceryList.get(i);
	}//end getGroceryItem
	
	public String toString() {
		StringBuilder listString = new StringBuilder();
		for(int i = 0; i < groceryList.size(); i++) {
			listString.append(groceryList.get(i).toString());
		}
		return listString.toString();
	}
	}// end ListReader class
