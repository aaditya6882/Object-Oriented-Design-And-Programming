package Tutorial5;
 interface  NotificationService{
	 void sendNotification(String message);
 }
 class EmailService implements NotificationService{
	 @Override
	 public void sendNotification(String message){
		 System.out.println("Send Email: \n"+message);
	 }
 }
 class SMSService implements NotificationService{
	 @Override
	 public void sendNotification(String message){
		 System.out.println("Send SMS: \n"+message);
	 }
 }
public class DIPSolution {
public static void main(String[] args) {
	NotificationService emailService=new EmailService();
	NotificationService smService=new SMSService();
	Notification notification=new Notification(smService);
	notification.notify("Viva in Workshop");
}
}
