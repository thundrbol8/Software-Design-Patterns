package creational.factory.factory;

public class WhatsAppNotification implements Notification {

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending WhatsApp Notification with message: " + message);
  }

}
