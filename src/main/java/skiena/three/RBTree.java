package skiena.three;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
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
 *
 * Answer: The implementation is a Red Black Tree
 */
public class RBTree<T extends Comparable<T>> {

  Node<T> root;

  int size;

  Node<T> min;
  Node<T> max;

  private void addFirstIfNotNull(Node node, Deque<Node<T>> dq) {
    if (Objects.nonNull(node)) {
      dq.addFirst(node);
    }
  }

  Node<T> successor(T item) {
    return null;
  }

  public T delete(T item) {
    return null;
  }

  public boolean member(T item) {
    return false;
  }

  static class Node<T> {

    Node<T> left;
    Node<T> right;
    Node<T> parent;
    T value;
    boolean red;

    @Override
    public String toString() {
      return String.format("Node(%s)", value);
    }
  }

}
