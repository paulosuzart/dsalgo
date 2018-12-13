public class BitCounting {

  public static int countBits(int n) {
    return (int) Integer.toBinaryString(n)
      .chars()
      .filter(c -> c == 49).count();
  }


}
