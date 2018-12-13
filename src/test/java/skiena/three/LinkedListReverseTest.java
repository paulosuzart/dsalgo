package skiena.three;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import skiena.three.LinkedListReverse.Node;

public class LinkedListReverseTest {

  LinkedListReverse tested;

  @Test
  public void singleElementKeepsPointingToNull() {
    Node n = new Node();
    Node o = n;
    tested.reverse(n);
    assertThat(n, is(o));
    assertNull(n.next);
    assertNull(o.next);
  }

  @Test
  public void firstBecomeNext() {
    Node n1 = new Node();
    Node n2 = new Node();
    n1.next = n2;
    assertNull(n2.next);
    assertThat(n1.next, is(n2));

    tested.reverse(n1);
    assertThat(n2.next, is(n1));
    assertNull(n1.next);
  }

//  @Before
//  public void init() {
//    tested = new LinkedListReverse();
//  }

}