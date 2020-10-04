package helper;

import java.util.List;

public class CreatePersonList {
  public static List<Person> createPeople() {
    return List.of(
        new Person("Sara", 20, 250d),
        new Person("Sara", 22, 300d),
        new Person("Bob", 20, 400d),
        new Person("Paula", 32, 400d),
        new Person("Paul", 32, 500d),
        new Person("Jack", 3, 150d),
        new Person("Jack", 72, 900d),
        new Person("Jill", 11, 100d)
    );
  }
}
