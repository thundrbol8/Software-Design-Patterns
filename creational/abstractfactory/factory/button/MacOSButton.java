package creational.abstractfactory.factory.button;

public class MacOSButton implements Button {

  @Override
  public void onClick() {
    System.out.println("Clicking MacOS Button");
  }

  @Override
  public void paint() {
    System.out.println("Painting MacOS Button");
  }
}
