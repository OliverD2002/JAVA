package labday;

public class AndroidPhone_main {
	public static void main(String[] args) {
		AndroidPhone a1 = new AndroidPhone("Samsung",12,"Burgundy",true);
		AndroidPhone a2 = new AndroidPhone("Oneplus", 8,"Green",true);
		AndroidPhone a3 = new AndroidPhone("Motorola",6,"Black",false);
		
		AndroidPhone[]arr = {a1,a2,a3};
		
		for(AndroidPhone a : arr) {
			System.out.println("Mobile Brand = " + a.brand + ";  RAM = " + a.ram + ";  Color = " + a.color + ";");
		}
	}
}
