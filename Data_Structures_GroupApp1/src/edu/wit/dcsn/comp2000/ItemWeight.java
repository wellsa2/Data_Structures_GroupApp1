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
} // end ItemWeight
