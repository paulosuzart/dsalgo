// https://www.codewars.com/kata/number-of-trailing-zeros-of-n
package codewards;

public class TrainlingZeros {

  public static int zeros(int n) {
    // your beatiful code here
    int t = n / 5;
    int result = t;
    while (t >= 5) {
      t = t / 5;
      result += t;
    }

    return result;
  }

}
