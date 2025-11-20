package creational.factory.method;

import creational.factory.factory.Notification;
import creational.factory.factory.SMSNotification;

public class SMSNotificationService extends NotificationService {

  @Override
  protected Notification createNotification() {
    return new SMSNotification();
  }
}
