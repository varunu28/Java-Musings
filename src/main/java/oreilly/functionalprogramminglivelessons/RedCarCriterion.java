package oreilly.functionalprogramminglivelessons;

public class RedCarCriterion implements CarCriterion {

  @Override
  public boolean test(Car c) {
    return c.getColor().equals("Red");
  }
}
