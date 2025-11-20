package creational.factory.method;

import creational.factory.factory.Notification;

public abstract class NotificationService {

  protected abstract Notification createNotification();

  public void notifyUser(String message) {
    Notification notification = createNotification();
    notification.sendMessage(message);
  }
}
