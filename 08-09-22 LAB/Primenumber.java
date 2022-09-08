import java.util.Scanner;

public class Primenumber {
    public static void Prime(int n){
        int i, a=0, flag=0;
        a=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not a prime number.");
        }
        else{
            for(i=2;i<=a;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number.");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a prime number.");
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number to check if it is a prime number or not : ");
        int n = sc.nextInt();
        Prime(n);
    }
}
