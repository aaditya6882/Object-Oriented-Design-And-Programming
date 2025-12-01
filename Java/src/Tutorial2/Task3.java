package Tutorial2;
class Person {
	String name;
	int age;
}

class Employee extends Person {
	int employeeId;
}

public class Task3 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "Alash";
		employee.age = 24;
		employee.employeeId = 7;
		System.out.println("Name = " + employee.name);
		System.out.println("Age = " + employee.age);
		System.out.println("Id" + employee.employeeId);
	}
}