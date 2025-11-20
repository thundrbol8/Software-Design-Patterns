package creational.abstractfactory.method;

import creational.abstractfactory.factory.button.Button;
import creational.abstractfactory.factory.button.WindowsButton;
import creational.abstractfactory.factory.checkbox.Checkbox;
import creational.abstractfactory.factory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

  @Override
  public Button createButton(){
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
