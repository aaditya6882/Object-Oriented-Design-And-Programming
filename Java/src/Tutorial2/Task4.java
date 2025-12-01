package Tutorial2;

class GrandParent {
	void displayGrant() {
		System.out.println("I am GrandParent");
	}
}

class Parent extends GrandParent {
	void displayParent() {
		System.out.println("I am Parent");
	}
}

class Child extends Parent {
	void displayChild() {
		System.out.println("I am Child");
	}
}
public class Task4 {
	public static void main(String[] args) {
		Child child = new Child();
		child.displayChild();
		child.displayParent();
		child.displayGrant();
	}
}
