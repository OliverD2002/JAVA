import java.util.Scanner;

public class Sumofdigits
{  
    static int Sum(int num)  
    {     
        int x = 0;  
        while (num != 0)  
            {  
            x = x + num % 10;  
            num = num/10;  
            }  
        return x;  
    }  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");  
        int num = sc.nextInt();
        System.out.println("The sum of digits: "+Sum(num));  
    }   
}
