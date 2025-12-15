package Workshop4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String filename = sc.nextLine();

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		} catch (Exception e) {
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
