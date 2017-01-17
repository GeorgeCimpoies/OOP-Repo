

import java.util.Comparator;

public class SortBasedOnName implements Comparator
{
    public int compare(Object o1, Object o2)
    {

        Plane dd1 = (Plane)o1;
        Plane dd2 = (Plane)o2;
        return dd1.getName().compareToIgnoreCase(dd2.getName());
    }

}