package Workshop4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q21 {
public static void main(String[] args) {
	BufferedReader fileReader=null;
	try {
		fileReader=new BufferedReader(new FileReader("src\\Workshop4\\Q21file.txt"));
		String line;
		while ((line = fileReader.readLine()) != null) {
			System.out.println(line);
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			fileReader.close();
			System.out.println("File Closed ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
