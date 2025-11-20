package creational.abstractfactory.method;

import creational.abstractfactory.factory.button.Button;
import creational.abstractfactory.factory.checkbox.Checkbox;

public class GUIApplication {
  Button button;
  Checkbox checkbox;

  public void initialize(GUIFactory guiFactory) {
    button = guiFactory.createButton();
    checkbox = guiFactory.createCheckbox();

    button.onClick();
    button.paint();
    checkbox.onClick();
    checkbox.paint();
  }
}
