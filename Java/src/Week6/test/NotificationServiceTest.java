package Week6.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import Workshop6.NotificationService;

public class NotificationServiceTest {
	NotificationService notificationService = new NotificationService();

	@Test
	void testSendEmail() {
		assertAll("Email Send", () -> assertTrue(notificationService.sendEmail("aadity@gmail.com", "Hii")));
	}
}
