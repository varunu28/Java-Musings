package helper;

public class Person {
  String name;
  int age;
  double salary;

  public Person(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return name;
  }
}
