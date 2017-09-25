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
} // end ItemFirmness
