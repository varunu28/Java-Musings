package oreilly.functionalprogramminglivelessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarScratch {
  public static void main(String[] args) {
    List<Car> cars =
        Arrays.asList(
            Car.withGasColorPassengers(6, "Red", "Fred", "Jim", "Shiela"),
            Car.withGasColorPassengers(3, "Octarine", "Rincewind", "Ridcully"),
            Car.withGasColorPassengers(9, "Black", "Weatherwax", "Magrat"),
            Car.withGasColorPassengers(7, "Green", "Valentine", "Gillian", "Anne", "Dr. Mahmoud"),
            Car.withGasColorPassengers(6, "Red", "Ender", "Hyrum", "Locke", "Bonzo"));
    showAll(cars);
    // Custom selection using filter criteria
    showAll(getCarsByCriterion(cars, new RedCarCriterion()));
    showAll(getCarsByCriterion(cars, new GasLevelCarCriterion(6)));

    // Custom sorting
    cars.sort(new PassengerCountOrder());
    showAll(cars);
  }

  public static void showAll(Iterable<Car> cars) {
    for (Car car : cars) {
      System.out.println(car);
    }
    System.out.println("-------------------------------------------------------------------");
  }

  public static List<Car> getCarsByCriterion(Iterable<Car> cars, CarCriterion carCriterion) {
    List<Car> coloredCars = new ArrayList<>();
    for (Car car : cars) {
      if (carCriterion.test(car)) {
        coloredCars.add(car);
      }
    }
    return coloredCars;
  }
}
