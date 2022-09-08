import java.util.function.DoubleFunction;

public class Apples {
    public static void main(String[] args){
        int remaining = 420;
        int sold = 40;
        int x = 100 - 40;

        int result = (remaining * 100) / x;
        System.out.println("The total number of apples :"+result);
    }
}
