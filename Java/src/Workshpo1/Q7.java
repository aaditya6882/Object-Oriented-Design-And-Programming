package Workshpo1;

import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the principle: ");
	int principle=scanner.nextInt();
	System.out.print("Enter the Rate of Intrest: ");
	int rate=scanner.nextInt();
	System.out.print("Enter the Time Period in years: ");
	int time=scanner.nextInt();
	int simpleIntrest=(principle*rate*time)/100;
	System.out.println("Simple Intrest: "+ simpleIntrest);
}
}
