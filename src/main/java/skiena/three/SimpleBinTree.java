package skiena.three;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 3-8. Design a data structure to support the following operations:
 *
 * insert(x,T) -- Insert item x into the set T. delete(k,T) -- Delete the kth smallest element from T. member(x,T) -- Return true iff x∈T.
 * All operations must take O(logn) time on an n-element set.
 */
public class SimpleBinTree<T extends Comparable<T>> {

  Node<T> root;

  Node<T> successor(T item) {
    Node search = root;
    Deque<Node<T>> toCompare = new LinkedList<>();
    toCompare.addFirst(root);

    Node successor = null;

    while (!toCompare.isEmpty()) {
      Node<T> current = toCompare.pop();
      int comparison = item.compareTo(current.value);

      if (comparison == -1) {
        successor = current;
        if (current.left != null) {
          toCompare.addFirst(current.left);
        }
      } else if (comparison == 1) {
        if (current.right != null) {
          toCompare.addFirst(current.left);
        }
      } else {
        if (current.left != null) {
          toCompare.addFirst(current.left);
        }
        if (current.right != null) {
          toCompare.addFirst(current.right);
        }
      }
    }

    return successor;
  }

  public T delete(T item) {
    return null;
  }

  public boolean member(T item) {
    return false;
  }

  static class Node<T> {

    Node left;
    Node right;
    T value;

    boolean isLeaf() {
      return left == null && right == null;
    }

    @Override
    public String toString() {
      return String.format("Node(%s)", value);
    }
  }

}
