package oreilly.functionalprogramminglivelessons;

public class GasLevelCarCriterion implements CarCriterion {

  private final int threshold;

  public GasLevelCarCriterion(int threshold) {
    this.threshold = threshold;
  }

  @Override
  public boolean test(Car c) {
    return c.getGasLevel() >= threshold;
  }
}
