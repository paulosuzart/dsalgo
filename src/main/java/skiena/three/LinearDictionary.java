package skiena.three;

import java.util.Map;
import java.util.stream.IntStream;

/**
 * Question 3-4 requires a dictionary where search, insertion and deletion operations with O(1). It also says elements will be integers from
 * 1,2...n. It also says it can take O(n) for initialization.
 *
 * The question is a bit confusing and sounds like elements will be indexed by the range it provides in the question. Also some operations
 * are not mentioned to be implemented (size, max, min, previous, etc).
 */
public class LinearDictionary {

  private final int[] internal;

  public LinearDictionary(int n) {
    internal = IntStream.range(1, n + 1).toArray();
  }

  public boolean insert(int i) {
    int idx = i - 1;
    if (idx < 1) {
      return false;
    }
    internal[idx] = i;
    return true;
  }

  /**
   * Deletes a item from the dictionary.
   * The implementation simply marks the position as -1
   * @param i index to be deleted
   * @return
   */
  public boolean delete(int i) {
    int idx = i - 1;
    if (idx < 1 || idx > internal.length) {
      return false;
    }

    if (internal[idx] == -1) {
      return false;
    }

    internal[idx] = -1;
    return true;
  }

  // -1 means deleted entry
  public int search(int i) {
    int idx = i - 1;
    if (idx < 1 || idx > internal.length) {
      return -1;
    }
    return internal[idx];
  }


}
