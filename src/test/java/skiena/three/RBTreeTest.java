package skiena.three;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import skiena.three.RBTree.Node;


public class RBTreeTest {

  RBTree<Integer> tested;

  @Test
  public void successor() {
    tested.root = new Node<>();
    tested.root.value = 4;
    Node<Integer> left = new Node<>();
    left.value = 3;
    tested.root.left = Optional.of(left);

    Node<Integer> right = new Node<>();
    right.value = 5;
    tested.root.right = Optional.of(right);

    Node<?> successor = tested.successor(3);
    assertThat(successor.value, is(4));
    assertThat(tested.successor(4).value, is(5));

    assertNull(tested.successor(6));

  }

  @Before
  public void init() {
    tested = new RBTree<>();
  }
}