package lab_06_10;

public class Person_main {
	public static void main(String[] args) {
		Person s = new Student(23442,"Pratham Sharma", 97);
		Person e = new Employee(7223, "Bhagyashree Sahu", 66000);
		
		System.out.println(s.toString());
		System.out.println(e.toString());
	}
}
