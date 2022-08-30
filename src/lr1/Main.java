package lr1;
import java.util.Scanner;
import lr1.com.fibonacci.*;

public class Main
{
    public static void main(String[] args)
    {
        int kst = inputData();

        Fibonacci.searchCorrectFibNums(kst);
    }
    
    public static int inputData()
    {
        int kst;

        do
        {
            System.out.print("Enter n >>> ");
            try(Scanner sc = new Scanner(System.in))
            {
                kst = sc.nextInt();
                if (kst <= 0 || kst >= 92)
                    System.out.println("n must be > 0 and < 92");
                else
                    break;
            }
            catch (Exception e) { System.out.println("Invalid input"); }
        } while (true);

        return kst;
    }
}