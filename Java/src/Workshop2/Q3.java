package Workshop2;
class Animal{
	public void sound() {
		System.out.println("Sound");
	}
}
class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Meow");
	}
}
public class Q3 {
public static void main(String[] args) {
	Cat cat=new Cat();
	cat.sound();
	Dog dog=new Dog();
	dog.sound();
}
}
