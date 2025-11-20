package creational.factory.method;


import creational.factory.factory.Notification;
import creational.factory.factory.WhatsAppNotification;

public class WhatsAppNotificationService extends NotificationService {

  @Override
  protected Notification createNotification() {
    return new WhatsAppNotification();
  }
}
