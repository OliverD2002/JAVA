package lab_06_10;

public class Method_Overloading {
	public void BILL(int a, int b) {
		int n = a + b;
		System.out.println("Total amount for food : " +n);
	}
	
	public void BILL(double a, double b) {
		double n = a + b;
		System.out.println("Total Bill for food with taxes : " +n);
	}

	public static void main(String[] args) {
		Method_Overloading bl = new Method_Overloading();
		bl.BILL(240, 410);
		bl.BILL(268.8, 459.2);
	}
}
