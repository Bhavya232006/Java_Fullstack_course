package oops;

public class Employee extends Company {

	public Employee(int id, String name, double salary, String department) {
		super(id, name, salary, department);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee e = new Employee(101, "Bhavya", 10000.0, "CSE");
		System.out.println(e.getSalary());
		e.setSalary(15000.0);
		System.out.println(e.getSalary());
	}
}
