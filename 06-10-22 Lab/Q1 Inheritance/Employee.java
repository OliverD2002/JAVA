package lab_06_10;

public class Employee extends Person{
	int salary;
	
	Employee(int id, String name, int salary){
		super(id, name);
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Details [ Name of the Employee : " +name+ "; Employee Id is : " +id+ "; Salary of the employee is : " +salary+ "; ] ";
	}
}
