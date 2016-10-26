/**
 * Created by George Cimpoies on 10/26/2016.
 */
import java.util.Scanner;


public class MainHolder
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter inferior limit: ");
        int inferior = Integer.parseInt(in.next());
        System.out.println("Please enter superior limit: ");
        int superior = Integer.parseInt(in.next());

        for(int i = inferior; i <= superior; i++)
            for(int p = 2; p <= i/2; p++)
                if(Utils.isPrime(p))
                    if(Utils.isPrime(i-p))
                    {
                        System.out.println(i + " = " + p + " + " + (i-p));
                        break;
                    }

        in.close();
    }
}

