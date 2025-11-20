package behavioral.observer;

import behavioral.observer.observer.EmailConsumer;
import behavioral.observer.observer.Listener;
import behavioral.observer.observer.WhatsAppConsumer;

public class ObserverPatternApplication {

  public static void main(String[] args) {

    NotificationSubject notifier = new NotificationSubject();

    Listener emailListener1 = new EmailConsumer("EmailObserver1");
    Listener emailListener2 = new EmailConsumer("EmailObserver2");
    Listener whatsAppListener1 = new WhatsAppConsumer("WhatsAppObserver1");
    Listener whatsAppListener2 = new WhatsAppConsumer("WhatsAppObserver2");

    notifier.addObserver(emailListener1);
    notifier.addObserver(emailListener2);
    notifier.addObserver(whatsAppListener1);
    notifier.addObserver(whatsAppListener2);

    notifier.publishMessage("Congrats! you mastered Observer Design Pattern. Keep Going!");

    notifier.removeObserver(emailListener1);

    notifier.publishMessage("So, moving to which next Design Pattern?");

  }

}
