package behavioral.strategy;

import behavioral.strategy.strategy.Strategy;

public class CostCalculator {
  Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void calculateCost(Order order) {
    strategy.calculateCost(order);
  }
}
