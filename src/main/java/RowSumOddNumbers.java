import java.util.stream.IntStream;

public class RowSumOddNumbers {

  public static int rowSumOddNumbers(int n) {

    int skip = IntStream.range(0, n).sum();

    return IntStream
      .iterate(1, (x -> x + 2))
      .skip(skip)
      .limit(n)
      .sum();
  }
}
