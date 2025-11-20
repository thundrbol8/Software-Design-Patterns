package creational.abstractfactory.factory.button;

public class WindowsButton implements Button{

  @Override
  public void onClick() {
    System.out.println("Clicking Windows Button");
  }

  @Override
  public void paint() {
    System.out.println("Painting Windows Button");
  }
}
