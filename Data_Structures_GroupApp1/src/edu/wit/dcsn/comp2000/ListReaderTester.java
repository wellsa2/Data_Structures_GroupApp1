package edu.wit.dcsn.comp2000;

public class ListReaderTester {
	
	public static void main(String[] args)
	{
		ListReader lr = new ListReader();
		for (GroceryItem item : lr.getGroceryList())
		{
			//System.out.println(item.toString());
		}
		System.out.print(lr.getGroceryItem(0));
		System.out.print(lr.toString());
		
	}
}
