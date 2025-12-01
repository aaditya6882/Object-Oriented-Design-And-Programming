package Workshop2;
abstract class Shape{
	abstract public void area();
}
class Circle extends Shape{
	double radius;
	public void area() {
		System.out.println("Circle Area "+(Math.PI)*(Math.pow(radius, 2)));
	}
}
class Rectangle extends Shape{
	double length;
	double breadth;
	public void area() {
		System.out.println("Rectangle Area "+length*breadth);
	}
}
public class Q7 {
public static void main(String[] args) {
	Rectangle rectangle=new Rectangle();
	Circle circle=new Circle();
	rectangle.length=7;
	rectangle.breadth=7;
	circle.radius=7;
	rectangle.area();
	circle.area();
	}
}
