package skiena.three;

/**
 * Assumes the only access to the list is a given root Node. The algo thus don't take advantage of any internal state of the list.
 *
 * Question 3.2 - Given a single linked list, reverse it in O(n)
 */
public class LinkedListReverse {

  /**
   * Represents a node of a list.
   *
   * @return
   */
  static class Node {

    volatile static int ids = 1;
    int id = ids++;
    Node next;

    @Override
    public String toString() {
      return String.format("n(%d)->%s", id, next);
    }
  }

  static Node reverse(Node head) {

    // holds the nextNode for the nextNode head
    Node nextNode = head.next;
    // Now we can set the nextNode head next to null as it will become the latest item.
    head.next = null;
    // While we don't reach the end of the list as it is
    while (nextNode != null) {
      // temporarily hold reference to the nextNode item next
      Node temp = nextNode.next;
      // points the nextNode reference to the previous head known head
      // if it is the first run, we are basically doing n1 => n2 to become n1 <= n2
      nextNode.next = head;
      // head now becomes the nextNode.
      head = nextNode;
      // nextNode becomes the initially next item of the nextNode.
      nextNode = temp;
    }

    return head;
  }

}
