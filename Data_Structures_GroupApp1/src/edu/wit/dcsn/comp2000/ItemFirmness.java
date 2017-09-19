package edu.wit.dcsn.comp2000;


//TODO Documentation
public enum ItemFirmness
	{
	// Firmness      Display Name    Numeric Value
	SOFT(         	"Soft",            	1 ),
	FIRM(        	"Firm",           	2 ),
	HARD(         	"Hard",            	3 );

	public final String displayName ;
	public final int    firmnessValue ;


	/**
	 * 
	 * @param itemFirmnessDisplayName
	 * @param itemFirmnessValue
	 */
	private ItemFirmness( String itemFirmnessDisplayName, int itemFirmnessValue )
	{
		displayName =   itemFirmnessDisplayName ;
		firmnessValue =   itemFirmnessValue ;
	} // end constructor


	/**
	 * 
	 * @param firmnessDescription
	 * @return
	 */
	public static ItemFirmness interpretDescription( String firmnessDescription )
	{
		// TODO: really implement this
		ItemFirmness correspondingfirmness ;

		switch( firmnessDescription.toLowerCase().charAt( 0 ) )
		{
		case 's':
			correspondingfirmness = SOFT ;
			break;

		case 'f':
			correspondingfirmness = FIRM ;
			break;

		case 'h':
			correspondingfirmness = HARD ;
			break ;

		default:
			correspondingfirmness = FIRM ;
			break ;
		}   // end switch()

		return  correspondingfirmness ;
	}   // end method interpretDescription()


	/**
	 * 
	 */
	@Override
	public String toString()
	{
		return displayName ;
	}   // end method toString()





}
