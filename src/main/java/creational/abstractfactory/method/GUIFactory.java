package creational.abstractfactory.method;

import creational.abstractfactory.factory.button.Button;
import creational.abstractfactory.factory.checkbox.Checkbox;

public interface GUIFactory {
  public Button createButton();
  public Checkbox createCheckbox();

}
