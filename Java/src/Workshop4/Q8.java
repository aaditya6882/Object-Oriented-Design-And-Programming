package Workshop4;

import java.io.FileReader;

public class Q8 {
public static void main(String[] args) {
	try {
		FileReader fileReader=new FileReader("MAIN.txt");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
