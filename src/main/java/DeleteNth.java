import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DeleteNth {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {

    if (maxOccurrences == 0) {
      return new int[0];
    }

    Map<Integer, Integer> counters = new LinkedHashMap<>();

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < elements.length; i++) {
      counters.putIfAbsent(elements[i], 1);
      counters.computeIfPresent(elements[i], (key, counter) -> {
        result.add(key);
        return counter++;
      });
    }

    return result.stream().mapToInt(i -> i).toArray();

  }
}
