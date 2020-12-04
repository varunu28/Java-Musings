package guicedemo.requests;

import guicedemo.services.DrawShape;
import guicedemo.services.DrawSquare;
import javax.inject.Inject;

public class SquareRequest {
  DrawShape d;

  //  Constructor injection
  /*
  @Inject
  public SquareRequest(DrawShape d) {
    this.d = d;
  }
*/

  public void makeRequest() {
    d.draw();
  }

  // Method injection
  @Inject
  public void setDrawShape(DrawSquare d) {
    this.d = d;
  }
}
