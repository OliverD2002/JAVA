package lab_06_10;

public class Bank_main {
	public static void main(String[] args) {
		Bank sb = new SBI_Bank();
		Bank ax = new AXIS_Bank();
		Bank ic = new ICICI_Bank();
		
		sb.Interest();
		ax.Interest();
		ic.Interest();
	}
}
