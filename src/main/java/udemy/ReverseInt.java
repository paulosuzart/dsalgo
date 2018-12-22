package udemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Given an int, reverse it as in:
 *
 * reverse(90) == 9
 * reverse(-51) == -15
 * reverse(18) == 81
 */
public class ReverseInt {

  int reverse(int n) {

    var multiplyFactor = 1;

    if (n < 0) {
      // will turn negative again after reverse
      multiplyFactor = -1;
      // makes positive before reverse
      n = -1 * n;
    }

    // uses string as list to reverse using Collections.reverse
    var reversedString = Arrays.asList(String.valueOf(n).split(""));
    Collections.reverse(reversedString);

    // turn list of strings back to single string then parses as int.
    var reversed = Integer.parseInt(reversedString.stream().collect(Collectors.joining()));

    // put value back to negative again, if needed.
    return multiplyFactor * reversed;

  }

}
