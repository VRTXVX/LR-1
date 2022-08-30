package lr1.com.fibonacci;

/**
 * This class contains a method to find a satisfactory value among the Fibonacci numbers
 */
public class Fibonacci
{
    /**
     * This is method for finding a satisfactory value among the Fibonacci numbers
     * @param kst - the number of Fibonacci numbers
     */
    public static void searchCorrectFibNums(int kst)
    {
        long prevNum,nextNum;
        double root;
        boolean flag = false;

        prevNum = nextNum = 1;

        System.out.print("Result: ");

        while(kst-- > 0)
        {
            root = Math.cbrt(nextNum + 1);

            if (root == (int)root && root != 0)
            {
                System.out.print(nextNum + " ");
                flag = true;
            }

            nextNum += prevNum;
            prevNum = nextNum - prevNum;
        }

        if(!flag)
            System.out.println("No numbers found!");

    }
}