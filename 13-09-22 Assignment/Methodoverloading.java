import java.util.Scanner;

public class Methodoverloading {
    public void method(String a) {
		System.out.println(a);
	}
	
	public void method(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}

	public void method(String a, String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How much data do you need? : ");
        int num = sc.nextInt();

        Methodoverloading data =  new Methodoverloading();
		
		switch(num) {
			case 1:
				data.method("Pincode - 421301");
				break;
			case 2:
				data.method("Pincode - 421301", "Police Stn - Godrej Hill");
				break;
			case 3:
				data.method("Pincode - 421301", "Police Stn - Godrej Hill", "City - Kalyan West");
				break;
			default: 
				System.out.print("This request is not valid");
		}
    }
}