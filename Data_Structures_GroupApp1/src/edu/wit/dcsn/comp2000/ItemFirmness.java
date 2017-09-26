package edu.wit.dcsn.comp2000;

/**
 * An enum representing the weight of an item (soft, firm, or hard)
 */
public enum ItemFirmness
{
	// Firmness      Display Name    Numeric Value
	SOFT(         	"Soft",            	1 ),
	FIRM(        	"Firm",           	2 ),
	HARD(         	"Hard",            	3 );

	public final String displayName;
	public final int    firmnessValue;


	/**
	 * private constructor
	 * @param itemFirmnessDisplayName name of firmness
	 * @param itemFirmnessValue value of firmness
	 */
	private ItemFirmness( String itemFirmnessDisplayName, int itemFirmnessValue )
	{
		displayName =   itemFirmnessDisplayName ;
		firmnessValue =   itemFirmnessValue ;
	} // end constructor

	
	/**
	 * converts description to ItemFirmness enum
	 * @param firmnessDescription
	 * @return the corresponding ItemFirmnes enum
	 */
	public static ItemFirmness interpretDescription( String firmnessDescription )
	{
		ItemFirmness correspondingfirmness;
		
		if (firmnessDescription == null)
		{
			return null;
		} // end if

		switch( firmnessDescription.toLowerCase().charAt( 0 ) )
		{
			case 's':
				correspondingfirmness = SOFT;
				break;

			case 'f':
				correspondingfirmness = FIRM;
				break;

			case 'h':
				correspondingfirmness = HARD;
				break;

			default:
				correspondingfirmness = FIRM;
				break;
		} // end switch

		return  correspondingfirmness;
	} // end interpretDescription

	
	/**
	 * returns a string representing the firmness
	 * @return the display name for the firmness
	 */
	@Override
	public String toString()
	{
		return displayName;
	} // end toString
	
	
	/**
	 * Unit Test Driver for ItemFirmness
	 */
	public static void main(String[] args)
	{
		System.out.println( "\n----------\nTesting ItemFirmness:\n" );
		
		testNameAndValue();
		
		testMethods();
	} // end main
	
	
	/**
	 * tester for display names and values
	 */
	private static void testNameAndValue()
	{
		System.out.println( "\n----------\nTesting Names and Values:\n" );
		
		printTest(true, "Testing SOFT display name", ItemFirmness.SOFT.displayName, "Soft");
		printTest(true, "Testing SOFT value", String.valueOf(ItemFirmness.SOFT.firmnessValue), "1");
		
		printTest(true, "Testing FIRM display name", ItemFirmness.FIRM.displayName, "Firm");
		printTest(true, "Testing FIRM value", String.valueOf(ItemFirmness.FIRM.firmnessValue), "2");
		
		printTest(true, "Testing HARD display name", ItemFirmness.HARD.displayName, "Hard");
		printTest(true, "Testing HARD value", String.valueOf(ItemFirmness.HARD.firmnessValue), "3");
	} // end testNameAndValue()
	
	
	/**
	 * tester for interpretDescription and toString
	 */
	private static void testMethods()
	{
		System.out.println( "\n----------\nTesting Methods:\n" );
		
		printTest(true, "Testing interpretDescription with valid string", interpretDescription("firm").displayName, "Firm");
		printTest(false, "Testing interpretDescription with undefined string", interpretDescription("z").displayName, "Firm"); // Firm is default value
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
} // end ItemFirmness
