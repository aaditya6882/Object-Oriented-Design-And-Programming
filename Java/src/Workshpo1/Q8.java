package Workshpo1;

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a number: ");
	double a=scanner.nextDouble();
	System.out.print("Enter another number: ");
	double b=scanner.nextDouble();
	double division;
	double sum=a+b;
	double subtraction=a-b;
	double multiplication=a*b;
	if (b==0) {
		 System.out.println("Division cannot be performed");
	}
	division=a/b;
	System.out.println("Addition :"+sum+" Multiplication: "+multiplication+" subtraction: "+subtraction+" division: "+division);
}
}
