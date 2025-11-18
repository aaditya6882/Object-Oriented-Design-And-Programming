package Workshpo1;

import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the radius ");
	double radius=scanner.nextDouble();
	double areaOfCircle= Math.PI*Math.pow(radius, 2);
	System.out.println("Area of circle: "+areaOfCircle);
}
}
