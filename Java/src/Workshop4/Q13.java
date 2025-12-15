package Workshop4;

import java.io.*;

public class Q13 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\Workshop4\\Q13file.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
