package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsDemo {

  public static void main(String[] args) {
    List<String> names = List.of("Sara", "Joe", "Bill", "Peter", "Pam", "Paul");
    incorrectUsage(names);
    correctUsage(names);
  }

  // An example of shared mutability in case of parallel streams
  public static void incorrectUsage(List<String> names) {
    List<String> selected = new ArrayList<>();
    names.parallelStream()
        .filter(name -> name.length() == 4)
        .map(String::toUpperCase)
        .forEach(selected::add); // shared mutability
    System.out.println(selected);
  }

  public static void correctUsage(List<String> names) {
    List<String> selected = names.parallelStream()
        .filter(name -> name.length() == 4)
        .map(String::toUpperCase)
        .collect(Collectors.toUnmodifiableList()); // Doing a reduce that collects results from all streams
    System.out.println(selected);
  }
}
