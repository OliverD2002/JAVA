import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int i, fact=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number to calculate the factorial");
        //int number=5;
        int number = scan.nextInt();

        for(i=1;i<=number;i++){
        fact=fact*i;
    }
    System.out.println("The Factorial of "+ number +" is "+ fact);
    }
}
