package Tutorial2;
class Animals{
	String name;
	double weight;
	public Animals(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public void makeSound() {
		System.out.println("Parent");
	}
}
class Cats extends Animals{
	String breed;

	public Cats(String name, double weight, String breed) {
		super(name, weight);
		this.breed = breed;
	}
	public void makeSound() {
		super.makeSound();
		System.out.println("Child");
	}
}
public class Task7 {
public static void main(String[] args) {
	Cats cats=new Cats("aa", 0, "bb");
	cats.makeSound();
}
}
