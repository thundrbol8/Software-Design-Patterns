package behavioral.observer;

import behavioral.observer.observer.Listener;

public interface Subject {

  public void addObserver(Listener listener);
  public void removeObserver(Listener listener);
  public void notifyObservers();
}
