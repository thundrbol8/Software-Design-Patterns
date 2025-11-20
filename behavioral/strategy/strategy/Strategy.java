package behavioral.strategy.strategy;

import behavioral.strategy.Order;

public interface Strategy {
  public void calculateCost(Order order);
}
