package oreilly.functionalprogramminglivelessons;

import java.util.Arrays;
import java.util.List;

public class Car {
  private final int gasLevel;
  private final String color;
  private final List<String> passengers;
  private final List<String> trunkContents;

  private Car(int gasLevel, String color, List<String> passengers, List<String> trunkContents) {
    this.gasLevel = gasLevel;
    this.color = color;
    this.passengers = passengers;
    this.trunkContents = trunkContents;
  }

  public static Car withGasColorPassengers(int gas, String color, String... passengers) {
    return new Car(gas, color, List.of(passengers), null);
  }

  public static Car withGasColorPassengersAndTrunk(int gas, String color, String... passengers) {
    return new Car(gas, color, List.of(passengers), Arrays.asList("jack", "wrench", "spare wheel"));
  }

  public int getGasLevel() {
    return gasLevel;
  }

  public String getColor() {
    return color;
  }

  public List<String> getPassengers() {
    return passengers;
  }

  public List<String> getTrunkContents() {
    return trunkContents;
  }

  @Override
  public String toString() {
    return "Car{"
        + "gasLevel="
        + gasLevel
        + ", color='"
        + color
        + '\''
        + ", passengers="
        + passengers
        + (trunkContents != null ? (", trunkContents=" + trunkContents) : ", no trunkContents")
        + '}';
  }
}
