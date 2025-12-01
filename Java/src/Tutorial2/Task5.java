package Tutorial2;

class Animal{
	String name;
	double weight;
	String color;
	int age;
	public Animal(String name, double weight, String color, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.age = age;
	}
	
}
class Dog extends Animal{
	String breed;
	boolean isIndoor;
	public Dog(String name, double weight, String color, int age, String breed, boolean isIndoor) {
		super(name, weight, color, age);
		this.breed = breed;
		this.isIndoor = isIndoor;
	}
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", isIndoor=" + isIndoor + ", name=" + name + ", weight=" + weight + ", color="
				+ color + ", age=" + age + "]";
	}
	
}
class Cat extends Animal{
	double height;

	public Cat(String name, double weight, String color, int age, double height) {
		super(name, weight, color, age);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cat [height=" + height + ", name=" + name + ", weight=" + weight + ", color=" + color + ", age=" + age
				+ "]";
	}
	
}
public class Task5 {
public static void main(String[] args) {
	Dog dog=new Dog("Aa", 0, "AA", 0, "AAA", false);
	Cat cat=new Cat("aa", 0, "AAA", 0, 0);
	System.out.println(dog);
	System.out.println(cat);
}
}
