package skiena.three;

/**
 * Warn: Class for simple test and study. Calling successive {@code check(string)} may cause changes
 * to {@code Explanation}. Therefore, not thread safe.
 *
 * The {@code enum Explanation} can be replaced by something else for testing purposes for sure.
 * But for study intention, it's fine.
 *
 * Question 3-1 - Given a string, validate if the parenthesis are balanced or not.
 */
public class ParenthesisBalancer {

  enum Explanation {
    UNBALANCED_OPEN,
    UNBALANCED_CLOSE,
    NORMAL
  }

  Explanation explanation;

  public boolean check(String s) {
    int balance = 0;

    for (int i = 0; i < s.length(); i++) {

      char c = s.charAt(i);
      if (c == '(') {
        balance++;
      } else if (c == ')') {
        balance--;
      }

      // if the remaining chars to check is already fewer then the balance,
      // return false because there's no way to recover from unbalanced open
      // parenthesis.
      if (s.length() - 1 - i < balance) {
        explanation = Explanation.UNBALANCED_OPEN;
        return false;
      }
      // balance reaching negative means too much closing parenthesis.
      // we just return false.
      if (balance < 0) {
        explanation = Explanation.UNBALANCED_CLOSE;
        return false;
      }
    }
    explanation = Explanation.NORMAL;
    return balance == 0;
  }
}
