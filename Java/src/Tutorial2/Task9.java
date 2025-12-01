package Tutorial2;

import java.lang.classfile.Superclass;
import java.lang.classfile.attribute.CompilationIDAttribute;

 abstract class EmployeeS{
String name;
String position;
public EmployeeS( String name, String position) {
	this.name=name;
	this.position=position;
}
public abstract void calculateSalary();
public void getdetais() {
	System.out.println("Name ="+name);
	System.out.println("Position = "+position);
}
}
 class FullTimeEmployee extends EmployeeS{
	 double Salary;

	public FullTimeEmployee(String name, String position, double salary) {
		super(name, position);
		Salary = salary;
	}
	 @Override
	 public void calculateSalary() {
		 System.out.println(super.name+"earns"+Salary);
	 };
 }
 class PartTimeEmployee extends EmployeeS {
		double hours;
		double hourlyWage;

		public PartTimeEmployee(String name, String position, double hours, double hourlyWage) {
			super(name, position);
			this.hours = hours;
			this.hourlyWage = hourlyWage;
		}

		@Override
		public void calculateSalary() {
			System.out.println(super.name + "earns" + (hourlyWage * hours));
		}
	}
public class Task9 {
public static void main(String[] args) {
	PartTimeEmployee partTimeEmployee=new PartTimeEmployee("Aaditya", "Manager", 0, 0);
	FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("a", "B", 0);
	partTimeEmployee.calculateSalary();
	fullTimeEmployee.calculateSalary();
}
}
