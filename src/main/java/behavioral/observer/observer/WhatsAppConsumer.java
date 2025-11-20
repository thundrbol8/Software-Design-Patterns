package behavioral.observer.observer;

public class WhatsAppConsumer extends Listener {

  public WhatsAppConsumer(String userId) {
    this.userId = userId;
  }

  public void update(String message) {
    System.out.println(userId + " notified with whatsapp message: " + message);
  }

}
