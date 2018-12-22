package udemy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

  Palindrome tested;

  @Before
  public void setUp() throws Exception {
    tested = new Palindrome();
  }

  @Test
  public void isPalindrome() {
    assertTrue(tested.isPalindrome("aba"));
    assertFalse(tested.isPalindrome("aba "));
    assertFalse(tested.isPalindrome("greetings"));
    assertTrue(tested.isPalindrome("1000000001"));
    assertFalse(tested.isPalindrome("Fish hsif"));
    assertTrue(tested.isPalindrome("pennep"));
  }
}