package creational.abstractfactory;

import creational.abstractfactory.method.GUIApplication;
import creational.abstractfactory.method.GUIFactory;
import creational.abstractfactory.method.WindowsFactory;

public class AbstractFactoryPatternApplication {

  public static void main(String[] args) {
    GUIFactory guiFactory;
    guiFactory = new WindowsFactory();

    GUIApplication guiApplication = new GUIApplication();
    guiApplication.initialize(guiFactory);
  }

}
