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

  /**
   * Given [1,2,3,4] will do ([2,3,4], [1]), then ([3,4], [2,1]) and so on until return [4,3,2,1]
   * @param head
   * @param tail
   * @return
   */
  private static Node internalReverse(Node head, Node tail) {
    if (head == null) {
      return tail;
    }

    if (head.next == null) {
      head.next = tail;
      return head;
    }

    Node nextHead = head.next;
    head.next = tail;
    return internalReverse(nextHead, head);
  }

  /**
   * This is the recursive solution implemented with the help of @buraktutanlar
   *
   * @return the reversed this
   */
  static Node recursiveReverse(Node head) {
    Node nextHead = head.next;
    head.next = null;
    return internalReverse(nextHead, head);
  }

  /**
   * Non recursive solution
   *
   * @return returns the reversed list
   */
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
