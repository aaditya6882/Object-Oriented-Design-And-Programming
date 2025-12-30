package Workshop6;

public class NotificationService {
	public boolean sendEmail(String email, String message) {

		if (email == null || email.isEmpty() || !email.contains("@")) {
			return false;
		}
		return true;
	}
}
