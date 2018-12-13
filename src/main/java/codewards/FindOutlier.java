package codewards;

import java.util.Vector;

public class FindOutlier {

  public static int find(int[] numbers) {

    int lastOdd = 0;
    int lastEven = 0;
    int totalOdd = 0;
    int totalEven = 0;
    Vector<Integer> ods = new Vector<>();
    Vector<Integer> evens = new Vector<>();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        totalEven++;
        lastEven = i;
      } else {
        totalOdd++;
        lastOdd = i;
      }
    }

    if (totalOdd == 1 && totalEven == 1) {
      return lastOdd;
    }

    return totalOdd > totalEven ? lastEven : lastOdd;

  }

}
