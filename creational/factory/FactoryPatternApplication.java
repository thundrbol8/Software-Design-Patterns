package creational.factory;

import creational.factory.method.*;

public class FactoryPatternApplication {

	public static void main(String[] args) {

		NotificationService emailNotification = new EmailNotificationService();
		emailNotification.notifyUser("Hello via Email!");

		NotificationService pushNotification = new PushNotificationService();
		pushNotification.notifyUser("Hello via Push Notification!");

		NotificationService smsNotification = new SMSNotificationService();
		smsNotification.notifyUser("Hello via SMS!");

		NotificationService whatsAppNotification = new WhatsAppNotificationService();
		whatsAppNotification.notifyUser("Hello via WhatsApp!");
	}

}
