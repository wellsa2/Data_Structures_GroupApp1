/**
 * 
 */

package edu.wit.dcsn.comp2000;

/**
 * An enum representing the weight of an item (light, medium, or heavy)
 * @author David M Rosenberg
 */
public enum ItemWeight
{
     // Weight      Display Name    Numeric Value
     LIGHT(         "Light",            1 ),
     MEDIUM(        "Medium",           2 ),
     HEAVY(         "Heavy",            3 )
     ;

    public final String displayName;
    public final int    weightValue;

    
    /**
     * private constructor
     * @param itemWeightDisplayName  name of weight
     * @param itemWeightValue  value of weight
     */
    private ItemWeight( String itemWeightDisplayName, int itemWeightWeightValue )
    {
        displayName =   itemWeightDisplayName;
        weightValue =   itemWeightWeightValue;
    } // end constructor

    
    /**
     * converts description to ItemWeight enum
     * @param weightDescription
     * @return the corresponding ItemWeight enum
     */
    public static ItemWeight interpretDescription( String weightDescription )
    {
        ItemWeight correspondingWeight;
        
        if (weightDescription == null)
		{
			return null;
		} // end if
        
        switch( weightDescription.toLowerCase().charAt( 0 ) )
        {
            case 'l':
                correspondingWeight = LIGHT;
                break;
                
            case 'm':
                correspondingWeight = MEDIUM;
                break;
                
            case 'h':
                correspondingWeight = HEAVY;
                break;
                
            default:
                correspondingWeight = MEDIUM;
                break;
        } // end switch
        
        return  correspondingWeight;
    } // end interpretDescription
    
    
    /**
     * returns a string representing the weight
     * @return the display name for the weight
     */
    @Override
    public String toString()
    {
        return displayName;
    } // end toString
    
    
	/**
	 * Unit Tester for ItemWeight
	 */
	public static void main(String[] args)
	{
		System.out.println( "\n----------\nTesting ItemWeight:\n" );
		testNameAndValue();
		testMethods();
	} // end main
	
	
	/**
	 * tester for display names and values
	 */
	private static void testNameAndValue()
	{
		System.out.println( "\n----------\nTesting Names and Values:\n" );
		
		printTest(true, "Testing LIGHT display name", ItemWeight.LIGHT.displayName, "Light");
		printTest(true, "Testing LIGHT value", String.valueOf(ItemWeight.LIGHT.weightValue), "1");
		
		printTest(true, "Testing MEDIUM display name",ItemWeight .MEDIUM.displayName, "Medium");
		printTest(true, "Testing MEDIUM value", String.valueOf(ItemWeight.MEDIUM.weightValue), "2");

		printTest(true, "Testing HEAVY display name", ItemWeight.HEAVY.displayName, "Heavy");
		printTest(true, "Testing HEAVY value", String.valueOf(ItemWeight.HEAVY.weightValue), "3");
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
		
		printTest(true, "Testing toString", ItemWeight.HEAVY.toString(), "Heavy");
		
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
} // end ItemWeight
