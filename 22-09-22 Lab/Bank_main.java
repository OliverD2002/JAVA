package Inheritance;

public class Bank_main {
	public static void main(String[] args)
	{
		ICICI ic = new ICICI();
		ic.Name();
		ic.IFSC();
		ic.Location();
		
		HDFC hd = new HDFC();
		hd.Name();
		hd.IFSC();
		hd.Location();
	}
}
