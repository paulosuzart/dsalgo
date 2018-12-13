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
    assertNull(n.next);
    tested.reverse(n);
    assertThat(n, is(o));
    assertNull(n.next);
    assertNull(o.next);
  }

  @Test
  public void firstBecomeNext() {
    Node n1 = new Node();
    Node n2 = new Node();
    Node n3 = new Node();

    n1.next = n2;
    n2.next = n3;

    assertThat(n1.next, is(n2));
    assertThat(n2.next, is(n3));
    assertNull(n3.next);

    tested.reverse(n1);
    assertNull(n1.next);
    assertThat(n2.next, is(n1));
    assertThat(n3.next, is(n2));
  }

}