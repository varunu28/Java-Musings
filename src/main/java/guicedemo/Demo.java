package guicedemo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guicedemo.module.AppModule;
import guicedemo.requests.SquareRequest;

public class Demo {

  private static final String SQUARE_REQ = "SQUARE";

  public static void main(String[] args) {
    sendRequest(SQUARE_REQ);
  }

  private static void sendRequest(String requestShape) {
    if (requestShape.equals(SQUARE_REQ)) {
      Injector injector = Guice.createInjector(new AppModule());
      SquareRequest requestOne = injector.getInstance(SquareRequest.class);
      requestOne.makeRequest();
    }
  }
}
