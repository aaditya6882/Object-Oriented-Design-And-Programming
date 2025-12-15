package Workshop4;

import java.io.FileReader;
import java.io.IOException;

public class Q5 {
public static void main(String[] args) {
	try {
		FileReader fileReader=new FileReader("Main.txt");
		System.out.println(10/0);
	} catch (IOException e) {
		System.out.println("Error in File :"+e);
	}catch (ArithmeticException e) {
		System.out.println("Arithmetic edxception "+e);
	}catch (Exception e) {
		System.out.println("Error "+ e);
	}

}
}
