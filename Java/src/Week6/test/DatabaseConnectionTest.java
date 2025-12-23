package Week6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import Tutorial6.DatabaseConnection;

public class DatabaseConnectionTest{
	DatabaseConnection db;
	@BeforeEach
	void setup() {
		db=new DatabaseConnection();
		System.out.println("Setup");
	}
	@Test
	void tryConnectingDatabase() {
		boolean output=db.connectToDatabase();
		assertTrue(output);
		System.out.println("Connected");
	}
	@Test
	void testReadData() {
		db.connectToDatabase();
		String output=db.readDData("Viva");
		String expected ="Data: Viva";
		
		assertAll(
				()-> assertNotNull(output),
				()-> assertEquals(2,2),
				()-> assertEquals(expected, output)
				);
		System.out.println("Reading");
	}
}