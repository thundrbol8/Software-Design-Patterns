package creational.abstractfactory.method;

import creational.abstractfactory.factory.button.Button;
import creational.abstractfactory.factory.button.MacOSButton;
import creational.abstractfactory.factory.checkbox.Checkbox;
import creational.abstractfactory.factory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

  @Override
  public Button createButton(){
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}
