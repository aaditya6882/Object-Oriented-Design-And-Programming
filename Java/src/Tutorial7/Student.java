package Tutorial7;
/**
 * This is my student class
 * @author Aaditya Acharya
 * @version 3.2
 */
public class Student {
	/**
	 * Private variable name that stores name of student
	 */
	private String name;
/**
 * constructor name
 * @param name
 */
	public Student(String name) {
		this.name = name;
	}
	/**
	 * Getter method
	 * @return
	 */
	public String getName() {
		return name;
	}
/**
 * Setter method
 * @param name
 */
	public void setName(String name) {
		this.name = name;
	}

}
