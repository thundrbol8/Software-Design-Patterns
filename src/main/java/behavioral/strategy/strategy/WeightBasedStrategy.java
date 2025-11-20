package behavioral.strategy.strategy;

import behavioral.strategy.Order;

public class WeightBasedStrategy implements Strategy {
  public double ratePerKG;

  public WeightBasedStrategy(double ratePerKG) {
    this.ratePerKG = ratePerKG;
  }

  @Override
  public void calculateCost(Order order) {
    System.out.println("Calculating cost by Weight Based Strategy");
    System.out.println("Cost for " + order.itemName + " is: " + ratePerKG * order.weight);
  }

}
