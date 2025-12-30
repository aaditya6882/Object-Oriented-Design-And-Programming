package Week6.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import Workshop6.EnrollementService;

public class EnrollmentTestService {
	EnrollementService enrollementService = new EnrollementService();

	@Test
	public void testEnrollStudent() {
		assertAll("Student enrolled",
				() -> assertTrue(enrollementService.enrollStudent("Aaditya", "Java"), "Already Enrolled"),
				() -> assertFalse(enrollementService.enrollStudent("Aaditya", "Java"), "Already Enrolled"));
	}
}
