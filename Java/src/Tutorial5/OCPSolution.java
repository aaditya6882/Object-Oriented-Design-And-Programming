package Tutorial5;
 interface Shape{
	 void draw();
 }
 class Circle implements Shape{
	 public void draw() {
		System.out.println("Circle");
	}
 }
 
 class Rectangle implements Shape{
	 public void draw() {
		System.out.println("Rectangle");
	}
 }
 class Triangle implements Shape{
	 public void draw() {
		System.out.println("Triangle");
	}
 }
 class ShapeDrawer{
	 public void drawShape(Shape shape) {
		 shape.draw();
	 }
 }
public class OCPSolution {
public static void main(String[] args) {
	ShapeDrawer shapeDrawer=new ShapeDrawer();
	Circle circle =new Circle();
	Rectangle rectangle =new Rectangle();
	Triangle triangle=new Triangle();
	shapeDrawer.drawShape(triangle);
	shapeDrawer.drawShape(rectangle);
	shapeDrawer.drawShape(circle);
}
}
