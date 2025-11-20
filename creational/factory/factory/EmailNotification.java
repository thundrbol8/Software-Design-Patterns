package creational.factory.factory;

public class EmailNotification implements Notification {

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending Email Notification with message: " + message);
  }
}
