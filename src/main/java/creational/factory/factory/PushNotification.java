package creational.factory.factory;

public class PushNotification implements Notification {

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending Push Notification with message: " + message);
  }
}
