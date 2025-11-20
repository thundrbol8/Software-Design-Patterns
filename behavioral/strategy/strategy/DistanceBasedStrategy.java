package behavioral.strategy.strategy;

import behavioral.strategy.Order;

public class DistanceBasedStrategy implements Strategy {
  public double ratePerKM;

  public DistanceBasedStrategy(double ratePerKM) {
    this.ratePerKM = ratePerKM;
  }

  @Override
  public void calculateCost(Order order) {
    System.out.println("Calculating cost by Distance Based Strategy");
    System.out.println("Cost for " + order.itemName + " is: " + ratePerKM * order.distance);
  }
}
