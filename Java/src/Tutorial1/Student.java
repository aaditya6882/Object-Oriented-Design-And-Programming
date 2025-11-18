package Tutorial1;

public class Student {
	String name = "Aaditya";
	long age = 20;

	public Student(String name, long age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
