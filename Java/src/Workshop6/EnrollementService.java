package Workshop6;

import java.util.HashMap;
import java.util.Map;

public class EnrollementService {
	private Map<String, String> enrollments = new HashMap<>();

	public boolean enrollStudent(String studentUsername, String courseName) {
		if (studentUsername == null || courseName == null) {
			return false;
		}
		if (enrollments.containsKey(studentUsername) && enrollments.get(studentUsername).equals(courseName)) {
			return false;
		}
		enrollments.put(studentUsername, courseName);
		return true;
	}
}
