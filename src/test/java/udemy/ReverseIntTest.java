package udemy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseIntTest {

  ReverseInt tested;

  @Test
  public void reverse() {
    int n = 5;
    assertThat(tested.reverse(n), is(5));
    assertThat(tested.reverse(15), is(51));
    assertThat(tested.reverse(90), is(9));
    assertThat(tested.reverse(2359), is(9532));
    assertThat(tested.reverse(2359), is(9532));
    assertThat(tested.reverse(-15), is(-51));
    assertThat(tested.reverse(-90), is(-9));
  }

  @Before
  public void init() {
    tested = new ReverseInt();
  }
}