/**
 * Created by George Cimpoies on 10/26/2016.
 */

public class Utils {
    public static boolean isPrime(int number)
    {
        if(number == 2) return true;
        for(int p = 2; p <= Math.sqrt(number); p++)
            if(number%p == 0)
                return false;
        return true;
    }
}
