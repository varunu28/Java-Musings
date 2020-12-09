package guavademo.basics.preconditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class PreconditionDemoTest {

  @Test
  public void checkArgumentWithoutParameterThrowsException() {
      int age = -18;
      assertThatThrownBy(() -> Preconditions.checkArgument(age > 0))
          .isInstanceOf(IllegalArgumentException.class)
          .hasMessage(null).hasNoCause();
  }

  @Test
  public void checkArgumentWithMessageThrowsException() {
    int age = -18;
    String message = "Age can't be zero or less than zero";
    assertThatThrownBy(() -> Preconditions.checkArgument(age > 0, message))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage(message).hasNoCause();
  }

  @Test
  public void checkArgumentWithTemplateThrowsException() {
    int age = -18;
    String message = "Age should be positive number, you supplied %s";
    assertThatThrownBy(() -> Preconditions.checkArgument(age > 0, message, age))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage(message, age).hasNoCause();
  }

  @Test
  public void checkElementIndexThrowsException() {
    int[] numbers = {1, 2, 3, 4, 5};
    String message = "Please check the bound of an array and retry";
    assertThatThrownBy(
        () -> Preconditions.checkElementIndex(6, numbers.length - 1, message))
        .isInstanceOf(IndexOutOfBoundsException.class)
        .hasMessageStartingWith(message).hasNoCause();
  }

  @Test
  public void checkNotNullWithMessageThrowsException() {
    String nullObject = null;
    String message = "Please check the object supplied. It is null";
    assertThatThrownBy(() -> Preconditions.checkNotNull(nullObject, message))
        .isInstanceOf(NullPointerException.class)
        .hasMessage(message).hasNoCause();
  }

  @Test
  public void checkNotNullWithTemplateMessageThrowsException() {
    String nullObject = null;
    String message = "Please check the object supplied. It %s";
    assertThatThrownBy(
        () -> Preconditions.checkNotNull(nullObject, message, new Object[]{null}))
        .isInstanceOf(NullPointerException.class)
        .hasMessage(message, nullObject).hasNoCause();
  }

  @Test
  public void checkPositionIndexThrowsException() {
    int[] numbers = { 1, 2, 3, 4, 5 };
    String message = "Please check the bound of an array and retry";

    assertThatThrownBy(
        () -> Preconditions.checkPositionIndex(6, numbers.length - 1, message))
        .isInstanceOf(IndexOutOfBoundsException.class)
        .hasMessageStartingWith(message).hasNoCause();
  }

  @Test
  public void checkStateThrowsException() {
    int[] validStates = {-1, 0, 1};
    int givenState = 10;
    String message = "You have entered an invalid state";
    assertThatThrownBy(
        () -> Preconditions.checkState(
            Arrays.binarySearch(validStates, givenState) > 0, message
        ))
        .isInstanceOf(IllegalStateException.class)
        .hasMessageStartingWith(message).hasNoCause();
  }
}
