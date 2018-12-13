package skiena.three;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import skiena.three.ParenthesisBalancer.Explanation;

public class ParenthesisBalancerTest {

  private ParenthesisBalancer tested;

  @Test
  public void validStringMustBeFound() {
    assertThat(tested.check("(()())()"), is(true));
    assertThat(tested.explanation, is(Explanation.NORMAL));
    assertThat(tested.check("()()"), is(true));
    assertThat(tested.check("(((()))())"), is(true));

  }

  @Test
  public void invalidBalanceWithFewerRemaining() {
    assertThat(tested.check("(((())"), is(false));
    assertThat(tested.explanation, is(Explanation.UNBALANCED_OPEN));
  }

  @Test
  public void invalidBalanceWithNegativeBalance() {
    assertThat(tested.check(")()("), is(false));
    assertThat(tested.explanation, is(Explanation.UNBALANCED_CLOSE));
    assertThat(tested.check("())"), is(false));
  }

  @Before
  public void init() {
    this.tested = new ParenthesisBalancer();
  }
}