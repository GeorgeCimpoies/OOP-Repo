import java.util.Comparator;

public class SortBasedOnName implements Comparator
{
    public int compare(Object o1, Object o2)
    {

        Ship dd1 = (Ship)o1;
        Ship dd2 = (Ship)o2;
        return dd1.getName().compareToIgnoreCase(dd2.getName());
    }

}