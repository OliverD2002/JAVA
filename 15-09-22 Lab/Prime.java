import java.util.Scanner;

public class Prime 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the minimum number for the range : ");
        int min = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the maximum number for the range : ");
        int max = scan.nextInt();

        System.out.println("The prime numbers between "+min+" and "+max+" are : ");
        for (int i = min; i <= max; i++)
        if (isPrime (i))
        System.out.println (i);
    }
    static boolean isPrime (int num)
    {
        if (num < 2)
        return false;

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            return false;
        }

        return true;
    }
}
