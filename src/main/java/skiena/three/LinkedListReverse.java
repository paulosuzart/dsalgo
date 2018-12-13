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

    // holds the current for the current head
    Node current = head.next;
    // Now we can set the current head next to null as it will become the latest item.
    head.next = null;
    // While we don't reach the end of the list as it is
    while (current != null) {
      // temporarily hold reference to the current item next
      Node temp = current.next;
      // points the current reference to the previous head known head
      // if it is the first run, we are basically doing n1 => n2 to become n1 <= n2
      current.next = head;
      // head now becomes the current.
      head = current;
      // current becomes the initially next item of the current.
      current = temp;
    }

    return head;
  }

}
