package behavioral.strategy;

import behavioral.strategy.strategy.DistanceBasedStrategy;
import behavioral.strategy.strategy.FlatRateStrategy;
import behavioral.strategy.strategy.Strategy;
import behavioral.strategy.strategy.WeightBasedStrategy;

public class StrategyPatternApplication {

  public static void main(String[] args) {

    CostCalculator costCalculator = new CostCalculator();
    Order order = new Order("Potato", 2, 4);

    Strategy flatRateStrategy = new FlatRateStrategy(1.0);
    Strategy weightBasedStrategy = new WeightBasedStrategy(2.2);
    Strategy distanceBasedStrategy = new DistanceBasedStrategy(1.5);

    costCalculator.setStrategy(flatRateStrategy);
    costCalculator.calculateCost(order);

    costCalculator.setStrategy(weightBasedStrategy);
    costCalculator.calculateCost(order);

    costCalculator.setStrategy(distanceBasedStrategy);
    costCalculator.calculateCost(order);
  }

}
