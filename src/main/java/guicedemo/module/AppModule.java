package guicedemo.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import guicedemo.annotations.ColorValue;
import guicedemo.annotations.EdgeValue;
import guicedemo.services.DrawShape;
import guicedemo.services.DrawSquare;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
    bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
    bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
  }
}
