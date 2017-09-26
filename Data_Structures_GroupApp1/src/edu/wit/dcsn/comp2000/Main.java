package edu.wit.dcsn.comp2000;

public class Main 
{
	public static void main(String[] args)
	{
		BagSorter bagSorter = new BagSorter();
		System.out.print(bagSorter.toString());
		
		System.out.println("\nTesting GroceryBag");
		GroceryBag groceryBag = bagSorter.getBagAt(0);
		System.out.println(groceryBag.toString());
		
		System.out.println("\nTesting groceryBag.remove()");
		System.out.println("removed " + groceryBag.remove() + "from bag.\nNew bag is");
		System.out.println(groceryBag.toString());
		
		System.out.println("\nTesting groceryBag.remove(GroceryItem item)");
		System.out.println("removing " + (new GroceryItem("eggs", ItemSize.MEDIUM, ItemWeight.MEDIUM, ItemFirmness.SOFT, "breakable").toString()));
		groceryBag.remove(new GroceryItem("eggs", ItemSize.MEDIUM, ItemWeight.MEDIUM, ItemFirmness.SOFT, "breakable"));
		System.out.println("new bag is");
		System.out.println(groceryBag.toString());
	} // end main
} // end Main
