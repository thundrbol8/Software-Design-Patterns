package creational.factory.factory;

public class SMSNotification implements Notification  {

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending SMS Notification with message: " + message);
  }

}
