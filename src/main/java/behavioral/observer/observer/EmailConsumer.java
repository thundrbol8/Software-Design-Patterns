package behavioral.observer.observer;

public class EmailConsumer extends Listener {

  public EmailConsumer(String userId) {
    this.userId = userId;
  }

  public void update(String message) {
    System.out.println(userId + " notified with message: " + message);
  }

}
