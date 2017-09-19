package edu.wit.dcsn.comp2000;


//TODO Documentation
public enum ItemSize
	{
    // Size      Display Name    Numeric Value
    SMALL(         "Small",            1 ),
    MEDIUM(        "Medium",           2 ),
    LARGE(         "Large",            3 )
    ;

   public final String displayName ;
   public final int    sizeValue ;

   
   /**
    * 
    * @param itemSizeDisplayName
    * @param itemSizeValue
    */
   private ItemSize( String itemSizeDisplayName, int itemSizeSizeValue )
       {
       displayName =   itemSizeDisplayName ;
       sizeValue =   itemSizeSizeValue ;
       } // end constructor

   
   /**
    * 
    * @param sizeDescription
    * @return
    */
   public static ItemSize interpretDescription( String sizeDescription )
       {
       // TODO: really implement this
       ItemSize correspondingSize ;
       
       switch( sizeDescription.toLowerCase().charAt( 0 ) )
           {
           case 's':
               correspondingSize = SMALL ;
               break;
               
           case 'm':
               correspondingSize = MEDIUM ;
               break;
               
           case 'l':
               correspondingSize = LARGE ;
               break ;
               
           default:
               correspondingSize = MEDIUM ;
               break ;
           }   // end switch()
       
       return  correspondingSize ;
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