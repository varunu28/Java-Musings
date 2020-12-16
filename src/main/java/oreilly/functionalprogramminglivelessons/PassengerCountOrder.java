package oreilly.functionalprogramminglivelessons;

import java.util.Comparator;

class PassengerCountOrder implements Comparator<Car> {

  @Override
  public int compare(Car c1, Car c2) {
    return c1.getPassengers().size() - c2.getPassengers().size();
  }
}
