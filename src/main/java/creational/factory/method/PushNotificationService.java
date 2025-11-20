package creational.factory.method;

import creational.factory.factory.Notification;
import creational.factory.factory.PushNotification;

public class PushNotificationService extends NotificationService {

  @Override
  protected Notification createNotification() {
    return new PushNotification();
  }
}
