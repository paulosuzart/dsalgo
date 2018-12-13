package skiena.three;

/**
 * Assumes the only access to the list is a given root Node. The algo thus don't take advantage of any internal state of the list.
 *
 * Question 3.2
 */
public class LinkedListReverse {

  static class Node {

    Node next;
  }

  static Node reverse(Node head) {

    Node next = head.next;
    Node prev = head;
    head.next = null;
    while (next != null) {
      Node temp = next.next;
      next.next = prev;
      next = temp;
      head = next;
    }
    return head;
  }

}
