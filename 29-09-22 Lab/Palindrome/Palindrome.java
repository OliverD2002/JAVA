package labday;

public class Palindrome {
	static String PalindromeMethod(String txt) {
        int len = txt.length();
        char list[] = new char[len];
        int n = 0;
        for(int i=len-1;i>-1;i--) {
            char a = txt.charAt(i);
            list[n]=a;n++;
        }
        
        String reverse = String.valueOf(list);
        return reverse;
    } 
}
