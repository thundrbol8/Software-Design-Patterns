package behavioral.strategy.strategy;

import behavioral.strategy.Order;

public class FlatRateStrategy implements Strategy {
  double rate;

  public FlatRateStrategy(double rate) {
    this.rate = rate;
  }

  @Override
  public void calculateCost(Order order) {
    System.out.println("Calculating cost by Flat Rate Strategy");
    System.out.println("Cost for " + order.itemName + " is: " + rate);
  }
}
