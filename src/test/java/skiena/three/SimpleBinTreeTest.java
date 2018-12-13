package skiena.three;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import skiena.three.SimpleBinTree.Node;


public class SimpleBinTreeTest {

  SimpleBinTree<Integer> tested;

  @Test
  public void successor() {
    tested.root = new Node<>();
    tested.root.value = 4;
    tested.root.left = new Node<>();
    tested.root.left.value = 3;

    tested.root.right = new Node<>();
    tested.root.right.value = 5;

    Node<?> succ = tested.successor(3);
    assertThat(succ.value, is(4));
    assertThat(tested.successor(4).value, is(5));

    assertNull(tested.successor(6));

  }

  @Before
  public void init() {
    tested = new SimpleBinTree<>();
  }
}