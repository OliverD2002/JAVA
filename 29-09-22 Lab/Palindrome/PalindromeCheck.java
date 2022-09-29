package labday;
import java.util.Scanner;

public class PalindromeCheck extends Palindrome{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the word to check if it is a Palindrome or not : ");
        String word = sc.nextLine();
        
        if (word.equals(PalindromeMethod(word))){
        	System.out.println(word+ " is a Palindrome.");
        	}
        else{
        	System.out.println(word+ " is not a Palindrome.");
        	}
        sc.close();
    }
}
