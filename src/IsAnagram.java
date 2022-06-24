import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SortedMap;

public class IsAnagram {
    public static  boolean isAnagram(String String1,String String2)
    {
        if(String1.length()==String2.length())
        {
            char[] firstString = String1.toLowerCase().toCharArray();
            char[] SecondString = String2.toLowerCase().toCharArray();

            Arrays.sort(firstString);
            Arrays.sort(SecondString);

            if((Arrays.equals(firstString,SecondString)))
            {
                return true;
            }
            return false;
        }
        return false;
    }
}
