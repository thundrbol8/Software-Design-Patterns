package behavioral.observer.observer;

public abstract class Listener {
  public String userId;

  public abstract void update(String message);

}
