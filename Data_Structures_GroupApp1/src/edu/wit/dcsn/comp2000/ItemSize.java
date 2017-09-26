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
    
    
    /**
	 * Unit Tester for ItemSize
	 */
	public static void main(String[] args)
	{
		for (ItemSize correspondingSize: ItemSize.values()){
			System.out.println(correspondingSize);
		}
	} // end main
}// end ItemSize
