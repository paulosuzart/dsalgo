package udemy;

import java.util.stream.IntStream;

public class Palindrome {

  /**
   * This is solution ranges the index of the string and compares to the other end of it.
   * The char in the middle doesn't need to be compared, that's why we divide by 2/
   * @param str
   * @return boolean
   */
  boolean isPalindrome(String str) {
    int lastBeforeMiddle = str.length() / 2;
    return IntStream.range(0, lastBeforeMiddle)
      .mapToObj(i -> str.charAt(i) == str.charAt(str.length() - i - 1))
      .allMatch(Boolean.TRUE::equals);
  }

}
