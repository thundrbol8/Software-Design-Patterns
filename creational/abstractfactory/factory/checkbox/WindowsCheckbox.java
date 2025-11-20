package creational.abstractfactory.factory.checkbox;

public class WindowsCheckbox implements Checkbox {

  @Override
  public void onClick() {
    System.out.println("Clicking Windows Checkbox");
  }

  @Override
  public void paint() {
    System.out.print("Painting Windows Checkbox");
  }
}
