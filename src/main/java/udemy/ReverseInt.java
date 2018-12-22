package udemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseInt {

  int reverse(int n) {

    var multiplyFactor = 1;

    if (n < 0) {
      // will turn negative again after reverse
      multiplyFactor = -1;
      // makes positive before reverse
      n = -1 * n;
    }

    var reversedString = Arrays.asList(String.valueOf(n).split(""));
    Collections.reverse(reversedString);

    var reversed = Integer.parseInt(reversedString.stream().collect(Collectors.joining()));
    return multiplyFactor * reversed;

  }

}
