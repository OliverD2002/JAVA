package lab_06_10;

public class Student extends Person{
	int marks;
	
	Student(int id, String name, int marks) {
		super(id, name);
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student Details [ Name of the Student : " +name+ "; Student Id is : " +id+ "; Marks of the student is : " +marks+ "; ] ";
	}
}
