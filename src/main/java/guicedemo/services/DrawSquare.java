package guicedemo.services;

import guicedemo.annotations.ColorValue;
import guicedemo.annotations.EdgeValue;
import javax.inject.Inject;

public class DrawSquare implements DrawShape{

  private final String color;
  private final Integer edge;

  @Inject
  public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
    this.color = color;
    this.edge = edge;
  }

  @Override
  public void draw() {
    System.out.println("Drawing square with color as : " + color + " and size: " + edge);
  }
}
