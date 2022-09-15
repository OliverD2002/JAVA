class Employee 
{
        int empID;
	String name;
	String department;
	int salary;

	Employee(int empID)
	{
	this.empID=empID;
	}

	Employee(int empID, String name)
	{
	this.empID = empID;
	this.name = name;
	}

	Employee(int empID, String name, String department)
	{
	this.empID = empID;
	this.name = name;
	this.department = department;
	}

	Employee(int empID, String name, String department,int salary)
	{
	this.empID = empID;
	this.name = name;
	this.department = department;
	this.salary = salary;
	}

	public void Data()
	{
	System.out.println("Employee ID : " +empID + " Name :  " + name + " Department : " + department + " Salary : " + salary );
	}



	public static void main( String[] args)
	{
	Employee emp1 = new Employee(163);
	Employee emp2 = new Employee(164," Amit");
	Employee emp3 = new Employee(165," Jonas " ," Accounts");
	Employee emp4 = new Employee(166,"Avinash","Sales",28000);


	emp1.Data(); emp2.Data(); emp3.Data(); emp4.Data();
	}
}
