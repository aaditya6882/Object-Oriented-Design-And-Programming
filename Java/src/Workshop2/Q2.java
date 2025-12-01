package Workshop2;
class Person{
	public void displayInfo() {
		System.out.println("Aaditya Acharya");
	}
}
class Employee extends Person{
	public void displayRole() {
		System.out.println("Manager");
	}
}
class Manager extends Employee{
	public void displayDepartment() {
		System.out.println("Sales");
	}
}
public class Q2 {
public static void main(String[] args) {
	Manager manager=new Manager();
	manager.displayDepartment();
	manager.displayRole();
	manager.displayInfo();
}
}
