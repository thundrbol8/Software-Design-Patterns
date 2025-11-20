package behavioral.strategy;

public class Order {
  public String itemName;
  public double weight;
  public double distance;

  public Order(String itemName, double weight, double distance) {
    this.itemName = itemName;
    this.weight = weight;
    this.distance = distance;
  }
}
