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
	public ArrayList<GroceryItem> getGroceryList(){
		return groceryList;
	}
	
	public GroceryItem getGroceryItem(int i) {
		return groceryList.get(i);
	}
	}// end ListReader class
