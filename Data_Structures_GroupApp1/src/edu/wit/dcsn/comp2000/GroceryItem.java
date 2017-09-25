package edu.wit.dcsn.comp2000;

/**
 * Data type for grocery items
 * @author wellsa1
 * @version 1.0
 */
public class GroceryItem {
	final private String NAME; // name of item
	final private ItemSize SIZE; // size of item
	final private ItemWeight WEIGHT; // weight of item
	final private ItemFirmness FIRMNESS; // firmness of item
	final private boolean FRAGILITY; // is breakable
	private boolean initialized;
	
	
	/**
	 * Creates a new GroceryItem
	 * @param name  the name of the item
	 * @param size  the size of the item
	 * @param weight  the weight of the item
	 * @param firmness  the firmness of the item
	 * @param fragility  breakable or unbreakable
	 */
	public GroceryItem(String name, ItemSize size, ItemWeight weight, ItemFirmness firmness, String fragility)
	{
		NAME = name;
		SIZE = size;
		WEIGHT = weight;
		FIRMNESS = firmness;
		FRAGILITY = ("breakable".equalsIgnoreCase(fragility))?true:false;
		initialized = true;
		if (name == null || size == null || weight == null|| firmness == null || fragility == null)
		{
			initialized = false;
		}
		else
		{
			initialized = true;
		}
	} // end constructor

	
	/**
	 * returns the name of the item
	 * @return the name of the item
	 */
	public String getName()
	{
		checkInitialization();
		return NAME;
	} // end getName
	
	
	/**
	 * returns the size of the item
	 * @return the size of the item
	 */
	public ItemSize getSize()
	{
		checkInitialization();
		return SIZE;
	} // end getSize
	
	
	/**
	 * returns the weight of the item
	 * @return the weight of the item
	 */
	public ItemWeight getWeight()
	{
		checkInitialization();
		return WEIGHT;
	} // end getWeight
	
	
	/**
	 * returns the firmness of the item
	 * @return the firmness of the item
	 */
	public ItemFirmness getFirmness()
	{
		checkInitialization();
		return FIRMNESS;
	} // end getFirmness
	
	
	/**
	 * returns true if the item is breakable, false if it's unbreakable
	 * @return true if breakable, false if unbreakable
	 */
	public boolean getFragile()
	{
		checkInitialization();
		return FRAGILITY;
	} // end getFragile
	
	
	/**
	 * returns a string representation of the grocery item's traits
	 * @return a string representation of the item's traits
	 */
	@Override
	public String toString()
	{
		try
		{
			checkInitialization();
		} // end try
		catch (Exception SecurityException)
		{
			return "Grocery item is not properly initialized.";
		} // end catch
		return String.format("Item: %-15s Size: %s\t Weight: %s\t Firmness: %s\t Breakable: %s\t",
				NAME, SIZE.toString(), WEIGHT.toString(), FIRMNESS.toString(), FRAGILITY);
	} // end toString
	
	
	/**
	 * returns true if the items have the same traits
	 * @param item item to compare to this one
	 * @return true if they have the same traits, false if they are different
	 */
	public boolean equals(GroceryItem item)
	{
		checkInitialization();
		return this.toString().equalsIgnoreCase(item.toString());
	} // end equals
	
