package creational.factory.method;

import creational.factory.factory.EmailNotification;
import creational.factory.factory.Notification;

public class EmailNotificationService extends NotificationService {

  @Override
  protected Notification createNotification() {
    return new EmailNotification();
  }
}
