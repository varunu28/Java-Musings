package designpatterns;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomIteratorPattern {

  public static void main(String[] args) {
    Triplet triplet = new Triplet("rock", "paper", "scissors");
    triplet.forEach(System.out::println);
    for (String s : triplet) {
      System.out.println(s);
    }
  }
}


class Triplet implements Iterable<String> {

  private String a;
  private String b;
  private String c;

  public Triplet(String a, String b, String c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public Iterator<String> iterator() {
    return new Iterator<>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < 3;
      }

      @Override
      public String next() {
        switch (index++) {
          case 0:
            return a;
          case 1:
            return b;
          case 2:
            return c;
          default:
            throw new NoSuchElementException();
        }
      }
    };
  }

  public void forEach(Consumer<? super String> consumer) {
    consumer.accept(a);
    consumer.accept(b);
    consumer.accept(c);
  }
}
