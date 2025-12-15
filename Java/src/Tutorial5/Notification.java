package Tutorial5;

public class Notification {
private NotificationService notificationService;

public Notification(NotificationService notificationService) {
	this.notificationService = notificationService;
}
public void notify(String message) {
	notificationService.sendNotification(message);
}
}
