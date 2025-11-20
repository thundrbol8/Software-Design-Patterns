package behavioral.observer;

import behavioral.observer.observer.Listener;

import java.util.ArrayList;
import java.util.List;

public class NotificationSubject implements Subject {
  private String message;

  private final List<Listener> observers = new ArrayList<>();

  @Override
  public void addObserver(Listener listener) {
    observers.add(listener);
  }

  @Override
  public void removeObserver(Listener listener) {
    System.out.println("Removing observer: " + listener.userId);
    observers.remove(listener);
  }

  @Override
  public void notifyObservers() {
    for (Listener listener: observers) {
      listener.update(message);
    }
  }

  public void publishMessage(String message) {
    this.message = message;
    notifyObservers();
  }

}
