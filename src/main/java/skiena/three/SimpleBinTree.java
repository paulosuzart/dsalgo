package skiena.three;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

/**
 * 3-8. Design a data structure to support the following operations:
 *
 * insert(x,T) -- Insert item x into the set T.
 *
 * delete(k,T) -- Delete the kth smallest element from T.
 *
 * member(x,T) -- Return true iff x∈T.
 *
 * All operations must take O(log n) time on an n-element set.
 */
public class SimpleBinTree<T extends Comparable<T>> {

  Node<T> root;

  int size;

  Node<T> min;
  Node<T> max;

  /**
   * Successor users depth first algo to look for a possible successor of {@code item}.
   *
   * It's possible that there's no successor on the tree for the givem {@code item}.
   *
   * @param item to look for successor
   * @return {@code Node<T>} as successor or null if none is found.
   */
  Node<T> successor(T item) {
    Deque<Node<T>> toCompare = new LinkedList<>();
    toCompare.addFirst(root);

    Node successor = null;

    while (!toCompare.isEmpty()) {
      Node<T> current = toCompare.pop();
      int comparison = item.compareTo(current.value);

      if (comparison == -1) {
        successor = current;
        current.left.ifPresent(toCompare::addFirst);
      } else if (comparison == 1) {
        current.right.ifPresent(toCompare::addFirst);
      } else {
        current.left.ifPresent(toCompare::addFirst);
        current.right.ifPresent(toCompare::addFirst);
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

    Optional<Node<T>> left = Optional.empty();
    Optional<Node<T>> right = Optional.empty();
    T value;

    @Override
    public String toString() {
      return String.format("Node(%s)", value);
    }
  }

}
