package edu.wit.dcsn.comp2000;


/**
 * An enum representing the weight of an item (small, medium, or large)
 */
public enum ItemSize
{
    // Size      Display Name    Numeric Value
    SMALL(         "Small",            1 ),
    MEDIUM(        "Medium",           2 ),
    LARGE(         "Large",            3 )
    ;

   public final String displayName;
   public final int    sizeValue;

   
   /**
    * private constructor
    * @param itemSizeDisplayName  name of size
    * @param itemSizeValue  value of size
    */
   private ItemSize( String itemSizeDisplayName, int itemSizeSizeValue )
   {
       displayName =   itemSizeDisplayName ;
       sizeValue =   itemSizeSizeValue ;
   } // end constructor

   
   /**
    * converts description to ItemSize enum
    * @param sizeDescription
    * @return the corresponding ItemSize enum
    */
    public static ItemSize interpretDescription( String sizeDescription )
    {
        ItemSize correspondingSize;
        
        if (sizeDescription == null)
		{
			return null;
		} // end if
       
        switch( sizeDescription.toLowerCase().charAt( 0 ) )
        {
           case 's':
               correspondingSize = SMALL;
               break;
               
           case 'm':
               correspondingSize = MEDIUM;
               break;
               
           case 'l':
               correspondingSize = LARGE;
               break;
               
           default:
               correspondingSize = MEDIUM ;
               break;
        } // end switch
       
    return  correspondingSize ;
    }   // end interpretDescription
   
   
    /**
     * returns a string representing the size
     * @return the display name for the size
     */
    @Override
    public String toString()
    {
        return displayName ;
    } // end toString
    
    
   
	/* 
	* Unit Tester for ItemSize
	*/
	public static void main(String[] args)
	{
		System.out.println( "\n----------\nTesting ItemSize:\n" );
		testNameAndValue();
		testMethods();
	} // end main
	
	
	/**
	 * tester for display names and values
	 */
	private static void testNameAndValue()
	{
		System.out.println( "\n----------\nTesting Names and Values:\n" );
		
		printTest(true, "Testing SMALL display name", ItemSize.SMALL.displayName, "Small");
		printTest(true, "Testing SMALL value", String.valueOf(ItemSize.SMALL.sizeValue), "1");
		
		printTest(true, "Testing MEDIUM display name",ItemSize .MEDIUM.displayName, "Medium");
		printTest(true, "Testing MEDIUM value", String.valueOf(ItemSize.MEDIUM.sizeValue), "2");

		printTest(true, "Testing LARGE display name", ItemSize.LARGE.displayName, "Large");
		printTest(true, "Testing LARGE value", String.valueOf(ItemSize.LARGE.sizeValue), "3");
	} // end testNameAndValue()
	
	
	/**
	 * tester for interpretDescription and toString
	 */
	private static void testMethods()
	{
		System.out.println( "\n----------\nTesting Methods:\n" );
		
		printTest(true, "Testing interpretDescription with valid string", interpretDescription("medium").displayName, "Medium");
		printTest(false, "Testing interpretDescription with undefined string", interpretDescription("z").displayName, "Medium"); // Medium is default value
		printTest(false, "Testing interpretDescription with null", String.valueOf(interpretDescription(null)), "null");
		
		printTest(true, "Testing toString", ItemSize.Large.toString(), "Large");
		
	} // end testMethods
	
	
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
} // end ItemSize

