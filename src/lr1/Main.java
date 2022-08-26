package lr1;
import java.util.Scanner;
import lr1.com.fibonacci.*;

/**
 * @author Bohdan Lyshuk
 * This is my №1 lab
 */

public class Main
{
    /**
     * This is main method
     * @param args command line values
     */
    public static void main(String[] args)
    {
        int kst = inputData();

        Fibonacci.searchCorrectFibNums(kst);
    }

    /**
     * This is method for input variable kst from keyboard
     * @return kst - the number of Fibonacci numbers
     */
    public static int inputData()
    {
        int kst;

        do
        {
            System.out.print("Enter n >>> ");
            Scanner sc = new Scanner(System.in);

            try
            {
                kst = sc.nextInt();
                sc.close();
                if (kst < 0)
                    System.out.println("n must be > 0");
                else
                    break;
            }
            catch (Exception e) { System.out.println("Invalid input"); }

        } while (true);

        return kst;
    }
}