	/**
	 * ensures GroceryItem has been properly initialized
	 */
	private void checkInitialization()
	{
		if (!initialized)
		{
			throw new SecurityException("Grocery item is not properly initialized.");
		} // end checkInitialization
	} // end checkInitialization
	
	
	/**
	 * Unit Test Driver for GroceryItem
	 */
	public static void main(String[] args)
	{
		System.out.println( "\n----------\nTesting GroceryItem:\n" );
		
		testConstructors();
		
		testGetters();
		
		testEquals();
	} // end main
	
	
	/**
	 * tester method for constructors
	 */
	private static void testConstructors()
	{
		System.out.println( "\n----------\nTesting Constructors:\n" );
		
		GroceryItem validLargeHeavyFirmBreakable = new GroceryItem("validLargeHeavyFirmBreakable", ItemSize.LARGE, ItemWeight.HEAVY, ItemFirmness.FIRM, "breakable");
		printTest(true, "Testing a large, heavy, firm, breakable object with valid name.", validLargeHeavyFirmBreakable.toString(), "Item: validLargeHeavyFirmFragile Size: Large   Weight: Heavy   Firmness: Firm  Breakable: true");
		
		GroceryItem validMediumMediumHardBreakable = new GroceryItem("validMediumMediumHardBreakable", ItemSize.MEDIUM, ItemWeight.MEDIUM, ItemFirmness.HARD, "breakable");
		printTest(true, "Testing a medium, medium, hard, breakable object with valid name.", validMediumMediumHardBreakable.toString(), "Item: validMediumMediumHardBreakable Size: Medium      Weight: Medium  Firmness: Hard  Breakable: true");
		
		GroceryItem validSmallLightSoftUnbreakable = new GroceryItem("validSmallLightSoftUnbreakable", ItemSize.SMALL, ItemWeight.LIGHT, ItemFirmness.SOFT, "unbreakable");
		printTest(true, "Testing a small, light, soft, unbreakable object with valid name.", validSmallLightSoftUnbreakable.toString(), "Item: validSmallLightSoftUnbreakable Size: Small       Weight: Light   Firmness: Soft  Breakable: false");
		
		GroceryItem allInvalid = new GroceryItem(null, null, null, null, null);
		printTest(false, "Testing a null, null, null, null object with null name.", allInvalid.toString(), "Grocery item is not properly initialized.");
	} // end testConstructors
	
	
	/**
	 * tester method for all of the getters
	 */
	private static void testGetters()
	{
		System.out.println( "\n----------\nTesting Getters:\n" );
		
		System.out.printf("Getters will throw exception if invoked on improperly instantiated GroceryItem "
				+ "so I won't test them here.\n The initialization feature has been shown to work in the testConstructor.");
		
		GroceryItem validLargeHeavyFirmBreakable = new GroceryItem("validLargeHeavyFirmBreakable", ItemSize.LARGE, ItemWeight.HEAVY, ItemFirmness.FIRM, "breakable");
		
		System.out.println( "\nTesting getName:\n" );
		
		printTest(true, "Testing getName() for a valid GroceryItem", validLargeHeavyFirmBreakable.getName(), "validLargeHeavyFirmBreakable");
		printTest(true, "Testing getSize() for a valid GroceryItem", validLargeHeavyFirmBreakable.getSize().displayName, "Large");
		printTest(true, "Testing getWeight() for a valid GroceryItem", validLargeHeavyFirmBreakable.getWeight().displayName, "Heavy");
		printTest(true, "Testing getFirmness() for a valid GroceryItem", validLargeHeavyFirmBreakable.getFirmness().displayName, "Firm");
		printTest(true, "Testing getFragile() for a valid GroceryItem", String.valueOf(validLargeHeavyFirmBreakable.getFragile()), "true");		
	} // end testGetters
	
	/**
	 * tester method for equals method
	 */
	private static void testEquals()
	{
		System.out.println( "\n----------\nTesting Equals:\n" );
		
		System.out.printf("equals will throw exception if invoked on improperly instantiated GroceryItem "
				+ "so I won't test them here.\n The initialization feature has been shown to work in the testConstructor.");
		
		GroceryItem validLargeHeavyFirmBreakable = new GroceryItem("validLargeHeavyFirmBreakable", ItemSize.LARGE, ItemWeight.HEAVY, ItemFirmness.FIRM, "breakable");
		GroceryItem validSmallLightSoftUnbreakable = new GroceryItem("validSmallLightSoftUnbreakable", ItemSize.SMALL, ItemWeight.LIGHT, ItemFirmness.SOFT, "unbreakable");
		
		printTest(true, "Testing two equal GroceryItems", String.valueOf(validLargeHeavyFirmBreakable.equals(validLargeHeavyFirmBreakable)), "true");
		printTest(true, "Testing two unequal GroceryItems", String.valueOf(validLargeHeavyFirmBreakable.equals(validSmallLightSoftUnbreakable)), "false");
	} // end testEquals
	
	
	/**
	 * utility function to print out testing info
	 * @param isValid  is this testing valid parameters or invalid ones
	 * @param description  a description of the test being run
	 * @param recieved  output received by the test
	 * @param expected  what the received output should be
	 */
	private static void printTest(boolean isValid, String description, String recieved, String expected)
	{
		System.out.println(String.format("Is Valid: %s%nDescription: %s%nRecieved: %s%nExpected: %s%n", isValid, description, recieved, expected));
	} // end printTest
} // end GroceryItem
