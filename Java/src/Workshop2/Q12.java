package Workshop2;

interface A {
	default void show() {
		System.out.println("This is from A");
	};
}

interface B {
	default void show() {
		System.out.println("This is from B");
	};
}

class C implements A, B {
	@Override
	public void show() {
		A.super.show();
		B.super.show();
	}
}

public class Q12 {
	public static void main(String[] args) {
		C c = new C();
		c.show();
	}
}
