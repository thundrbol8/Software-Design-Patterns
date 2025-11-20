package creational.abstractfactory.factory.checkbox;

public class MacOSCheckbox implements Checkbox {

  @Override
  public void onClick() {
    System.out.println("Clicking MacOS Checkbox");
  }

  @Override
  public void paint() {
    System.out.println("Painting MacOS Checkbox");
  }
}
