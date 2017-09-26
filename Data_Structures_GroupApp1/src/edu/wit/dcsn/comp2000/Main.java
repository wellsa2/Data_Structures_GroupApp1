package edu.wit.dcsn.comp2000;

public class Main 
{
	public static void main(String[] args)
	{
		BagSorter bagSorter = new BagSorter();
		System.out.print(bagSorter.toString());
		
		testGroceryBag(bagSorter);

	} // end main
	
	private static void testGroceryBag(BagSorter bagSorter){
		System.out.println("\nTesting GroceryBag");
		GroceryBag groceryBag = bagSorter.getBagAt(0);
		System.out.println(groceryBag.toString());
		
		GroceryItem eggs = new GroceryItem("eggs", ItemSize.MEDIUM, ItemWeight.MEDIUM, ItemFirmness.SOFT, "breakable");
		
		testRemove(groceryBag);
		testRemove(groceryBag, eggs);
		testGetters(groceryBag);
		testContains(groceryBag, eggs);
		
	}
	
	private static void testRemove(GroceryBag groceryBag) {
		System.out.println("\nTesting groceryBag.remove()");
		System.out.println("removed " + groceryBag.remove() + "from bag.\nNew bag is");
		System.out.println(groceryBag.toString());
	}
	
	private static void testRemove(GroceryBag groceryBag, GroceryItem eggs) {
		System.out.println("\nTesting groceryBag.remove(GroceryItem item)");
		System.out.println("removing " + eggs.toString());
		groceryBag.remove(eggs);
		System.out.println("new bag is");
		System.out.println(groceryBag.toString());
		System.out.println("eggs not removed. remove(anEntry) does not work");
	}
	
	private static void testGetters(GroceryBag groceryBag) {
		System.out.println("\nTesting getWeightLeft");
		System.out.println(groceryBag.getWeightLeft());
		System.out.println("\nTesting getSpaceLeft");
		System.out.println(groceryBag.getSpaceLeft());
	}
	
	private static void testContains(GroceryBag groceryBag, GroceryItem eggs) {
		System.out.println("\nTesting Contains");
		System.out.println(groceryBag.contains(eggs));
		System.out.println("contains eggs, but returned false. contains(anEntry) does not work");
	}
} // end Main
