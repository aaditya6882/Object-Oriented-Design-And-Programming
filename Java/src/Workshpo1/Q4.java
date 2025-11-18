package Workshpo1;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the value of a:");
	double a=scanner.nextDouble();
	System.out.print("Enter the value of b:");
	double b=scanner.nextDouble();
	System.out.print("Enter the value of c:");
	double c=scanner.nextDouble();
	double s= (a+b+c)/2;
	double areaOfTriangle= Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Arera of Triangle = "+areaOfTriangle);
}
}
