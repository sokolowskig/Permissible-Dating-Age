
/**
 * The class is a set of methods needed in the GUI.
 * 
 * @author (James Burns) 
 * @version (2/10/15)
 */
public class model
{
    //TODO add javadoc
    public static int getHighest(int n)
    {
        if (n > 15)
        {
              return n + n/2 - 7 ;
        }
        else
        {
            return 0;
        }

    }

    public static int getLowest(int n)
    {
     
        if (n > 15)
        {
        	if(n/2 + 7 <= 15)
        	{
        		return 16;
        	}
        	else
        	{
        		return n/2 + 7 ;
        	}
        }
        else
        {
            return 0;
        }
    }

    
}
